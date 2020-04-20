package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrr extends js.Object {
  def add_rr_param(sparam: String): Double
  def check_route_param(sre: String): Double
  def is_direction(dir: String): Double
  def loose_route(): Double
  def record_route(): Double
  def record_route_params(params: String): Double
  def remove_record_route(): Double
}

object Typeofrr {
  @scala.inline
  def apply(
    add_rr_param: String => Double,
    check_route_param: String => Double,
    is_direction: String => Double,
    loose_route: () => Double,
    record_route: () => Double,
    record_route_params: String => Double,
    remove_record_route: () => Double
  ): Typeofrr = {
    val __obj = js.Dynamic.literal(add_rr_param = js.Any.fromFunction1(add_rr_param), check_route_param = js.Any.fromFunction1(check_route_param), is_direction = js.Any.fromFunction1(is_direction), loose_route = js.Any.fromFunction0(loose_route), record_route = js.Any.fromFunction0(record_route), record_route_params = js.Any.fromFunction1(record_route_params), remove_record_route = js.Any.fromFunction0(remove_record_route))
    __obj.asInstanceOf[Typeofrr]
  }
}

