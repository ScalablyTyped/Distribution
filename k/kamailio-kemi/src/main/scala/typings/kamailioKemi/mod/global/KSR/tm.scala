package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tm {
  
  @JSGlobal("KSR.tm")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def tAnyReplied(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_any_replied")().asInstanceOf[Double]
  
  @scala.inline
  def tAnyTimeout(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_any_timeout")().asInstanceOf[Double]
  
  @scala.inline
  def tBranchReplied(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_branch_replied")().asInstanceOf[Double]
  
  @scala.inline
  def tBranchTimeout(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_branch_timeout")().asInstanceOf[Double]
  
  @scala.inline
  def tCheckStatus(sexp: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_check_status")(sexp.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tCheckTrans(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_check_trans")().asInstanceOf[Double]
  
  @scala.inline
  def tDropReplies(mode: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_drop_replies")(mode.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tDropRepliesAll(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_drop_replies_all")().asInstanceOf[Double]
  
  @scala.inline
  def tGrepStatus(code: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_grep_status")(code.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tIsCanceled(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_is_canceled")().asInstanceOf[Double]
  
  @scala.inline
  def tIsExpired(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_is_expired")().asInstanceOf[Double]
  
  @scala.inline
  def tIsRetrAsyncReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_is_retr_async_reply")().asInstanceOf[Double]
  
  @scala.inline
  def tIsSet(target: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_is_set")(target.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tLoadContacts(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_load_contacts")().asInstanceOf[Double]
  
  @scala.inline
  def tLookupCancel(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_lookup_cancel")().asInstanceOf[Double]
  
  @scala.inline
  def tLookupCancelFlags(flags: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_lookup_cancel_flags")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tLookupRequest(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_lookup_request")().asInstanceOf[Double]
  
  @scala.inline
  def tNewtran(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_newtran")().asInstanceOf[Double]
  
  @scala.inline
  def tNextContactFlow(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_next_contact_flow")().asInstanceOf[Double]
  
  @scala.inline
  def tNextContacts(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_next_contacts")().asInstanceOf[Double]
  
  @scala.inline
  def tOnBranch(rname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_on_branch")(rname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tOnBranchFailure(rname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_on_branch_failure")(rname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tOnFailure(rname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_on_failure")(rname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tOnReply(rname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_on_reply")(rname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tRelay(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_relay")().asInstanceOf[Double]
  
  @scala.inline
  def tRelease(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_release")().asInstanceOf[Double]
  
  @scala.inline
  def tReplicate(suri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_replicate")(suri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tReply(code: Double, reason: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t_reply")(code.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tResetFr(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_reset_fr")().asInstanceOf[Double]
  
  @scala.inline
  def tResetMaxLifetime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_reset_max_lifetime")().asInstanceOf[Double]
  
  @scala.inline
  def tResetRetr(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_reset_retr")().asInstanceOf[Double]
  
  @scala.inline
  def tRetransmitReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_retransmit_reply")().asInstanceOf[Double]
  
  @scala.inline
  def tSaveLumps(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_save_lumps")().asInstanceOf[Double]
  
  @scala.inline
  def tSendReply(code: Double, reason: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t_send_reply")(code.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tSetAutoInv100(state: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_set_auto_inv_100")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tSetDisable6xx(state: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_set_disable_6xx")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tSetDisableFailover(state: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_set_disable_failover")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tSetDisableInternalReply(state: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_set_disable_internal_reply")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tSetFr(fr_inv: Double, fr: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t_set_fr")(fr_inv.asInstanceOf[js.Any], fr.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tSetFrInv(fr_inv: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_set_fr_inv")(fr_inv.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tSetMaxLifetime(t1: Double, t2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t_set_max_lifetime")(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tSetNoE2eCancelReason(state: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_set_no_e2e_cancel_reason")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tSetRetr(t1: Double, t2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t_set_retr")(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tUacSend(method: String, ruri: String, nexthop: String, ssock: String, hdrs: String, body: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t_uac_send")(method.asInstanceOf[js.Any], ruri.asInstanceOf[js.Any], nexthop.asInstanceOf[js.Any], ssock.asInstanceOf[js.Any], hdrs.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tUseUacHeaders(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_use_uac_headers")().asInstanceOf[Double]
}
