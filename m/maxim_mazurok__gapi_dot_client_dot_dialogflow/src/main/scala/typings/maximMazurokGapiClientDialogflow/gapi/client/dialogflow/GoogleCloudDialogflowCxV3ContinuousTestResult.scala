package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ContinuousTestResult extends StObject {
  
  /** The resource name for the continuous test result. Format: `projects//locations//agents//environments//continuousTestResults/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The result of this continuous test run, i.e. whether all the tests in this continuous test run pass or not. */
  var result: js.UndefOr[String] = js.undefined
  
  /** Time when the continuous testing run starts. */
  var runTime: js.UndefOr[String] = js.undefined
  
  /** A list of individual test case results names in this continuous test run. */
  var testCaseResults: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowCxV3ContinuousTestResult {
  
  inline def apply(): GoogleCloudDialogflowCxV3ContinuousTestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ContinuousTestResult]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ContinuousTestResult](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setRunTime(value: String): Self = StObject.set(x, "runTime", value.asInstanceOf[js.Any])
    
    inline def setRunTimeUndefined: Self = StObject.set(x, "runTime", js.undefined)
    
    inline def setTestCaseResults(value: js.Array[String]): Self = StObject.set(x, "testCaseResults", value.asInstanceOf[js.Any])
    
    inline def setTestCaseResultsUndefined: Self = StObject.set(x, "testCaseResults", js.undefined)
    
    inline def setTestCaseResultsVarargs(value: String*): Self = StObject.set(x, "testCaseResults", js.Array(value*))
  }
}
