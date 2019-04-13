package typings
package keyboardjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keyboardjsMod {
  /**
    * Callback function when a keyCombo is triggered.
    * @see KeyEvent
    */
  type Callback = js.Function1[/* e */ js.UndefOr[KeyEvent], scala.Unit]
}
