package typings.hellosignDashEmbedded.hellosignDashEmbeddedMod.HelloSignNs

import typings.hellosignDashEmbedded.Anon_Ccroles
import typings.hellosignDashEmbedded.hellosignDashEmbeddedStrings.template_created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateCreatedMessageEvent extends MessageEvent {
  var event: template_created
  var template_id: String
  var template_info: Anon_Ccroles
}

object TemplateCreatedMessageEvent {
  @scala.inline
  def apply(event: template_created, template_id: String, template_info: Anon_Ccroles): TemplateCreatedMessageEvent = {
    val __obj = js.Dynamic.literal(event = event, template_id = template_id, template_info = template_info)
  
    __obj.asInstanceOf[TemplateCreatedMessageEvent]
  }
}

