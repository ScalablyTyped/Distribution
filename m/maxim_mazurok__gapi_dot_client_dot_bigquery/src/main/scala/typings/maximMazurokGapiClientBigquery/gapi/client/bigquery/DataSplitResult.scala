package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSplitResult extends js.Object {
  
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
  implicit class DataSplitResultOps[Self <: DataSplitResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvaluationTable(value: TableReference): Self = this.set("evaluationTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationTable: Self = this.set("evaluationTable", js.undefined)
    
    @scala.inline
    def setTrainingTable(value: TableReference): Self = this.set("trainingTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingTable: Self = this.set("trainingTable", js.undefined)
  }
}
