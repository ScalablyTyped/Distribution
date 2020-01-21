package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftm extends js.Object {
  def t_any_replied(): Double
  def t_any_timeout(): Double
  def t_branch_replied(): Double
  def t_branch_timeout(): Double
  def t_check_status(sexp: String): Double
  def t_check_trans(): Double
  def t_drop_replies(mode: String): Double
  def t_drop_replies_all(): Double
  def t_grep_status(code: Double): Double
  def t_is_canceled(): Double
  def t_is_expired(): Double
  def t_is_retr_async_reply(): Double
  def t_is_set(target: String): Double
  def t_load_contacts(): Double
  def t_lookup_cancel(): Double
  def t_lookup_cancel_flags(flags: Double): Double
  def t_lookup_request(): Double
  def t_newtran(): Double
  def t_next_contact_flow(): Double
  def t_next_contacts(): Double
  def t_on_branch(rname: String): Double
  def t_on_branch_failure(rname: String): Double
  def t_on_failure(rname: String): Double
  def t_on_reply(rname: String): Double
  def t_relay(): Double
  def t_release(): Double
  def t_replicate(suri: String): Double
  def t_reply(code: Double, reason: String): Double
  def t_reset_fr(): Double
  def t_reset_max_lifetime(): Double
  def t_reset_retr(): Double
  def t_retransmit_reply(): Double
  def t_save_lumps(): Double
  def t_send_reply(code: Double, reason: String): Double
  def t_set_auto_inv_100(state: Double): Double
  def t_set_disable_6xx(state: Double): Double
  def t_set_disable_failover(state: Double): Double
  def t_set_disable_internal_reply(state: Double): Double
  def t_set_fr(fr_inv: Double, fr: Double): Double
  def t_set_fr_inv(fr_inv: Double): Double
  def t_set_max_lifetime(t1: Double, t2: Double): Double
  def t_set_no_e2e_cancel_reason(state: Double): Double
  def t_set_retr(t1: Double, t2: Double): Double
  def t_uac_send(method: String, ruri: String, nexthop: String, ssock: String, hdrs: String, body: String): Double
  def t_use_uac_headers(): Double
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
}

