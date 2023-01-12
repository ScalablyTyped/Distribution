package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.HierarchicalDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuOptions extends StObject {
  
  var activate: js.UndefOr[js.Function1[/* e */ MenuActivateEvent, Unit]] = js.undefined
  
  var animation: js.UndefOr[Boolean | MenuAnimation] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ MenuCloseEvent, Unit]] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var dataContentField: js.UndefOr[String] = js.undefined
  
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[Any | HierarchicalDataSource] = js.undefined
  
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  
  var dataTextField: js.UndefOr[String] = js.undefined
  
  var dataUrlField: js.UndefOr[String] = js.undefined
  
  var deactivate: js.UndefOr[js.Function1[/* e */ MenuDeactivateEvent, Unit]] = js.undefined
  
  var direction: js.UndefOr[String] = js.undefined
  
  var hoverDelay: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ MenuOpenEvent, Unit]] = js.undefined
  
  var openOnClick: js.UndefOr[Boolean | MenuOpenOnClick] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var popupCollision: js.UndefOr[String] = js.undefined
  
  var scrollable: js.UndefOr[Boolean | MenuScrollable] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ MenuSelectEvent, Unit]] = js.undefined
}
object MenuOptions {
  
  inline def apply(): MenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuOptions] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: /* e */ MenuActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setAnimation(value: Boolean | MenuAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setClose(value: /* e */ MenuCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDataContentField(value: String): Self = StObject.set(x, "dataContentField", value.asInstanceOf[js.Any])
    
    inline def setDataContentFieldUndefined: Self = StObject.set(x, "dataContentField", js.undefined)
    
    inline def setDataImageUrlField(value: String): Self = StObject.set(x, "dataImageUrlField", value.asInstanceOf[js.Any])
    
    inline def setDataImageUrlFieldUndefined: Self = StObject.set(x, "dataImageUrlField", js.undefined)
    
    inline def setDataSource(value: Any | HierarchicalDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSpriteCssClassField(value: String): Self = StObject.set(x, "dataSpriteCssClassField", value.asInstanceOf[js.Any])
    
    inline def setDataSpriteCssClassFieldUndefined: Self = StObject.set(x, "dataSpriteCssClassField", js.undefined)
    
    inline def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    inline def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    inline def setDataUrlField(value: String): Self = StObject.set(x, "dataUrlField", value.asInstanceOf[js.Any])
    
    inline def setDataUrlFieldUndefined: Self = StObject.set(x, "dataUrlField", js.undefined)
    
    inline def setDeactivate(value: /* e */ MenuDeactivateEvent => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
    
    inline def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
    
    inline def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ MenuOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenOnClick(value: Boolean | MenuOpenOnClick): Self = StObject.set(x, "openOnClick", value.asInstanceOf[js.Any])
    
    inline def setOpenOnClickUndefined: Self = StObject.set(x, "openOnClick", js.undefined)
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPopupCollision(value: String): Self = StObject.set(x, "popupCollision", value.asInstanceOf[js.Any])
    
    inline def setPopupCollisionUndefined: Self = StObject.set(x, "popupCollision", js.undefined)
    
    inline def setScrollable(value: Boolean | MenuScrollable): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    inline def setSelect(value: /* e */ MenuSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
