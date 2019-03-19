package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appendbranch extends js.Object {
  def append_branch(): scala.Double
  def append_branch_uri(uri: java.lang.String): scala.Double
  def append_branch_uri_q(uri: java.lang.String, q: java.lang.String): scala.Double
  def has_ruri_user(): scala.Double
  def has_user_agent(): scala.Double
  def isxflagset(fval: scala.Double): scala.Double
  def resetxflag(fval: scala.Double): scala.Double
  def send_data(uri: java.lang.String, data: java.lang.String): scala.Double
  def sendx(uri: java.lang.String, sock: java.lang.String, data: java.lang.String): scala.Double
  def set_recv_socket(ssock: java.lang.String): scala.Double
  def set_send_socket(ssock: java.lang.String): scala.Double
  def set_source_address(saddr: java.lang.String): scala.Double
  def setxflag(fval: scala.Double): scala.Double
  def via_add_srvid(fval: scala.Double): scala.Double
  def via_add_xavp_params(fval: scala.Double): scala.Double
  def via_use_xavp_fields(fval: scala.Double): scala.Double
}

object Anon_Appendbranch {
  @scala.inline
  def apply(
    append_branch: () => scala.Double,
    append_branch_uri: java.lang.String => scala.Double,
    append_branch_uri_q: (java.lang.String, java.lang.String) => scala.Double,
    has_ruri_user: () => scala.Double,
    has_user_agent: () => scala.Double,
    isxflagset: scala.Double => scala.Double,
    resetxflag: scala.Double => scala.Double,
    send_data: (java.lang.String, java.lang.String) => scala.Double,
    sendx: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    set_recv_socket: java.lang.String => scala.Double,
    set_send_socket: java.lang.String => scala.Double,
    set_source_address: java.lang.String => scala.Double,
    setxflag: scala.Double => scala.Double,
    via_add_srvid: scala.Double => scala.Double,
    via_add_xavp_params: scala.Double => scala.Double,
    via_use_xavp_fields: scala.Double => scala.Double
  ): Anon_Appendbranch = {
    val __obj = js.Dynamic.literal(append_branch = js.Any.fromFunction0(append_branch), append_branch_uri = js.Any.fromFunction1(append_branch_uri), append_branch_uri_q = js.Any.fromFunction2(append_branch_uri_q), has_ruri_user = js.Any.fromFunction0(has_ruri_user), has_user_agent = js.Any.fromFunction0(has_user_agent), isxflagset = js.Any.fromFunction1(isxflagset), resetxflag = js.Any.fromFunction1(resetxflag), send_data = js.Any.fromFunction2(send_data), sendx = js.Any.fromFunction3(sendx), set_recv_socket = js.Any.fromFunction1(set_recv_socket), set_send_socket = js.Any.fromFunction1(set_send_socket), set_source_address = js.Any.fromFunction1(set_source_address), setxflag = js.Any.fromFunction1(setxflag), via_add_srvid = js.Any.fromFunction1(via_add_srvid), via_add_xavp_params = js.Any.fromFunction1(via_add_xavp_params), via_use_xavp_fields = js.Any.fromFunction1(via_use_xavp_fields))
  
    __obj.asInstanceOf[Anon_Appendbranch]
  }
}

