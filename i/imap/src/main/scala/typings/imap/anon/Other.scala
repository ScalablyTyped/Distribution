package typings.imap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Other extends js.Object {
  
  /** Mailboxes that belong to other users that the logged in user has access to. */
  var other: js.Array[_] = js.native
  
  /** Mailboxes that belong to the logged in user. */
  var personal: js.Array[_] = js.native
  
  /** Mailboxes that are accessible by any logged in user. */
  var shared: js.Array[_] = js.native
}
object Other {
  
  @scala.inline
  def apply(other: js.Array[_], personal: js.Array[_], shared: js.Array[_]): Other = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
  
  @scala.inline
  implicit class OtherOps[Self <: Other] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other_ <: js.Any](other: Other_): Self with Other_ = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other_]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOtherVarargs(value: js.Any*): Self = this.set("other", js.Array(value :_*))
    
    @scala.inline
    def setOther(value: js.Array[_]): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalVarargs(value: js.Any*): Self = this.set("personal", js.Array(value :_*))
    
    @scala.inline
    def setPersonal(value: js.Array[_]): Self = this.set("personal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedVarargs(value: js.Any*): Self = this.set("shared", js.Array(value :_*))
    
    @scala.inline
    def setShared(value: js.Array[_]): Self = this.set("shared", value.asInstanceOf[js.Any])
  }
}
