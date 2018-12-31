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

