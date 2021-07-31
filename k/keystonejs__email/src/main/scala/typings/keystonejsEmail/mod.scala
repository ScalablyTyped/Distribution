package typings.keystonejsEmail

import typings.keystonejsEmail.anon.Root
import typings.keystonejsEmail.anon.Send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keystonejs/email", "emailSender")
  @js.native
  val emailSender: MailSenderBuilder = js.native
  
  @js.native
  trait MailSenderBuilder extends StObject {
    
    def jsx(): Sender = js.native
    def jsx(opts: Root): Sender = js.native
    
    def mjml(): Sender = js.native
    def mjml(opts: Root): Sender = js.native
    
    def pug(): Sender = js.native
    def pug(opts: Root): Sender = js.native
  }
  
  type Sender = js.Function1[/* fileName */ String, Send]
}
