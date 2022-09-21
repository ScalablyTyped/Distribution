package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourceCompliance extends StObject {
  
  /**
    * Ordered list of configuration steps taken by the agent for the OS policy resource.
    */
  var configSteps: js.UndefOr[js.Array[SchemaOSPolicyResourceConfigStep]] = js.undefined
  
  /**
    * ExecResource specific output.
    */
  var execResourceOutput: js.UndefOr[SchemaOSPolicyResourceComplianceExecResourceOutput] = js.undefined
  
  /**
    * The id of the OS policy resource.
    */
  var osPolicyResourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Compliance state of the OS policy resource.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyResourceCompliance {
  
  inline def apply(): SchemaOSPolicyResourceCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourceCompliance]
  }
  
  extension [Self <: SchemaOSPolicyResourceCompliance](x: Self) {
    
    inline def setConfigSteps(value: js.Array[SchemaOSPolicyResourceConfigStep]): Self = StObject.set(x, "configSteps", value.asInstanceOf[js.Any])
    
    inline def setConfigStepsUndefined: Self = StObject.set(x, "configSteps", js.undefined)
    
    inline def setConfigStepsVarargs(value: SchemaOSPolicyResourceConfigStep*): Self = StObject.set(x, "configSteps", js.Array(value*))
    
    inline def setExecResourceOutput(value: SchemaOSPolicyResourceComplianceExecResourceOutput): Self = StObject.set(x, "execResourceOutput", value.asInstanceOf[js.Any])
    
    inline def setExecResourceOutputUndefined: Self = StObject.set(x, "execResourceOutput", js.undefined)
    
    inline def setOsPolicyResourceId(value: String): Self = StObject.set(x, "osPolicyResourceId", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyResourceIdNull: Self = StObject.set(x, "osPolicyResourceId", null)
    
    inline def setOsPolicyResourceIdUndefined: Self = StObject.set(x, "osPolicyResourceId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
