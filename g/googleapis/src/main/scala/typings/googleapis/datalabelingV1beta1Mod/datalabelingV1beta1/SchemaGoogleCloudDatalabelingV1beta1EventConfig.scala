package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1EventConfig extends StObject {
  
  /**
    * Required. The list of annotation spec set resource name. Similar to video classification, we support selecting event from multiple AnnotationSpecSet at the same time.
    */
  var annotationSpecSets: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Videos will be cut to smaller clips to make it easier for labelers to work on. Users can configure is field in seconds, if not set, default value is 60s.
    */
  var clipLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The overlap length between different video clips. Users can configure is field in seconds, if not set, default value is 1s.
    */
  var overlapLength: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1EventConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1EventConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1EventConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1EventConfig](x: Self) {
    
    inline def setAnnotationSpecSets(value: js.Array[String]): Self = StObject.set(x, "annotationSpecSets", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetsNull: Self = StObject.set(x, "annotationSpecSets", null)
    
    inline def setAnnotationSpecSetsUndefined: Self = StObject.set(x, "annotationSpecSets", js.undefined)
    
    inline def setAnnotationSpecSetsVarargs(value: String*): Self = StObject.set(x, "annotationSpecSets", js.Array(value*))
    
    inline def setClipLength(value: Double): Self = StObject.set(x, "clipLength", value.asInstanceOf[js.Any])
    
    inline def setClipLengthNull: Self = StObject.set(x, "clipLength", null)
    
    inline def setClipLengthUndefined: Self = StObject.set(x, "clipLength", js.undefined)
    
    inline def setOverlapLength(value: Double): Self = StObject.set(x, "overlapLength", value.asInstanceOf[js.Any])
    
    inline def setOverlapLengthNull: Self = StObject.set(x, "overlapLength", null)
    
    inline def setOverlapLengthUndefined: Self = StObject.set(x, "overlapLength", js.undefined)
  }
}
