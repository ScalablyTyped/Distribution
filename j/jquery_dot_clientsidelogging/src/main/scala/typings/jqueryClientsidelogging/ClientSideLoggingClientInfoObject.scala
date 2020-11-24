package typings.jqueryClientsidelogging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSideLoggingClientInfoObject extends js.Object {
  
  var location: js.UndefOr[Boolean] = js.native
  
      //  The url to the page on which the error occurred.
  var screen_size: js.UndefOr[Boolean] = js.native
  
      //  The size of the user's screen (different to the window size because the window might not be maximized)
  var user_agent: js.UndefOr[Boolean] = js.native
  
      //  The user agent string.
  var window_size: js.UndefOr[Boolean] = js.native
}
object ClientSideLoggingClientInfoObject {
  
  @scala.inline
  def apply(): ClientSideLoggingClientInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSideLoggingClientInfoObject]
  }
  
  @scala.inline
  implicit class ClientSideLoggingClientInfoObjectOps[Self <: ClientSideLoggingClientInfoObject] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: Boolean): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setScreen_size(value: Boolean): Self = this.set("screen_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreen_size: Self = this.set("screen_size", js.undefined)
    
    @scala.inline
    def setUser_agent(value: Boolean): Self = this.set("user_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_agent: Self = this.set("user_agent", js.undefined)
    
    @scala.inline
    def setWindow_size(value: Boolean): Self = this.set("window_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow_size: Self = this.set("window_size", js.undefined)
  }
}
