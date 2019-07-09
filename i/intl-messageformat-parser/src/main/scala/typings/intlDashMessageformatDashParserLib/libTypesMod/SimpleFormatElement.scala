package typings
package intlDashMessageformatDashParserLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleFormatElement[T /* <: TYPE */] extends BaseElement[T] {
  var style: js.UndefOr[java.lang.String] = js.undefined
}

object SimpleFormatElement {
  @scala.inline
  def apply[T /* <: TYPE */](`type`: T, value: java.lang.String, location: Location = null, style: java.lang.String = null): SimpleFormatElement[T] = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SimpleFormatElement[T]]
  }
}

