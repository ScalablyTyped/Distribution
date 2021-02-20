package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ObjectTrackingFrame extends StObject {
  
  var boundingPoly: js.UndefOr[GoogleCloudDatalabelingV1beta1BoundingPoly] = js.native
  
  var normalizedBoundingPoly: js.UndefOr[GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly] = js.native
  
  /** The time offset of this frame relative to the beginning of the video. */
  var timeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ObjectTrackingFrame {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ObjectTrackingFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ObjectTrackingFrameMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ObjectTrackingFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPoly(value: GoogleCloudDatalabelingV1beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setNormalizedBoundingPoly(value: GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly): Self = StObject.set(x, "normalizedBoundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedBoundingPolyUndefined: Self = StObject.set(x, "normalizedBoundingPoly", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
