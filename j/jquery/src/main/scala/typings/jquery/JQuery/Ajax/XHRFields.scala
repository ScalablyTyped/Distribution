package typings.jquery.JQuery.Ajax

import typings.std.Event
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// Writable properties on XMLHttpRequest
/* Inlined parent std.Partial<std.Pick<std.XMLHttpRequest, 'onreadystatechange' | 'responseType' | 'timeout' | 'withCredentials'>> */
@js.native
trait XHRFields extends js.Object {
  
  var msCaching: js.UndefOr[String] = js.native
  
  var onreadystatechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object XHRFields {
  
  @scala.inline
  def apply(): XHRFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XHRFields]
  }
  
  @scala.inline
  implicit class XHRFieldsOps[Self <: XHRFields] (val x: Self) extends AnyVal {
    
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
    def setMsCaching(value: String): Self = this.set("msCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsCaching: Self = this.set("msCaching", js.undefined)
    
    @scala.inline
    def setOnreadystatechange(value: js.ThisFunction1[XHRFields, /* ev */ Event, _]): Self = this.set("onreadystatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnreadystatechange: Self = this.set("onreadystatechange", js.undefined)
    
    @scala.inline
    def setOnreadystatechangeNull: Self = this.set("onreadystatechange", null)
    
    @scala.inline
    def setResponseType(value: XMLHttpRequestResponseType): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
