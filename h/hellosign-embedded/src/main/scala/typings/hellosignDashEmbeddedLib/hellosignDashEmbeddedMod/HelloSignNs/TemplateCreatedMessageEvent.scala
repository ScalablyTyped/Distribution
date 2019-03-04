package typings
package hellosignDashEmbeddedLib.hellosignDashEmbeddedMod.HelloSignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateCreatedMessageEvent extends MessageEvent {
  var event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.template_created
  var template_id: java.lang.String
  var template_info: hellosignDashEmbeddedLib.Anon_Ccroles
}

object TemplateCreatedMessageEvent {
  @scala.inline
  def apply(
    event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.template_created,
    template_id: java.lang.String,
    template_info: hellosignDashEmbeddedLib.Anon_Ccroles
  ): TemplateCreatedMessageEvent = {
    val __obj = js.Dynamic.literal(event = event, template_id = template_id, template_info = template_info)
  
    __obj.asInstanceOf[TemplateCreatedMessageEvent]
  }
}

