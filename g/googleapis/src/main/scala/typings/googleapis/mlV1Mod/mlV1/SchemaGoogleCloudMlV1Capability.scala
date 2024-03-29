package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1Capability extends StObject {
  
  /**
    * Available accelerators for the capability.
    */
  var availableAccelerators: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1Capability {
  
  inline def apply(): SchemaGoogleCloudMlV1Capability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Capability]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1Capability](x: Self) {
    
    inline def setAvailableAccelerators(value: js.Array[String]): Self = StObject.set(x, "availableAccelerators", value.asInstanceOf[js.Any])
    
    inline def setAvailableAcceleratorsNull: Self = StObject.set(x, "availableAccelerators", null)
    
    inline def setAvailableAcceleratorsUndefined: Self = StObject.set(x, "availableAccelerators", js.undefined)
    
    inline def setAvailableAcceleratorsVarargs(value: String*): Self = StObject.set(x, "availableAccelerators", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
