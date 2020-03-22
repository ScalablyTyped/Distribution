package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.AnonCcemailaddresses
import typings.hellosignEmbedded.AnonCcroles
import typings.hellosignEmbedded.hellosignEmbeddedStrings.error
import typings.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_canceled
import typings.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_declined
import typings.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_sent
import typings.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_signed
import typings.hellosignEmbedded.hellosignEmbeddedStrings.template_created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hellosignEmbedded.mod.HelloSign.SignedMessageEvent
  - typings.hellosignEmbedded.mod.HelloSign.DeclinedMessageEvent
  - typings.hellosignEmbedded.mod.HelloSign.CanceledMessageEvent
  - typings.hellosignEmbedded.mod.HelloSign.SentMessageEvent
  - typings.hellosignEmbedded.mod.HelloSign.TemplateCreatedMessageEvent
  - typings.hellosignEmbedded.mod.HelloSign.ErrorMessageEvent
*/
trait MessageEvent extends js.Object

object MessageEvent {
  @scala.inline
  def SignedMessageEvent(event: signature_request_signed, signature_id: String): MessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageEvent]
  }
  @scala.inline
  def SentMessageEvent(
    event: signature_request_sent,
    signature_request_id: String,
    signature_request_info: AnonCcemailaddresses
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_request_id = signature_request_id.asInstanceOf[js.Any], signature_request_info = signature_request_info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageEvent]
  }
  @scala.inline
  def CanceledMessageEvent(event: signature_request_canceled): MessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageEvent]
  }
  @scala.inline
  def DeclinedMessageEvent(event: signature_request_declined, signature_id: String): MessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageEvent]
  }
  @scala.inline
  def TemplateCreatedMessageEvent(event: template_created, template_id: String, template_info: AnonCcroles): MessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], template_info = template_info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageEvent]
  }
  @scala.inline
  def ErrorMessageEvent(description: String, event: error): MessageEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageEvent]
  }
}

