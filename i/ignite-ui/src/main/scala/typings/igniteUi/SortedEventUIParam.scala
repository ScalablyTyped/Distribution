package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortedEventUIParam extends StObject {
  
  /**
    * Gets an array of the tuple indices and sort directions that were actually applied to the table view.
    */
  var appliedSortDirections: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets an array of the tuple indices and sort directions that were passed to the table view.
    */
  var sortDirections: js.UndefOr[js.Array[Any]] = js.undefined
}
object SortedEventUIParam {
  
  inline def apply(): SortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setAppliedSortDirections(value: js.Array[Any]): Self = StObject.set(x, "appliedSortDirections", value.asInstanceOf[js.Any])
    
    inline def setAppliedSortDirectionsUndefined: Self = StObject.set(x, "appliedSortDirections", js.undefined)
    
    inline def setAppliedSortDirectionsVarargs(value: Any*): Self = StObject.set(x, "appliedSortDirections", js.Array(value*))
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSortDirections(value: js.Array[Any]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
    
    inline def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
    
    inline def setSortDirectionsVarargs(value: Any*): Self = StObject.set(x, "sortDirections", js.Array(value*))
  }
}
