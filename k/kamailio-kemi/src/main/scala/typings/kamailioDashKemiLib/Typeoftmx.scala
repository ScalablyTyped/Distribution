package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftmx extends js.Object {
  def t_cancel_branches(mode: java.lang.String): scala.Double
  def t_cancel_callid(callid_s: java.lang.String, cseq_s: java.lang.String, fl: scala.Double): scala.Double
  def t_cancel_callid_reason(callid_s: java.lang.String, cseq_s: java.lang.String, fl: scala.Double, rcode: scala.Double): scala.Double
  def t_continue(tindex: scala.Double, tlabel: scala.Double, cbname: java.lang.String): scala.Double
  def t_flush_flags(): scala.Double
  def t_flush_xflags(): scala.Double
  def t_is_branch_route(): scala.Double
  def t_is_failure_route(): scala.Double
  def t_is_reply_route(): scala.Double
  def t_is_request_route(): scala.Double
  def t_precheck_trans(): scala.Double
  def t_reply_callid(
    callid_s: java.lang.String,
    cseq_s: java.lang.String,
    code: scala.Double,
    status_s: java.lang.String
  ): scala.Double
  def t_reuse_branch(): scala.Double
  def t_suspend(): scala.Double
}

object Typeoftmx {
  @scala.inline
  def apply(
    t_cancel_branches: java.lang.String => scala.Double,
    t_cancel_callid: (java.lang.String, java.lang.String, scala.Double) => scala.Double,
    t_cancel_callid_reason: (java.lang.String, java.lang.String, scala.Double, scala.Double) => scala.Double,
    t_continue: (scala.Double, scala.Double, java.lang.String) => scala.Double,
    t_flush_flags: () => scala.Double,
    t_flush_xflags: () => scala.Double,
    t_is_branch_route: () => scala.Double,
    t_is_failure_route: () => scala.Double,
    t_is_reply_route: () => scala.Double,
    t_is_request_route: () => scala.Double,
    t_precheck_trans: () => scala.Double,
    t_reply_callid: (java.lang.String, java.lang.String, scala.Double, java.lang.String) => scala.Double,
    t_reuse_branch: () => scala.Double,
    t_suspend: () => scala.Double
  ): Typeoftmx = {
    val __obj = js.Dynamic.literal(t_cancel_branches = js.Any.fromFunction1(t_cancel_branches), t_cancel_callid = js.Any.fromFunction3(t_cancel_callid), t_cancel_callid_reason = js.Any.fromFunction4(t_cancel_callid_reason), t_continue = js.Any.fromFunction3(t_continue), t_flush_flags = js.Any.fromFunction0(t_flush_flags), t_flush_xflags = js.Any.fromFunction0(t_flush_xflags), t_is_branch_route = js.Any.fromFunction0(t_is_branch_route), t_is_failure_route = js.Any.fromFunction0(t_is_failure_route), t_is_reply_route = js.Any.fromFunction0(t_is_reply_route), t_is_request_route = js.Any.fromFunction0(t_is_request_route), t_precheck_trans = js.Any.fromFunction0(t_precheck_trans), t_reply_callid = js.Any.fromFunction4(t_reply_callid), t_reuse_branch = js.Any.fromFunction0(t_reuse_branch), t_suspend = js.Any.fromFunction0(t_suspend))
  
    __obj.asInstanceOf[Typeoftmx]
  }
}

