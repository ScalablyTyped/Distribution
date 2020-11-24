package typings.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchOptions extends js.Object {
  
  /** A string or Array of strings containing the body part section to fetch. Default: (none) Example sections: */
  var bodies: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Fetch the message envelope. Default: false */
  var envelope: js.UndefOr[Boolean] = js.native
  
  /** Mark message(s) as read when fetched. Default: false */
  var markSeen: js.UndefOr[Boolean] = js.native
  
  /** Fetch modifiers defined by IMAP extensions. Default: (none) */
  var modifiers: js.UndefOr[js.Object] = js.native
  
  /** Fetch the RFC822 size. Default: false */
  var size: js.UndefOr[Boolean] = js.native
  
  /** Fetch the message structure. Default: false */
  var struct: js.UndefOr[Boolean] = js.native
}
object FetchOptions {
  
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  
  @scala.inline
  implicit class FetchOptionsOps[Self <: FetchOptions] (val x: Self) extends AnyVal {
    
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
    def setBodiesVarargs(value: String*): Self = this.set("bodies", js.Array(value :_*))
    
    @scala.inline
    def setBodies(value: String | js.Array[String]): Self = this.set("bodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodies: Self = this.set("bodies", js.undefined)
    
    @scala.inline
    def setEnvelope(value: Boolean): Self = this.set("envelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelope: Self = this.set("envelope", js.undefined)
    
    @scala.inline
    def setMarkSeen(value: Boolean): Self = this.set("markSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkSeen: Self = this.set("markSeen", js.undefined)
    
    @scala.inline
    def setModifiers(value: js.Object): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setSize(value: Boolean): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStruct(value: Boolean): Self = this.set("struct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStruct: Self = this.set("struct", js.undefined)
  }
}
