package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOptions extends BaseValidationOptions {
  
  /**
    * overrides individual error messages. Defaults to no override (`{}`).
    * Messages use the same rules as templates.
    * Variables in double braces `{{var}}` are HTML escaped if the option `errors.escapeHtml` is set to true.
    *
    * @default {}
    */
  var messages: js.UndefOr[LanguageMessages] = js.native
}
object ValidationOptions {
  
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  
  @scala.inline
  implicit class ValidationOptionsMutableBuilder[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: LanguageMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
  }
}
