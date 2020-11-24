package typings.imap.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImapMessageAttributes extends js.Object {
  
  /** The internal server date for the message. */
  var date: Date = js.native
  
  /** A list of flags currently set on this message. */
  var flags: js.Array[String] = js.native
  
  /** The RFC822 message size (only set if requested with fetch()). */
  var size: js.UndefOr[Double] = js.native
  
  /** The message's body structure (only set if requested with fetch()). */
  var struct: js.UndefOr[js.Array[_]] = js.native
  
  /** A 32-bit ID that uniquely identifies this message within its mailbox. */
  var uid: Double = js.native
}
object ImapMessageAttributes {
  
  @scala.inline
  def apply(date: Date, flags: js.Array[String], uid: Double): ImapMessageAttributes = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapMessageAttributes]
  }
  
  @scala.inline
  implicit class ImapMessageAttributesOps[Self <: ImapMessageAttributes] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsVarargs(value: String*): Self = this.set("flags", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: js.Array[String]): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStructVarargs(value: js.Any*): Self = this.set("struct", js.Array(value :_*))
    
    @scala.inline
    def setStruct(value: js.Array[_]): Self = this.set("struct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStruct: Self = this.set("struct", js.undefined)
  }
}
