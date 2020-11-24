package typings.jsBeautify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreBeautifyOptions extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var end_with_newline: js.UndefOr[Boolean] = js.native
  
  var eol: js.UndefOr[String] = js.native
  
  var indent_char: js.UndefOr[String] = js.native
  
  var indent_empty_lines: js.UndefOr[Boolean] = js.native
  
  var indent_level: js.UndefOr[Double] = js.native
  
  var indent_size: js.UndefOr[Double] = js.native
  
  var indent_with_tabs: js.UndefOr[Boolean] = js.native
  
  var max_preserve_newlines: js.UndefOr[Double] = js.native
  
  var preserve_newlines: js.UndefOr[Boolean] = js.native
  
  var templating: js.UndefOr[js.Array[String]] = js.native
  
  var wrap_line_length: js.UndefOr[Double] = js.native
}
object CoreBeautifyOptions {
  
  @scala.inline
  def apply(): CoreBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreBeautifyOptions]
  }
  
  @scala.inline
  implicit class CoreBeautifyOptionsOps[Self <: CoreBeautifyOptions] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEnd_with_newline(value: Boolean): Self = this.set("end_with_newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_with_newline: Self = this.set("end_with_newline", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    
    @scala.inline
    def setIndent_char(value: String): Self = this.set("indent_char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_char: Self = this.set("indent_char", js.undefined)
    
    @scala.inline
    def setIndent_empty_lines(value: Boolean): Self = this.set("indent_empty_lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_empty_lines: Self = this.set("indent_empty_lines", js.undefined)
    
    @scala.inline
    def setIndent_level(value: Double): Self = this.set("indent_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_level: Self = this.set("indent_level", js.undefined)
    
    @scala.inline
    def setIndent_size(value: Double): Self = this.set("indent_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_size: Self = this.set("indent_size", js.undefined)
    
    @scala.inline
    def setIndent_with_tabs(value: Boolean): Self = this.set("indent_with_tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_with_tabs: Self = this.set("indent_with_tabs", js.undefined)
    
    @scala.inline
    def setMax_preserve_newlines(value: Double): Self = this.set("max_preserve_newlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_preserve_newlines: Self = this.set("max_preserve_newlines", js.undefined)
    
    @scala.inline
    def setPreserve_newlines(value: Boolean): Self = this.set("preserve_newlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserve_newlines: Self = this.set("preserve_newlines", js.undefined)
    
    @scala.inline
    def setTemplatingVarargs(value: String*): Self = this.set("templating", js.Array(value :_*))
    
    @scala.inline
    def setTemplating(value: js.Array[String]): Self = this.set("templating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplating: Self = this.set("templating", js.undefined)
    
    @scala.inline
    def setWrap_line_length(value: Double): Self = this.set("wrap_line_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap_line_length: Self = this.set("wrap_line_length", js.undefined)
  }
}
