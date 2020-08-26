package typings.mailparser.mod

import typings.mailparser.mailparserStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text message content.
  */
@js.native
trait MessageText extends js.Object {
  /**
    * Includes the HTML version of the message.
    *
    * Is set if the message has at least one `text/html` node.
    */
  var html: js.UndefOr[String | Boolean] = js.native
  /**
    * Includes the plaintext version of the message.
    *
    * Is set if the message has at least one `text/plain` node.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Includes the plaintext version of the message in HTML format.
    *
    * Is set if the message has at least one `text/plain` node.
    */
  var textAsHtml: js.UndefOr[String] = js.native
  /**
    * Message type.
    */
  var `type`: text = js.native
}

object MessageText {
  @scala.inline
  def apply(`type`: text): MessageText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageText]
  }
  @scala.inline
  implicit class MessageTextOps[Self <: MessageText] (val x: Self) extends AnyVal {
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
    def setType(value: text): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String | Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextAsHtml(value: String): Self = this.set("textAsHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAsHtml: Self = this.set("textAsHtml", js.undefined)
  }
  
}

