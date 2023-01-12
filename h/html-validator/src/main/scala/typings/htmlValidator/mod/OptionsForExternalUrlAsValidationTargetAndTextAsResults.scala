package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.gnu
import typings.htmlValidator.htmlValidatorStrings.html
import typings.htmlValidator.htmlValidatorStrings.text
import typings.htmlValidator.htmlValidatorStrings.xhtml
import typings.htmlValidator.htmlValidatorStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsForExternalUrlAsValidationTargetAndTextAsResults
  extends StObject
     with OptionsForHtmlFileAsValidationTarget {
  
  var format: html | xhtml | xml | gnu | text
}
object OptionsForExternalUrlAsValidationTargetAndTextAsResults {
  
  inline def apply(data: String, format: html | xhtml | xml | gnu | text): OptionsForExternalUrlAsValidationTargetAndTextAsResults = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTargetAndTextAsResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsForExternalUrlAsValidationTargetAndTextAsResults] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: html | xhtml | xml | gnu | text): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
