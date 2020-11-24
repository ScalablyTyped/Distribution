package typings.intlMessageformatParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Capture location info in AST
    * Default is false
    */
  var captureLocation: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to treat HTML/XML tags as string literal
    * instead of parsing them as tag token.
    * When this is false we only allow simple tags without
    * any attributes
    */
  var ignoreTag: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to convert `#` in plural rule options
    * to `{var, number}`
    * Default is true
    */
  var normalizeHashtagInPlural: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to parse number/datetime skeleton
    * into Intl.NumberFormatOptions & Intl.DateTimeFormatOptions
    */
  var shouldParseSkeletons: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCaptureLocation(value: Boolean): Self = this.set("captureLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureLocation: Self = this.set("captureLocation", js.undefined)
    
    @scala.inline
    def setIgnoreTag(value: Boolean): Self = this.set("ignoreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreTag: Self = this.set("ignoreTag", js.undefined)
    
    @scala.inline
    def setNormalizeHashtagInPlural(value: Boolean): Self = this.set("normalizeHashtagInPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeHashtagInPlural: Self = this.set("normalizeHashtagInPlural", js.undefined)
    
    @scala.inline
    def setShouldParseSkeletons(value: Boolean): Self = this.set("shouldParseSkeletons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldParseSkeletons: Self = this.set("shouldParseSkeletons", js.undefined)
  }
}
