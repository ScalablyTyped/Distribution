package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileApplication extends StObject {
  
  var appStore: js.UndefOr[String] = js.undefined
  
  var externalAppId: js.UndefOr[String] = js.undefined
}
object MobileApplication {
  
  inline def apply(): MobileApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileApplication]
  }
  
  extension [Self <: MobileApplication](x: Self) {
    
    inline def setAppStore(value: String): Self = StObject.set(x, "appStore", value.asInstanceOf[js.Any])
    
    inline def setAppStoreUndefined: Self = StObject.set(x, "appStore", js.undefined)
    
    inline def setExternalAppId(value: String): Self = StObject.set(x, "externalAppId", value.asInstanceOf[js.Any])
    
    inline def setExternalAppIdUndefined: Self = StObject.set(x, "externalAppId", js.undefined)
  }
}
