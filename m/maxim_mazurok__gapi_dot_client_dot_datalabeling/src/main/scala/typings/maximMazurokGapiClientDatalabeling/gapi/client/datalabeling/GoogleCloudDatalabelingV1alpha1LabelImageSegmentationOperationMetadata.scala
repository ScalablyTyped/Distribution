package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1alpha1LabelImageSegmentationOperationMetadata extends StObject {
  
  /** Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1alpha1HumanAnnotationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1alpha1LabelImageSegmentationOperationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1alpha1LabelImageSegmentationOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1alpha1LabelImageSegmentationOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1alpha1LabelImageSegmentationOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: GoogleCloudDatalabelingV1alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
