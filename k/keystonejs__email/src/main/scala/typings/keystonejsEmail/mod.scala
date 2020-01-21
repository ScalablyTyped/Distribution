package typings.keystonejsEmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/email", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait MailSenderBuilder extends js.Object {
    def jsx(): Sender = js.native
    def jsx(opts: AnonRoot): Sender = js.native
    def mjml(): Sender = js.native
    def mjml(opts: AnonRoot): Sender = js.native
    def pug(): Sender = js.native
    def pug(opts: AnonRoot): Sender = js.native
  }
  
  val emailSender: MailSenderBuilder = js.native
  type Sender = js.Function1[/* fileName */ String, AnonRendererOpts]
}

