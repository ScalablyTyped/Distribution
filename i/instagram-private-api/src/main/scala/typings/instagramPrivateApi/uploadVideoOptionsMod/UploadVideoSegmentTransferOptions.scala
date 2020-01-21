package typings.instagramPrivateApi.uploadVideoOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadVideoSegmentTransferOptions extends js.Object {
  var ruploadParams: js.Any
  var segment: Buffer
  var startOffset: Double
  var streamId: String
  var transferId: String
  var waterfallId: String
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
}

