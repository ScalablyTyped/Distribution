package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets an array of the tuple indices and sort directions that will be used.
    */
  var sortDirections: js.UndefOr[js.Array[_]] = js.native
}
object SortingEventUIParam {
  
  @scala.inline
  def apply(): SortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortingEventUIParam]
  }
  
  @scala.inline
  implicit class SortingEventUIParamMutableBuilder[Self <: SortingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSortDirections(value: js.Array[_]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
    
    @scala.inline
    def setSortDirectionsVarargs(value: js.Any*): Self = StObject.set(x, "sortDirections", js.Array(value :_*))
  }
}
