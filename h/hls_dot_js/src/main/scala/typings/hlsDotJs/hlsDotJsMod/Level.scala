package typings.hlsDotJs.hlsDotJsMod

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
  var audioCodec: String
  /**
    * level bitrate
    */
  var bitrate: Double
  /**
    * level details
    */
  var details: js.UndefOr[LevelDetails] = js.undefined
  /**
    * whether there is any error on the fragment
    */
  var fragmentError: js.UndefOr[Boolean] = js.undefined
  /**
    * video height
    */
  var height: Double
  /**
    * index of the level
    */
  var level: js.UndefOr[Double] = js.undefined
  /**
    * error code
    */
  var loadError: Double
  /**
    * level name
    */
  var name: String
  /**
    * array of unrecognized codecs
    */
  var unkownCodecs: js.Array[String]
  /**
    * level url. might contain several items if failover/redundant streams are found in the manifest
    */
  var url: js.Array[String]
  /**
    * index of current url from url[] array
    */
  var urlId: Double
  /**
    * video codec
    */
  var videoCodec: String
  /**
    * video width
    */
  var width: Double
}

object Level {
  @scala.inline
  def apply(
    attrs: js.Array[LevelAttr],
    audioCodec: String,
    bitrate: Double,
    height: Double,
    loadError: Double,
    name: String,
    unkownCodecs: js.Array[String],
    url: js.Array[String],
    urlId: Double,
    videoCodec: String,
    width: Double,
    details: LevelDetails = null,
    fragmentError: js.UndefOr[Boolean] = js.undefined,
    level: Int | Double = null
  ): Level = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], audioCodec = audioCodec.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], loadError = loadError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unkownCodecs = unkownCodecs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlId = urlId.asInstanceOf[js.Any], videoCodec = videoCodec.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentError)) __obj.updateDynamic("fragmentError")(fragmentError.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

