package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tmx {
  
  @JSGlobal("KSR.tmx")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def tCancelBranches(mode: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_cancel_branches")(mode.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tCancelCallid(callid_s: String, cseq_s: String, fl: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t_cancel_callid")(callid_s.asInstanceOf[js.Any], cseq_s.asInstanceOf[js.Any], fl.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tCancelCallidReason(callid_s: String, cseq_s: String, fl: Double, rcode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t_cancel_callid_reason")(callid_s.asInstanceOf[js.Any], cseq_s.asInstanceOf[js.Any], fl.asInstanceOf[js.Any], rcode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tContinue(tindex: Double, tlabel: Double, cbname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t_continue")(tindex.asInstanceOf[js.Any], tlabel.asInstanceOf[js.Any], cbname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tFlushFlags(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_flush_flags")().asInstanceOf[Double]
  
  @scala.inline
  def tFlushXflags(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_flush_xflags")().asInstanceOf[Double]
  
  @scala.inline
  def tIsBranchRoute(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_is_branch_route")().asInstanceOf[Double]
  
  @scala.inline
  def tIsFailureRoute(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_is_failure_route")().asInstanceOf[Double]
  
  @scala.inline
  def tIsReplyRoute(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_is_reply_route")().asInstanceOf[Double]
  
  @scala.inline
  def tIsRequestRoute(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_is_request_route")().asInstanceOf[Double]
  
  @scala.inline
  def tPrecheckTrans(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_precheck_trans")().asInstanceOf[Double]
  
  @scala.inline
  def tReplyCallid(callid_s: String, cseq_s: String, code: Double, status_s: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t_reply_callid")(callid_s.asInstanceOf[js.Any], cseq_s.asInstanceOf[js.Any], code.asInstanceOf[js.Any], status_s.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tReuseBranch(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_reuse_branch")().asInstanceOf[Double]
  
  @scala.inline
  def tSuspend(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_suspend")().asInstanceOf[Double]
}
