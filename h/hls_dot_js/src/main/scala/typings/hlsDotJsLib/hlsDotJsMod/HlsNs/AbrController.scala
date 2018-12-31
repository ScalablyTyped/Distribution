package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * (default: internal ABR controller)
  * Customized Adaptive Bitrate Streaming Controller.
  */
trait AbrController extends js.Object {
  /**
    * get: capping/max level value that could be used by ABR Controller
    * set: capping/max level value that could be used by ABR Controller
    */
  var autoLevelCapping: scala.Double
  /**
    *  accumulated handled events
    */
  var handledEvents: js.Array[java.lang.String]
  /**
    * current hls instance
    */
  var hls: hlsDotJsLib.hlsDotJsMod.Hls
  /**
    * last fragments corresponding level
    */
  var lastLoadedFragLevel: scala.Double
  /**
    * get: next auto-quality levele/force next auto-quality level that should be returned
    * set: next auto-quality levele/force next auto-quality level that should be returned
    *  - currently used for emergency switch down
    */
  var nextAutoLevel: scala.Double
  var useGenericHandler: scala.Boolean
}

