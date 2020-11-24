package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotation extends js.Object {
  
  /** Length of the substring in the plain-text message body this annotation corresponds to. */
  var length: js.UndefOr[Double] = js.native
  
  /** The metadata for a slash command. */
  var slashCommand: js.UndefOr[SlashCommandMetadata] = js.native
  
  /** Start index (0-based, inclusive) in the plain-text message body this annotation corresponds to. */
  var startIndex: js.UndefOr[Double] = js.native
  
  /** The type of this annotation. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The metadata of user mention. */
  var userMention: js.UndefOr[UserMentionMetadata] = js.native
}
object Annotation {
  
  @scala.inline
  def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setSlashCommand(value: SlashCommandMetadata): Self = this.set("slashCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlashCommand: Self = this.set("slashCommand", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserMention(value: UserMentionMetadata): Self = this.set("userMention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserMention: Self = this.set("userMention", js.undefined)
  }
}
