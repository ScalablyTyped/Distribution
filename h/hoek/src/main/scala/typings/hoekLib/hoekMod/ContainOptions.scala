package typings
package hoekLib.hoekMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContainOptions extends js.Object {
  /** Perform a deep comparison of the values? */
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow only one occurrence of each value? */
  var once: js.UndefOr[scala.Boolean] = js.undefined
  /** Don't allow values not explicitly listed? */
  var only: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow partial match of the values? */
  var part: js.UndefOr[scala.Boolean] = js.undefined
}

