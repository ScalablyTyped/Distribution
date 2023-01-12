package typings.kendoUi.kendo.spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopFilterOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object TopFilterOptions {
  
  inline def apply(): TopFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopFilterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopFilterOptions] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
