package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig extends StObject {
  
  /**
    * Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to true, run once a day.
    */
  var enableContinuousRun: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the environment. Default false.
    */
  var enablePredeploymentRun: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A list of test case names to run. They should be under the same agent. Format of each test case name: `projects//locations/ /agents//testCases/`
    */
  var testCases: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig](x: Self) {
    
    inline def setEnableContinuousRun(value: Boolean): Self = StObject.set(x, "enableContinuousRun", value.asInstanceOf[js.Any])
    
    inline def setEnableContinuousRunNull: Self = StObject.set(x, "enableContinuousRun", null)
    
    inline def setEnableContinuousRunUndefined: Self = StObject.set(x, "enableContinuousRun", js.undefined)
    
    inline def setEnablePredeploymentRun(value: Boolean): Self = StObject.set(x, "enablePredeploymentRun", value.asInstanceOf[js.Any])
    
    inline def setEnablePredeploymentRunNull: Self = StObject.set(x, "enablePredeploymentRun", null)
    
    inline def setEnablePredeploymentRunUndefined: Self = StObject.set(x, "enablePredeploymentRun", js.undefined)
    
    inline def setTestCases(value: js.Array[String]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    inline def setTestCasesNull: Self = StObject.set(x, "testCases", null)
    
    inline def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    inline def setTestCasesVarargs(value: String*): Self = StObject.set(x, "testCases", js.Array(value*))
  }
}
