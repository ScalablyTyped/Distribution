package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenPopulatedEventUIParam extends StObject {
  
  /**
    * Gets the data ID of the row.
    */
  var id: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets access the hierarchical grid object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets access the row element for the row that was populated.
    */
  var parentrow: js.UndefOr[String] = js.undefined
}
object ChildrenPopulatedEventUIParam {
  
  @scala.inline
  def apply(): ChildrenPopulatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenPopulatedEventUIParam]
  }
  
  @scala.inline
  implicit class ChildrenPopulatedEventUIParamMutableBuilder[Self <: ChildrenPopulatedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setParentrow(value: String): Self = StObject.set(x, "parentrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentrowUndefined: Self = StObject.set(x, "parentrow", js.undefined)
  }
}
