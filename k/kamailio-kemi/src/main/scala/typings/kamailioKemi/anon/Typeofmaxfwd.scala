package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmaxfwd extends js.Object {
  def is_maxfwd_lt(limit: Double): Double
  def process_maxfwd(limit: Double): Double
}

object Typeofmaxfwd {
  @scala.inline
  def apply(is_maxfwd_lt: Double => Double, process_maxfwd: Double => Double): Typeofmaxfwd = {
    val __obj = js.Dynamic.literal(is_maxfwd_lt = js.Any.fromFunction1(is_maxfwd_lt), process_maxfwd = js.Any.fromFunction1(process_maxfwd))
    __obj.asInstanceOf[Typeofmaxfwd]
  }
}

