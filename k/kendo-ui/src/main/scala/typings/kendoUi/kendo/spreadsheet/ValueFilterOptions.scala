package typings.kendoUi.kendo.spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueFilterOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object ValueFilterOptions {
  
  inline def apply(): ValueFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueFilterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueFilterOptions] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
