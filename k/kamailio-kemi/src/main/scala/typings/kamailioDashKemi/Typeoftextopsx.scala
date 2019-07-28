package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftextopsx extends js.Object {
  def append_hf_value(hexp: String, `val`: String): Double
  def assign_hf_value(hexp: String, `val`: String): Double
  def assign_hf_value2(hexp: String, `val`: String): Double
  def change_reply_status(code: Double, reason: String): Double
  def exclude_hf_value(hexp: String, `val`: String): Double
  def fnmatch(`val`: String, `match`: String): Double
  def fnmatch_ex(`val`: String, `match`: String, flags: String): Double
  def hf_value_exists(hexp: String, `val`: String): Double
  def include_hf_value(hexp: String, `val`: String): Double
  def insert_hf_value(hexp: String, `val`: String): Double
  def keep_hf(): Double
  def keep_hf_re(sre: String): Double
  def msg_apply_changes(): Double
  def msg_set_buffer(obuf: String): Double
  def remove_body(): Double
  def remove_hf_value(hexp: String): Double
  def remove_hf_value2(hexp: String, `val`: String): Double
}

object Typeoftextopsx {
  @scala.inline
  def apply(
    append_hf_value: (String, String) => Double,
    assign_hf_value: (String, String) => Double,
    assign_hf_value2: (String, String) => Double,
    change_reply_status: (Double, String) => Double,
    exclude_hf_value: (String, String) => Double,
    fnmatch: (String, String) => Double,
    fnmatch_ex: (String, String, String) => Double,
    hf_value_exists: (String, String) => Double,
    include_hf_value: (String, String) => Double,
    insert_hf_value: (String, String) => Double,
    keep_hf: () => Double,
    keep_hf_re: String => Double,
    msg_apply_changes: () => Double,
    msg_set_buffer: String => Double,
    remove_body: () => Double,
    remove_hf_value: String => Double,
    remove_hf_value2: (String, String) => Double
  ): Typeoftextopsx = {
    val __obj = js.Dynamic.literal(append_hf_value = js.Any.fromFunction2(append_hf_value), assign_hf_value = js.Any.fromFunction2(assign_hf_value), assign_hf_value2 = js.Any.fromFunction2(assign_hf_value2), change_reply_status = js.Any.fromFunction2(change_reply_status), exclude_hf_value = js.Any.fromFunction2(exclude_hf_value), fnmatch = js.Any.fromFunction2(fnmatch), fnmatch_ex = js.Any.fromFunction3(fnmatch_ex), hf_value_exists = js.Any.fromFunction2(hf_value_exists), include_hf_value = js.Any.fromFunction2(include_hf_value), insert_hf_value = js.Any.fromFunction2(insert_hf_value), keep_hf = js.Any.fromFunction0(keep_hf), keep_hf_re = js.Any.fromFunction1(keep_hf_re), msg_apply_changes = js.Any.fromFunction0(msg_apply_changes), msg_set_buffer = js.Any.fromFunction1(msg_set_buffer), remove_body = js.Any.fromFunction0(remove_body), remove_hf_value = js.Any.fromFunction1(remove_hf_value), remove_hf_value2 = js.Any.fromFunction2(remove_hf_value2))
  
    __obj.asInstanceOf[Typeoftextopsx]
  }
}

