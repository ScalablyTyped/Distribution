package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDragCanceledEventUIParam extends js.Object {
  
  /**
    * Gets the column index of the column that was being dragged.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets the column key of the column that was being dragged.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the orginal th being dragged.
    */
  var header: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to cloned DOM element that was actually being dragged.
    */
  var helper: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[String] = js.native
}
object ColumnDragCanceledEventUIParam {
  
  @scala.inline
  def apply(): ColumnDragCanceledEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDragCanceledEventUIParam]
  }
  
  @scala.inline
  implicit class ColumnDragCanceledEventUIParamOps[Self <: ColumnDragCanceledEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHelper(value: String): Self = this.set("helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
