package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListSearch extends StObject {
  
  var fields: js.UndefOr[Any] = js.undefined
}
object TreeListSearch {
  
  inline def apply(): TreeListSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListSearch]
  }
  
  extension [Self <: TreeListSearch](x: Self) {
    
    inline def setFields(value: Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
