package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstatsd extends js.Object {
  def statsd_decr(key: String): Double
  def statsd_gauge(key: String, `val`: String): Double
  def statsd_incr(key: String): Double
  def statsd_set(key: String, `val`: String): Double
  def statsd_start(key: String): Double
  def statsd_stop(key: String): Double
}

object Typeofstatsd {
  @scala.inline
  def apply(
    statsd_decr: String => Double,
    statsd_gauge: (String, String) => Double,
    statsd_incr: String => Double,
    statsd_set: (String, String) => Double,
    statsd_start: String => Double,
    statsd_stop: String => Double
  ): Typeofstatsd = {
    val __obj = js.Dynamic.literal(statsd_decr = js.Any.fromFunction1(statsd_decr), statsd_gauge = js.Any.fromFunction2(statsd_gauge), statsd_incr = js.Any.fromFunction1(statsd_incr), statsd_set = js.Any.fromFunction2(statsd_set), statsd_start = js.Any.fromFunction1(statsd_start), statsd_stop = js.Any.fromFunction1(statsd_stop))
  
    __obj.asInstanceOf[Typeofstatsd]
  }
}

