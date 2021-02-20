package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsForExternalUrlAsValidationTargetAndObjectAsResult extends OptionsForExternalUrlAsValidationTarget {
  
  var format: js.UndefOr[json] = js.native
}
object OptionsForExternalUrlAsValidationTargetAndObjectAsResult {
  
  @scala.inline
  def apply(url: String): OptionsForExternalUrlAsValidationTargetAndObjectAsResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTargetAndObjectAsResult]
  }
  
  @scala.inline
  implicit class OptionsForExternalUrlAsValidationTargetAndObjectAsResultMutableBuilder[Self <: OptionsForExternalUrlAsValidationTargetAndObjectAsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: json): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
