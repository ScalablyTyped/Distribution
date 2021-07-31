package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDropDownOpeningEventUIParam extends StObject {
  
  /**
    * A reference to the hierarchy.
    */
  var hierarchy: js.UndefOr[js.Any] = js.undefined
}
object FilterDropDownOpeningEventUIParam {
  
  @scala.inline
  def apply(): FilterDropDownOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropDownOpeningEventUIParam]
  }
  
  @scala.inline
  implicit class FilterDropDownOpeningEventUIParamMutableBuilder[Self <: FilterDropDownOpeningEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHierarchy(value: js.Any): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
  }
}
