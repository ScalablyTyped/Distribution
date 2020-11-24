package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapXmlaDataSourceOptionsRequestOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A callback to be invoked right before the request is send to the server. Extends beforeSend callback of jQuery.ajax's options object.
    */
  var beforeSend: js.UndefOr[js.Function] = js.native
  
  /**
    * The value is applied to XmlHttpRequest.withCredentials if supported by the user agent.
    *                 Setting this property to true will allow IE8/IE9 to make authenticated cross-origin requests to tusted domains through XmlHttpRequest instead of XDomainRequest
    *                 and will prompt the user for credentials.
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object OlapXmlaDataSourceOptionsRequestOptions {
  
  @scala.inline
  def apply(): OlapXmlaDataSourceOptionsRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapXmlaDataSourceOptionsRequestOptions]
  }
  
  @scala.inline
  implicit class OlapXmlaDataSourceOptionsRequestOptionsOps[Self <: OlapXmlaDataSourceOptionsRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setBeforeSend(value: js.Function): Self = this.set("beforeSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
