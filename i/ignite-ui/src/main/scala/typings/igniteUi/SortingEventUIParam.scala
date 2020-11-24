package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortingEventUIParam extends js.Object {
  
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
  implicit class SortingEventUIParamOps[Self <: SortingEventUIParam] (val x: Self) extends AnyVal {
    
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
