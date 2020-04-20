package typings.hlsJs.mod

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
  var autoLevelCapping: Double
  /**
    *  accumulated handled events
    */
  var handledEvents: js.Array[String]
  /**
    * current hls instance
    */
  var hls: Hls
  /**
    * last fragments corresponding level
    */
  var lastLoadedFragLevel: Double
  /**
    * get: next auto-quality levele/force next auto-quality level that should be returned
    * set: next auto-quality levele/force next auto-quality level that should be returned
    *  - currently used for emergency switch down
    */
  var nextAutoLevel: Double
  var useGenericHandler: Boolean
}

object AbrController {
  @scala.inline
  def apply(
    autoLevelCapping: Double,
    handledEvents: js.Array[String],
    hls: Hls,
    lastLoadedFragLevel: Double,
    nextAutoLevel: Double,
    useGenericHandler: Boolean
  ): AbrController = {
    val __obj = js.Dynamic.literal(autoLevelCapping = autoLevelCapping.asInstanceOf[js.Any], handledEvents = handledEvents.asInstanceOf[js.Any], hls = hls.asInstanceOf[js.Any], lastLoadedFragLevel = lastLoadedFragLevel.asInstanceOf[js.Any], nextAutoLevel = nextAutoLevel.asInstanceOf[js.Any], useGenericHandler = useGenericHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbrController]
  }
}

