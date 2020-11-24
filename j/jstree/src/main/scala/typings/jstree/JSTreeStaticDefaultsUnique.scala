package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSTreeStaticDefaultsUnique extends js.Object {
  
  /**
    * Indicates if the comparison should be case sensitive. Default is `false`.
    * @name $.jstree.defaults.unique.case_sensitive
    * @plugin unique
    */
  var case_sensitive: Boolean = js.native
  
  /**
    * A callback executed in the instance's scope when a new node is created
    * and the name is already taken, the two arguments are the conflicting name and the counter.
    * The default will produce results like `New node (2)`.
    * @name $.jstree.defaults.unique.duplicate
    * @plugin unique
    */
  def duplicate(name: String, counter: Double): String = js.native
  
  /**
    * Indicates if white space should be trimmed before the comparison. Default is `false`.
    * @name $.jstree.defaults.unique.trim_whitespace
    * @plugin unique
    */
  var trim_whitespace: Boolean = js.native
}
object JSTreeStaticDefaultsUnique {
  
  @scala.inline
  def apply(case_sensitive: Boolean, duplicate: (String, Double) => String, trim_whitespace: Boolean): JSTreeStaticDefaultsUnique = {
    val __obj = js.Dynamic.literal(case_sensitive = case_sensitive.asInstanceOf[js.Any], duplicate = js.Any.fromFunction2(duplicate), trim_whitespace = trim_whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsUnique]
  }
  
  @scala.inline
  implicit class JSTreeStaticDefaultsUniqueOps[Self <: JSTreeStaticDefaultsUnique] (val x: Self) extends AnyVal {
    
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
    def setCase_sensitive(value: Boolean): Self = this.set("case_sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicate(value: (String, Double) => String): Self = this.set("duplicate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrim_whitespace(value: Boolean): Self = this.set("trim_whitespace", value.asInstanceOf[js.Any])
  }
}
