package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateVerificationToken extends js.Object {
  
  var from: String = js.native
  
  def generateVerificationToken(): Unit = js.native
  
  var redirect: String = js.native
  
  var subject: String = js.native
  
  var template: String = js.native
  
  var text: String = js.native
  
  var to: String = js.native
  
  var `type`: String = js.native
}
object GenerateVerificationToken {
  
  @scala.inline
  def apply(
    from: String,
    generateVerificationToken: () => Unit,
    redirect: String,
    subject: String,
    template: String,
    text: String,
    to: String,
    `type`: String
  ): GenerateVerificationToken = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], generateVerificationToken = js.Any.fromFunction0(generateVerificationToken), redirect = redirect.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateVerificationToken]
  }
  
  @scala.inline
  implicit class GenerateVerificationTokenOps[Self <: GenerateVerificationToken] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateVerificationToken(value: () => Unit): Self = this.set("generateVerificationToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRedirect(value: String): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
