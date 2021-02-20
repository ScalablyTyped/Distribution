package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStripOptions extends StObject {
  
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
  implicit class TabStripOptionsMutableBuilder[Self <: TabStripOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: /* e */ TabStripActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | TabStripAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setContentLoad(value: /* e */ TabStripContentLoadEvent => Unit): Self = StObject.set(x, "contentLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentLoadUndefined: Self = StObject.set(x, "contentLoad", js.undefined)
    
    @scala.inline
    def setContentUrls(value: js.Any): Self = StObject.set(x, "contentUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlsUndefined: Self = StObject.set(x, "contentUrls", js.undefined)
    
    @scala.inline
    def setDataContentField(value: String): Self = StObject.set(x, "dataContentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataContentFieldUndefined: Self = StObject.set(x, "dataContentField", js.undefined)
    
    @scala.inline
    def setDataContentUrlField(value: String): Self = StObject.set(x, "dataContentUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataContentUrlFieldUndefined: Self = StObject.set(x, "dataContentUrlField", js.undefined)
    
    @scala.inline
    def setDataImageUrlField(value: String): Self = StObject.set(x, "dataImageUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataImageUrlFieldUndefined: Self = StObject.set(x, "dataImageUrlField", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSpriteCssClass(value: String): Self = StObject.set(x, "dataSpriteCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSpriteCssClassUndefined: Self = StObject.set(x, "dataSpriteCssClass", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    @scala.inline
    def setDataUrlField(value: String): Self = StObject.set(x, "dataUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUrlFieldUndefined: Self = StObject.set(x, "dataUrlField", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ TabStripErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean | TabStripScrollable): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ TabStripSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setShow(value: /* e */ TabStripShowEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTabPosition(value: String): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
