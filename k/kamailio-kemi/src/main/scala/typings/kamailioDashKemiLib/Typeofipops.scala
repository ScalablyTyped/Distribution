package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofipops extends js.Object {
  def compare_ips(_sval1: java.lang.String, _sval2: java.lang.String): scala.Double
  def compare_pure_ips(_sval1: java.lang.String, _sval2: java.lang.String): scala.Double
  def detailed_ip_type(_sval: java.lang.String, _dpv: java.lang.String): scala.Double
  def detailed_ipv4_type(_sval: java.lang.String, _dpv: java.lang.String): scala.Double
  def detailed_ipv6_type(_sval: java.lang.String, _dpv: java.lang.String): scala.Double
  def dns_int_match_ip(vhn: java.lang.String, vip: java.lang.String): scala.Double
  def dns_query(naptrname: java.lang.String, pvid: java.lang.String): scala.Double
  def dns_sys_match_ip(vhn: java.lang.String, vip: java.lang.String): scala.Double
  def ip_is_in_subnet(_sval1: java.lang.String, _sval2: java.lang.String): scala.Double
  def ip_type(sval: java.lang.String): scala.Double
  def is_in_subnet(_sval1: java.lang.String, _sval2: java.lang.String): scala.Double
  def is_ip(sval: java.lang.String): scala.Double
  def is_ip4(sval: java.lang.String): scala.Double
  def is_ip6(sval: java.lang.String): scala.Double
  def is_ip6_reference(sval: java.lang.String): scala.Double
  def is_ip_rfc1918(sval: java.lang.String): scala.Double
  def is_pure_ip(sval: java.lang.String): scala.Double
  def naptr_query(naptrname: java.lang.String, pvid: java.lang.String): scala.Double
  def srv_query(naptrname: java.lang.String, pvid: java.lang.String): scala.Double
}

object Typeofipops {
  @scala.inline
  def apply(
    compare_ips: (java.lang.String, java.lang.String) => scala.Double,
    compare_pure_ips: (java.lang.String, java.lang.String) => scala.Double,
    detailed_ip_type: (java.lang.String, java.lang.String) => scala.Double,
    detailed_ipv4_type: (java.lang.String, java.lang.String) => scala.Double,
    detailed_ipv6_type: (java.lang.String, java.lang.String) => scala.Double,
    dns_int_match_ip: (java.lang.String, java.lang.String) => scala.Double,
    dns_query: (java.lang.String, java.lang.String) => scala.Double,
    dns_sys_match_ip: (java.lang.String, java.lang.String) => scala.Double,
    ip_is_in_subnet: (java.lang.String, java.lang.String) => scala.Double,
    ip_type: java.lang.String => scala.Double,
    is_in_subnet: (java.lang.String, java.lang.String) => scala.Double,
    is_ip: java.lang.String => scala.Double,
    is_ip4: java.lang.String => scala.Double,
    is_ip6: java.lang.String => scala.Double,
    is_ip6_reference: java.lang.String => scala.Double,
    is_ip_rfc1918: java.lang.String => scala.Double,
    is_pure_ip: java.lang.String => scala.Double,
    naptr_query: (java.lang.String, java.lang.String) => scala.Double,
    srv_query: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofipops = {
    val __obj = js.Dynamic.literal(compare_ips = js.Any.fromFunction2(compare_ips), compare_pure_ips = js.Any.fromFunction2(compare_pure_ips), detailed_ip_type = js.Any.fromFunction2(detailed_ip_type), detailed_ipv4_type = js.Any.fromFunction2(detailed_ipv4_type), detailed_ipv6_type = js.Any.fromFunction2(detailed_ipv6_type), dns_int_match_ip = js.Any.fromFunction2(dns_int_match_ip), dns_query = js.Any.fromFunction2(dns_query), dns_sys_match_ip = js.Any.fromFunction2(dns_sys_match_ip), ip_is_in_subnet = js.Any.fromFunction2(ip_is_in_subnet), ip_type = js.Any.fromFunction1(ip_type), is_in_subnet = js.Any.fromFunction2(is_in_subnet), is_ip = js.Any.fromFunction1(is_ip), is_ip4 = js.Any.fromFunction1(is_ip4), is_ip6 = js.Any.fromFunction1(is_ip6), is_ip6_reference = js.Any.fromFunction1(is_ip6_reference), is_ip_rfc1918 = js.Any.fromFunction1(is_ip_rfc1918), is_pure_ip = js.Any.fromFunction1(is_pure_ip), naptr_query = js.Any.fromFunction2(naptr_query), srv_query = js.Any.fromFunction2(srv_query))
  
    __obj.asInstanceOf[Typeofipops]
  }
}

