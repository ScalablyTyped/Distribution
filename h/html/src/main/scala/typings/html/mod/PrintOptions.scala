package typings.html.mod

import typings.html.htmlStrings.`end-expand`
import typings.html.htmlStrings.collapse
import typings.html.htmlStrings.expand
import typings.html.htmlStrings.keep
import typings.html.htmlStrings.normal
import typings.html.htmlStrings.separate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintOptions extends js.Object {
  
  /**
    * Put braces on the same line as control statements (`collapse`),
    * or put braces on own line (Allman / ANSI style, `expand`),
    * or just put end braces on own line (`end-expand`). Default: `collapse`.
    */
  var brace_style: js.UndefOr[collapse | expand | `end-expand`] = js.native
  
  /** character to indent with. Default: " " (space). */
  var indent_char: js.UndefOr[String] = js.native
  
  /** Default: `normal`. */
  var indent_scripts: js.UndefOr[keep | separate | normal] = js.native
  
  /** indentation size. Default: 4. */
  var indent_size: js.UndefOr[Double] = js.native
  
  /** Maximum amount of characters per line. Default: 70. */
  var max_char: js.UndefOr[Double] = js.native
  
  /** list of tags, that shouldn't be reformatted. Defaults to inline tags. */
  var unformatted: js.UndefOr[js.Array[String]] = js.native
}
object PrintOptions {
  
  @scala.inline
  def apply(): PrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintOptions]
  }
  
  @scala.inline
  implicit class PrintOptionsOps[Self <: PrintOptions] (val x: Self) extends AnyVal {
    
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
    def setBrace_style(value: collapse | expand | `end-expand`): Self = this.set("brace_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrace_style: Self = this.set("brace_style", js.undefined)
    
    @scala.inline
    def setIndent_char(value: String): Self = this.set("indent_char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_char: Self = this.set("indent_char", js.undefined)
    
    @scala.inline
    def setIndent_scripts(value: keep | separate | normal): Self = this.set("indent_scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_scripts: Self = this.set("indent_scripts", js.undefined)
    
    @scala.inline
    def setIndent_size(value: Double): Self = this.set("indent_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_size: Self = this.set("indent_size", js.undefined)
    
    @scala.inline
    def setMax_char(value: Double): Self = this.set("max_char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_char: Self = this.set("max_char", js.undefined)
    
    @scala.inline
    def setUnformattedVarargs(value: String*): Self = this.set("unformatted", js.Array(value :_*))
    
    @scala.inline
    def setUnformatted(value: js.Array[String]): Self = this.set("unformatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnformatted: Self = this.set("unformatted", js.undefined)
  }
}
