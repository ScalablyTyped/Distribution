package typings.jqueryDotFinger

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryFingerEventObject extends JQueryEventObject {
  /**
    * The absolute x delta since the last event.
    */
  var adx: Double = js.native
  /**
    * The absolute y delta since the last event.
    */
  var ady: Double = js.native
  /**
    * The direction of the motion. Value is 1 if the motion is 'positive'
    * (left-to-right or top-to-bottom) or -1 if 'negative'(right-to-left or
    * bottom-to-top).
    */
  var direction: Double = js.native
  /**
    * The x delta since the last event.
    */
  var dx: Double = js.native
  /**
    * The y delta since the last event.
    */
  var dy: Double = js.native
  /**
    * The orientation of the motion. Adjusted by $.Finger.motionThreshhold.
    * Value is 'horizontal' or 'vertical'.
    */
  var orientation: String = js.native
  /**
    * The x page coordinate.
    */
  var x: Double = js.native
  /**
    * The y page coordinate.
    */
  var y: Double = js.native
}

