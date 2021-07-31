package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileApplication extends StObject {
  
  var appStore: js.UndefOr[String] = js.undefined
  
  var externalAppId: js.UndefOr[String] = js.undefined
}
object MobileApplication {
  
  @scala.inline
  def apply(): MobileApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileApplication]
  }
  
  @scala.inline
  implicit class MobileApplicationMutableBuilder[Self <: MobileApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppStore(value: String): Self = StObject.set(x, "appStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreUndefined: Self = StObject.set(x, "appStore", js.undefined)
    
    @scala.inline
    def setExternalAppId(value: String): Self = StObject.set(x, "externalAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalAppIdUndefined: Self = StObject.set(x, "externalAppId", js.undefined)
  }
}
