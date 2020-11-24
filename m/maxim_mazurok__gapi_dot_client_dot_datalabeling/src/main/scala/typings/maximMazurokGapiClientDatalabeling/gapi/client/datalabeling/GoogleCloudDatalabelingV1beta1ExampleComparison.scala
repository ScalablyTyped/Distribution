package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ExampleComparison extends js.Object {
  
  /** The ground truth output for the input. */
  var groundTruthExample: js.UndefOr[GoogleCloudDatalabelingV1beta1Example] = js.native
  
  /** Predictions by the model for the input. */
  var modelCreatedExamples: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Example]] = js.native
}
object GoogleCloudDatalabelingV1beta1ExampleComparison {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ExampleComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ExampleComparison]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ExampleComparisonOps[Self <: GoogleCloudDatalabelingV1beta1ExampleComparison] (val x: Self) extends AnyVal {
    
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
    def setGroundTruthExample(value: GoogleCloudDatalabelingV1beta1Example): Self = this.set("groundTruthExample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundTruthExample: Self = this.set("groundTruthExample", js.undefined)
    
    @scala.inline
    def setModelCreatedExamplesVarargs(value: GoogleCloudDatalabelingV1beta1Example*): Self = this.set("modelCreatedExamples", js.Array(value :_*))
    
    @scala.inline
    def setModelCreatedExamples(value: js.Array[GoogleCloudDatalabelingV1beta1Example]): Self = this.set("modelCreatedExamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelCreatedExamples: Self = this.set("modelCreatedExamples", js.undefined)
  }
}
