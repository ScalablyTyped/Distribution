package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdrouting extends js.Object {
  def do_routing(grp_id: scala.Double): scala.Double
  def do_routing_furi(): scala.Double
  def goes_to_gw(): scala.Double
  def goes_to_gw_type(`type`: scala.Double): scala.Double
  def is_from_gw(): scala.Double
  def is_from_gw_type(`type`: scala.Double): scala.Double
  def is_from_gw_type_flags(`type`: scala.Double, flags: scala.Double): scala.Double
  def next_routing(): scala.Double
  def use_next_gw(): scala.Double
}

object Typeofdrouting {
  @scala.inline
  def apply(
    do_routing: scala.Double => scala.Double,
    do_routing_furi: () => scala.Double,
    goes_to_gw: () => scala.Double,
    goes_to_gw_type: scala.Double => scala.Double,
    is_from_gw: () => scala.Double,
    is_from_gw_type: scala.Double => scala.Double,
    is_from_gw_type_flags: (scala.Double, scala.Double) => scala.Double,
    next_routing: () => scala.Double,
    use_next_gw: () => scala.Double
  ): Typeofdrouting = {
    val __obj = js.Dynamic.literal(do_routing = js.Any.fromFunction1(do_routing), do_routing_furi = js.Any.fromFunction0(do_routing_furi), goes_to_gw = js.Any.fromFunction0(goes_to_gw), goes_to_gw_type = js.Any.fromFunction1(goes_to_gw_type), is_from_gw = js.Any.fromFunction0(is_from_gw), is_from_gw_type = js.Any.fromFunction1(is_from_gw_type), is_from_gw_type_flags = js.Any.fromFunction2(is_from_gw_type_flags), next_routing = js.Any.fromFunction0(next_routing), use_next_gw = js.Any.fromFunction0(use_next_gw))
  
    __obj.asInstanceOf[Typeofdrouting]
  }
}

