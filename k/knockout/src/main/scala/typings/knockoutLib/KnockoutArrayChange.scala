package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutArrayChange[T] extends js.Object {
  var index: scala.Double
  var moved: js.UndefOr[scala.Double] = js.undefined
  var status: knockoutLib.knockoutLibStrings.added | knockoutLib.knockoutLibStrings.deleted | knockoutLib.knockoutLibStrings.retained
  var value: T
}

