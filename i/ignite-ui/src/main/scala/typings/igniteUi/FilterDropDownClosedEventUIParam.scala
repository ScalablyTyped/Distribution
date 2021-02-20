package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDropDownClosedEventUIParam extends StObject {
  
  /**
    * A reference to the hierarchy.
    */
  var hierarchy: js.UndefOr[js.Any] = js.native
}
object FilterDropDownClosedEventUIParam {
  
  @scala.inline
  def apply(): FilterDropDownClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropDownClosedEventUIParam]
  }
  
  @scala.inline
  implicit class FilterDropDownClosedEventUIParamMutableBuilder[Self <: FilterDropDownClosedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHierarchy(value: js.Any): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
  }
}
