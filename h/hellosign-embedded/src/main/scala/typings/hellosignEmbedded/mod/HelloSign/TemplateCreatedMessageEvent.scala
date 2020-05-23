package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.anon.Ccroles
import typings.hellosignEmbedded.hellosignEmbeddedStrings.template_created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateCreatedMessageEvent extends MessageEvent {
  var event: template_created
  var template_id: String
  var template_info: Ccroles
}

object TemplateCreatedMessageEvent {
  @scala.inline
  def apply(event: template_created, template_id: String, template_info: Ccroles): TemplateCreatedMessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], template_info = template_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateCreatedMessageEvent]
  }
}

