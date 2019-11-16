package typings.atKeystonejsEmail

import typings.atKeystonejsEmail.atKeystonejsEmailMod.MailSenderBuilder
import typings.atKeystonejsEmail.atKeystonejsEmailMod.Sender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/email", JSImport.Namespace)
@js.native
object atKeystonejsEmailMod extends js.Object {
  @js.native
  trait MailSenderBuilder extends js.Object {
    def jsx(): Sender = js.native
    def jsx(opts: Anon_Root): Sender = js.native
    def mjml(): Sender = js.native
    def mjml(opts: Anon_Root): Sender = js.native
    def pug(): Sender = js.native
    def pug(opts: Anon_Root): Sender = js.native
  }
  
  val emailSender: MailSenderBuilder = js.native
  type Sender = js.Function1[/* fileName */ String, Anon_RendererOpts]
}

