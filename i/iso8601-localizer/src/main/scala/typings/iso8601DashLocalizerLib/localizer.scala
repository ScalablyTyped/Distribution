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
    localize: js.Function0[java.lang.String],
    returnAs: js.Function1[java.lang.String, localizer],
    to: js.Function1[scala.Double, localizer]
  ): localizer = {
    val __obj = js.Dynamic.literal(localize = localize, returnAs = returnAs, to = to)
  
    __obj.asInstanceOf[localizer]
  }
}

