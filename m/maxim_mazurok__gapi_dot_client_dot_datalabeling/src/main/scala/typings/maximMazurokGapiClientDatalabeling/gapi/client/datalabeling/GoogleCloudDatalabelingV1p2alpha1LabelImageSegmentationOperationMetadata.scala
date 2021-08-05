package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p2alpha1LabelImageSegmentationOperationMetadata extends StObject {
  
  /** Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1p2alpha1LabelImageSegmentationOperationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1p2alpha1LabelImageSegmentationOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1LabelImageSegmentationOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1p2alpha1LabelImageSegmentationOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: GoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
