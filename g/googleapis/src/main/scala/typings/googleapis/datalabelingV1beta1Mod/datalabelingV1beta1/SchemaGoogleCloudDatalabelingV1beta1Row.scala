package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1Row extends StObject {
  
  /**
    * The annotation spec of the ground truth label for this row.
    */
  var annotationSpec: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  /**
    * A list of the confusion matrix entries. One entry for each possible predicted label.
    */
  var entries: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrixEntry]] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1Row {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1Row]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1Row](x: Self) {
    
    inline def setAnnotationSpec(value: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    inline def setEntries(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrixEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrixEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
