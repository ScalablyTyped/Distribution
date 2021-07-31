package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p1alpha1LabelTextClassificationOperationMetadata extends StObject {
  
  /** Basic human annotation config used in labeling request. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1p1alpha1LabelTextClassificationOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p1alpha1LabelTextClassificationOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p1alpha1LabelTextClassificationOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p1alpha1LabelTextClassificationOperationMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1p1alpha1LabelTextClassificationOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicConfig(value: GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
