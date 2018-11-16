package typings
package jqueryDotFingerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryFingerEventObject
  extends jqueryLib.JQueryEventObject {
  /**
        * The absolute x delta since the last event.
        */
  var adx: scala.Double = js.native
  /**
        * The absolute y delta since the last event.
        */
  var ady: scala.Double = js.native
  /**
        * The direction of the motion. Value is 1 if the motion is 'positive'
        * (left-to-right or top-to-bottom) or -1 if 'negative'(right-to-left or
        * bottom-to-top).
        */
  var direction: scala.Double = js.native
  /**
        * The x delta since the last event.
        */
  var dx: scala.Double = js.native
  /**
        * The y delta since the last event.
        */
  var dy: scala.Double = js.native
  /**
        * The orientation of the motion. Adjusted by $.Finger.motionThreshhold.
        * Value is 'horizontal' or 'vertical'.
        */
  var orientation: java.lang.String = js.native
  /**
        * The x page coordinate.
        */
  var x: scala.Double = js.native
  /**
        * The y page coordinate.
        */
  var y: scala.Double = js.native
}

