package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftmx extends js.Object {
  
  def t_cancel_branches(mode: String): Double = js.native
  
  def t_cancel_callid(callid_s: String, cseq_s: String, fl: Double): Double = js.native
  
  def t_cancel_callid_reason(callid_s: String, cseq_s: String, fl: Double, rcode: Double): Double = js.native
  
  def t_continue(tindex: Double, tlabel: Double, cbname: String): Double = js.native
  
  def t_flush_flags(): Double = js.native
  
  def t_flush_xflags(): Double = js.native
  
  def t_is_branch_route(): Double = js.native
  
  def t_is_failure_route(): Double = js.native
  
  def t_is_reply_route(): Double = js.native
  
  def t_is_request_route(): Double = js.native
  
  def t_precheck_trans(): Double = js.native
  
  def t_reply_callid(callid_s: String, cseq_s: String, code: Double, status_s: String): Double = js.native
  
  def t_reuse_branch(): Double = js.native
  
  def t_suspend(): Double = js.native
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
  
  @scala.inline
  implicit class TypeoftmxOps[Self <: Typeoftmx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setT_cancel_branches(value: String => Double): Self = this.set("t_cancel_branches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_cancel_callid(value: (String, String, Double) => Double): Self = this.set("t_cancel_callid", js.Any.fromFunction3(value))
    
    @scala.inline
    def setT_cancel_callid_reason(value: (String, String, Double, Double) => Double): Self = this.set("t_cancel_callid_reason", js.Any.fromFunction4(value))
    
    @scala.inline
    def setT_continue(value: (Double, Double, String) => Double): Self = this.set("t_continue", js.Any.fromFunction3(value))
    
    @scala.inline
    def setT_flush_flags(value: () => Double): Self = this.set("t_flush_flags", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_flush_xflags(value: () => Double): Self = this.set("t_flush_xflags", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_is_branch_route(value: () => Double): Self = this.set("t_is_branch_route", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_is_failure_route(value: () => Double): Self = this.set("t_is_failure_route", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_is_reply_route(value: () => Double): Self = this.set("t_is_reply_route", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_is_request_route(value: () => Double): Self = this.set("t_is_request_route", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_precheck_trans(value: () => Double): Self = this.set("t_precheck_trans", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_reply_callid(value: (String, String, Double, String) => Double): Self = this.set("t_reply_callid", js.Any.fromFunction4(value))
    
    @scala.inline
    def setT_reuse_branch(value: () => Double): Self = this.set("t_reuse_branch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_suspend(value: () => Double): Self = this.set("t_suspend", js.Any.fromFunction0(value))
  }
}
