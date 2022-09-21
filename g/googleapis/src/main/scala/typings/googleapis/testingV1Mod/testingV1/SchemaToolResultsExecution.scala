package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaToolResultsExecution extends StObject {
  
  /**
    * Output only. A tool results execution ID.
    */
  var executionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A tool results history ID.
    */
  var historyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The cloud project that owns the tool results execution.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaToolResultsExecution {
  
  inline def apply(): SchemaToolResultsExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolResultsExecution]
  }
  
  extension [Self <: SchemaToolResultsExecution](x: Self) {
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdNull: Self = StObject.set(x, "executionId", null)
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdNull: Self = StObject.set(x, "historyId", null)
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
