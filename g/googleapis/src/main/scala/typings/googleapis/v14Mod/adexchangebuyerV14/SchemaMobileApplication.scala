package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMobileApplication extends StObject {
  
  var appStore: js.UndefOr[String | Null] = js.undefined
  
  var externalAppId: js.UndefOr[String | Null] = js.undefined
}
object SchemaMobileApplication {
  
  inline def apply(): SchemaMobileApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileApplication]
  }
  
  extension [Self <: SchemaMobileApplication](x: Self) {
    
    inline def setAppStore(value: String): Self = StObject.set(x, "appStore", value.asInstanceOf[js.Any])
    
    inline def setAppStoreNull: Self = StObject.set(x, "appStore", null)
    
    inline def setAppStoreUndefined: Self = StObject.set(x, "appStore", js.undefined)
    
    inline def setExternalAppId(value: String): Self = StObject.set(x, "externalAppId", value.asInstanceOf[js.Any])
    
    inline def setExternalAppIdNull: Self = StObject.set(x, "externalAppId", null)
    
    inline def setExternalAppIdUndefined: Self = StObject.set(x, "externalAppId", js.undefined)
  }
}
