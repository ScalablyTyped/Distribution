package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2Trigger extends StObject {
  
  /**
    * HTTP URI trigger for the Cloud Function.
    */
  var functionUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the trigger was changed.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2Trigger {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2Trigger]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2Trigger](x: Self) {
    
    inline def setFunctionUri(value: String): Self = StObject.set(x, "functionUri", value.asInstanceOf[js.Any])
    
    inline def setFunctionUriNull: Self = StObject.set(x, "functionUri", null)
    
    inline def setFunctionUriUndefined: Self = StObject.set(x, "functionUri", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
