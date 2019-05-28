package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnathelper extends js.Object {
  def add_contact_alias(): scala.Double
  def add_contact_alias_addr(ip_str: java.lang.String, port_str: java.lang.String, proto_str: java.lang.String): scala.Double
  def add_rcv_param(upos: scala.Double): scala.Double
  def fix_nated_contact(): scala.Double
  def fix_nated_register(): scala.Double
  def fix_nated_sdp(level: scala.Double): scala.Double
  def fix_nated_sdp_ip(level: scala.Double, ip: java.lang.String): scala.Double
  def handle_ruri_alias(): scala.Double
  def is_rfc1918(address: java.lang.String): scala.Double
  def nat_uac_test(tests: scala.Double): scala.Double
  def set_contact_alias(): scala.Double
}

object Typeofnathelper {
  @scala.inline
  def apply(
    add_contact_alias: () => scala.Double,
    add_contact_alias_addr: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    add_rcv_param: scala.Double => scala.Double,
    fix_nated_contact: () => scala.Double,
    fix_nated_register: () => scala.Double,
    fix_nated_sdp: scala.Double => scala.Double,
    fix_nated_sdp_ip: (scala.Double, java.lang.String) => scala.Double,
    handle_ruri_alias: () => scala.Double,
    is_rfc1918: java.lang.String => scala.Double,
    nat_uac_test: scala.Double => scala.Double,
    set_contact_alias: () => scala.Double
  ): Typeofnathelper = {
    val __obj = js.Dynamic.literal(add_contact_alias = js.Any.fromFunction0(add_contact_alias), add_contact_alias_addr = js.Any.fromFunction3(add_contact_alias_addr), add_rcv_param = js.Any.fromFunction1(add_rcv_param), fix_nated_contact = js.Any.fromFunction0(fix_nated_contact), fix_nated_register = js.Any.fromFunction0(fix_nated_register), fix_nated_sdp = js.Any.fromFunction1(fix_nated_sdp), fix_nated_sdp_ip = js.Any.fromFunction2(fix_nated_sdp_ip), handle_ruri_alias = js.Any.fromFunction0(handle_ruri_alias), is_rfc1918 = js.Any.fromFunction1(is_rfc1918), nat_uac_test = js.Any.fromFunction1(nat_uac_test), set_contact_alias = js.Any.fromFunction0(set_contact_alias))
  
    __obj.asInstanceOf[Typeofnathelper]
  }
}

