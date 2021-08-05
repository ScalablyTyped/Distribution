package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object ColorOptions {
  
  inline def apply(): ColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorOptions]
  }
  
  extension [Self <: ColorOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
