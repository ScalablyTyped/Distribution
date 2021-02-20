package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig extends StObject {
  
  /** Optional. If allow_multi_label is true, contributors are able to choose multiple labels from one annotation spec set. */
  var allowMultiLabel: js.UndefOr[Boolean] = js.native
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMultiLabel(value: Boolean): Self = StObject.set(x, "allowMultiLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultiLabelUndefined: Self = StObject.set(x, "allowMultiLabel", js.undefined)
    
    @scala.inline
    def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
  }
}
