package typings.highlightJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/************
  PRIVATE API
  ************/
/* for jsdoc annotations in the JS source files */
/* Inlined std.Error & {  mode :highlight.js.Mode | highlight.js.Language | undefined,   languageName :string | undefined,   badRule :highlight.js.Mode | undefined} */
@js.native
trait AnnotatedError extends js.Object {
  
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
  implicit class AnnotatedErrorOps[Self <: AnnotatedError] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadRule(value: Mode): Self = this.set("badRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadRule: Self = this.set("badRule", js.undefined)
    
    @scala.inline
    def setLanguageName(value: String): Self = this.set("languageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageName: Self = this.set("languageName", js.undefined)
    
    @scala.inline
    def setMode(value: Mode | Language): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}
