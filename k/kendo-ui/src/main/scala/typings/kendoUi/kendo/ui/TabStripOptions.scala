package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStripOptions extends StObject {
  
  var activate: js.UndefOr[js.Function1[/* e */ TabStripActivateEvent, Unit]] = js.undefined
  
  var animation: js.UndefOr[Boolean | TabStripAnimation] = js.undefined
  
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ TabStripContentLoadEvent, Unit]] = js.undefined
  
  var contentUrls: js.UndefOr[js.Any] = js.undefined
  
  var dataContentField: js.UndefOr[String] = js.undefined
  
  var dataContentUrlField: js.UndefOr[String] = js.undefined
  
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  
  var dataSpriteCssClass: js.UndefOr[String] = js.undefined
  
  var dataTextField: js.UndefOr[String] = js.undefined
  
  var dataUrlField: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* e */ TabStripErrorEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigatable: js.UndefOr[Boolean] = js.undefined
  
  var scrollable: js.UndefOr[Boolean | TabStripScrollable] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ TabStripSelectEvent, Unit]] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ TabStripShowEvent, Unit]] = js.undefined
  
  var tabPosition: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object TabStripOptions {
  
  inline def apply(): TabStripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabStripOptions]
  }
  
  extension [Self <: TabStripOptions](x: Self) {
    
    inline def setActivate(value: /* e */ TabStripActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setAnimation(value: Boolean | TabStripAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setContentLoad(value: /* e */ TabStripContentLoadEvent => Unit): Self = StObject.set(x, "contentLoad", js.Any.fromFunction1(value))
    
    inline def setContentLoadUndefined: Self = StObject.set(x, "contentLoad", js.undefined)
    
    inline def setContentUrls(value: js.Any): Self = StObject.set(x, "contentUrls", value.asInstanceOf[js.Any])
    
    inline def setContentUrlsUndefined: Self = StObject.set(x, "contentUrls", js.undefined)
    
    inline def setDataContentField(value: String): Self = StObject.set(x, "dataContentField", value.asInstanceOf[js.Any])
    
    inline def setDataContentFieldUndefined: Self = StObject.set(x, "dataContentField", js.undefined)
    
    inline def setDataContentUrlField(value: String): Self = StObject.set(x, "dataContentUrlField", value.asInstanceOf[js.Any])
    
    inline def setDataContentUrlFieldUndefined: Self = StObject.set(x, "dataContentUrlField", js.undefined)
    
    inline def setDataImageUrlField(value: String): Self = StObject.set(x, "dataImageUrlField", value.asInstanceOf[js.Any])
    
    inline def setDataImageUrlFieldUndefined: Self = StObject.set(x, "dataImageUrlField", js.undefined)
    
    inline def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSpriteCssClass(value: String): Self = StObject.set(x, "dataSpriteCssClass", value.asInstanceOf[js.Any])
    
    inline def setDataSpriteCssClassUndefined: Self = StObject.set(x, "dataSpriteCssClass", js.undefined)
    
    inline def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    inline def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    inline def setDataUrlField(value: String): Self = StObject.set(x, "dataUrlField", value.asInstanceOf[js.Any])
    
    inline def setDataUrlFieldUndefined: Self = StObject.set(x, "dataUrlField", js.undefined)
    
    inline def setError(value: /* e */ TabStripErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    inline def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    inline def setScrollable(value: Boolean | TabStripScrollable): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    inline def setSelect(value: /* e */ TabStripSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setShow(value: /* e */ TabStripShowEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTabPosition(value: String): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
    
    inline def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
