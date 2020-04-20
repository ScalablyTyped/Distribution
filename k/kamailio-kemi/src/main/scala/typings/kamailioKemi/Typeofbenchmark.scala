package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbenchmark extends js.Object {
  def bm_log_timer(tname: String): Double
  def bm_start_timer(tname: String): Double
}

object Typeofbenchmark {
  @scala.inline
  def apply(bm_log_timer: String => Double, bm_start_timer: String => Double): Typeofbenchmark = {
    val __obj = js.Dynamic.literal(bm_log_timer = js.Any.fromFunction1(bm_log_timer), bm_start_timer = js.Any.fromFunction1(bm_start_timer))
    __obj.asInstanceOf[Typeofbenchmark]
  }
}

