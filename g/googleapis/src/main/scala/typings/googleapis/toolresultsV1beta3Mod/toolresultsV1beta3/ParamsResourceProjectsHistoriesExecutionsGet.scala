package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHistoriesExecutionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * An Execution id. Required.
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
}
object ParamsResourceProjectsHistoriesExecutionsGet {
  
  inline def apply(): ParamsResourceProjectsHistoriesExecutionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsHistoriesExecutionsGet](x: Self) {
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
