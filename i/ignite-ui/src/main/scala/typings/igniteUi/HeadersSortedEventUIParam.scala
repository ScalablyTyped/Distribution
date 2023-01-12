package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersSortedEventUIParam extends StObject {
  
  /**
    * Gets an array of the level names and sort directions that were actually applied to the table view.
    */
  var appliedLevelSortDirections: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets an array of the level names and sort directions that were used.
    */
  var levelSortDirections: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object HeadersSortedEventUIParam {
  
  inline def apply(): HeadersSortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersSortedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadersSortedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setAppliedLevelSortDirections(value: js.Array[Any]): Self = StObject.set(x, "appliedLevelSortDirections", value.asInstanceOf[js.Any])
    
    inline def setAppliedLevelSortDirectionsUndefined: Self = StObject.set(x, "appliedLevelSortDirections", js.undefined)
    
    inline def setAppliedLevelSortDirectionsVarargs(value: Any*): Self = StObject.set(x, "appliedLevelSortDirections", js.Array(value*))
    
    inline def setLevelSortDirections(value: js.Array[Any]): Self = StObject.set(x, "levelSortDirections", value.asInstanceOf[js.Any])
    
    inline def setLevelSortDirectionsUndefined: Self = StObject.set(x, "levelSortDirections", js.undefined)
    
    inline def setLevelSortDirectionsVarargs(value: Any*): Self = StObject.set(x, "levelSortDirections", js.Array(value*))
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
