package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ExampleComparison extends StObject {
  
  /** The ground truth output for the input. */
  var groundTruthExample: js.UndefOr[GoogleCloudDatalabelingV1beta1Example] = js.undefined
  
  /** Predictions by the model for the input. */
  var modelCreatedExamples: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Example]] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ExampleComparison {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ExampleComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ExampleComparison]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ExampleComparisonMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ExampleComparison] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroundTruthExample(value: GoogleCloudDatalabelingV1beta1Example): Self = StObject.set(x, "groundTruthExample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundTruthExampleUndefined: Self = StObject.set(x, "groundTruthExample", js.undefined)
    
    @scala.inline
    def setModelCreatedExamples(value: js.Array[GoogleCloudDatalabelingV1beta1Example]): Self = StObject.set(x, "modelCreatedExamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelCreatedExamplesUndefined: Self = StObject.set(x, "modelCreatedExamples", js.undefined)
    
    @scala.inline
    def setModelCreatedExamplesVarargs(value: GoogleCloudDatalabelingV1beta1Example*): Self = StObject.set(x, "modelCreatedExamples", js.Array(value :_*))
  }
}
