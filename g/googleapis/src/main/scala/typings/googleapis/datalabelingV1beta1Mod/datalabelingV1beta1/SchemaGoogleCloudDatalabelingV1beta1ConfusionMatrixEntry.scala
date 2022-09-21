package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrixEntry extends StObject {
  
  /**
    * The annotation spec of a predicted label.
    */
  var annotationSpec: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  /**
    * Number of items predicted to have this label. (The ground truth label for these items is the `Row.annotationSpec` of this entry's parent.)
    */
  var itemCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrixEntry {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrixEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrixEntry]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrixEntry](x: Self) {
    
    inline def setAnnotationSpec(value: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountNull: Self = StObject.set(x, "itemCount", null)
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
  }
}
