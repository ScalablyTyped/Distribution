package typings.instagramPrivateApi.uploadVideoOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadVideoSegmentInitOptions extends js.Object {
  
  var ruploadParams: js.Any = js.native
  
  var startOffset: Double = js.native
  
  var streamId: String = js.native
  
  var transferId: String = js.native
  
  var waterfallId: String = js.native
}
object UploadVideoSegmentInitOptions {
  
  @scala.inline
  def apply(
    ruploadParams: js.Any,
    startOffset: Double,
    streamId: String,
    transferId: String,
    waterfallId: String
  ): UploadVideoSegmentInitOptions = {
    val __obj = js.Dynamic.literal(ruploadParams = ruploadParams.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], transferId = transferId.asInstanceOf[js.Any], waterfallId = waterfallId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadVideoSegmentInitOptions]
  }
  
  @scala.inline
  implicit class UploadVideoSegmentInitOptionsOps[Self <: UploadVideoSegmentInitOptions] (val x: Self) extends AnyVal {
    
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
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: String): Self = this.set("streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferId(value: String): Self = this.set("transferId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterfallId(value: String): Self = this.set("waterfallId", value.asInstanceOf[js.Any])
  }
}
