package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingFrame extends StObject {
  
  var boundingPoly: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1BoundingPoly] = js.undefined
  
  var normalizedBoundingPoly: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1NormalizedBoundingPoly] = js.undefined
  
  /**
    * The time offset of this frame relative to the beginning of the video.
    */
  var timeOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingFrame {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingFrame]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ObjectTrackingFrame](x: Self) {
    
    inline def setBoundingPoly(value: SchemaGoogleCloudDatalabelingV1beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setNormalizedBoundingPoly(value: SchemaGoogleCloudDatalabelingV1beta1NormalizedBoundingPoly): Self = StObject.set(x, "normalizedBoundingPoly", value.asInstanceOf[js.Any])
    
    inline def setNormalizedBoundingPolyUndefined: Self = StObject.set(x, "normalizedBoundingPoly", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetNull: Self = StObject.set(x, "timeOffset", null)
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
