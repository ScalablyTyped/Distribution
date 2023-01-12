package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1VideoClassificationConfig extends StObject {
  
  /**
    * Required. The list of annotation spec set configs. Since watching a video clip takes much longer time than an image, we support label with multiple AnnotationSpecSet at the same
    * time. Labels in each AnnotationSpecSet will be shown in a group to contributors. Contributors can select one or more (depending on whether to allow multi label) from each group.
    */
  var annotationSpecSetConfigs: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig]] = js.undefined
  
  /** Optional. Option to apply shot detection on the video. */
  var applyShotDetection: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDatalabelingV1beta1VideoClassificationConfig {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1VideoClassificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1VideoClassificationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1VideoClassificationConfig] (val x: Self) extends AnyVal {
    
    inline def setAnnotationSpecSetConfigs(value: js.Array[GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig]): Self = StObject.set(x, "annotationSpecSetConfigs", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetConfigsUndefined: Self = StObject.set(x, "annotationSpecSetConfigs", js.undefined)
    
    inline def setAnnotationSpecSetConfigsVarargs(value: GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig*): Self = StObject.set(x, "annotationSpecSetConfigs", js.Array(value*))
    
    inline def setApplyShotDetection(value: Boolean): Self = StObject.set(x, "applyShotDetection", value.asInstanceOf[js.Any])
    
    inline def setApplyShotDetectionUndefined: Self = StObject.set(x, "applyShotDetection", js.undefined)
  }
}
