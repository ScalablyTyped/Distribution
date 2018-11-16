package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushpinOptions extends js.Object {
  /**
           * The distance in pixels from the top of the page where the elements stops being fixed
           * @default Infinity
           */
  var bottom: scala.Double = js.native
  /**
           * The offset from the top the element will be fixed at
           * @default 0
           */
  var offset: scala.Double = js.native
  /**
           * The distance in pixels from the top of the page where the element becomes fixed
           * @default 0
           */
  var top: scala.Double = js.native
  /**
           * Callback function called when pushpin position changes. You are provided with a position string
           * @default null
           */
  @JSName("onPositionChange")
  def `onPositionChange_pin-bottom`(`this`: Pushpin, position: materializeDashCssLib.materializeDashCssLibStrings.`pin-bottom`): scala.Unit = js.native
  /**
           * Callback function called when pushpin position changes. You are provided with a position string
           * @default null
           */
  @JSName("onPositionChange")
  def `onPositionChange_pin-top`(`this`: Pushpin, position: materializeDashCssLib.materializeDashCssLibStrings.`pin-top`): scala.Unit = js.native
  /**
           * Callback function called when pushpin position changes. You are provided with a position string
           * @default null
           */
  @JSName("onPositionChange")
  def onPositionChange_pinned(`this`: Pushpin, position: materializeDashCssLib.materializeDashCssLibStrings.pinned): scala.Unit = js.native
}

