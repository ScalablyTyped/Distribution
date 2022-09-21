package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ImagePolylineAnnotation extends StObject {
  
  /**
    * Label of this polyline.
    */
  var annotationSpec: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  var normalizedPolyline: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1NormalizedPolyline] = js.undefined
  
  var polyline: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1Polyline] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ImagePolylineAnnotation {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ImagePolylineAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ImagePolylineAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ImagePolylineAnnotation](x: Self) {
    
    inline def setAnnotationSpec(value: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    inline def setNormalizedPolyline(value: SchemaGoogleCloudDatalabelingV1beta1NormalizedPolyline): Self = StObject.set(x, "normalizedPolyline", value.asInstanceOf[js.Any])
    
    inline def setNormalizedPolylineUndefined: Self = StObject.set(x, "normalizedPolyline", js.undefined)
    
    inline def setPolyline(value: SchemaGoogleCloudDatalabelingV1beta1Polyline): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
  }
}
