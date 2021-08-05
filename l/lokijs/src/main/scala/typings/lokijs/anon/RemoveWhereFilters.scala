package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveWhereFilters extends StObject {
  
  var removeWhereFilters: js.UndefOr[Boolean] = js.undefined
}
object RemoveWhereFilters {
  
  inline def apply(): RemoveWhereFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveWhereFilters]
  }
  
  extension [Self <: RemoveWhereFilters](x: Self) {
    
    inline def setRemoveWhereFilters(value: Boolean): Self = StObject.set(x, "removeWhereFilters", value.asInstanceOf[js.Any])
    
    inline def setRemoveWhereFiltersUndefined: Self = StObject.set(x, "removeWhereFilters", js.undefined)
  }
}
