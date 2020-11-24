package typings.igniteUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderCellRenderedEventUIParam extends js.Object {
  
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to header cell DOM element.
    */
  var th: js.UndefOr[Element] = js.native
}
object HeaderCellRenderedEventUIParam {
  
  @scala.inline
  def apply(): HeaderCellRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderCellRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class HeaderCellRenderedEventUIParamOps[Self <: HeaderCellRenderedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setTh(value: Element): Self = this.set("th", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTh: Self = this.set("th", js.undefined)
  }
}
