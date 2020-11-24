package typings.instagramPrivateApi.uploadVideoOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadVideoSegmentTransferOptions extends js.Object {
  
  var ruploadParams: js.Any = js.native
  
  var segment: Buffer = js.native
  
  var startOffset: Double = js.native
  
  var streamId: String = js.native
  
  var transferId: String = js.native
  
  var waterfallId: String = js.native
}
object UploadVideoSegmentTransferOptions {
  
  @scala.inline
  def apply(
    ruploadParams: js.Any,
    segment: Buffer,
    startOffset: Double,
    streamId: String,
    transferId: String,
    waterfallId: String
  ): UploadVideoSegmentTransferOptions = {
    val __obj = js.Dynamic.literal(ruploadParams = ruploadParams.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], transferId = transferId.asInstanceOf[js.Any], waterfallId = waterfallId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadVideoSegmentTransferOptions]
  }
  
  @scala.inline
  implicit class UploadVideoSegmentTransferOptionsOps[Self <: UploadVideoSegmentTransferOptions] (val x: Self) extends AnyVal {
    
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
    def setRuploadParams(value: js.Any): Self = this.set("ruploadParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegment(value: Buffer): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: String): Self = this.set("streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferId(value: String): Self = this.set("transferId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterfallId(value: String): Self = this.set("waterfallId", value.asInstanceOf[js.Any])
  }
}
