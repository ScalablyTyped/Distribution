package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveWhereFilters extends StObject {
  
  var removeWhereFilters: js.UndefOr[Boolean] = js.undefined
}
object RemoveWhereFilters {
  
  @scala.inline
  def apply(): RemoveWhereFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveWhereFilters]
  }
  
  @scala.inline
  implicit class RemoveWhereFiltersMutableBuilder[Self <: RemoveWhereFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveWhereFilters(value: Boolean): Self = StObject.set(x, "removeWhereFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveWhereFiltersUndefined: Self = StObject.set(x, "removeWhereFilters", js.undefined)
  }
}
