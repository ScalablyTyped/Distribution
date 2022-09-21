package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation extends StObject {
  
  /**
    * The mapping between rgb color and annotation spec. The key is the rgb color represented in format of rgb(0, 0, 0). The value is the AnnotationSpec.
    */
  var annotationColors: js.UndefOr[StringDictionary[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec] | Null] = js.undefined
  
  /**
    * A byte string of a full image's color map.
    */
  var imageBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Image format.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation](x: Self) {
    
    inline def setAnnotationColors(value: StringDictionary[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpec]): Self = StObject.set(x, "annotationColors", value.asInstanceOf[js.Any])
    
    inline def setAnnotationColorsNull: Self = StObject.set(x, "annotationColors", null)
    
    inline def setAnnotationColorsUndefined: Self = StObject.set(x, "annotationColors", js.undefined)
    
    inline def setImageBytes(value: String): Self = StObject.set(x, "imageBytes", value.asInstanceOf[js.Any])
    
    inline def setImageBytesNull: Self = StObject.set(x, "imageBytes", null)
    
    inline def setImageBytesUndefined: Self = StObject.set(x, "imageBytes", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
