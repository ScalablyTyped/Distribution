package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdrouting extends js.Object {
  def do_routing(grp_id: Double): Double
  def do_routing_furi(): Double
  def goes_to_gw(): Double
  def goes_to_gw_type(`type`: Double): Double
  def is_from_gw(): Double
  def is_from_gw_type(`type`: Double): Double
  def is_from_gw_type_flags(`type`: Double, flags: Double): Double
  def next_routing(): Double
  def use_next_gw(): Double
}

object Typeofdrouting {
  @scala.inline
  def apply(
    do_routing: Double => Double,
    do_routing_furi: () => Double,
    goes_to_gw: () => Double,
    goes_to_gw_type: Double => Double,
    is_from_gw: () => Double,
    is_from_gw_type: Double => Double,
    is_from_gw_type_flags: (Double, Double) => Double,
    next_routing: () => Double,
    use_next_gw: () => Double
  ): Typeofdrouting = {
    val __obj = js.Dynamic.literal(do_routing = js.Any.fromFunction1(do_routing), do_routing_furi = js.Any.fromFunction0(do_routing_furi), goes_to_gw = js.Any.fromFunction0(goes_to_gw), goes_to_gw_type = js.Any.fromFunction1(goes_to_gw_type), is_from_gw = js.Any.fromFunction0(is_from_gw), is_from_gw_type = js.Any.fromFunction1(is_from_gw_type), is_from_gw_type_flags = js.Any.fromFunction2(is_from_gw_type_flags), next_routing = js.Any.fromFunction0(next_routing), use_next_gw = js.Any.fromFunction0(use_next_gw))
  
    __obj.asInstanceOf[Typeofdrouting]
  }
}

