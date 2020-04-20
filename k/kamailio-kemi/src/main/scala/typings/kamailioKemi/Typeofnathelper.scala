package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnathelper extends js.Object {
  def add_contact_alias(): Double
  def add_contact_alias_addr(ip_str: String, port_str: String, proto_str: String): Double
  def add_rcv_param(upos: Double): Double
  def fix_nated_contact(): Double
  def fix_nated_register(): Double
  def fix_nated_sdp(level: Double): Double
  def fix_nated_sdp_ip(level: Double, ip: String): Double
  def handle_ruri_alias(): Double
  def is_rfc1918(address: String): Double
  def nat_uac_test(tests: Double): Double
  def set_contact_alias(): Double
}

object Typeofnathelper {
  @scala.inline
  def apply(
    add_contact_alias: () => Double,
    add_contact_alias_addr: (String, String, String) => Double,
    add_rcv_param: Double => Double,
    fix_nated_contact: () => Double,
    fix_nated_register: () => Double,
    fix_nated_sdp: Double => Double,
    fix_nated_sdp_ip: (Double, String) => Double,
    handle_ruri_alias: () => Double,
    is_rfc1918: String => Double,
    nat_uac_test: Double => Double,
    set_contact_alias: () => Double
  ): Typeofnathelper = {
    val __obj = js.Dynamic.literal(add_contact_alias = js.Any.fromFunction0(add_contact_alias), add_contact_alias_addr = js.Any.fromFunction3(add_contact_alias_addr), add_rcv_param = js.Any.fromFunction1(add_rcv_param), fix_nated_contact = js.Any.fromFunction0(fix_nated_contact), fix_nated_register = js.Any.fromFunction0(fix_nated_register), fix_nated_sdp = js.Any.fromFunction1(fix_nated_sdp), fix_nated_sdp_ip = js.Any.fromFunction2(fix_nated_sdp_ip), handle_ruri_alias = js.Any.fromFunction0(handle_ruri_alias), is_rfc1918 = js.Any.fromFunction1(is_rfc1918), nat_uac_test = js.Any.fromFunction1(nat_uac_test), set_contact_alias = js.Any.fromFunction0(set_contact_alias))
    __obj.asInstanceOf[Typeofnathelper]
  }
}

