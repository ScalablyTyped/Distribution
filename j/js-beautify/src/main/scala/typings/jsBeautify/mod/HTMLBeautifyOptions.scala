package typings.jsBeautify.mod

import typings.jsBeautify.jsBeautifyStrings.`aligned-multiple`
import typings.jsBeautify.jsBeautifyStrings.`force-aligned`
import typings.jsBeautify.jsBeautifyStrings.`force-expand-multiline`
import typings.jsBeautify.jsBeautifyStrings.`preserve-aligned`
import typings.jsBeautify.jsBeautifyStrings.auto
import typings.jsBeautify.jsBeautifyStrings.force
import typings.jsBeautify.jsBeautifyStrings.keep
import typings.jsBeautify.jsBeautifyStrings.normal
import typings.jsBeautify.jsBeautifyStrings.preserve
import typings.jsBeautify.jsBeautifyStrings.separate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLBeautifyOptions extends CoreBeautifyOptions {
  
  var content_unformatted: js.UndefOr[js.Array[String]] = js.native
  
  var extra_liners: js.UndefOr[js.Array[String]] = js.native
  
  var indent_body_inner_html: js.UndefOr[Boolean] = js.native
  
  var indent_handlebars: js.UndefOr[Boolean] = js.native
  
  var indent_head_inner_html: js.UndefOr[Boolean] = js.native
  
  var indent_inner_html: js.UndefOr[Boolean] = js.native
  
  var indent_scripts: js.UndefOr[normal | keep | separate] = js.native
  
  var `inline`: js.UndefOr[js.Array[String]] = js.native
  
  var unformatted: js.UndefOr[js.Array[String]] = js.native
  
  var unformatted_content_delimiter: js.UndefOr[String] = js.native
  
  var void_elements: js.UndefOr[js.Array[String]] = js.native
  
  var wrap_attributes: js.UndefOr[
    auto | force | `force-aligned` | `force-expand-multiline` | `aligned-multiple` | preserve | `preserve-aligned`
  ] = js.native
  
  var wrap_attributes_indent_size: js.UndefOr[Double] = js.native
}
object HTMLBeautifyOptions {
  
  @scala.inline
  def apply(): HTMLBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLBeautifyOptions]
  }
  
  @scala.inline
  implicit class HTMLBeautifyOptionsOps[Self <: HTMLBeautifyOptions] (val x: Self) extends AnyVal {
    
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
    def setContent_unformattedVarargs(value: String*): Self = this.set("content_unformatted", js.Array(value :_*))
    
    @scala.inline
    def setContent_unformatted(value: js.Array[String]): Self = this.set("content_unformatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_unformatted: Self = this.set("content_unformatted", js.undefined)
    
    @scala.inline
    def setExtra_linersVarargs(value: String*): Self = this.set("extra_liners", js.Array(value :_*))
    
    @scala.inline
    def setExtra_liners(value: js.Array[String]): Self = this.set("extra_liners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra_liners: Self = this.set("extra_liners", js.undefined)
    
    @scala.inline
    def setIndent_body_inner_html(value: Boolean): Self = this.set("indent_body_inner_html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_body_inner_html: Self = this.set("indent_body_inner_html", js.undefined)
    
    @scala.inline
    def setIndent_handlebars(value: Boolean): Self = this.set("indent_handlebars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_handlebars: Self = this.set("indent_handlebars", js.undefined)
    
    @scala.inline
    def setIndent_head_inner_html(value: Boolean): Self = this.set("indent_head_inner_html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_head_inner_html: Self = this.set("indent_head_inner_html", js.undefined)
    
    @scala.inline
    def setIndent_inner_html(value: Boolean): Self = this.set("indent_inner_html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_inner_html: Self = this.set("indent_inner_html", js.undefined)
    
    @scala.inline
    def setIndent_scripts(value: normal | keep | separate): Self = this.set("indent_scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_scripts: Self = this.set("indent_scripts", js.undefined)
    
    @scala.inline
    def setInlineVarargs(value: String*): Self = this.set("inline", js.Array(value :_*))
    
    @scala.inline
    def setInline(value: js.Array[String]): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setUnformattedVarargs(value: String*): Self = this.set("unformatted", js.Array(value :_*))
    
    @scala.inline
    def setUnformatted(value: js.Array[String]): Self = this.set("unformatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnformatted: Self = this.set("unformatted", js.undefined)
    
    @scala.inline
    def setUnformatted_content_delimiter(value: String): Self = this.set("unformatted_content_delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnformatted_content_delimiter: Self = this.set("unformatted_content_delimiter", js.undefined)
    
    @scala.inline
    def setVoid_elementsVarargs(value: String*): Self = this.set("void_elements", js.Array(value :_*))
    
    @scala.inline
    def setVoid_elements(value: js.Array[String]): Self = this.set("void_elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoid_elements: Self = this.set("void_elements", js.undefined)
    
    @scala.inline
    def setWrap_attributes(
      value: auto | force | `force-aligned` | `force-expand-multiline` | `aligned-multiple` | preserve | `preserve-aligned`
    ): Self = this.set("wrap_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap_attributes: Self = this.set("wrap_attributes", js.undefined)
    
    @scala.inline
    def setWrap_attributes_indent_size(value: Double): Self = this.set("wrap_attributes_indent_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap_attributes_indent_size: Self = this.set("wrap_attributes_indent_size", js.undefined)
  }
}
