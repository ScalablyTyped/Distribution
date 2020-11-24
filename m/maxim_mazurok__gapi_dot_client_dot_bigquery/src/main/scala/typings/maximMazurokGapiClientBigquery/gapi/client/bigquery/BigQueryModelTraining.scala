package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigQueryModelTraining extends js.Object {
  
  /** [Output-only, Beta] Index of current ML training iteration. Updated during create model query job to show job progress. */
  var currentIteration: js.UndefOr[Double] = js.native
  
  /**
    * [Output-only, Beta] Expected number of iterations for the create model query job specified as num_iterations in the input query. The actual total number of iterations may be less
    * than this number due to early stop.
    */
  var expectedTotalIterations: js.UndefOr[String] = js.native
}
object BigQueryModelTraining {
  
  @scala.inline
  def apply(): BigQueryModelTraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryModelTraining]
  }
  
  @scala.inline
  implicit class BigQueryModelTrainingOps[Self <: BigQueryModelTraining] (val x: Self) extends AnyVal {
    
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
    def setCurrentIteration(value: Double): Self = this.set("currentIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentIteration: Self = this.set("currentIteration", js.undefined)
    
    @scala.inline
    def setExpectedTotalIterations(value: String): Self = this.set("expectedTotalIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedTotalIterations: Self = this.set("expectedTotalIterations", js.undefined)
  }
}
