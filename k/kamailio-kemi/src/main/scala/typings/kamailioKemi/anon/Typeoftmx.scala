package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftmx extends js.Object {
  def t_cancel_branches(mode: String): Double
  def t_cancel_callid(callid_s: String, cseq_s: String, fl: Double): Double
  def t_cancel_callid_reason(callid_s: String, cseq_s: String, fl: Double, rcode: Double): Double
  def t_continue(tindex: Double, tlabel: Double, cbname: String): Double
  def t_flush_flags(): Double
  def t_flush_xflags(): Double
  def t_is_branch_route(): Double
  def t_is_failure_route(): Double
  def t_is_reply_route(): Double
  def t_is_request_route(): Double
  def t_precheck_trans(): Double
  def t_reply_callid(callid_s: String, cseq_s: String, code: Double, status_s: String): Double
  def t_reuse_branch(): Double
  def t_suspend(): Double
}

object Typeoftmx {
  @scala.inline
  def apply(
    t_cancel_branches: String => Double,
    t_cancel_callid: (String, String, Double) => Double,
    t_cancel_callid_reason: (String, String, Double, Double) => Double,
    t_continue: (Double, Double, String) => Double,
    t_flush_flags: () => Double,
    t_flush_xflags: () => Double,
    t_is_branch_route: () => Double,
    t_is_failure_route: () => Double,
    t_is_reply_route: () => Double,
    t_is_request_route: () => Double,
    t_precheck_trans: () => Double,
    t_reply_callid: (String, String, Double, String) => Double,
    t_reuse_branch: () => Double,
    t_suspend: () => Double
  ): Typeoftmx = {
    val __obj = js.Dynamic.literal(t_cancel_branches = js.Any.fromFunction1(t_cancel_branches), t_cancel_callid = js.Any.fromFunction3(t_cancel_callid), t_cancel_callid_reason = js.Any.fromFunction4(t_cancel_callid_reason), t_continue = js.Any.fromFunction3(t_continue), t_flush_flags = js.Any.fromFunction0(t_flush_flags), t_flush_xflags = js.Any.fromFunction0(t_flush_xflags), t_is_branch_route = js.Any.fromFunction0(t_is_branch_route), t_is_failure_route = js.Any.fromFunction0(t_is_failure_route), t_is_reply_route = js.Any.fromFunction0(t_is_reply_route), t_is_request_route = js.Any.fromFunction0(t_is_request_route), t_precheck_trans = js.Any.fromFunction0(t_precheck_trans), t_reply_callid = js.Any.fromFunction4(t_reply_callid), t_reuse_branch = js.Any.fromFunction0(t_reuse_branch), t_suspend = js.Any.fromFunction0(t_suspend))
    __obj.asInstanceOf[Typeoftmx]
  }
}

