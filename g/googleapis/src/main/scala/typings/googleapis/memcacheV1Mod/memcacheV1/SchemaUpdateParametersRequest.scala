package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateParametersRequest extends StObject {
  
  /**
    * The parameters to apply to the instance.
    */
  var parameters: js.UndefOr[SchemaMemcacheParameters] = js.undefined
  
  /**
    * Required. Mask of fields to update.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateParametersRequest {
  
  inline def apply(): SchemaUpdateParametersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateParametersRequest]
  }
  
  extension [Self <: SchemaUpdateParametersRequest](x: Self) {
    
    inline def setParameters(value: SchemaMemcacheParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
