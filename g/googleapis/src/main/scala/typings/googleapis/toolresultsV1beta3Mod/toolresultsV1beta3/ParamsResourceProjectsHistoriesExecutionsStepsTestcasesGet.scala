package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet
  extends StObject
     with StandardParameters {
  
  /**
    * A Execution id Required.
    */
  var executionId: js.UndefOr[String] = js.undefined
  
  /**
    * A History id. Required.
    */
  var historyId: js.UndefOr[String] = js.undefined
  
  /**
    * A Project id. Required.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * A Step id. Note: This step must include a TestExecutionStep. Required.
    */
  var stepId: js.UndefOr[String] = js.undefined
  
  /**
    * A Test Case id. Required.
    */
  var testCaseId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet {
  
  inline def apply(): ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet]
  }
  
  extension [Self <: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet](x: Self) {
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
    
    inline def setTestCaseId(value: String): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseIdUndefined: Self = StObject.set(x, "testCaseId", js.undefined)
  }
}
