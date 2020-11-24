package typings.instagramPrivateApi.uploadVideoOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadSegmentedVideoOptions extends UploadVideoOptions {
  
  var retryContext: js.UndefOr[UploadRetryContext] = js.native
  
  var segmentDivider: js.UndefOr[SegmentDivider] = js.native
  
  var segments: js.UndefOr[js.Array[Buffer]] = js.native
}
object UploadSegmentedVideoOptions {
  
  @scala.inline
  def apply(duration: Double, video: Buffer): UploadSegmentedVideoOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSegmentedVideoOptions]
  }
  
  @scala.inline
  implicit class UploadSegmentedVideoOptionsOps[Self <: UploadSegmentedVideoOptions] (val x: Self) extends AnyVal {
    
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
    def setRetryContext(value: UploadRetryContext): Self = this.set("retryContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryContext: Self = this.set("retryContext", js.undefined)
    
    @scala.inline
    def setSegmentDivider(value: /* options */ typings.instagramPrivateApi.anon.Buffer => js.Array[Buffer]): Self = this.set("segmentDivider", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSegmentDivider: Self = this.set("segmentDivider", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: Buffer*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[Buffer]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
  }
}
