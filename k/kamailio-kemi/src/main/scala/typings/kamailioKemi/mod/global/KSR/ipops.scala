package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipops {
  
  @JSGlobal("KSR.ipops")
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareIps(_sval1: String, _sval2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare_ips")(_sval1.asInstanceOf[js.Any], _sval2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def comparePureIps(_sval1: String, _sval2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare_pure_ips")(_sval1.asInstanceOf[js.Any], _sval2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def detailedIpType(_sval: String, _dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("detailed_ip_type")(_sval.asInstanceOf[js.Any], _dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def detailedIpv4Type(_sval: String, _dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("detailed_ipv4_type")(_sval.asInstanceOf[js.Any], _dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def detailedIpv6Type(_sval: String, _dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("detailed_ipv6_type")(_sval.asInstanceOf[js.Any], _dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def dnsIntMatchIp(vhn: String, vip: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dns_int_match_ip")(vhn.asInstanceOf[js.Any], vip.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def dnsQuery(naptrname: String, pvid: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dns_query")(naptrname.asInstanceOf[js.Any], pvid.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def dnsSysMatchIp(vhn: String, vip: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dns_sys_match_ip")(vhn.asInstanceOf[js.Any], vip.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def ipIsInSubnet(_sval1: String, _sval2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ip_is_in_subnet")(_sval1.asInstanceOf[js.Any], _sval2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def ipType(sval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ip_type")(sval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isInSubnet(_sval1: String, _sval2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("is_in_subnet")(_sval1.asInstanceOf[js.Any], _sval2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isIp(sval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_ip")(sval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isIp4(sval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_ip4")(sval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isIp6(sval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_ip6")(sval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isIp6Reference(sval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_ip6_reference")(sval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isIpRfc1918(sval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_ip_rfc1918")(sval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isPureIp(sval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_pure_ip")(sval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def naptrQuery(naptrname: String, pvid: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("naptr_query")(naptrname.asInstanceOf[js.Any], pvid.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def srvQuery(naptrname: String, pvid: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("srv_query")(naptrname.asInstanceOf[js.Any], pvid.asInstanceOf[js.Any])).asInstanceOf[Double]
}
