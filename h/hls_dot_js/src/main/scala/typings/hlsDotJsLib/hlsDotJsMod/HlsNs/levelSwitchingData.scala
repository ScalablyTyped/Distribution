package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attrs")(attrs)
    __obj.updateDynamic("audioCodec")(audioCodec)
    __obj.updateDynamic("bitrate")(bitrate)
    __obj.updateDynamic("fragmentError")(fragmentError)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("loadError")(loadError)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("unknownCodecs")(unknownCodecs)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("urlId")(urlId)
    __obj.updateDynamic("videoCodec")(videoCodec)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[levelSwitchingData]
  }
}

