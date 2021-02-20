package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadersSortingEventUIParam extends StObject {
  
  /**
    * Gets an array of the level names and sort directions that will be used.
    */
  var levelSortDirections: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object HeadersSortingEventUIParam {
  
  @scala.inline
  def apply(): HeadersSortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersSortingEventUIParam]
  }
  
  @scala.inline
  implicit class HeadersSortingEventUIParamMutableBuilder[Self <: HeadersSortingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevelSortDirections(value: js.Array[_]): Self = StObject.set(x, "levelSortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelSortDirectionsUndefined: Self = StObject.set(x, "levelSortDirections", js.undefined)
    
    @scala.inline
    def setLevelSortDirectionsVarargs(value: js.Any*): Self = StObject.set(x, "levelSortDirections", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
