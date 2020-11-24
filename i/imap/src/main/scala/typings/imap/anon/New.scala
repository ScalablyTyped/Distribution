package typings.imap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait New extends js.Object {
  
  /** Number of messages in this mailbox having the Recent flag (this IMAP session is the first to see these messages). */
  var `new`: Double = js.native
  
  /** Total number of messages in this mailbox. */
  var total: Double = js.native
  
  /** (Only available with status() calls) Number of messages in this mailbox not having the Seen flag (marked as not having been read). */
  var unseen: Double = js.native
}
object New {
  
  @scala.inline
  def apply(`new`: Double, total: Double, unseen: Double): New = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], unseen = unseen.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[New]
  }
  
  @scala.inline
  implicit class NewOps[Self <: New] (val x: Self) extends AnyVal {
    
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
    def setNew(value: Double): Self = this.set("new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnseen(value: Double): Self = this.set("unseen", value.asInstanceOf[js.Any])
  }
}
