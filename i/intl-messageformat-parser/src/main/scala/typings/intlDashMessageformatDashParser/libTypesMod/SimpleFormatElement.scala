package typings.intlDashMessageformatDashParser.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleFormatElement[T /* <: TYPE */, S /* <: Skeleton */] extends BaseElement[T] {
  var style: js.UndefOr[String | S | Null] = js.undefined
}

object SimpleFormatElement {
  @scala.inline
  def apply[T /* <: TYPE */, S /* <: Skeleton */](`type`: T, value: String, location: Location = null, style: String | S = null): SimpleFormatElement[T, S] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleFormatElement[T, S]]
  }
}

