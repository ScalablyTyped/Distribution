package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrr extends js.Object {
  def add_rr_param(sparam: java.lang.String): scala.Double
  def check_route_param(sre: java.lang.String): scala.Double
  def is_direction(dir: java.lang.String): scala.Double
  def loose_route(): scala.Double
  def record_route(): scala.Double
  def record_route_params(params: java.lang.String): scala.Double
  def remove_record_route(): scala.Double
}

object Typeofrr {
  @scala.inline
  def apply(
    add_rr_param: java.lang.String => scala.Double,
    check_route_param: java.lang.String => scala.Double,
    is_direction: java.lang.String => scala.Double,
    loose_route: () => scala.Double,
    record_route: () => scala.Double,
    record_route_params: java.lang.String => scala.Double,
    remove_record_route: () => scala.Double
  ): Typeofrr = {
    val __obj = js.Dynamic.literal(add_rr_param = js.Any.fromFunction1(add_rr_param), check_route_param = js.Any.fromFunction1(check_route_param), is_direction = js.Any.fromFunction1(is_direction), loose_route = js.Any.fromFunction0(loose_route), record_route = js.Any.fromFunction0(record_route), record_route_params = js.Any.fromFunction1(record_route_params), remove_record_route = js.Any.fromFunction0(remove_record_route))
  
    __obj.asInstanceOf[Typeofrr]
  }
}

