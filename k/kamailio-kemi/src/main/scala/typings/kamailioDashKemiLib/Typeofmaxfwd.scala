package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmaxfwd extends js.Object {
  def is_maxfwd_lt(limit: scala.Double): scala.Double
  def process_maxfwd(limit: scala.Double): scala.Double
}

object Typeofmaxfwd {
  @scala.inline
  def apply(is_maxfwd_lt: scala.Double => scala.Double, process_maxfwd: scala.Double => scala.Double): Typeofmaxfwd = {
    val __obj = js.Dynamic.literal(is_maxfwd_lt = js.Any.fromFunction1(is_maxfwd_lt), process_maxfwd = js.Any.fromFunction1(process_maxfwd))
  
    __obj.asInstanceOf[Typeofmaxfwd]
  }
}

