package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementOperatorState extends StObject {
  
  /**
    * The state of the Operator's deployment
    */
  var deploymentState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Install errors.
    */
  var errors: js.UndefOr[js.Array[SchemaConfigManagementInstallError]] = js.undefined
  
  /**
    * The semenatic version number of the operator
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementOperatorState {
  
  inline def apply(): SchemaConfigManagementOperatorState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementOperatorState]
  }
  
  extension [Self <: SchemaConfigManagementOperatorState](x: Self) {
    
    inline def setDeploymentState(value: String): Self = StObject.set(x, "deploymentState", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStateNull: Self = StObject.set(x, "deploymentState", null)
    
    inline def setDeploymentStateUndefined: Self = StObject.set(x, "deploymentState", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaConfigManagementInstallError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaConfigManagementInstallError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
