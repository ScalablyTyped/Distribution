package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLaunchFlexTemplateRequest extends StObject {
  
  /**
    * Required. Parameter to launch a job form Flex Template.
    */
  var launchParameter: js.UndefOr[SchemaLaunchFlexTemplateParameter] = js.undefined
  
  /**
    * If true, the request is validated but not actually executed. Defaults to false.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaLaunchFlexTemplateRequest {
  
  inline def apply(): SchemaLaunchFlexTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchFlexTemplateRequest]
  }
  
  extension [Self <: SchemaLaunchFlexTemplateRequest](x: Self) {
    
    inline def setLaunchParameter(value: SchemaLaunchFlexTemplateParameter): Self = StObject.set(x, "launchParameter", value.asInstanceOf[js.Any])
    
    inline def setLaunchParameterUndefined: Self = StObject.set(x, "launchParameter", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
