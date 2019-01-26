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

