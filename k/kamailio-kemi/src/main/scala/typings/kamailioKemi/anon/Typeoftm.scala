package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftm extends js.Object {
  
  def t_any_replied(): Double = js.native
  
  def t_any_timeout(): Double = js.native
  
  def t_branch_replied(): Double = js.native
  
  def t_branch_timeout(): Double = js.native
  
  def t_check_status(sexp: String): Double = js.native
  
  def t_check_trans(): Double = js.native
  
  def t_drop_replies(mode: String): Double = js.native
  
  def t_drop_replies_all(): Double = js.native
  
  def t_grep_status(code: Double): Double = js.native
  
  def t_is_canceled(): Double = js.native
  
  def t_is_expired(): Double = js.native
  
  def t_is_retr_async_reply(): Double = js.native
  
  def t_is_set(target: String): Double = js.native
  
  def t_load_contacts(): Double = js.native
  
  def t_lookup_cancel(): Double = js.native
  
  def t_lookup_cancel_flags(flags: Double): Double = js.native
  
  def t_lookup_request(): Double = js.native
  
  def t_newtran(): Double = js.native
  
  def t_next_contact_flow(): Double = js.native
  
  def t_next_contacts(): Double = js.native
  
  def t_on_branch(rname: String): Double = js.native
  
  def t_on_branch_failure(rname: String): Double = js.native
  
  def t_on_failure(rname: String): Double = js.native
  
  def t_on_reply(rname: String): Double = js.native
  
  def t_relay(): Double = js.native
  
  def t_release(): Double = js.native
  
  def t_replicate(suri: String): Double = js.native
  
  def t_reply(code: Double, reason: String): Double = js.native
  
  def t_reset_fr(): Double = js.native
  
  def t_reset_max_lifetime(): Double = js.native
  
  def t_reset_retr(): Double = js.native
  
  def t_retransmit_reply(): Double = js.native
  
  def t_save_lumps(): Double = js.native
  
  def t_send_reply(code: Double, reason: String): Double = js.native
  
  def t_set_auto_inv_100(state: Double): Double = js.native
  
  def t_set_disable_6xx(state: Double): Double = js.native
  
  def t_set_disable_failover(state: Double): Double = js.native
  
  def t_set_disable_internal_reply(state: Double): Double = js.native
  
  def t_set_fr(fr_inv: Double, fr: Double): Double = js.native
  
  def t_set_fr_inv(fr_inv: Double): Double = js.native
  
  def t_set_max_lifetime(t1: Double, t2: Double): Double = js.native
  
  def t_set_no_e2e_cancel_reason(state: Double): Double = js.native
  
  def t_set_retr(t1: Double, t2: Double): Double = js.native
  
  def t_uac_send(method: String, ruri: String, nexthop: String, ssock: String, hdrs: String, body: String): Double = js.native
  
  def t_use_uac_headers(): Double = js.native
}
object Typeoftm {
  
