package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSplitResult extends StObject {
  
  /** Table reference of the evaluation data after split. */
  var evaluationTable: js.UndefOr[TableReference] = js.undefined
  
  /** Table reference of the test data after split. */
  var testTable: js.UndefOr[TableReference] = js.undefined
  
  /** Table reference of the training data after split. */
  var trainingTable: js.UndefOr[TableReference] = js.undefined
}
object DataSplitResult {
  
  inline def apply(): DataSplitResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSplitResult]
  }
  
  extension [Self <: DataSplitResult](x: Self) {
    
    inline def setEvaluationTable(value: TableReference): Self = StObject.set(x, "evaluationTable", value.asInstanceOf[js.Any])
    
    inline def setEvaluationTableUndefined: Self = StObject.set(x, "evaluationTable", js.undefined)
    
    inline def setTestTable(value: TableReference): Self = StObject.set(x, "testTable", value.asInstanceOf[js.Any])
    
    inline def setTestTableUndefined: Self = StObject.set(x, "testTable", js.undefined)
    
    inline def setTrainingTable(value: TableReference): Self = StObject.set(x, "trainingTable", value.asInstanceOf[js.Any])
    
    inline def setTrainingTableUndefined: Self = StObject.set(x, "trainingTable", js.undefined)
  }
}
