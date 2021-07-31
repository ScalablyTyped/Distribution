package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsForHtmlFileAsValidationTargetAndObjectAsResult
  extends StObject
     with OptionsForHtmlFileAsValidationTarget {
  
  var format: js.UndefOr[json] = js.undefined
}
object OptionsForHtmlFileAsValidationTargetAndObjectAsResult {
  
  @scala.inline
  def apply(data: String): OptionsForHtmlFileAsValidationTargetAndObjectAsResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForHtmlFileAsValidationTargetAndObjectAsResult]
  }
  
  @scala.inline
  implicit class OptionsForHtmlFileAsValidationTargetAndObjectAsResultMutableBuilder[Self <: OptionsForHtmlFileAsValidationTargetAndObjectAsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: json): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
