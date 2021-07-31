package typings.intlMessageformatParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Capture location info in AST
    * Default is false
    */
  var captureLocation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to treat HTML/XML tags as string literal
    * instead of parsing them as tag token.
    * When this is false we only allow simple tags without
    * any attributes
    */
  var ignoreTag: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to convert `#` in plural rule options
    * to `{var, number}`
    * Default is true
    */
  var normalizeHashtagInPlural: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to parse number/datetime skeleton
    * into Intl.NumberFormatOptions & Intl.DateTimeFormatOptions
    */
  var shouldParseSkeletons: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureLocation(value: Boolean): Self = StObject.set(x, "captureLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureLocationUndefined: Self = StObject.set(x, "captureLocation", js.undefined)
    
    @scala.inline
    def setIgnoreTag(value: Boolean): Self = StObject.set(x, "ignoreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreTagUndefined: Self = StObject.set(x, "ignoreTag", js.undefined)
    
    @scala.inline
    def setNormalizeHashtagInPlural(value: Boolean): Self = StObject.set(x, "normalizeHashtagInPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeHashtagInPluralUndefined: Self = StObject.set(x, "normalizeHashtagInPlural", js.undefined)
    
    @scala.inline
    def setShouldParseSkeletons(value: Boolean): Self = StObject.set(x, "shouldParseSkeletons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldParseSkeletonsUndefined: Self = StObject.set(x, "shouldParseSkeletons", js.undefined)
  }
}
