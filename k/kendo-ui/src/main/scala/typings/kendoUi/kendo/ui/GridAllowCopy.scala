package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAllowCopy extends StObject {
  
  var delimeter: js.UndefOr[String | Any] = js.undefined
}
object GridAllowCopy {
  
  inline def apply(): GridAllowCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAllowCopy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridAllowCopy] (val x: Self) extends AnyVal {
    
    inline def setDelimeter(value: String | Any): Self = StObject.set(x, "delimeter", value.asInstanceOf[js.Any])
    
    inline def setDelimeterUndefined: Self = StObject.set(x, "delimeter", js.undefined)
  }
}
