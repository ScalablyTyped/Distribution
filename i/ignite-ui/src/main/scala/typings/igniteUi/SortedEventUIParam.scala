package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortedEventUIParam extends StObject {
  
  /**
    * Gets an array of the tuple indices and sort directions that were actually applied to the table view.
    */
  var appliedSortDirections: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets an array of the tuple indices and sort directions that were passed to the table view.
    */
  var sortDirections: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object SortedEventUIParam {
  
  @scala.inline
  def apply(): SortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortedEventUIParam]
  }
  
  @scala.inline
  implicit class SortedEventUIParamMutableBuilder[Self <: SortedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppliedSortDirections(value: js.Array[js.Any]): Self = StObject.set(x, "appliedSortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedSortDirectionsUndefined: Self = StObject.set(x, "appliedSortDirections", js.undefined)
    
    @scala.inline
    def setAppliedSortDirectionsVarargs(value: js.Any*): Self = StObject.set(x, "appliedSortDirections", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSortDirections(value: js.Array[js.Any]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
    
    @scala.inline
    def setSortDirectionsVarargs(value: js.Any*): Self = StObject.set(x, "sortDirections", js.Array(value :_*))
  }
}
