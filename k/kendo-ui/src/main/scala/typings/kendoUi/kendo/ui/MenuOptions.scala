package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuOptions extends js.Object {
  
  var activate: js.UndefOr[js.Function1[/* e */ MenuActivateEvent, Unit]] = js.native
  
  var animation: js.UndefOr[Boolean | MenuAnimation] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ MenuCloseEvent, Unit]] = js.native
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var dataContentField: js.UndefOr[String] = js.native
  
  var dataImageUrlField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.native
  
  var dataSpriteCssClassField: js.UndefOr[String] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var dataUrlField: js.UndefOr[String] = js.native
  
  var deactivate: js.UndefOr[js.Function1[/* e */ MenuDeactivateEvent, Unit]] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var hoverDelay: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ MenuOpenEvent, Unit]] = js.native
  
  var openOnClick: js.UndefOr[Boolean | MenuOpenOnClick] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var popupCollision: js.UndefOr[String] = js.native
  
  var scrollable: js.UndefOr[Boolean | MenuScrollable] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ MenuSelectEvent, Unit]] = js.native
}
object MenuOptions {
  
  @scala.inline
  def apply(): MenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOptions]
  }
  
  @scala.inline
  implicit class MenuOptionsOps[Self <: MenuOptions] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: /* e */ MenuActivateEvent => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | MenuAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ MenuCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    
    @scala.inline
    def setDataContentField(value: String): Self = this.set("dataContentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataContentField: Self = this.set("dataContentField", js.undefined)
    
    @scala.inline
    def setDataImageUrlField(value: String): Self = this.set("dataImageUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataImageUrlField: Self = this.set("dataImageUrlField", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | HierarchicalDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataSpriteCssClassField(value: String): Self = this.set("dataSpriteCssClassField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSpriteCssClassField: Self = this.set("dataSpriteCssClassField", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    
    @scala.inline
    def setDataUrlField(value: String): Self = this.set("dataUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataUrlField: Self = this.set("dataUrlField", js.undefined)
    
    @scala.inline
    def setDeactivate(value: /* e */ MenuDeactivateEvent => Unit): Self = this.set("deactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeactivate: Self = this.set("deactivate", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setHoverDelay(value: Double): Self = this.set("hoverDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverDelay: Self = this.set("hoverDelay", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ MenuOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOpenOnClick(value: Boolean | MenuOpenOnClick): Self = this.set("openOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnClick: Self = this.set("openOnClick", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPopupCollision(value: String): Self = this.set("popupCollision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupCollision: Self = this.set("popupCollision", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean | MenuScrollable): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ MenuSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
}
