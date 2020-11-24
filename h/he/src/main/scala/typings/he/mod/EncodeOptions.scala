package typings.he.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodeOptions extends js.Object {
  
  /**
    * The default value for the allowUnsafeSymbols option is false. This means
    * that characters that are unsafe for use in HTML content (&, <, >, ", ',
    * and `) will be encoded. When set to true, only non-ASCII characters will
    * be encoded. If the encodeEverything option is set to true, this option
    * will be ignored.
    */
  var allowUnsafeSymbols: js.UndefOr[Boolean] = js.native
  
  /**
    * The default value for the decimal option is false. If the option is
    * enabled, encode will generally use decimal escapes (e.g. &#169;)
    * rather than hexadecimal escapes (e.g. &#xA9;). Beside of this
    * replacement, the basic behavior remains the same when combined with
    * other options. For example: if both options useNamedReferences and
    * decimal are enabled, named references (e.g. &copy;) are used over
    * decimal escapes. HTML entities without a named reference are encoded
    * using decimal escapes.
    */
  var decimal: js.UndefOr[Boolean] = js.native
  
  /**
    * The default value for the encodeEverything option is false. This means
    * that encode() will not use any character references for printable ASCII
    * symbols that don’t need escaping. Set it to true to encode every symbol
    * in the input string. When set to true, this option takes precedence over
    * allowUnsafeSymbols (i.e. setting the latter to true in such a case has
    * no effect).
    */
  var encodeEverything: js.UndefOr[Boolean] = js.native
  
  /**
    * The default value for the strict option is false. This means that
    * encode() will encode any HTML text content you feed it, even if it
    * contains any symbols that cause parse errors. To throw an error when such
    * invalid HTML is encountered, set the strict option to true. This option
    * makes it possible to use he as part of HTML parsers and HTML validators.
    */
  var strict: js.UndefOr[Boolean] = js.native
  
  /**
    * The default value for the useNamedReferences option is false. This
    * means that encode() will not use any named character references
    * (e.g. &copy;) in the output — hexadecimal escapes (e.g. &#xA9;) will
    * be used instead. Set it to true to enable the use of named references.
    */
  var useNamedReferences: js.UndefOr[Boolean] = js.native
}
object EncodeOptions {
  
  @scala.inline
  def apply(): EncodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodeOptions]
  }
  
  @scala.inline
  implicit class EncodeOptionsOps[Self <: EncodeOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowUnsafeSymbols(value: Boolean): Self = this.set("allowUnsafeSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnsafeSymbols: Self = this.set("allowUnsafeSymbols", js.undefined)
    
    @scala.inline
    def setDecimal(value: Boolean): Self = this.set("decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    
    @scala.inline
    def setEncodeEverything(value: Boolean): Self = this.set("encodeEverything", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodeEverything: Self = this.set("encodeEverything", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setUseNamedReferences(value: Boolean): Self = this.set("useNamedReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNamedReferences: Self = this.set("useNamedReferences", js.undefined)
  }
}
