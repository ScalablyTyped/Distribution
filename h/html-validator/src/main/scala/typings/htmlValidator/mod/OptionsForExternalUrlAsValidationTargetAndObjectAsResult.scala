package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsForExternalUrlAsValidationTargetAndObjectAsResult
  extends StObject
     with OptionsForExternalUrlAsValidationTarget {
  
  var format: js.UndefOr[json] = js.undefined
}
object OptionsForExternalUrlAsValidationTargetAndObjectAsResult {
  
  inline def apply(url: String): OptionsForExternalUrlAsValidationTargetAndObjectAsResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTargetAndObjectAsResult]
  }
  
  extension [Self <: OptionsForExternalUrlAsValidationTargetAndObjectAsResult](x: Self) {
    
    inline def setFormat(value: json): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
