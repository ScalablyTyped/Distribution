package typings
package lzmaDashNativeLib.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamInfo extends js.Object {
  var blocks: scala.Double
  var checks: scala.Double
  var fileSize: scala.Double
  var memlimit: scala.Double
  var streamPadding: scala.Double
  var streams: scala.Double
  var uncompressedSize: scala.Double
}

object StreamInfo {
  @scala.inline
  def apply(
    blocks: scala.Double,
    checks: scala.Double,
    fileSize: scala.Double,
    memlimit: scala.Double,
    streamPadding: scala.Double,
    streams: scala.Double,
    uncompressedSize: scala.Double
  ): StreamInfo = {
    val __obj = js.Dynamic.literal(blocks = blocks, checks = checks, fileSize = fileSize, memlimit = memlimit, streamPadding = streamPadding, streams = streams, uncompressedSize = uncompressedSize)
  
    __obj.asInstanceOf[StreamInfo]
  }
}

