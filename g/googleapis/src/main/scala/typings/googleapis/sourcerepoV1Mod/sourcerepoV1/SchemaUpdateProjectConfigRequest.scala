package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateProjectConfigRequest extends StObject {
  
  /**
    * The new configuration for the project.
    */
  var projectConfig: js.UndefOr[SchemaProjectConfig] = js.undefined
  
  /**
    * A FieldMask specifying which fields of the project_config to modify. Only the fields in the mask will be modified. If no mask is provided, this request is no-op.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateProjectConfigRequest {
  
  inline def apply(): SchemaUpdateProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateProjectConfigRequest]
  }
  
  extension [Self <: SchemaUpdateProjectConfigRequest](x: Self) {
    
    inline def setProjectConfig(value: SchemaProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
    
    inline def setProjectConfigUndefined: Self = StObject.set(x, "projectConfig", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
