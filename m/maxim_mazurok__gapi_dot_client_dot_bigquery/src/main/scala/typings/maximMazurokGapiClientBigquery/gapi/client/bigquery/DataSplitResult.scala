package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSplitResult extends StObject {
  
  /** Table reference of the evaluation data after split. */
  var evaluationTable: js.UndefOr[TableReference] = js.native
  
  /** Table reference of the training data after split. */
  var trainingTable: js.UndefOr[TableReference] = js.native
}
object DataSplitResult {
  
  @scala.inline
  def apply(): DataSplitResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSplitResult]
  }
  
  @scala.inline
  implicit class DataSplitResultMutableBuilder[Self <: DataSplitResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationTable(value: TableReference): Self = StObject.set(x, "evaluationTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationTableUndefined: Self = StObject.set(x, "evaluationTable", js.undefined)
    
    @scala.inline
    def setTrainingTable(value: TableReference): Self = StObject.set(x, "trainingTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingTableUndefined: Self = StObject.set(x, "trainingTable", js.undefined)
  }
}
