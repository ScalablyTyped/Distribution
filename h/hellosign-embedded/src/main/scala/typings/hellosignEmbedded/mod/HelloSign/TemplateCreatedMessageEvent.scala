package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.anon.Ccroles
import typings.hellosignEmbedded.hellosignEmbeddedStrings.template_created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateCreatedMessageEvent extends MessageEvent {
  var event: template_created = js.native
  var template_id: String = js.native
  var template_info: Ccroles = js.native
}

object TemplateCreatedMessageEvent {
  @scala.inline
  def apply(event: template_created, template_id: String, template_info: Ccroles): TemplateCreatedMessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], template_info = template_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateCreatedMessageEvent]
  }
  @scala.inline
  implicit class TemplateCreatedMessageEventOps[Self <: TemplateCreatedMessageEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: template_created): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate_id(value: String): Self = this.set("template_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate_info(value: Ccroles): Self = this.set("template_info", value.asInstanceOf[js.Any])
  }
  
}

