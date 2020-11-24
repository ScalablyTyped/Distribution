package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation extends js.Object {
  
  /** The mapping between rgb color and annotation spec. The key is the rgb color represented in format of rgb(0, 0, 0). The value is the AnnotationSpec. */
  var annotationColors: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.datalabeling.gapi.client.datalabeling.GoogleCloudDatalabelingV1beta1AnnotationSpec}
    */ typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation with TopLevel[js.Any]
  ] = js.native
  
  /** A byte string of a full image's color map. */
  var imageBytes: js.UndefOr[String] = js.native
  
  /** Image format. */
  var mimeType: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotationOps[Self <: GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotationColors(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.datalabeling.gapi.client.datalabeling.GoogleCloudDatalabelingV1beta1AnnotationSpec}
      */ typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.GoogleCloudDatalabelingV1beta1ImageSegmentationAnnotation with TopLevel[js.Any]
    ): Self = this.set("annotationColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationColors: Self = this.set("annotationColors", js.undefined)
    
    @scala.inline
    def setImageBytes(value: String): Self = this.set("imageBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBytes: Self = this.set("imageBytes", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
}
