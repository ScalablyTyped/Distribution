package typings.i18nextXhrBackend.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendOptions extends js.Object {
  
  /**
    * path to post missing resources
    */
  var addPath: js.UndefOr[String] = js.native
  
  /**
    * define a custom xhr function
    * can be used to support XDomainRequest in IE 8 and 9
    */
  var ajax: js.UndefOr[
    js.Function5[
      /* url */ String, 
      /* options */ this.type, 
      /* callback */ AjaxRequestCallback, 
      /* data */ js.Object | String, 
      /* cache */ Boolean, 
      Unit
    ]
  ] = js.native
  
  /**
    * your backend server supports multiLoading
    * locales/resources.json?lng=de+en&ns=ns1+ns2
    * set loadPath: '/locales/resources.json?lng={{lng}}&ns={{ns}}' to adapt to multiLoading
    */
  var allowMultiLoading: js.UndefOr[Boolean] = js.native
  
  /**
    * allow cross domain requests
    */
  var crossDomain: js.UndefOr[Boolean] = js.native
  
  /**
    * @see https://github.com/i18next/i18next-xhr-backend/blob/281c7e235e1157b33122adacef1957252e5700f1/src/ajax.js#L52
    */
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * path where resources get loaded from, or a function
    * returning a path:
    * function(lngs, namespaces) { return customPath; }
    * the returned path will interpolate lng, ns if provided like giving a static path
    */
  var loadPath: js.UndefOr[LoadPathOption] = js.native
  
  /**
    * parse data after it has been fetched
    * in example use https://www.npmjs.com/package/json5
    * here it removes the letter a from the json (bad idea)
    */
  var parse: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  
  /**
    * parse data before it has been sent by addPath
    */
  var parsePayload: js.UndefOr[
    js.Function3[
      /* namespace */ String, 
      /* key */ String, 
      /* fallbackValue */ js.UndefOr[String], 
      StringDictionary[_]
    ]
  ] = js.native
  
  /**
    * adds parameters to resource URL. 'example.com' -> 'example.com?v=1.3.5'
    */
  var queryStringParams: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * allow credentials on cross domain requests
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object BackendOptions {
  
  @scala.inline
  def apply(): BackendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendOptions]
  }
  
  @scala.inline
  implicit class BackendOptionsOps[Self <: BackendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddPath(value: String): Self = this.set("addPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddPath: Self = this.set("addPath", js.undefined)
    
    @scala.inline
    def setAjax(
      value: (/* url */ String, BackendOptions, /* callback */ AjaxRequestCallback, /* data */ js.Object | String, /* cache */ Boolean) => Unit
    ): Self = this.set("ajax", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    
    @scala.inline
    def setAllowMultiLoading(value: Boolean): Self = this.set("allowMultiLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiLoading: Self = this.set("allowMultiLoading", js.undefined)
    
    @scala.inline
    def setCrossDomain(value: Boolean): Self = this.set("crossDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossDomain: Self = this.set("crossDomain", js.undefined)
    
    @scala.inline
    def setCustomHeaders(value: StringDictionary[String]): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    
    @scala.inline
    def setLoadPathFunction2(value: (/* lngs */ js.Array[String], /* namespaces */ js.Array[String]) => String): Self = this.set("loadPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadPath(value: LoadPathOption): Self = this.set("loadPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadPath: Self = this.set("loadPath", js.undefined)
    
    @scala.inline
    def setParse(value: /* data */ String => String): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setParsePayload(
      value: (/* namespace */ String, /* key */ String, /* fallbackValue */ js.UndefOr[String]) => StringDictionary[_]
    ): Self = this.set("parsePayload", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteParsePayload: Self = this.set("parsePayload", js.undefined)
    
    @scala.inline
    def setQueryStringParams(value: StringDictionary[String]): Self = this.set("queryStringParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryStringParams: Self = this.set("queryStringParams", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
