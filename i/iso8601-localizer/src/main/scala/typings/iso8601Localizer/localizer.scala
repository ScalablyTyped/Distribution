package typings.iso8601Localizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait localizer extends js.Object {
  def localize(): String
  def returnAs(as: String): localizer
  def to(offset: Double): localizer
}

object localizer {
  @scala.inline
  def apply(localize: () => String, returnAs: String => localizer, to: Double => localizer): localizer = {
    val __obj = js.Dynamic.literal(localize = js.Any.fromFunction0(localize), returnAs = js.Any.fromFunction1(returnAs), to = js.Any.fromFunction1(to))
    __obj.asInstanceOf[localizer]
  }
}

