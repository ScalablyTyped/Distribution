package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata extends StObject {
  
  /** Basic human annotation config used in labeling request. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1p2alpha1LabelVideoObjectTrackingOperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setBasicConfig(value: GoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
