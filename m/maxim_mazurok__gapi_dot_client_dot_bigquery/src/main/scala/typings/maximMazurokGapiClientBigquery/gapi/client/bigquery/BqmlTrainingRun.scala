package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.EarlyStop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BqmlTrainingRun extends js.Object {
  
  /** [Output-only, Beta] List of each iteration results. */
  var iterationResults: js.UndefOr[js.Array[BqmlIterationResult]] = js.native
  
  /** [Output-only, Beta] Training run start time in milliseconds since the epoch. */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED:
    * Training run successfully completed. CANCELLED: Training run cancelled by the user.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not
    * specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous
    * training run.
    */
  var trainingOptions: js.UndefOr[EarlyStop] = js.native
}
object BqmlTrainingRun {
  
  @scala.inline
  def apply(): BqmlTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlTrainingRun]
  }
  
  @scala.inline
  implicit class BqmlTrainingRunOps[Self <: BqmlTrainingRun] (val x: Self) extends AnyVal {
    
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
    def setIterationResultsVarargs(value: BqmlIterationResult*): Self = this.set("iterationResults", js.Array(value :_*))
    
    @scala.inline
    def setIterationResults(value: js.Array[BqmlIterationResult]): Self = this.set("iterationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterationResults: Self = this.set("iterationResults", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTrainingOptions(value: EarlyStop): Self = this.set("trainingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingOptions: Self = this.set("trainingOptions", js.undefined)
  }
}
