package typings.jestTestResult.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Added extends js.Object {
  
  var added: Double = js.native
  
  var fileDeleted: Boolean = js.native
  
  var matched: Double = js.native
  
  var unchecked: Double = js.native
  
  var uncheckedKeys: js.Array[String] = js.native
  
  var unmatched: Double = js.native
  
  var updated: Double = js.native
}
object Added {
  
  @scala.inline
  def apply(
    added: Double,
    fileDeleted: Boolean,
    matched: Double,
    unchecked: Double,
    uncheckedKeys: js.Array[String],
    unmatched: Double,
    updated: Double
  ): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], fileDeleted = fileDeleted.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], unchecked = unchecked.asInstanceOf[js.Any], uncheckedKeys = uncheckedKeys.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  
  @scala.inline
  implicit class AddedOps[Self <: Added] (val x: Self) extends AnyVal {
    
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
    def setAdded(value: Double): Self = this.set("added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDeleted(value: Boolean): Self = this.set("fileDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatched(value: Double): Self = this.set("matched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnchecked(value: Double): Self = this.set("unchecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedKeysVarargs(value: String*): Self = this.set("uncheckedKeys", js.Array(value :_*))
    
    @scala.inline
    def setUncheckedKeys(value: js.Array[String]): Self = this.set("uncheckedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmatched(value: Double): Self = this.set("unmatched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: Double): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
}
