package typings.instagramPrivateApi.uploadVideoOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadVideoSegmentInitOptions extends js.Object {
  var ruploadParams: js.Any
  var startOffset: Double
  var streamId: String
  var transferId: String
  var waterfallId: String
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
}

