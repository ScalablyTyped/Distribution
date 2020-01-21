package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftcpops extends js.Object {
  def tcp_conid_alive(i_conid: Double): Double
  def tcp_conid_state(i_conid: Double): Double
  def tcp_enable_closed_event(): Double
  def tcp_enable_closed_event_cid(i_conid: Double): Double
  def tcp_keepalive_disable(): Double
  def tcp_keepalive_disable_cid(i_con: Double): Double
  def tcp_keepalive_enable(i_idle: Double, i_cnt: Double, i_intvl: Double): Double
  def tcp_keepalive_enable_cid(i_con: Double, i_idle: Double, i_cnt: Double, i_intvl: Double): Double
  def tcp_set_connection_lifetime(i_time: Double): Double
  def tcp_set_connection_lifetime_cid(i_conid: Double, i_time: Double): Double
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
}

