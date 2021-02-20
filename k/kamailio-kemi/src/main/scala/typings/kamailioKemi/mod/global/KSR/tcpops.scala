package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tcpops {
  
  @JSGlobal("KSR.tcpops.tcp_conid_alive")
  @js.native
  def tcpConidAlive(i_conid: Double): Double = js.native
  
  @JSGlobal("KSR.tcpops.tcp_conid_state")
  @js.native
  def tcpConidState(i_conid: Double): Double = js.native
  
  @JSGlobal("KSR.tcpops.tcp_enable_closed_event")
  @js.native
  def tcpEnableClosedEvent(): Double = js.native
  
  @JSGlobal("KSR.tcpops.tcp_enable_closed_event_cid")
  @js.native
  def tcpEnableClosedEventCid(i_conid: Double): Double = js.native
  
  @JSGlobal("KSR.tcpops.tcp_keepalive_disable")
  @js.native
  def tcpKeepaliveDisable(): Double = js.native
  
  @JSGlobal("KSR.tcpops.tcp_keepalive_disable_cid")
  @js.native
  def tcpKeepaliveDisableCid(i_con: Double): Double = js.native
  
  @JSGlobal("KSR.tcpops.tcp_keepalive_enable")
  @js.native
  def tcpKeepaliveEnable(i_idle: Double, i_cnt: Double, i_intvl: Double): Double = js.native
  
  @JSGlobal("KSR.tcpops.tcp_keepalive_enable_cid")
  @js.native
  def tcpKeepaliveEnableCid(i_con: Double, i_idle: Double, i_cnt: Double, i_intvl: Double): Double = js.native
  
  @JSGlobal("KSR.tcpops.tcp_set_connection_lifetime")
  @js.native
  def tcpSetConnectionLifetime(i_time: Double): Double = js.native
  
  @JSGlobal("KSR.tcpops.tcp_set_connection_lifetime_cid")
  @js.native
  def tcpSetConnectionLifetimeCid(i_conid: Double, i_time: Double): Double = js.native
}
