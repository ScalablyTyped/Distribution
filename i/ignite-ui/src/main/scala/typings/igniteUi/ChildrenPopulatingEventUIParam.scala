package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenPopulatingEventUIParam extends StObject {
  
  /**
    * Gets the data ID of the row.
    */
  var id: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets access the hierarchical grid object.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets access the row element for the row that's about to be populated.
    */
  var parentrow: js.UndefOr[String] = js.undefined
}
object ChildrenPopulatingEventUIParam {
  
  inline def apply(): ChildrenPopulatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenPopulatingEventUIParam]
  }
  
  extension [Self <: ChildrenPopulatingEventUIParam](x: Self) {
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParentrow(value: String): Self = StObject.set(x, "parentrow", value.asInstanceOf[js.Any])
    
    inline def setParentrowUndefined: Self = StObject.set(x, "parentrow", js.undefined)
  }
}
