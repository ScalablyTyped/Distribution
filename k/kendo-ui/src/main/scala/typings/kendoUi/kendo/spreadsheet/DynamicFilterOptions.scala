package typings.kendoUi.kendo.spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicFilterOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object DynamicFilterOptions {
  
  inline def apply(): DynamicFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicFilterOptions]
  }
  
  extension [Self <: DynamicFilterOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
