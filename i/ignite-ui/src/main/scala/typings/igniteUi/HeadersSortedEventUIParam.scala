package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadersSortedEventUIParam extends StObject {
  
  /**
    * Gets an array of the level names and sort directions that were actually applied to the table view.
    */
  var appliedLevelSortDirections: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets an array of the level names and sort directions that were used.
    */
  var levelSortDirections: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object HeadersSortedEventUIParam {
  
  @scala.inline
  def apply(): HeadersSortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersSortedEventUIParam]
  }
  
  @scala.inline
  implicit class HeadersSortedEventUIParamMutableBuilder[Self <: HeadersSortedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppliedLevelSortDirections(value: js.Array[_]): Self = StObject.set(x, "appliedLevelSortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedLevelSortDirectionsUndefined: Self = StObject.set(x, "appliedLevelSortDirections", js.undefined)
    
    @scala.inline
    def setAppliedLevelSortDirectionsVarargs(value: js.Any*): Self = StObject.set(x, "appliedLevelSortDirections", js.Array(value :_*))
    
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
