package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAllowCopy extends StObject {
  
  var delimeter: js.UndefOr[String | js.Any] = js.undefined
}
object GridAllowCopy {
  
  inline def apply(): GridAllowCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAllowCopy]
  }
  
  extension [Self <: GridAllowCopy](x: Self) {
    
    inline def setDelimeter(value: String | js.Any): Self = StObject.set(x, "delimeter", value.asInstanceOf[js.Any])
    
    inline def setDelimeterUndefined: Self = StObject.set(x, "delimeter", js.undefined)
  }
}
