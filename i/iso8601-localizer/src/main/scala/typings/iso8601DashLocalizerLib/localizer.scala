package typings
package iso8601DashLocalizerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait localizer extends js.Object {
  def localize(): java.lang.String
  def returnAs(as: java.lang.String): localizer
  def to(offset: scala.Double): localizer
}

object localizer {
  @scala.inline
  def apply(
    localize: () => java.lang.String,
    returnAs: java.lang.String => localizer,
    to: scala.Double => localizer
  ): localizer = {
    val __obj = js.Dynamic.literal(localize = js.Any.fromFunction0(localize), returnAs = js.Any.fromFunction1(returnAs), to = js.Any.fromFunction1(to))
  
    __obj.asInstanceOf[localizer]
  }
}

