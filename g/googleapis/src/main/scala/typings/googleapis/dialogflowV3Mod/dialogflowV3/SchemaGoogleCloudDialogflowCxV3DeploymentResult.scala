package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3DeploymentResult extends StObject {
  
  /**
    * Results of test cases running before the deployment. Format: `projects//locations//agents//testCases//results/`.
    */
  var deploymentTestResults: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the experiment triggered by this deployment. Format: projects//locations//agents//environments//experiments/.
    */
  var experiment: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3DeploymentResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3DeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3DeploymentResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3DeploymentResult](x: Self) {
    
    inline def setDeploymentTestResults(value: js.Array[String]): Self = StObject.set(x, "deploymentTestResults", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTestResultsNull: Self = StObject.set(x, "deploymentTestResults", null)
    
    inline def setDeploymentTestResultsUndefined: Self = StObject.set(x, "deploymentTestResults", js.undefined)
    
    inline def setDeploymentTestResultsVarargs(value: String*): Self = StObject.set(x, "deploymentTestResults", js.Array(value*))
    
    inline def setExperiment(value: String): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setExperimentNull: Self = StObject.set(x, "experiment", null)
    
    inline def setExperimentUndefined: Self = StObject.set(x, "experiment", js.undefined)
  }
}
