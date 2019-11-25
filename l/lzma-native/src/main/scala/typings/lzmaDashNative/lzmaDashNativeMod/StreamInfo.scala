package typings.lzmaDashNative.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamInfo extends js.Object {
  var blocks: Double
  var checks: Double
  var fileSize: Double
  var memlimit: Double
  var streamPadding: Double
  var streams: Double
  var uncompressedSize: Double
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
}

