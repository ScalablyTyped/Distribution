package typings.gridstack.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridStackWidget extends js.Object {
  
  /** if true then x, y parameters will be ignored and widget will be places on the first available position (default?: false) */
  var autoPosition: js.UndefOr[Boolean] = js.native
  
  /** html to append inside as content */
  var content: js.UndefOr[String] = js.native
  
  /** widget dimension height (default?: 1) */
  var height: js.UndefOr[Double] = js.native
  
  /** value for `data-gs-id` stored on the widget (default?: undefined) */
  var id: js.UndefOr[numberOrString] = js.native
  
  /** prevents moving and resizing (default?: undefined = un-constrained) */
  var locked: js.UndefOr[Boolean] = js.native
  
  /** maximum height allowed during resize/creation (default?: undefined = un-constrained) */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /** maximum width allowed during resize/creation (default?: undefined = un-constrained) */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /** minimum height allowed during resize/creation (default?: undefined = un-constrained) */
  var minHeight: js.UndefOr[Double] = js.native
  
  /** minimum width allowed during resize/creation (default?: undefined = un-constrained) */
  var minWidth: js.UndefOr[Double] = js.native
  
  /** prevents moving (default?: undefined = un-constrained) */
  var noMove: js.UndefOr[Boolean] = js.native
  
  /** prevent resizing (default?: undefined = un-constrained) */
  var noResize: js.UndefOr[Boolean] = js.native
  
  /** widgets can have their own resize handles. For example 'e,w' will make the particular widget only resize east and west. */
  var resizeHandles: js.UndefOr[String] = js.native
  
  /** widget dimension width (default?: 1) */
  var width: js.UndefOr[Double] = js.native
  
  /** widget position x (default?: 0) */
  var x: js.UndefOr[Double] = js.native
  
  /** widget position y (default?: 0) */
  var y: js.UndefOr[Double] = js.native
}
object GridStackWidget {
  
  @scala.inline
  def apply(): GridStackWidget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridStackWidget]
  }
  
  @scala.inline
  implicit class GridStackWidgetOps[Self <: GridStackWidget] (val x: Self) extends AnyVal {
    
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
    def setAutoPosition(value: Boolean): Self = this.set("autoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPosition: Self = this.set("autoPosition", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: numberOrString): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setNoMove(value: Boolean): Self = this.set("noMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoMove: Self = this.set("noMove", js.undefined)
    
    @scala.inline
    def setNoResize(value: Boolean): Self = this.set("noResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResize: Self = this.set("noResize", js.undefined)
    
    @scala.inline
    def setResizeHandles(value: String): Self = this.set("resizeHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeHandles: Self = this.set("resizeHandles", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
