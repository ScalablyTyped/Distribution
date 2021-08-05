package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lcr {
  
  @JSGlobal("KSR.lcr")
  @js.native
  val ^ : js.Any = js.native
  
  inline def defunctGw(defunct_period: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defunct_gw")(defunct_period.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fromAnyGw(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("from_any_gw")().asInstanceOf[Double]
  
  inline def fromAnyGwAddr(addr_str: String, transport: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("from_any_gw_addr")(addr_str.asInstanceOf[js.Any], transport.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fromGw(lcr_id: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("from_gw")(lcr_id.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fromGwAddr(lcr_id: Double, addr_str: String, transport: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("from_gw_addr")(lcr_id.asInstanceOf[js.Any], addr_str.asInstanceOf[js.Any], transport.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def inactivateGw(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inactivate_gw")().asInstanceOf[Double]
  
  inline def loadGws(lcr_id: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("load_gws")(lcr_id.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def loadGwsFuri(lcr_id: Double, ruri_user: String, from_uri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("load_gws_furi")(lcr_id.asInstanceOf[js.Any], ruri_user.asInstanceOf[js.Any], from_uri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def loadGwsRuser(lcr_id: Double, ruri_user: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("load_gws_ruser")(lcr_id.asInstanceOf[js.Any], ruri_user.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def nextGw(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("next_gw")().asInstanceOf[Double]
  
  inline def toAnyGw(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("to_any_gw")().asInstanceOf[Double]
  
  inline def toAnyGwAddr(addr_str: String, transport: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("to_any_gw_addr")(addr_str.asInstanceOf[js.Any], transport.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toGw(lcr_id: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("to_gw")(lcr_id.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toGwAddr(lcr_id: Double, addr_str: String, transport: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("to_gw_addr")(lcr_id.asInstanceOf[js.Any], addr_str.asInstanceOf[js.Any], transport.asInstanceOf[js.Any])).asInstanceOf[Double]
}
