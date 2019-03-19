package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appendhfvalue extends js.Object {
  def append_hf_value(hexp: java.lang.String, `val`: java.lang.String): scala.Double
  def assign_hf_value(hexp: java.lang.String, `val`: java.lang.String): scala.Double
  def assign_hf_value2(hexp: java.lang.String, `val`: java.lang.String): scala.Double
  def change_reply_status(code: scala.Double, reason: java.lang.String): scala.Double
  def exclude_hf_value(hexp: java.lang.String, `val`: java.lang.String): scala.Double
  def fnmatch(`val`: java.lang.String, `match`: java.lang.String): scala.Double
  def fnmatch_ex(`val`: java.lang.String, `match`: java.lang.String, flags: java.lang.String): scala.Double
  def hf_value_exists(hexp: java.lang.String, `val`: java.lang.String): scala.Double
  def include_hf_value(hexp: java.lang.String, `val`: java.lang.String): scala.Double
  def insert_hf_value(hexp: java.lang.String, `val`: java.lang.String): scala.Double
  def keep_hf(): scala.Double
  def keep_hf_re(sre: java.lang.String): scala.Double
  def msg_apply_changes(): scala.Double
  def msg_set_buffer(obuf: java.lang.String): scala.Double
  def remove_body(): scala.Double
  def remove_hf_value(hexp: java.lang.String): scala.Double
  def remove_hf_value2(hexp: java.lang.String, `val`: java.lang.String): scala.Double
}

object Anon_Appendhfvalue {
  @scala.inline
  def apply(
    append_hf_value: (java.lang.String, java.lang.String) => scala.Double,
    assign_hf_value: (java.lang.String, java.lang.String) => scala.Double,
    assign_hf_value2: (java.lang.String, java.lang.String) => scala.Double,
    change_reply_status: (scala.Double, java.lang.String) => scala.Double,
    exclude_hf_value: (java.lang.String, java.lang.String) => scala.Double,
    fnmatch: (java.lang.String, java.lang.String) => scala.Double,
    fnmatch_ex: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    hf_value_exists: (java.lang.String, java.lang.String) => scala.Double,
    include_hf_value: (java.lang.String, java.lang.String) => scala.Double,
    insert_hf_value: (java.lang.String, java.lang.String) => scala.Double,
    keep_hf: () => scala.Double,
    keep_hf_re: java.lang.String => scala.Double,
    msg_apply_changes: () => scala.Double,
    msg_set_buffer: java.lang.String => scala.Double,
    remove_body: () => scala.Double,
    remove_hf_value: java.lang.String => scala.Double,
    remove_hf_value2: (java.lang.String, java.lang.String) => scala.Double
  ): Anon_Appendhfvalue = {
    val __obj = js.Dynamic.literal(append_hf_value = js.Any.fromFunction2(append_hf_value), assign_hf_value = js.Any.fromFunction2(assign_hf_value), assign_hf_value2 = js.Any.fromFunction2(assign_hf_value2), change_reply_status = js.Any.fromFunction2(change_reply_status), exclude_hf_value = js.Any.fromFunction2(exclude_hf_value), fnmatch = js.Any.fromFunction2(fnmatch), fnmatch_ex = js.Any.fromFunction3(fnmatch_ex), hf_value_exists = js.Any.fromFunction2(hf_value_exists), include_hf_value = js.Any.fromFunction2(include_hf_value), insert_hf_value = js.Any.fromFunction2(insert_hf_value), keep_hf = js.Any.fromFunction0(keep_hf), keep_hf_re = js.Any.fromFunction1(keep_hf_re), msg_apply_changes = js.Any.fromFunction0(msg_apply_changes), msg_set_buffer = js.Any.fromFunction1(msg_set_buffer), remove_body = js.Any.fromFunction0(remove_body), remove_hf_value = js.Any.fromFunction1(remove_hf_value), remove_hf_value2 = js.Any.fromFunction2(remove_hf_value2))
  
    __obj.asInstanceOf[Anon_Appendhfvalue]
  }
}

