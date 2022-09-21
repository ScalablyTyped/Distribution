package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourceConfigStep extends StObject {
  
  /**
    * An error message recorded during the execution of this step. Only populated when outcome is FAILED.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Outcome of the configuration step.
    */
  var outcome: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration step type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyResourceConfigStep {
  
  inline def apply(): SchemaOSPolicyResourceConfigStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourceConfigStep]
  }
  
  extension [Self <: SchemaOSPolicyResourceConfigStep](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeNull: Self = StObject.set(x, "outcome", null)
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
