package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  /** Input only. Parameters that a bot can use to configure how its response is posted. */
  var actionResponse: js.UndefOr[ActionResponse] = js.native
  
  /** Output only. Annotations associated with the text in this message. */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.native
  
  /** Plain-text body of the message with all bot mentions stripped out. */
  var argumentText: js.UndefOr[String] = js.native
  
  /** User uploaded attachment. */
  var attachment: js.UndefOr[js.Array[Attachment]] = js.native
  
  /**
    * Rich, formatted and interactive cards that can be used to display UI elements such as: formatted texts, buttons, clickable images. Cards are normally displayed below the plain-text
    * body of the message.
    */
  var cards: js.UndefOr[js.Array[Card]] = js.native
  
  /** Output only. The time at which the message was created in Hangouts Chat server. */
  var createTime: js.UndefOr[String] = js.native
  
  /** A plain-text description of the message's cards, used when the actual cards cannot be displayed (e.g. mobile notifications). */
  var fallbackText: js.UndefOr[String] = js.native
  
  /** Resource name, in the form "spaces/∗/messages/ *". Example: spaces/AAAAMpdlehY/messages/UMxbHmzDlr4.UMxbHmzDlr4 */
  var name: js.UndefOr[String] = js.native
  
  /** Text for generating preview chips. This text will not be displayed to the user, but any links to images, web pages, videos, etc. included here will generate preview chips. */
  var previewText: js.UndefOr[String] = js.native
  
  /** The user who created the message. */
  var sender: js.UndefOr[User] = js.native
  
  /** Slash command information, if applicable. */
  var slashCommand: js.UndefOr[SlashCommand] = js.native
  
  /** The space the message belongs to. */
  var space: js.UndefOr[Space] = js.native
  
  /** Plain-text body of the message. */
  var text: js.UndefOr[String] = js.native
  
  /** The thread the message belongs to. */
  var thread: js.UndefOr[Thread] = js.native
}
object Message {
  
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
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
    def setActionResponse(value: ActionResponse): Self = this.set("actionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionResponse: Self = this.set("actionResponse", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: Annotation*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[Annotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setArgumentText(value: String): Self = this.set("argumentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentText: Self = this.set("argumentText", js.undefined)
    
    @scala.inline
    def setAttachmentVarargs(value: Attachment*): Self = this.set("attachment", js.Array(value :_*))
    
    @scala.inline
    def setAttachment(value: js.Array[Attachment]): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    
    @scala.inline
    def setCardsVarargs(value: Card*): Self = this.set("cards", js.Array(value :_*))
    
    @scala.inline
    def setCards(value: js.Array[Card]): Self = this.set("cards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCards: Self = this.set("cards", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setFallbackText(value: String): Self = this.set("fallbackText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackText: Self = this.set("fallbackText", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPreviewText(value: String): Self = this.set("previewText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewText: Self = this.set("previewText", js.undefined)
    
    @scala.inline
    def setSender(value: User): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    
    @scala.inline
    def setSlashCommand(value: SlashCommand): Self = this.set("slashCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlashCommand: Self = this.set("slashCommand", js.undefined)
    
    @scala.inline
    def setSpace(value: Space): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setThread(value: Thread): Self = this.set("thread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThread: Self = this.set("thread", js.undefined)
  }
}
