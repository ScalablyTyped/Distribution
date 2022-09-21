package typings.jspdf.mod

import typings.jspdf.jspdfStrings.`non-conform`
import typings.jspdf.jspdfStrings.javascript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoPrintInput extends StObject {
  
  var variant: `non-conform` | javascript
}
object AutoPrintInput {
  
  inline def apply(variant: `non-conform` | javascript): AutoPrintInput = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoPrintInput]
  }
  
  extension [Self <: AutoPrintInput](x: Self) {
    
    inline def setVariant(value: `non-conform` | javascript): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
