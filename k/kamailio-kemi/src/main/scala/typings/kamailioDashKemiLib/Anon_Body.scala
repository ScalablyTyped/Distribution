package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  def t_any_replied(): scala.Double
  def t_any_timeout(): scala.Double
  def t_branch_replied(): scala.Double
  def t_branch_timeout(): scala.Double
  def t_check_status(sexp: java.lang.String): scala.Double
  def t_check_trans(): scala.Double
  def t_drop_replies(mode: java.lang.String): scala.Double
  def t_drop_replies_all(): scala.Double
  def t_grep_status(code: scala.Double): scala.Double
  def t_is_canceled(): scala.Double
  def t_is_expired(): scala.Double
  def t_is_retr_async_reply(): scala.Double
  def t_is_set(target: java.lang.String): scala.Double
  def t_load_contacts(): scala.Double
  def t_lookup_cancel(): scala.Double
  def t_lookup_cancel_flags(flags: scala.Double): scala.Double
  def t_lookup_request(): scala.Double
  def t_newtran(): scala.Double
  def t_next_contact_flow(): scala.Double
  def t_next_contacts(): scala.Double
  def t_on_branch(rname: java.lang.String): scala.Double
  def t_on_branch_failure(rname: java.lang.String): scala.Double
  def t_on_failure(rname: java.lang.String): scala.Double
  def t_on_reply(rname: java.lang.String): scala.Double
  def t_relay(): scala.Double
  def t_release(): scala.Double
  def t_replicate(suri: java.lang.String): scala.Double
  def t_reply(code: scala.Double, reason: java.lang.String): scala.Double
  def t_reset_fr(): scala.Double
  def t_reset_max_lifetime(): scala.Double
  def t_reset_retr(): scala.Double
  def t_retransmit_reply(): scala.Double
  def t_save_lumps(): scala.Double
  def t_send_reply(code: scala.Double, reason: java.lang.String): scala.Double
  def t_set_auto_inv_100(state: scala.Double): scala.Double
  def t_set_disable_6xx(state: scala.Double): scala.Double
  def t_set_disable_failover(state: scala.Double): scala.Double
  def t_set_disable_internal_reply(state: scala.Double): scala.Double
  def t_set_fr(fr_inv: scala.Double, fr: scala.Double): scala.Double
  def t_set_fr_inv(fr_inv: scala.Double): scala.Double
  def t_set_max_lifetime(t1: scala.Double, t2: scala.Double): scala.Double
  def t_set_no_e2e_cancel_reason(state: scala.Double): scala.Double
  def t_set_retr(t1: scala.Double, t2: scala.Double): scala.Double
  def t_uac_send(
    method: java.lang.String,
    ruri: java.lang.String,
    nexthop: java.lang.String,
    ssock: java.lang.String,
    hdrs: java.lang.String,
    body: java.lang.String
  ): scala.Double
  def t_use_uac_headers(): scala.Double
}

