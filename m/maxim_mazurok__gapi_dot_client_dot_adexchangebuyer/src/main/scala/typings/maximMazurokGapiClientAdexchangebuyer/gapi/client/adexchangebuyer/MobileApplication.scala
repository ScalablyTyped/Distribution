package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileApplication extends js.Object {
  
  var appStore: js.UndefOr[String] = js.native
  
  var externalAppId: js.UndefOr[String] = js.native
}
object MobileApplication {
  
  @scala.inline
  def apply(): MobileApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileApplication]
  }
  
  @scala.inline
  implicit class MobileApplicationOps[Self <: MobileApplication] (val x: Self) extends AnyVal {
    
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
    def setAppStore(value: String): Self = this.set("appStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppStore: Self = this.set("appStore", js.undefined)
    
    @scala.inline
    def setExternalAppId(value: String): Self = this.set("externalAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalAppId: Self = this.set("externalAppId", js.undefined)
  }
}
