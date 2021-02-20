package typings.highlightJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/************
  PRIVATE API
  ************/
/* for jsdoc annotations in the JS source files */
/* Inlined std.Error & {  mode :highlight.js.Mode | highlight.js.Language | undefined,   languageName :string | undefined,   badRule :highlight.js.Mode | undefined} */
@js.native
trait AnnotatedError extends StObject {
  
  var badRule: js.UndefOr[Mode] = js.native
  
  var languageName: js.UndefOr[String] = js.native
  
  var message: String = js.native
  
  var mode: js.UndefOr[Mode | Language] = js.native
  
  var name: String = js.native
  
  var stack: js.UndefOr[String] = js.native
}
object AnnotatedError {
  
  @scala.inline
  def apply(message: String, name: String): AnnotatedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotatedError]
  }
  
  @scala.inline
  implicit class AnnotatedErrorMutableBuilder[Self <: AnnotatedError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadRule(value: Mode): Self = StObject.set(x, "badRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadRuleUndefined: Self = StObject.set(x, "badRule", js.undefined)
    
    @scala.inline
    def setLanguageName(value: String): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageNameUndefined: Self = StObject.set(x, "languageName", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Mode | Language): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