object Anon_Body {
  @scala.inline
  def apply(
    t_any_replied: () => scala.Double,
    t_any_timeout: () => scala.Double,
    t_branch_replied: () => scala.Double,
    t_branch_timeout: () => scala.Double,
    t_check_status: java.lang.String => scala.Double,
    t_check_trans: () => scala.Double,
    t_drop_replies: java.lang.String => scala.Double,
    t_drop_replies_all: () => scala.Double,
    t_grep_status: scala.Double => scala.Double,
    t_is_canceled: () => scala.Double,
    t_is_expired: () => scala.Double,
    t_is_retr_async_reply: () => scala.Double,
    t_is_set: java.lang.String => scala.Double,
    t_load_contacts: () => scala.Double,
    t_lookup_cancel: () => scala.Double,
    t_lookup_cancel_flags: scala.Double => scala.Double,
    t_lookup_request: () => scala.Double,
    t_newtran: () => scala.Double,
    t_next_contact_flow: () => scala.Double,
    t_next_contacts: () => scala.Double,
    t_on_branch: java.lang.String => scala.Double,
    t_on_branch_failure: java.lang.String => scala.Double,
    t_on_failure: java.lang.String => scala.Double,
    t_on_reply: java.lang.String => scala.Double,
    t_relay: () => scala.Double,
    t_release: () => scala.Double,
    t_replicate: java.lang.String => scala.Double,
    t_reply: (scala.Double, java.lang.String) => scala.Double,
    t_reset_fr: () => scala.Double,
    t_reset_max_lifetime: () => scala.Double,
    t_reset_retr: () => scala.Double,
    t_retransmit_reply: () => scala.Double,
    t_save_lumps: () => scala.Double,
    t_send_reply: (scala.Double, java.lang.String) => scala.Double,
    t_set_auto_inv_100: scala.Double => scala.Double,
    t_set_disable_6xx: scala.Double => scala.Double,
    t_set_disable_failover: scala.Double => scala.Double,
    t_set_disable_internal_reply: scala.Double => scala.Double,
    t_set_fr: (scala.Double, scala.Double) => scala.Double,
    t_set_fr_inv: scala.Double => scala.Double,
    t_set_max_lifetime: (scala.Double, scala.Double) => scala.Double,
    t_set_no_e2e_cancel_reason: scala.Double => scala.Double,
    t_set_retr: (scala.Double, scala.Double) => scala.Double,
    t_uac_send: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    t_use_uac_headers: () => scala.Double
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(t_any_replied = js.Any.fromFunction0(t_any_replied), t_any_timeout = js.Any.fromFunction0(t_any_timeout), t_branch_replied = js.Any.fromFunction0(t_branch_replied), t_branch_timeout = js.Any.fromFunction0(t_branch_timeout), t_check_status = js.Any.fromFunction1(t_check_status), t_check_trans = js.Any.fromFunction0(t_check_trans), t_drop_replies = js.Any.fromFunction1(t_drop_replies), t_drop_replies_all = js.Any.fromFunction0(t_drop_replies_all), t_grep_status = js.Any.fromFunction1(t_grep_status), t_is_canceled = js.Any.fromFunction0(t_is_canceled), t_is_expired = js.Any.fromFunction0(t_is_expired), t_is_retr_async_reply = js.Any.fromFunction0(t_is_retr_async_reply), t_is_set = js.Any.fromFunction1(t_is_set), t_load_contacts = js.Any.fromFunction0(t_load_contacts), t_lookup_cancel = js.Any.fromFunction0(t_lookup_cancel), t_lookup_cancel_flags = js.Any.fromFunction1(t_lookup_cancel_flags), t_lookup_request = js.Any.fromFunction0(t_lookup_request), t_newtran = js.Any.fromFunction0(t_newtran), t_next_contact_flow = js.Any.fromFunction0(t_next_contact_flow), t_next_contacts = js.Any.fromFunction0(t_next_contacts), t_on_branch = js.Any.fromFunction1(t_on_branch), t_on_branch_failure = js.Any.fromFunction1(t_on_branch_failure), t_on_failure = js.Any.fromFunction1(t_on_failure), t_on_reply = js.Any.fromFunction1(t_on_reply), t_relay = js.Any.fromFunction0(t_relay), t_release = js.Any.fromFunction0(t_release), t_replicate = js.Any.fromFunction1(t_replicate), t_reply = js.Any.fromFunction2(t_reply), t_reset_fr = js.Any.fromFunction0(t_reset_fr), t_reset_max_lifetime = js.Any.fromFunction0(t_reset_max_lifetime), t_reset_retr = js.Any.fromFunction0(t_reset_retr), t_retransmit_reply = js.Any.fromFunction0(t_retransmit_reply), t_save_lumps = js.Any.fromFunction0(t_save_lumps), t_send_reply = js.Any.fromFunction2(t_send_reply), t_set_auto_inv_100 = js.Any.fromFunction1(t_set_auto_inv_100), t_set_disable_6xx = js.Any.fromFunction1(t_set_disable_6xx), t_set_disable_failover = js.Any.fromFunction1(t_set_disable_failover), t_set_disable_internal_reply = js.Any.fromFunction1(t_set_disable_internal_reply), t_set_fr = js.Any.fromFunction2(t_set_fr), t_set_fr_inv = js.Any.fromFunction1(t_set_fr_inv), t_set_max_lifetime = js.Any.fromFunction2(t_set_max_lifetime), t_set_no_e2e_cancel_reason = js.Any.fromFunction1(t_set_no_e2e_cancel_reason), t_set_retr = js.Any.fromFunction2(t_set_retr), t_uac_send = js.Any.fromFunction6(t_uac_send), t_use_uac_headers = js.Any.fromFunction0(t_use_uac_headers))
  
    __obj.asInstanceOf[Anon_Body]
  }
}

