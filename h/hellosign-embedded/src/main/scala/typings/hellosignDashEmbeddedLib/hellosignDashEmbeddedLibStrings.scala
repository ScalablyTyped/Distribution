package typings
package hellosignDashEmbeddedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hellosignDashEmbeddedLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait signature_request_canceled extends js.Object
  
  @js.native
  sealed trait signature_request_declined extends js.Object
  
  @js.native
  sealed trait signature_request_sent extends js.Object
  
  @js.native
  sealed trait signature_request_signed extends js.Object
  
  @js.native
  sealed trait template_created extends js.Object
  
  def error: error = "error".asInstanceOf[error]
  def signature_request_canceled: signature_request_canceled = "signature_request_canceled".asInstanceOf[signature_request_canceled]
  def signature_request_declined: signature_request_declined = "signature_request_declined".asInstanceOf[signature_request_declined]
  def signature_request_sent: signature_request_sent = "signature_request_sent".asInstanceOf[signature_request_sent]
  def signature_request_signed: signature_request_signed = "signature_request_signed".asInstanceOf[signature_request_signed]
  def template_created: template_created = "template_created".asInstanceOf[template_created]
}

