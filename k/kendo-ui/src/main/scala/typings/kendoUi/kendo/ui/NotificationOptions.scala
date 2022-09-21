package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationOptions extends StObject {
  
  var allowHideAfter: js.UndefOr[Double] = js.undefined
  
  var animation: js.UndefOr[Any | Boolean] = js.undefined
  
  var appendTo: js.UndefOr[String | JQuery] = js.undefined
  
  var autoHideAfter: js.UndefOr[Double] = js.undefined
  
  var button: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var hide: js.UndefOr[js.Function1[/* e */ NotificationHideEvent, Unit]] = js.undefined
  
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[NotificationPosition] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ NotificationShowEvent, Unit]] = js.undefined
  
  var stacking: js.UndefOr[String] = js.undefined
  
  var templates: js.UndefOr[js.Array[NotificationTemplate]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object NotificationOptions {
  
  inline def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  
  extension [Self <: NotificationOptions](x: Self) {
    
    inline def setAllowHideAfter(value: Double): Self = StObject.set(x, "allowHideAfter", value.asInstanceOf[js.Any])
    
    inline def setAllowHideAfterUndefined: Self = StObject.set(x, "allowHideAfter", js.undefined)
    
    inline def setAnimation(value: Any | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAppendTo(value: String | JQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setAutoHideAfter(value: Double): Self = StObject.set(x, "autoHideAfter", value.asInstanceOf[js.Any])
    
    inline def setAutoHideAfterUndefined: Self = StObject.set(x, "autoHideAfter", js.undefined)
    
    inline def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHide(value: /* e */ NotificationHideEvent => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
    
    inline def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosition(value: NotificationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShow(value: /* e */ NotificationShowEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStacking(value: String): Self = StObject.set(x, "stacking", value.asInstanceOf[js.Any])
    
    inline def setStackingUndefined: Self = StObject.set(x, "stacking", js.undefined)
    
    inline def setTemplates(value: js.Array[NotificationTemplate]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: NotificationTemplate*): Self = StObject.set(x, "templates", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
