package typings.heremaps.HNs.mapeventsNs

import typings.heremaps.HNs.mathNs.BitMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PointerNs {
  /**
    * Indicates which pointer device buttons are being pressed, expressed as a bitmask. Bit values are:
    *
    *   - 0: No button pressed
    *   - 1: Left mouse button pressed, or Touch contact or Pen contact
    *   - 2: Right mouse button pressed, or Pen contact with barrel button pressed
    *   - 4: Middle mouse button pressed
    */
  // TODO not sure this is the right interpretation of the docs
  type Buttons = BitMask
}
