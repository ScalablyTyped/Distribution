package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcorex extends js.Object {
  def append_branch(): Double
  def append_branch_uri(uri: String): Double
  def append_branch_uri_q(uri: String, q: String): Double
  def has_ruri_user(): Double
  def has_user_agent(): Double
  def isxflagset(fval: Double): Double
  def resetxflag(fval: Double): Double
  def send_data(uri: String, data: String): Double
  def sendx(uri: String, sock: String, data: String): Double
  def set_recv_socket(ssock: String): Double
  def set_send_socket(ssock: String): Double
  def set_source_address(saddr: String): Double
  def setxflag(fval: Double): Double
  def via_add_srvid(fval: Double): Double
  def via_add_xavp_params(fval: Double): Double
  def via_use_xavp_fields(fval: Double): Double
}

object Typeofcorex {
  @scala.inline
  def apply(
    append_branch: () => Double,
    append_branch_uri: String => Double,
    append_branch_uri_q: (String, String) => Double,
    has_ruri_user: () => Double,
    has_user_agent: () => Double,
    isxflagset: Double => Double,
    resetxflag: Double => Double,
    send_data: (String, String) => Double,
    sendx: (String, String, String) => Double,
    set_recv_socket: String => Double,
    set_send_socket: String => Double,
    set_source_address: String => Double,
    setxflag: Double => Double,
    via_add_srvid: Double => Double,
    via_add_xavp_params: Double => Double,
    via_use_xavp_fields: Double => Double
  ): Typeofcorex = {
    val __obj = js.Dynamic.literal(append_branch = js.Any.fromFunction0(append_branch), append_branch_uri = js.Any.fromFunction1(append_branch_uri), append_branch_uri_q = js.Any.fromFunction2(append_branch_uri_q), has_ruri_user = js.Any.fromFunction0(has_ruri_user), has_user_agent = js.Any.fromFunction0(has_user_agent), isxflagset = js.Any.fromFunction1(isxflagset), resetxflag = js.Any.fromFunction1(resetxflag), send_data = js.Any.fromFunction2(send_data), sendx = js.Any.fromFunction3(sendx), set_recv_socket = js.Any.fromFunction1(set_recv_socket), set_send_socket = js.Any.fromFunction1(set_send_socket), set_source_address = js.Any.fromFunction1(set_source_address), setxflag = js.Any.fromFunction1(setxflag), via_add_srvid = js.Any.fromFunction1(via_add_srvid), via_add_xavp_params = js.Any.fromFunction1(via_add_xavp_params), via_use_xavp_fields = js.Any.fromFunction1(via_use_xavp_fields))
  
    __obj.asInstanceOf[Typeofcorex]
  }
}

