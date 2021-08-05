package typings.intlMessageformatParser.srcTypesMod

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
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setCaptureLocation(value: Boolean): Self = StObject.set(x, "captureLocation", value.asInstanceOf[js.Any])
    
    inline def setCaptureLocationUndefined: Self = StObject.set(x, "captureLocation", js.undefined)
    
    inline def setIgnoreTag(value: Boolean): Self = StObject.set(x, "ignoreTag", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTagUndefined: Self = StObject.set(x, "ignoreTag", js.undefined)
    
    inline def setNormalizeHashtagInPlural(value: Boolean): Self = StObject.set(x, "normalizeHashtagInPlural", value.asInstanceOf[js.Any])
    
    inline def setNormalizeHashtagInPluralUndefined: Self = StObject.set(x, "normalizeHashtagInPlural", js.undefined)
    
    inline def setShouldParseSkeletons(value: Boolean): Self = StObject.set(x, "shouldParseSkeletons", value.asInstanceOf[js.Any])
    
    inline def setShouldParseSkeletonsUndefined: Self = StObject.set(x, "shouldParseSkeletons", js.undefined)
  }
}