  @scala.inline
  def apply(
    t_any_replied: () => Double,
    t_any_timeout: () => Double,
    t_branch_replied: () => Double,
    t_branch_timeout: () => Double,
    t_check_status: String => Double,
    t_check_trans: () => Double,
    t_drop_replies: String => Double,
    t_drop_replies_all: () => Double,
    t_grep_status: Double => Double,
    t_is_canceled: () => Double,
    t_is_expired: () => Double,
    t_is_retr_async_reply: () => Double,
    t_is_set: String => Double,
    t_load_contacts: () => Double,
    t_lookup_cancel: () => Double,
    t_lookup_cancel_flags: Double => Double,
    t_lookup_request: () => Double,
    t_newtran: () => Double,
    t_next_contact_flow: () => Double,
    t_next_contacts: () => Double,
    t_on_branch: String => Double,
    t_on_branch_failure: String => Double,
    t_on_failure: String => Double,
    t_on_reply: String => Double,
    t_relay: () => Double,
    t_release: () => Double,
    t_replicate: String => Double,
    t_reply: (Double, String) => Double,
    t_reset_fr: () => Double,
    t_reset_max_lifetime: () => Double,
    t_reset_retr: () => Double,
    t_retransmit_reply: () => Double,
    t_save_lumps: () => Double,
    t_send_reply: (Double, String) => Double,
    t_set_auto_inv_100: Double => Double,
    t_set_disable_6xx: Double => Double,
    t_set_disable_failover: Double => Double,
    t_set_disable_internal_reply: Double => Double,
    t_set_fr: (Double, Double) => Double,
    t_set_fr_inv: Double => Double,
    t_set_max_lifetime: (Double, Double) => Double,
    t_set_no_e2e_cancel_reason: Double => Double,
    t_set_retr: (Double, Double) => Double,
    t_uac_send: (String, String, String, String, String, String) => Double,
    t_use_uac_headers: () => Double
  ): Typeoftm = {
    val __obj = js.Dynamic.literal(t_any_replied = js.Any.fromFunction0(t_any_replied), t_any_timeout = js.Any.fromFunction0(t_any_timeout), t_branch_replied = js.Any.fromFunction0(t_branch_replied), t_branch_timeout = js.Any.fromFunction0(t_branch_timeout), t_check_status = js.Any.fromFunction1(t_check_status), t_check_trans = js.Any.fromFunction0(t_check_trans), t_drop_replies = js.Any.fromFunction1(t_drop_replies), t_drop_replies_all = js.Any.fromFunction0(t_drop_replies_all), t_grep_status = js.Any.fromFunction1(t_grep_status), t_is_canceled = js.Any.fromFunction0(t_is_canceled), t_is_expired = js.Any.fromFunction0(t_is_expired), t_is_retr_async_reply = js.Any.fromFunction0(t_is_retr_async_reply), t_is_set = js.Any.fromFunction1(t_is_set), t_load_contacts = js.Any.fromFunction0(t_load_contacts), t_lookup_cancel = js.Any.fromFunction0(t_lookup_cancel), t_lookup_cancel_flags = js.Any.fromFunction1(t_lookup_cancel_flags), t_lookup_request = js.Any.fromFunction0(t_lookup_request), t_newtran = js.Any.fromFunction0(t_newtran), t_next_contact_flow = js.Any.fromFunction0(t_next_contact_flow), t_next_contacts = js.Any.fromFunction0(t_next_contacts), t_on_branch = js.Any.fromFunction1(t_on_branch), t_on_branch_failure = js.Any.fromFunction1(t_on_branch_failure), t_on_failure = js.Any.fromFunction1(t_on_failure), t_on_reply = js.Any.fromFunction1(t_on_reply), t_relay = js.Any.fromFunction0(t_relay), t_release = js.Any.fromFunction0(t_release), t_replicate = js.Any.fromFunction1(t_replicate), t_reply = js.Any.fromFunction2(t_reply), t_reset_fr = js.Any.fromFunction0(t_reset_fr), t_reset_max_lifetime = js.Any.fromFunction0(t_reset_max_lifetime), t_reset_retr = js.Any.fromFunction0(t_reset_retr), t_retransmit_reply = js.Any.fromFunction0(t_retransmit_reply), t_save_lumps = js.Any.fromFunction0(t_save_lumps), t_send_reply = js.Any.fromFunction2(t_send_reply), t_set_auto_inv_100 = js.Any.fromFunction1(t_set_auto_inv_100), t_set_disable_6xx = js.Any.fromFunction1(t_set_disable_6xx), t_set_disable_failover = js.Any.fromFunction1(t_set_disable_failover), t_set_disable_internal_reply = js.Any.fromFunction1(t_set_disable_internal_reply), t_set_fr = js.Any.fromFunction2(t_set_fr), t_set_fr_inv = js.Any.fromFunction1(t_set_fr_inv), t_set_max_lifetime = js.Any.fromFunction2(t_set_max_lifetime), t_set_no_e2e_cancel_reason = js.Any.fromFunction1(t_set_no_e2e_cancel_reason), t_set_retr = js.Any.fromFunction2(t_set_retr), t_uac_send = js.Any.fromFunction6(t_uac_send), t_use_uac_headers = js.Any.fromFunction0(t_use_uac_headers))
    __obj.asInstanceOf[Typeoftm]
  }
  
