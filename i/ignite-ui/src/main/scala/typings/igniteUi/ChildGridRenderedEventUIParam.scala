package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildGridRenderedEventUIParam extends js.Object {
  
  /**
    * Gets reference to the child grid.
    */
  var childgrid: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets access the hierarchical grid object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets access the row element for the row that's about to be populated.
    */
  var parentrow: js.UndefOr[String] = js.native
}
object ChildGridRenderedEventUIParam {
  
  @scala.inline
  def apply(): ChildGridRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildGridRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class ChildGridRenderedEventUIParamOps[Self <: ChildGridRenderedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setChildgrid(value: js.Any): Self = this.set("childgrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildgrid: Self = this.set("childgrid", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setParentrow(value: String): Self = this.set("parentrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentrow: Self = this.set("parentrow", js.undefined)
  }
}
