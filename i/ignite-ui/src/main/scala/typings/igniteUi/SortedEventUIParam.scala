package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortedEventUIParam extends js.Object {
  
  /**
    * Gets an array of the tuple indices and sort directions that were actually applied to the table view.
    */
  var appliedSortDirections: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets an array of the tuple indices and sort directions that were passed to the table view.
    */
  var sortDirections: js.UndefOr[js.Array[_]] = js.native
}
object SortedEventUIParam {
  
  @scala.inline
  def apply(): SortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortedEventUIParam]
  }
  
  @scala.inline
  implicit class SortedEventUIParamOps[Self <: SortedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppliedSortDirectionsVarargs(value: js.Any*): Self = this.set("appliedSortDirections", js.Array(value :_*))
    
    @scala.inline
    def setAppliedSortDirections(value: js.Array[_]): Self = this.set("appliedSortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedSortDirections: Self = this.set("appliedSortDirections", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setSortDirectionsVarargs(value: js.Any*): Self = this.set("sortDirections", js.Array(value :_*))
    
    @scala.inline
    def setSortDirections(value: js.Array[_]): Self = this.set("sortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDirections: Self = this.set("sortDirections", js.undefined)
  }
}