  @scala.inline
  implicit class TypeoftmOps[Self <: Typeoftm] (val x: Self) extends AnyVal {
    
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
    def setT_any_replied(value: () => Double): Self = this.set("t_any_replied", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_any_timeout(value: () => Double): Self = this.set("t_any_timeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_branch_replied(value: () => Double): Self = this.set("t_branch_replied", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_branch_timeout(value: () => Double): Self = this.set("t_branch_timeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_check_status(value: String => Double): Self = this.set("t_check_status", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_check_trans(value: () => Double): Self = this.set("t_check_trans", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_drop_replies(value: String => Double): Self = this.set("t_drop_replies", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_drop_replies_all(value: () => Double): Self = this.set("t_drop_replies_all", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_grep_status(value: Double => Double): Self = this.set("t_grep_status", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_is_canceled(value: () => Double): Self = this.set("t_is_canceled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_is_expired(value: () => Double): Self = this.set("t_is_expired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_is_retr_async_reply(value: () => Double): Self = this.set("t_is_retr_async_reply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_is_set(value: String => Double): Self = this.set("t_is_set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_load_contacts(value: () => Double): Self = this.set("t_load_contacts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_lookup_cancel(value: () => Double): Self = this.set("t_lookup_cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_lookup_cancel_flags(value: Double => Double): Self = this.set("t_lookup_cancel_flags", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_lookup_request(value: () => Double): Self = this.set("t_lookup_request", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_newtran(value: () => Double): Self = this.set("t_newtran", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_next_contact_flow(value: () => Double): Self = this.set("t_next_contact_flow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_next_contacts(value: () => Double): Self = this.set("t_next_contacts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_on_branch(value: String => Double): Self = this.set("t_on_branch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_on_branch_failure(value: String => Double): Self = this.set("t_on_branch_failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_on_failure(value: String => Double): Self = this.set("t_on_failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_on_reply(value: String => Double): Self = this.set("t_on_reply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_relay(value: () => Double): Self = this.set("t_relay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_release(value: () => Double): Self = this.set("t_release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_replicate(value: String => Double): Self = this.set("t_replicate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_reply(value: (Double, String) => Double): Self = this.set("t_reply", js.Any.fromFunction2(value))
    
    @scala.inline
    def setT_reset_fr(value: () => Double): Self = this.set("t_reset_fr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_reset_max_lifetime(value: () => Double): Self = this.set("t_reset_max_lifetime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_reset_retr(value: () => Double): Self = this.set("t_reset_retr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_retransmit_reply(value: () => Double): Self = this.set("t_retransmit_reply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_save_lumps(value: () => Double): Self = this.set("t_save_lumps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_send_reply(value: (Double, String) => Double): Self = this.set("t_send_reply", js.Any.fromFunction2(value))
    
    @scala.inline
    def setT_set_auto_inv_100(value: Double => Double): Self = this.set("t_set_auto_inv_100", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_set_disable_6xx(value: Double => Double): Self = this.set("t_set_disable_6xx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_set_disable_failover(value: Double => Double): Self = this.set("t_set_disable_failover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_set_disable_internal_reply(value: Double => Double): Self = this.set("t_set_disable_internal_reply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_set_fr(value: (Double, Double) => Double): Self = this.set("t_set_fr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setT_set_fr_inv(value: Double => Double): Self = this.set("t_set_fr_inv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_set_max_lifetime(value: (Double, Double) => Double): Self = this.set("t_set_max_lifetime", js.Any.fromFunction2(value))
    
    @scala.inline
    def setT_set_no_e2e_cancel_reason(value: Double => Double): Self = this.set("t_set_no_e2e_cancel_reason", js.Any.fromFunction1(value))
    
    @scala.inline
    def setT_set_retr(value: (Double, Double) => Double): Self = this.set("t_set_retr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setT_uac_send(value: (String, String, String, String, String, String) => Double): Self = this.set("t_uac_send", js.Any.fromFunction6(value))
    
    @scala.inline
    def setT_use_uac_headers(value: () => Double): Self = this.set("t_use_uac_headers", js.Any.fromFunction0(value))
  }
}
