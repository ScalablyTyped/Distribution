package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDropDownClosingEventUIParam extends StObject {
  
  /**
    * A reference to the drop down.
    */
  var dropDownElement: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to the hierarchy.
    */
  var hierarchy: js.UndefOr[js.Any] = js.undefined
}
object FilterDropDownClosingEventUIParam {
  
  @scala.inline
  def apply(): FilterDropDownClosingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropDownClosingEventUIParam]
  }
  
  @scala.inline
  implicit class FilterDropDownClosingEventUIParamMutableBuilder[Self <: FilterDropDownClosingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropDownElement(value: String): Self = StObject.set(x, "dropDownElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownElementUndefined: Self = StObject.set(x, "dropDownElement", js.undefined)
    
    @scala.inline
    def setHierarchy(value: js.Any): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
  }
}
