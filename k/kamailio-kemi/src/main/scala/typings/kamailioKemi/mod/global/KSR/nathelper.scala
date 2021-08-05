package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nathelper {
  
  @JSGlobal("KSR.nathelper")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addContactAlias(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("add_contact_alias")().asInstanceOf[Double]
  
  inline def addContactAliasAddr(ip_str: String, port_str: String, proto_str: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add_contact_alias_addr")(ip_str.asInstanceOf[js.Any], port_str.asInstanceOf[js.Any], proto_str.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def addRcvParam(upos: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("add_rcv_param")(upos.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fixNatedContact(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fix_nated_contact")().asInstanceOf[Double]
  
  inline def fixNatedRegister(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fix_nated_register")().asInstanceOf[Double]
  
  inline def fixNatedSdp(level: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fix_nated_sdp")(level.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fixNatedSdpIp(level: Double, ip: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fix_nated_sdp_ip")(level.asInstanceOf[js.Any], ip.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def handleRuriAlias(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_ruri_alias")().asInstanceOf[Double]
  
  inline def isRfc1918(address: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_rfc1918")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def natUacTest(tests: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nat_uac_test")(tests.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setContactAlias(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_contact_alias")().asInstanceOf[Double]
}
