package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsForHtmlFileAsValidationTarget
  extends StObject
     with BasicOptions {
  
  var data: String
}
object OptionsForHtmlFileAsValidationTarget {
  
  inline def apply(data: String): OptionsForHtmlFileAsValidationTarget = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForHtmlFileAsValidationTarget]
  }
  
  extension [Self <: OptionsForHtmlFileAsValidationTarget](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
