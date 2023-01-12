package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets an array of the tuple indices and sort directions that will be used.
    */
  var sortDirections: js.UndefOr[js.Array[Any]] = js.undefined
}
object SortingEventUIParam {
  
  inline def apply(): SortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSortDirections(value: js.Array[Any]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
    
    inline def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
    
    inline def setSortDirectionsVarargs(value: Any*): Self = StObject.set(x, "sortDirections", js.Array(value*))
  }
}
