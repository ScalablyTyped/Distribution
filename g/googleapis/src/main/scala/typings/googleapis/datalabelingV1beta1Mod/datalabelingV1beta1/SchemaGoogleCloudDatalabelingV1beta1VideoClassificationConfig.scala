package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1VideoClassificationConfig extends StObject {
  
  /**
    * Required. The list of annotation spec set configs. Since watching a video clip takes much longer time than an image, we support label with multiple AnnotationSpecSet at the same time. Labels in each AnnotationSpecSet will be shown in a group to contributors. Contributors can select one or more (depending on whether to allow multi label) from each group.
    */
  var annotationSpecSetConfigs: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig]] = js.undefined
  
  /**
    * Optional. Option to apply shot detection on the video.
    */
  var applyShotDetection: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1VideoClassificationConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1VideoClassificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1VideoClassificationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1VideoClassificationConfig](x: Self) {
    
    inline def setAnnotationSpecSetConfigs(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig]): Self = StObject.set(x, "annotationSpecSetConfigs", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetConfigsUndefined: Self = StObject.set(x, "annotationSpecSetConfigs", js.undefined)
    
    inline def setAnnotationSpecSetConfigsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig*): Self = StObject.set(x, "annotationSpecSetConfigs", js.Array(value*))
    
    inline def setApplyShotDetection(value: Boolean): Self = StObject.set(x, "applyShotDetection", value.asInstanceOf[js.Any])
    
    inline def setApplyShotDetectionNull: Self = StObject.set(x, "applyShotDetection", null)
    
    inline def setApplyShotDetectionUndefined: Self = StObject.set(x, "applyShotDetection", js.undefined)
  }
}
