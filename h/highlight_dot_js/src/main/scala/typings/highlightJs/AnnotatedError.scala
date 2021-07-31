package typings.highlightJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/************
  PRIVATE API
  ************/
/* for jsdoc annotations in the JS source files */
trait AnnotatedError
  extends StObject
     with Error {
  
  var badRule: js.UndefOr[Mode] = js.undefined
  
  var languageName: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[Mode | Language] = js.undefined
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
    def setMode(value: Mode | Language): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
