package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ObjectTrackingFrame extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1ObjectTrackingFrameOps[Self <: GoogleCloudDatalabelingV1beta1ObjectTrackingFrame] (val x: Self) extends AnyVal {
    
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
    def setBoundingPoly(value: GoogleCloudDatalabelingV1beta1BoundingPoly): Self = this.set("boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingPoly: Self = this.set("boundingPoly", js.undefined)
    
    @scala.inline
    def setNormalizedBoundingPoly(value: GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly): Self = this.set("normalizedBoundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedBoundingPoly: Self = this.set("normalizedBoundingPoly", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffset: Self = this.set("timeOffset", js.undefined)
  }
}
