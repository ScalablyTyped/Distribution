package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tcpops {
  
  @JSGlobal("KSR.tcpops")
  @js.native
  val ^ : js.Any = js.native
  
  inline def tcpConidAlive(i_conid: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp_conid_alive")(i_conid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def tcpConidState(i_conid: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp_conid_state")(i_conid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def tcpEnableClosedEvent(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp_enable_closed_event")().asInstanceOf[Double]
  
  inline def tcpEnableClosedEventCid(i_conid: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp_enable_closed_event_cid")(i_conid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def tcpKeepaliveDisable(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp_keepalive_disable")().asInstanceOf[Double]
  
  inline def tcpKeepaliveDisableCid(i_con: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp_keepalive_disable_cid")(i_con.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def tcpKeepaliveEnable(i_idle: Double, i_cnt: Double, i_intvl: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tcp_keepalive_enable")(i_idle.asInstanceOf[js.Any], i_cnt.asInstanceOf[js.Any], i_intvl.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tcpKeepaliveEnableCid(i_con: Double, i_idle: Double, i_cnt: Double, i_intvl: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tcp_keepalive_enable_cid")(i_con.asInstanceOf[js.Any], i_idle.asInstanceOf[js.Any], i_cnt.asInstanceOf[js.Any], i_intvl.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tcpSetConnectionLifetime(i_time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp_set_connection_lifetime")(i_time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def tcpSetConnectionLifetimeCid(i_conid: Double, i_time: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tcp_set_connection_lifetime_cid")(i_conid.asInstanceOf[js.Any], i_time.asInstanceOf[js.Any])).asInstanceOf[Double]
}
