package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1alpha1LabelVideoClassificationOperationMetadata extends StObject {
  
  /** Basic human annotation config used in labeling request. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1alpha1HumanAnnotationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1alpha1LabelVideoClassificationOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1alpha1LabelVideoClassificationOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1alpha1LabelVideoClassificationOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1alpha1LabelVideoClassificationOperationMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1alpha1LabelVideoClassificationOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicConfig(value: GoogleCloudDatalabelingV1alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
