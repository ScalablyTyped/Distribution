package typings.jpm.anon

import typings.jpm.jpmStrings.end
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.start
import typings.jpm.sdkPanelMod.PanelPosition
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentScriptFile extends StObject {
  
  var allow: js.UndefOr[`0`] = js.undefined
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentScriptOptions: js.UndefOr[Any] = js.undefined
  
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.undefined
  
  var contentStyle: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentStyleFile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentURL: js.UndefOr[String | URL] = js.undefined
  
  var contextMenu: js.UndefOr[Boolean] = js.undefined
  
  var focus: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Any]] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onMessage: js.UndefOr[js.Function1[/* message */ String, Any]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var position: js.UndefOr[PanelPosition] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ContentScriptFile {
  
  inline def apply(): ContentScriptFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentScriptFile]
  }
  
  extension [Self <: ContentScriptFile](x: Self) {
    
    inline def setAllow(value: `0`): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
    
    inline def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
    
    inline def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
    
    inline def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value*))
    
    inline def setContentScriptOptions(value: Any): Self = StObject.set(x, "contentScriptOptions", value.asInstanceOf[js.Any])
    
    inline def setContentScriptOptionsUndefined: Self = StObject.set(x, "contentScriptOptions", js.undefined)
    
    inline def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
    
    inline def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value*))
    
    inline def setContentScriptWhen(value: start | ready | end): Self = StObject.set(x, "contentScriptWhen", value.asInstanceOf[js.Any])
    
    inline def setContentScriptWhenUndefined: Self = StObject.set(x, "contentScriptWhen", js.undefined)
    
    inline def setContentStyle(value: String | js.Array[String]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleFile(value: String | js.Array[String]): Self = StObject.set(x, "contentStyleFile", value.asInstanceOf[js.Any])
    
    inline def setContentStyleFileUndefined: Self = StObject.set(x, "contentStyleFile", js.undefined)
    
    inline def setContentStyleFileVarargs(value: String*): Self = StObject.set(x, "contentStyleFile", js.Array(value*))
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setContentStyleVarargs(value: String*): Self = StObject.set(x, "contentStyle", js.Array(value*))
    
    inline def setContentURL(value: String | URL): Self = StObject.set(x, "contentURL", value.asInstanceOf[js.Any])
    
    inline def setContentURLUndefined: Self = StObject.set(x, "contentURL", js.undefined)
    
    inline def setContextMenu(value: Boolean): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOnError(value: /* error */ js.Error => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnHide(value: () => Any): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnMessage(value: /* message */ String => Any): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
    
    inline def setOnShow(value: () => Any): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setPosition(value: PanelPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
