package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ObjectDetectionConfig extends StObject {
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.native
  
  /** Required. Number of frames per second to be extracted from the video. */
  var extractionFrameRate: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1ObjectDetectionConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ObjectDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ObjectDetectionConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ObjectDetectionConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ObjectDetectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    @scala.inline
    def setExtractionFrameRate(value: Double): Self = StObject.set(x, "extractionFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractionFrameRateUndefined: Self = StObject.set(x, "extractionFrameRate", js.undefined)
  }
}
