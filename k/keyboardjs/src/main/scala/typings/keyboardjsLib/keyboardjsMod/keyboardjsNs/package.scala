package typings
package keyboardjsLib.keyboardjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keyboardjsNs {
  /**
       * Callback function when a keyCombo is triggered.
       * @see KeyEvent
       */
  type Callback = js.Function1[/* e */ js.UndefOr[KeyEvent], scala.Unit]
}
