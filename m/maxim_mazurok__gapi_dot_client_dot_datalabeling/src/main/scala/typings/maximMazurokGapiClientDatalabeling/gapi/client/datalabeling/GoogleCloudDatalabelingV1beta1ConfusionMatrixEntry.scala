package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry extends StObject {
  
  /** The annotation spec of a predicted label. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  /** Number of items predicted to have this label. (The ground truth label for these items is the `Row.annotationSpec` of this entry's parent.) */
  var itemCount: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry](x: Self) {
    
    inline def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
  }
}
