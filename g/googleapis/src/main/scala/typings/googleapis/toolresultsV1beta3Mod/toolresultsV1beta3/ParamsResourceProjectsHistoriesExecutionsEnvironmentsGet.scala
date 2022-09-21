package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHistoriesExecutionsEnvironmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. An Environment id.
    */
  var environmentId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. An Execution id.
    */
  var executionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A History id.
    */
  var historyId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A Project id.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHistoriesExecutionsEnvironmentsGet {
  
  inline def apply(): ParamsResourceProjectsHistoriesExecutionsEnvironmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsEnvironmentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsHistoriesExecutionsEnvironmentsGet](x: Self) {
    
    inline def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
