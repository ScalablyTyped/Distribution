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
    val __obj = js.Dynamic.literal(blocks = blocks, checks = checks, fileSize = fileSize, memlimit = memlimit, streamPadding = streamPadding, streams = streams, uncompressedSize = uncompressedSize)
  
    __obj.asInstanceOf[StreamInfo]
  }
}

