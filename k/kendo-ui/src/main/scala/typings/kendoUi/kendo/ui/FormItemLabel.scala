package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormItemLabel extends StObject {
  
  var encoded: js.UndefOr[Boolean] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object FormItemLabel {
  
  inline def apply(): FormItemLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemLabel]
  }
  
  extension [Self <: FormItemLabel](x: Self) {
    
    inline def setEncoded(value: Boolean): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    inline def setEncodedUndefined: Self = StObject.set(x, "encoded", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
