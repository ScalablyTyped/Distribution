package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a Level object represents a given quality level and contains quality level related info
  */
trait Level extends js.Object {
  /**
    * attribute list
    */
  var attrs: js.Array[LevelAttr]
  /**
    * audio codec
    */
  var audioCodec: java.lang.String
  /**
    * level bitrate
    */
  var bitrate: scala.Double
  /**
    * level details
    */
  var details: js.UndefOr[LevelDetails] = js.undefined
  /**
    * whether there is any error on the fragment
    */
  var fragmentError: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * video height
    */
  var height: scala.Double
  /**
    * index of the level
    */
  var level: js.UndefOr[scala.Double] = js.undefined
  /**
    * error code
    */
  var loadError: scala.Double
  /**
    * level name
    */
  var name: java.lang.String
  /**
    * array of unrecognized codecs
    */
  var unkownCodecs: js.Array[java.lang.String]
  /**
    * level url. might contain several items if failover/redundant streams are found in the manifest
    */
  var url: js.Array[java.lang.String]
  /**
    * index of current url from url[] array
    */
  var urlId: scala.Double
  /**
    * video codec
    */
  var videoCodec: java.lang.String
  /**
    * video width
    */
  var width: scala.Double
}

object Level {
  @scala.inline
  def apply(
    attrs: js.Array[LevelAttr],
    audioCodec: java.lang.String,
    bitrate: scala.Double,
    height: scala.Double,
    loadError: scala.Double,
    name: java.lang.String,
    unkownCodecs: js.Array[java.lang.String],
    url: js.Array[java.lang.String],
    urlId: scala.Double,
    videoCodec: java.lang.String,
    width: scala.Double,
    details: LevelDetails = null,
    fragmentError: js.UndefOr[scala.Boolean] = js.undefined,
    level: scala.Int | scala.Double = null
  ): Level = {
    val __obj = js.Dynamic.literal(attrs = attrs, audioCodec = audioCodec, bitrate = bitrate, height = height, loadError = loadError, name = name, unkownCodecs = unkownCodecs, url = url, urlId = urlId, videoCodec = videoCodec, width = width)
    if (details != null) __obj.updateDynamic("details")(details)
    if (!js.isUndefined(fragmentError)) __obj.updateDynamic("fragmentError")(fragmentError)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

