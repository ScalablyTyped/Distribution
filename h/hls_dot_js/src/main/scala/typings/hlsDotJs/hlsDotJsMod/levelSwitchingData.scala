package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelSwitchingData extends js.Object {
  var attrs: js.Any
  var audioCodec: String
  var bitrate: Double
  var fragmentError: Boolean
  var height: Double
  var level: Double
  var loadError: Double
  var name: String
  var unknownCodecs: js.Array[String]
  var url: js.Array[String]
  var urlId: Double
  var videoCodec: String
  var width: Double
}

object levelSwitchingData {
  @scala.inline
  def apply(
    attrs: js.Any,
    audioCodec: String,
    bitrate: Double,
    fragmentError: Boolean,
    height: Double,
    level: Double,
    loadError: Double,
    name: String,
    unknownCodecs: js.Array[String],
    url: js.Array[String],
    urlId: Double,
    videoCodec: String,
    width: Double
  ): levelSwitchingData = {
    val __obj = js.Dynamic.literal(attrs = attrs, audioCodec = audioCodec, bitrate = bitrate, fragmentError = fragmentError, height = height, level = level, loadError = loadError, name = name, unknownCodecs = unknownCodecs, url = url, urlId = urlId, videoCodec = videoCodec, width = width)
  
    __obj.asInstanceOf[levelSwitchingData]
  }
}

