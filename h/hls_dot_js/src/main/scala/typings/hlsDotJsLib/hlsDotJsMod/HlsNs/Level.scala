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
           * level bitrate
           */
  var bitrate: scala.Double
  /**
           * used codecs
           */
  var codecs: java.lang.String
  /**
           * level details
           */
  var details: LevelDetails
  /**
           * video height
           */
  var height: scala.Double
  /**
           * level name
           */
  var name: java.lang.String
  /**
           * level url. might contain sever items if failover/redundant streams are found in the manifest
           */
  var url: js.Array[java.lang.String]
  /**
           * video width
           */
  var width: scala.Double
}

