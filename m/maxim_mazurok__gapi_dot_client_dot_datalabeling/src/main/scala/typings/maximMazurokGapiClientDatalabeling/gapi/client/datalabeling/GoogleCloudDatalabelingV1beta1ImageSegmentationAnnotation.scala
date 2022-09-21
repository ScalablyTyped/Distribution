package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation extends StObject {
  
  /** The mapping between rgb color and annotation spec. The key is the rgb color represented in format of rgb(0, 0, 0). The value is the AnnotationSpec. */
  var annotationColors: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.datalabeling.gapi.client.datalabeling.GoogleCloudDatalabelingV1beta1AnnotationSpec}
    */ typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation & TopLevel[Any]
  ] = js.undefined
  
  /** A byte string of a full image's color map. */
  var imageBytes: js.UndefOr[String] = js.undefined
  
  /** Image format. */
  var mimeType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation](x: Self) {
    
    inline def setAnnotationColors(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.datalabeling.gapi.client.datalabeling.GoogleCloudDatalabelingV1beta1AnnotationSpec}
      */ typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation & TopLevel[Any]
    ): Self = StObject.set(x, "annotationColors", value.asInstanceOf[js.Any])
    
    inline def setAnnotationColorsUndefined: Self = StObject.set(x, "annotationColors", js.undefined)
    
    inline def setImageBytes(value: String): Self = StObject.set(x, "imageBytes", value.asInstanceOf[js.Any])
    
    inline def setImageBytesUndefined: Self = StObject.set(x, "imageBytes", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
