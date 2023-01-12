package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1Row extends StObject {
  
  /** The annotation spec of the ground truth label for this row. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  /** A list of the confusion matrix entries. One entry for each possible predicted label. */
  var entries: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry]] = js.undefined
}
object GoogleCloudDatalabelingV1beta1Row {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Row]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1Row] (val x: Self) extends AnyVal {
    
    inline def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    inline def setEntries(value: js.Array[GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
