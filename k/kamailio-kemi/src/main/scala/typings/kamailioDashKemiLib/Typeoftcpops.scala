package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftcpops extends js.Object {
  def tcp_conid_alive(i_conid: scala.Double): scala.Double
  def tcp_conid_state(i_conid: scala.Double): scala.Double
  def tcp_enable_closed_event(): scala.Double
  def tcp_enable_closed_event_cid(i_conid: scala.Double): scala.Double
  def tcp_keepalive_disable(): scala.Double
  def tcp_keepalive_disable_cid(i_con: scala.Double): scala.Double
  def tcp_keepalive_enable(i_idle: scala.Double, i_cnt: scala.Double, i_intvl: scala.Double): scala.Double
  def tcp_keepalive_enable_cid(i_con: scala.Double, i_idle: scala.Double, i_cnt: scala.Double, i_intvl: scala.Double): scala.Double
  def tcp_set_connection_lifetime(i_time: scala.Double): scala.Double
  def tcp_set_connection_lifetime_cid(i_conid: scala.Double, i_time: scala.Double): scala.Double
}

object Typeoftcpops {
  @scala.inline
  def apply(
    tcp_conid_alive: scala.Double => scala.Double,
    tcp_conid_state: scala.Double => scala.Double,
    tcp_enable_closed_event: () => scala.Double,
    tcp_enable_closed_event_cid: scala.Double => scala.Double,
    tcp_keepalive_disable: () => scala.Double,
    tcp_keepalive_disable_cid: scala.Double => scala.Double,
    tcp_keepalive_enable: (scala.Double, scala.Double, scala.Double) => scala.Double,
    tcp_keepalive_enable_cid: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Double,
    tcp_set_connection_lifetime: scala.Double => scala.Double,
    tcp_set_connection_lifetime_cid: (scala.Double, scala.Double) => scala.Double
  ): Typeoftcpops = {
    val __obj = js.Dynamic.literal(tcp_conid_alive = js.Any.fromFunction1(tcp_conid_alive), tcp_conid_state = js.Any.fromFunction1(tcp_conid_state), tcp_enable_closed_event = js.Any.fromFunction0(tcp_enable_closed_event), tcp_enable_closed_event_cid = js.Any.fromFunction1(tcp_enable_closed_event_cid), tcp_keepalive_disable = js.Any.fromFunction0(tcp_keepalive_disable), tcp_keepalive_disable_cid = js.Any.fromFunction1(tcp_keepalive_disable_cid), tcp_keepalive_enable = js.Any.fromFunction3(tcp_keepalive_enable), tcp_keepalive_enable_cid = js.Any.fromFunction4(tcp_keepalive_enable_cid), tcp_set_connection_lifetime = js.Any.fromFunction1(tcp_set_connection_lifetime), tcp_set_connection_lifetime_cid = js.Any.fromFunction2(tcp_set_connection_lifetime_cid))
  
    __obj.asInstanceOf[Typeoftcpops]
  }
}

