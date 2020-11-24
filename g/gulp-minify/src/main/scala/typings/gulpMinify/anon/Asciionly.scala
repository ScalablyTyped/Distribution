package typings.gulpMinify.anon

import typings.gulpMinify.gulpMinifyBooleans.`false`
import typings.gulpMinify.gulpMinifyNumbers.`32000`
import typings.gulpMinify.gulpMinifyNumbers.`80`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asciionly extends js.Object {
  
  /**
    * Output ASCII-safe? (encodes Unicode characters as ASCII)
    */
  var ascii_only: js.UndefOr[Boolean] = js.native
  
  /**
    * Beautify output?
    */
  var beautify: js.UndefOr[Boolean] = js.native
  
  /**
    * Use brackets every time?
    */
  var bracketize: js.UndefOr[Boolean] = js.native
  
  /**
    * Output comments?
    */
  var comments: js.UndefOr[Boolean] = js.native
  
  /**
    * Beautify output?
    */
  var ie_proof: js.UndefOr[Boolean] = js.native
  
  /**
    * Indentation level (only when `beautify`)
    */
  var indent_level: js.UndefOr[Double] = js.native
  
  /**
    * Start indentation on every line (only when `beautify`)
    */
  var indent_start: js.UndefOr[Double] = js.native
  
  /**
    * Escape "</script"?
    */
  var inline_script: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum line length (for non-beautified output)
    */
  var max_line_len: js.UndefOr[`32000`] = js.native
  
  /**
    * Quote all keys in object literals?
    */
  var quote_keys: js.UndefOr[`false`] = js.native
  
  /**
    * Use semicolons to separate statements? (otherwise, newlines)
    */
  var semicolons: js.UndefOr[Boolean] = js.native
  
  /**
    * Output a source map
    */
  var source_map: js.UndefOr[Boolean] = js.native
  
  /**
    * Add a space after colon signs?
    */
  var space_colon: js.UndefOr[Boolean] = js.native
  
  /**
    * Informative maximum line width (for beautified output)
    */
  var width: js.UndefOr[`80`] = js.native
}
object Asciionly {
  
  @scala.inline
  def apply(): Asciionly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asciionly]
  }
  
  @scala.inline
  implicit class AsciionlyOps[Self <: Asciionly] (val x: Self) extends AnyVal {
    
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
    def setAscii_only(value: Boolean): Self = this.set("ascii_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscii_only: Self = this.set("ascii_only", js.undefined)
    
    @scala.inline
    def setBeautify(value: Boolean): Self = this.set("beautify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeautify: Self = this.set("beautify", js.undefined)
    
    @scala.inline
    def setBracketize(value: Boolean): Self = this.set("bracketize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBracketize: Self = this.set("bracketize", js.undefined)
    
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setIe_proof(value: Boolean): Self = this.set("ie_proof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIe_proof: Self = this.set("ie_proof", js.undefined)
    
    @scala.inline
    def setIndent_level(value: Double): Self = this.set("indent_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_level: Self = this.set("indent_level", js.undefined)
    
    @scala.inline
    def setIndent_start(value: Double): Self = this.set("indent_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_start: Self = this.set("indent_start", js.undefined)
    
    @scala.inline
    def setInline_script(value: Boolean): Self = this.set("inline_script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline_script: Self = this.set("inline_script", js.undefined)
    
    @scala.inline
    def setMax_line_len(value: `32000`): Self = this.set("max_line_len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_line_len: Self = this.set("max_line_len", js.undefined)
    
    @scala.inline
    def setQuote_keys(value: `false`): Self = this.set("quote_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote_keys: Self = this.set("quote_keys", js.undefined)
    
    @scala.inline
    def setSemicolons(value: Boolean): Self = this.set("semicolons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemicolons: Self = this.set("semicolons", js.undefined)
    
    @scala.inline
    def setSource_map(value: Boolean): Self = this.set("source_map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_map: Self = this.set("source_map", js.undefined)
    
    @scala.inline
    def setSpace_colon(value: Boolean): Self = this.set("space_colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace_colon: Self = this.set("space_colon", js.undefined)
    
    @scala.inline
    def setWidth(value: `80`): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
