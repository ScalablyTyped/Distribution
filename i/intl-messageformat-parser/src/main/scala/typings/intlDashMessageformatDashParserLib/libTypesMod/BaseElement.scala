package typings
package intlDashMessageformatDashParserLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseElement[T /* <: TYPE */] extends js.Object {
  var location: js.UndefOr[Location] = js.undefined
  var `type`: T
  var value: java.lang.String
}

object BaseElement {
  @scala.inline
  def apply[T /* <: TYPE */](`type`: T, value: java.lang.String, location: Location = null): BaseElement[T] = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[BaseElement[T]]
  }
}

