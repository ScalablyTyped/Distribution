package typings.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImapMessageBodyInfo extends js.Object {
  
  /** The size of this body in bytes. */
  var size: Double = js.native
  
  /** The specifier for this body (e.g. 'TEXT', 'HEADER.FIELDS (TO FROM SUBJECT)', etc). */
  var which: String = js.native
}
object ImapMessageBodyInfo {
  
  @scala.inline
  def apply(size: Double, which: String): ImapMessageBodyInfo = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapMessageBodyInfo]
  }
  
  @scala.inline
  implicit class ImapMessageBodyInfoOps[Self <: ImapMessageBodyInfo] (val x: Self) extends AnyVal {
    
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhich(value: String): Self = this.set("which", value.asInstanceOf[js.Any])
  }
}
