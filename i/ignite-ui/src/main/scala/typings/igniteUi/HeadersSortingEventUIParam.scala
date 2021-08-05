package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersSortingEventUIParam extends StObject {
  
  /**
    * Gets an array of the level names and sort directions that will be used.
    */
  var levelSortDirections: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object HeadersSortingEventUIParam {
  
  inline def apply(): HeadersSortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersSortingEventUIParam]
  }
  
  extension [Self <: HeadersSortingEventUIParam](x: Self) {
    
    inline def setLevelSortDirections(value: js.Array[js.Any]): Self = StObject.set(x, "levelSortDirections", value.asInstanceOf[js.Any])
    
    inline def setLevelSortDirectionsUndefined: Self = StObject.set(x, "levelSortDirections", js.undefined)
    
    inline def setLevelSortDirectionsVarargs(value: js.Any*): Self = StObject.set(x, "levelSortDirections", js.Array(value :_*))
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
