package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelSwitchingData extends js.Object {
  var attrs: js.Any
  var audioCodec: java.lang.String
  var bitrate: scala.Double
  var fragmentError: scala.Boolean
  var height: scala.Double
  var level: scala.Double
  var loadError: scala.Double
  var name: java.lang.String
  var unknownCodecs: js.Array[java.lang.String]
  var url: js.Array[java.lang.String]
  var urlId: scala.Double
  var videoCodec: java.lang.String
  var width: scala.Double
}

object levelSwitchingData {
  @scala.inline
  def apply(
    attrs: js.Any,
    audioCodec: java.lang.String,
    bitrate: scala.Double,
    fragmentError: scala.Boolean,
    height: scala.Double,
    level: scala.Double,
    loadError: scala.Double,
    name: java.lang.String,
    unknownCodecs: js.Array[java.lang.String],
    url: js.Array[java.lang.String],
    urlId: scala.Double,
    videoCodec: java.lang.String,
    width: scala.Double
  ): levelSwitchingData = {
    val __obj = js.Dynamic.literal(attrs = attrs, audioCodec = audioCodec, bitrate = bitrate, fragmentError = fragmentError, height = height, level = level, loadError = loadError, name = name, unknownCodecs = unknownCodecs, url = url, urlId = urlId, videoCodec = videoCodec, width = width)
  
    __obj.asInstanceOf[levelSwitchingData]
  }
}

