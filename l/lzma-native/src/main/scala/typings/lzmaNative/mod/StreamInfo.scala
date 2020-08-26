package typings.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamInfo extends js.Object {
  var blocks: Double = js.native
  var checks: Double = js.native
  var fileSize: Double = js.native
  var memlimit: Double = js.native
  var streamPadding: Double = js.native
  var streams: Double = js.native
  var uncompressedSize: Double = js.native
}

object StreamInfo {
  @scala.inline
  def apply(
    blocks: Double,
    checks: Double,
    fileSize: Double,
    memlimit: Double,
    streamPadding: Double,
    streams: Double,
    uncompressedSize: Double
  ): StreamInfo = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], memlimit = memlimit.asInstanceOf[js.Any], streamPadding = streamPadding.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamInfo]
  }
  @scala.inline
  implicit class StreamInfoOps[Self <: StreamInfo] (val x: Self) extends AnyVal {
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
    def setBlocks(value: Double): Self = this.set("blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecks(value: Double): Self = this.set("checks", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemlimit(value: Double): Self = this.set("memlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamPadding(value: Double): Self = this.set("streamPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreams(value: Double): Self = this.set("streams", value.asInstanceOf[js.Any])
    @scala.inline
    def setUncompressedSize(value: Double): Self = this.set("uncompressedSize", value.asInstanceOf[js.Any])
  }
  
}

