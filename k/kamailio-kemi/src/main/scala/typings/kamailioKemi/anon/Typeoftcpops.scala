package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftcpops extends js.Object {
  def tcp_conid_alive(i_conid: Double): Double = js.native
  def tcp_conid_state(i_conid: Double): Double = js.native
  def tcp_enable_closed_event(): Double = js.native
  def tcp_enable_closed_event_cid(i_conid: Double): Double = js.native
  def tcp_keepalive_disable(): Double = js.native
  def tcp_keepalive_disable_cid(i_con: Double): Double = js.native
  def tcp_keepalive_enable(i_idle: Double, i_cnt: Double, i_intvl: Double): Double = js.native
  def tcp_keepalive_enable_cid(i_con: Double, i_idle: Double, i_cnt: Double, i_intvl: Double): Double = js.native
  def tcp_set_connection_lifetime(i_time: Double): Double = js.native
  def tcp_set_connection_lifetime_cid(i_conid: Double, i_time: Double): Double = js.native
}

object Typeoftcpops {
  @scala.inline
  def apply(
    tcp_conid_alive: Double => Double,
    tcp_conid_state: Double => Double,
    tcp_enable_closed_event: () => Double,
    tcp_enable_closed_event_cid: Double => Double,
    tcp_keepalive_disable: () => Double,
    tcp_keepalive_disable_cid: Double => Double,
    tcp_keepalive_enable: (Double, Double, Double) => Double,
    tcp_keepalive_enable_cid: (Double, Double, Double, Double) => Double,
    tcp_set_connection_lifetime: Double => Double,
    tcp_set_connection_lifetime_cid: (Double, Double) => Double
  ): Typeoftcpops = {
    val __obj = js.Dynamic.literal(tcp_conid_alive = js.Any.fromFunction1(tcp_conid_alive), tcp_conid_state = js.Any.fromFunction1(tcp_conid_state), tcp_enable_closed_event = js.Any.fromFunction0(tcp_enable_closed_event), tcp_enable_closed_event_cid = js.Any.fromFunction1(tcp_enable_closed_event_cid), tcp_keepalive_disable = js.Any.fromFunction0(tcp_keepalive_disable), tcp_keepalive_disable_cid = js.Any.fromFunction1(tcp_keepalive_disable_cid), tcp_keepalive_enable = js.Any.fromFunction3(tcp_keepalive_enable), tcp_keepalive_enable_cid = js.Any.fromFunction4(tcp_keepalive_enable_cid), tcp_set_connection_lifetime = js.Any.fromFunction1(tcp_set_connection_lifetime), tcp_set_connection_lifetime_cid = js.Any.fromFunction2(tcp_set_connection_lifetime_cid))
    __obj.asInstanceOf[Typeoftcpops]
  }
  @scala.inline
  implicit class TypeoftcpopsOps[Self <: Typeoftcpops] (val x: Self) extends AnyVal {
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
    def setTcp_conid_alive(value: Double => Double): Self = this.set("tcp_conid_alive", js.Any.fromFunction1(value))
    @scala.inline
    def setTcp_conid_state(value: Double => Double): Self = this.set("tcp_conid_state", js.Any.fromFunction1(value))
    @scala.inline
    def setTcp_enable_closed_event(value: () => Double): Self = this.set("tcp_enable_closed_event", js.Any.fromFunction0(value))
    @scala.inline
    def setTcp_enable_closed_event_cid(value: Double => Double): Self = this.set("tcp_enable_closed_event_cid", js.Any.fromFunction1(value))
    @scala.inline
    def setTcp_keepalive_disable(value: () => Double): Self = this.set("tcp_keepalive_disable", js.Any.fromFunction0(value))
    @scala.inline
    def setTcp_keepalive_disable_cid(value: Double => Double): Self = this.set("tcp_keepalive_disable_cid", js.Any.fromFunction1(value))
    @scala.inline
    def setTcp_keepalive_enable(value: (Double, Double, Double) => Double): Self = this.set("tcp_keepalive_enable", js.Any.fromFunction3(value))
    @scala.inline
    def setTcp_keepalive_enable_cid(value: (Double, Double, Double, Double) => Double): Self = this.set("tcp_keepalive_enable_cid", js.Any.fromFunction4(value))
    @scala.inline
    def setTcp_set_connection_lifetime(value: Double => Double): Self = this.set("tcp_set_connection_lifetime", js.Any.fromFunction1(value))
    @scala.inline
    def setTcp_set_connection_lifetime_cid(value: (Double, Double) => Double): Self = this.set("tcp_set_connection_lifetime_cid", js.Any.fromFunction2(value))
  }
  
}

