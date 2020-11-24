package typings.hapiJoi.mod

import typings.hapiJoi.anon.Array
import typings.hapiJoi.hapiJoiBooleans.`false`
import typings.hapiJoi.hapiJoiStrings.key
import typings.hapiJoi.hapiJoiStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorFormattingOptions extends js.Object {
  
  /**
    * when true, error message templates will escape special characters to HTML entities, for security purposes.
    *
    * @default false
    */
  var escapeHtml: js.UndefOr[Boolean] = js.native
  
  /**
    * defines the value used to set the label context variable.
    */
  var label: js.UndefOr[path | key | `false`] = js.native
  
  /**
    * The preferred language code for error messages.
    * The value is matched against keys at the root of the messages object, and then the error code as a child key of that.
    * Can be a reference to the value, global context, or local context which is the root value passed to the validation function.
    *
    * Note that references to the value are usually not what you want as they move around the value structure relative to where the error happens.
    * Instead, either use the global context, or the absolute value (e.g. `Joi.ref('/variable')`)
    */
  var language: js.UndefOr[/* keyof @hapi/joi.@hapi/joi.LanguageMessages */ String] = js.native
  
  /**
    * when false, skips rendering error templates. Useful when error messages are generated elsewhere to save processing time.
    *
    * @default true
    */
  var render: js.UndefOr[Boolean] = js.native
  
  /**
    * when true, the main error will possess a stack trace, otherwise it will be disabled.
    * Defaults to false for performances reasons. Has no effect on platforms other than V8/node.js as it uses the Stack trace API.
    *
    * @default false
    */
  var stack: js.UndefOr[Boolean] = js.native
  
  /**
    * overrides the way values are wrapped (e.g. `[]` arround arrays, `""` around labels).
    * Each key can be set to a string with one (same character before and after the value) or two characters (first character
    * before and second character after), or `false` to disable wrapping.
    */
  var wrap: js.UndefOr[Array] = js.native
}
object ErrorFormattingOptions {
  
  @scala.inline
  def apply(): ErrorFormattingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorFormattingOptions]
  }
  
  @scala.inline
  implicit class ErrorFormattingOptionsOps[Self <: ErrorFormattingOptions] (val x: Self) extends AnyVal {
    
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
    def setEscapeHtml(value: Boolean): Self = this.set("escapeHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeHtml: Self = this.set("escapeHtml", js.undefined)
    
    @scala.inline
    def setLabel(value: path | key | `false`): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLanguage(value: /* keyof @hapi/joi.@hapi/joi.LanguageMessages */ String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setRender(value: Boolean): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setWrap(value: Array): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
