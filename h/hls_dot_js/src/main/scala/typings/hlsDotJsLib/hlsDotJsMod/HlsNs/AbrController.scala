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

object AbrController {
  @scala.inline
  def apply(
    autoLevelCapping: scala.Double,
    handledEvents: js.Array[java.lang.String],
    hls: hlsDotJsLib.hlsDotJsMod.Hls,
    lastLoadedFragLevel: scala.Double,
    nextAutoLevel: scala.Double,
    useGenericHandler: scala.Boolean
  ): AbrController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoLevelCapping")(autoLevelCapping)
    __obj.updateDynamic("handledEvents")(handledEvents)
    __obj.updateDynamic("hls")(hls)
    __obj.updateDynamic("lastLoadedFragLevel")(lastLoadedFragLevel)
    __obj.updateDynamic("nextAutoLevel")(nextAutoLevel)
    __obj.updateDynamic("useGenericHandler")(useGenericHandler)
    __obj.asInstanceOf[AbrController]
  }
}

