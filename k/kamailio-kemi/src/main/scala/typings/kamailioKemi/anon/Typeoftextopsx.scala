package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftextopsx extends js.Object {
  
  def append_hf_value(hexp: String, `val`: String): Double = js.native
  
  def assign_hf_value(hexp: String, `val`: String): Double = js.native
  
  def assign_hf_value2(hexp: String, `val`: String): Double = js.native
  
  def change_reply_status(code: Double, reason: String): Double = js.native
  
  def exclude_hf_value(hexp: String, `val`: String): Double = js.native
  
  def fnmatch(`val`: String, `match`: String): Double = js.native
  
  def fnmatch_ex(`val`: String, `match`: String, flags: String): Double = js.native
  
  def hf_value_exists(hexp: String, `val`: String): Double = js.native
  
  def include_hf_value(hexp: String, `val`: String): Double = js.native
  
  def insert_hf_value(hexp: String, `val`: String): Double = js.native
  
  def keep_hf(): Double = js.native
  
  def keep_hf_re(sre: String): Double = js.native
  
  def msg_apply_changes(): Double = js.native
  
  def msg_set_buffer(obuf: String): Double = js.native
  
  def remove_body(): Double = js.native
  
  def remove_hf_value(hexp: String): Double = js.native
  
  def remove_hf_value2(hexp: String, `val`: String): Double = js.native
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
  
  @scala.inline
  implicit class TypeoftextopsxOps[Self <: Typeoftextopsx] (val x: Self) extends AnyVal {
    
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
    def setAppend_hf_value(value: (String, String) => Double): Self = this.set("append_hf_value", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAssign_hf_value(value: (String, String) => Double): Self = this.set("assign_hf_value", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAssign_hf_value2(value: (String, String) => Double): Self = this.set("assign_hf_value2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChange_reply_status(value: (Double, String) => Double): Self = this.set("change_reply_status", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExclude_hf_value(value: (String, String) => Double): Self = this.set("exclude_hf_value", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFnmatch(value: (String, String) => Double): Self = this.set("fnmatch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFnmatch_ex(value: (String, String, String) => Double): Self = this.set("fnmatch_ex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHf_value_exists(value: (String, String) => Double): Self = this.set("hf_value_exists", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInclude_hf_value(value: (String, String) => Double): Self = this.set("include_hf_value", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsert_hf_value(value: (String, String) => Double): Self = this.set("insert_hf_value", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeep_hf(value: () => Double): Self = this.set("keep_hf", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeep_hf_re(value: String => Double): Self = this.set("keep_hf_re", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMsg_apply_changes(value: () => Double): Self = this.set("msg_apply_changes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMsg_set_buffer(value: String => Double): Self = this.set("msg_set_buffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_body(value: () => Double): Self = this.set("remove_body", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove_hf_value(value: String => Double): Self = this.set("remove_hf_value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_hf_value2(value: (String, String) => Double): Self = this.set("remove_hf_value2", js.Any.fromFunction2(value))
  }
}
