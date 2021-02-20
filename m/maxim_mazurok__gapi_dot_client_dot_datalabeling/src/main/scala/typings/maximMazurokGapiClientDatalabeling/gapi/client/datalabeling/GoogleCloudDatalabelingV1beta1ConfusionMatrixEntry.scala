package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry extends StObject {
  
  /** The annotation spec of a predicted label. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
  
  /** Number of items predicted to have this label. (The ground truth label for these items is the `Row.annotationSpec` of this entry's parent.) */
  var itemCount: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ConfusionMatrixEntryMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    @scala.inline
    def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
  }
}
