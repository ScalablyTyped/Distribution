package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersSortedEventUIParam extends StObject {
  
  /**
    * Gets an array of the level names and sort directions that were actually applied to the table view.
    */
  var appliedLevelSortDirections: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets an array of the level names and sort directions that were used.
    */
  var levelSortDirections: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object HeadersSortedEventUIParam {
  
  inline def apply(): HeadersSortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersSortedEventUIParam]
  }
  
  extension [Self <: HeadersSortedEventUIParam](x: Self) {
    
    inline def setAppliedLevelSortDirections(value: js.Array[js.Any]): Self = StObject.set(x, "appliedLevelSortDirections", value.asInstanceOf[js.Any])
    
    inline def setAppliedLevelSortDirectionsUndefined: Self = StObject.set(x, "appliedLevelSortDirections", js.undefined)
    
    inline def setAppliedLevelSortDirectionsVarargs(value: js.Any*): Self = StObject.set(x, "appliedLevelSortDirections", js.Array(value :_*))
    
    inline def setLevelSortDirections(value: js.Array[js.Any]): Self = StObject.set(x, "levelSortDirections", value.asInstanceOf[js.Any])
    
    inline def setLevelSortDirectionsUndefined: Self = StObject.set(x, "levelSortDirections", js.undefined)
    
    inline def setLevelSortDirectionsVarargs(value: js.Any*): Self = StObject.set(x, "levelSortDirections", js.Array(value :_*))
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
