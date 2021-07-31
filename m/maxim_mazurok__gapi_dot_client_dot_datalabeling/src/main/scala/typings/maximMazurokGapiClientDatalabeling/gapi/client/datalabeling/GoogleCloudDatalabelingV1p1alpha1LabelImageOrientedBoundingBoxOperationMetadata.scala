package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p1alpha1LabelImageOrientedBoundingBoxOperationMetadata extends StObject {
  
  /** Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1p1alpha1LabelImageOrientedBoundingBoxOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p1alpha1LabelImageOrientedBoundingBoxOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p1alpha1LabelImageOrientedBoundingBoxOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p1alpha1LabelImageOrientedBoundingBoxOperationMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1p1alpha1LabelImageOrientedBoundingBoxOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicConfig(value: GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
