package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1LabelImageSegmentationOperationMetadata extends StObject {
  
  /** Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.native
}
object GoogleCloudDatalabelingV1beta1LabelImageSegmentationOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1LabelImageSegmentationOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelImageSegmentationOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1LabelImageSegmentationOperationMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1LabelImageSegmentationOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicConfig(value: GoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
