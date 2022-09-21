package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaToolResultsHistory extends StObject {
  
  /**
    * Required. A tool results history ID.
    */
  var historyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The cloud project that owns the tool results history.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaToolResultsHistory {
  
  inline def apply(): SchemaToolResultsHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolResultsHistory]
  }
  
  extension [Self <: SchemaToolResultsHistory](x: Self) {
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdNull: Self = StObject.set(x, "historyId", null)
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
