package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildGridRenderedEventUIParam extends StObject {
  
  /**
    * Gets reference to the child grid.
    */
  var childgrid: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets access the hierarchical grid object.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets access the row element for the row that's about to be populated.
    */
  var parentrow: js.UndefOr[String] = js.undefined
}
object ChildGridRenderedEventUIParam {
  
  inline def apply(): ChildGridRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildGridRenderedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildGridRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setChildgrid(value: Any): Self = StObject.set(x, "childgrid", value.asInstanceOf[js.Any])
    
    inline def setChildgridUndefined: Self = StObject.set(x, "childgrid", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParentrow(value: String): Self = StObject.set(x, "parentrow", value.asInstanceOf[js.Any])
    
    inline def setParentrowUndefined: Self = StObject.set(x, "parentrow", js.undefined)
  }
}
