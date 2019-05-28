package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstatsd extends js.Object {
  def statsd_decr(key: java.lang.String): scala.Double
  def statsd_gauge(key: java.lang.String, `val`: java.lang.String): scala.Double
  def statsd_incr(key: java.lang.String): scala.Double
  def statsd_set(key: java.lang.String, `val`: java.lang.String): scala.Double
  def statsd_start(key: java.lang.String): scala.Double
  def statsd_stop(key: java.lang.String): scala.Double
}

object Typeofstatsd {
  @scala.inline
  def apply(
    statsd_decr: java.lang.String => scala.Double,
    statsd_gauge: (java.lang.String, java.lang.String) => scala.Double,
    statsd_incr: java.lang.String => scala.Double,
    statsd_set: (java.lang.String, java.lang.String) => scala.Double,
    statsd_start: java.lang.String => scala.Double,
    statsd_stop: java.lang.String => scala.Double
  ): Typeofstatsd = {
    val __obj = js.Dynamic.literal(statsd_decr = js.Any.fromFunction1(statsd_decr), statsd_gauge = js.Any.fromFunction2(statsd_gauge), statsd_incr = js.Any.fromFunction1(statsd_incr), statsd_set = js.Any.fromFunction2(statsd_set), statsd_start = js.Any.fromFunction1(statsd_start), statsd_stop = js.Any.fromFunction1(statsd_stop))
  
    __obj.asInstanceOf[Typeofstatsd]
  }
}

