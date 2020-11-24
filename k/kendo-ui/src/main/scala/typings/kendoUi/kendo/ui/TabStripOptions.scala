package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStripOptions extends js.Object {
  
  var activate: js.UndefOr[js.Function1[/* e */ TabStripActivateEvent, Unit]] = js.native
  
  var animation: js.UndefOr[Boolean | TabStripAnimation] = js.native
  
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ TabStripContentLoadEvent, Unit]] = js.native
  
  var contentUrls: js.UndefOr[js.Any] = js.native
  
  var dataContentField: js.UndefOr[String] = js.native
  
  var dataContentUrlField: js.UndefOr[String] = js.native
  
  var dataImageUrlField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var dataSpriteCssClass: js.UndefOr[String] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var dataUrlField: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[js.Function1[/* e */ TabStripErrorEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigatable: js.UndefOr[Boolean] = js.native
  
  var scrollable: js.UndefOr[Boolean | TabStripScrollable] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ TabStripSelectEvent, Unit]] = js.native
  
  var show: js.UndefOr[js.Function1[/* e */ TabStripShowEvent, Unit]] = js.native
  
  var tabPosition: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TabStripOptions {
  
  @scala.inline
  def apply(): TabStripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabStripOptions]
  }
  
  @scala.inline
  implicit class TabStripOptionsOps[Self <: TabStripOptions] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: /* e */ TabStripActivateEvent => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | TabStripAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setContentLoad(value: /* e */ TabStripContentLoadEvent => Unit): Self = this.set("contentLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentLoad: Self = this.set("contentLoad", js.undefined)
    
    @scala.inline
    def setContentUrls(value: js.Any): Self = this.set("contentUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrls: Self = this.set("contentUrls", js.undefined)
    
    @scala.inline
    def setDataContentField(value: String): Self = this.set("dataContentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataContentField: Self = this.set("dataContentField", js.undefined)
    
    @scala.inline
    def setDataContentUrlField(value: String): Self = this.set("dataContentUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataContentUrlField: Self = this.set("dataContentUrlField", js.undefined)
    
    @scala.inline
    def setDataImageUrlField(value: String): Self = this.set("dataImageUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataImageUrlField: Self = this.set("dataImageUrlField", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataSpriteCssClass(value: String): Self = this.set("dataSpriteCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSpriteCssClass: Self = this.set("dataSpriteCssClass", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    
    @scala.inline
    def setDataUrlField(value: String): Self = this.set("dataUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataUrlField: Self = this.set("dataUrlField", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ TabStripErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNavigatable(value: Boolean): Self = this.set("navigatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatable: Self = this.set("navigatable", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean | TabStripScrollable): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ TabStripSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setShow(value: /* e */ TabStripShowEvent => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTabPosition(value: String): Self = this.set("tabPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabPosition: Self = this.set("tabPosition", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
