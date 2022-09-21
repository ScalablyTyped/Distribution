package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingConfig extends StObject {
  
  /**
    * Required. Annotation spec set resource name.
    */
  var annotationSpecSet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Videos will be cut to smaller clips to make it easier for labelers to work on. Users can configure is field in seconds, if not set, default value is 20s.
    */
  var clipLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The overlap length between different video clips. Users can configure is field in seconds, if not set, default value is 0.3s.
    */
  var overlapLength: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingConfig](x: Self) {
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetNull: Self = StObject.set(x, "annotationSpecSet", null)
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    inline def setClipLength(value: Double): Self = StObject.set(x, "clipLength", value.asInstanceOf[js.Any])
    
    inline def setClipLengthNull: Self = StObject.set(x, "clipLength", null)
    
    inline def setClipLengthUndefined: Self = StObject.set(x, "clipLength", js.undefined)
    
    inline def setOverlapLength(value: Double): Self = StObject.set(x, "overlapLength", value.asInstanceOf[js.Any])
    
    inline def setOverlapLengthNull: Self = StObject.set(x, "overlapLength", null)
    
    inline def setOverlapLengthUndefined: Self = StObject.set(x, "overlapLength", js.undefined)
  }
}
