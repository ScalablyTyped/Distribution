package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdrouting extends js.Object {
  def do_routing(grp_id: Double): Double = js.native
  def do_routing_furi(): Double = js.native
  def goes_to_gw(): Double = js.native
  def goes_to_gw_type(`type`: Double): Double = js.native
  def is_from_gw(): Double = js.native
  def is_from_gw_type(`type`: Double): Double = js.native
  def is_from_gw_type_flags(`type`: Double, flags: Double): Double = js.native
  def next_routing(): Double = js.native
  def use_next_gw(): Double = js.native
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
  @scala.inline
  implicit class TypeofdroutingOps[Self <: Typeofdrouting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDo_routing(value: Double => Double): Self = this.set("do_routing", js.Any.fromFunction1(value))
    @scala.inline
    def setDo_routing_furi(value: () => Double): Self = this.set("do_routing_furi", js.Any.fromFunction0(value))
    @scala.inline
    def setGoes_to_gw(value: () => Double): Self = this.set("goes_to_gw", js.Any.fromFunction0(value))
    @scala.inline
    def setGoes_to_gw_type(value: Double => Double): Self = this.set("goes_to_gw_type", js.Any.fromFunction1(value))
    @scala.inline
    def setIs_from_gw(value: () => Double): Self = this.set("is_from_gw", js.Any.fromFunction0(value))
    @scala.inline
    def setIs_from_gw_type(value: Double => Double): Self = this.set("is_from_gw_type", js.Any.fromFunction1(value))
    @scala.inline
    def setIs_from_gw_type_flags(value: (Double, Double) => Double): Self = this.set("is_from_gw_type_flags", js.Any.fromFunction2(value))
    @scala.inline
    def setNext_routing(value: () => Double): Self = this.set("next_routing", js.Any.fromFunction0(value))
    @scala.inline
    def setUse_next_gw(value: () => Double): Self = this.set("use_next_gw", js.Any.fromFunction0(value))
  }
  
}

