package typings.jpm.anon

import typings.jpm.jpmStrings.end
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.start
import typings.jpm.panelMod.PanelPosition
import typings.std.Error
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentScriptFile extends StObject {
  
  var allow: js.UndefOr[`0`] = js.undefined
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentScriptOptions: js.UndefOr[js.Any] = js.undefined
  
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.undefined
  
  var contentStyle: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentStyleFile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentURL: js.UndefOr[String | URL] = js.undefined
  
  var contextMenu: js.UndefOr[Boolean] = js.undefined
  
  var focus: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ Error, js.Any]] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var onMessage: js.UndefOr[js.Function1[/* message */ String, js.Any]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var position: js.UndefOr[PanelPosition] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ContentScriptFile {
  
  @scala.inline
  def apply(): ContentScriptFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentScriptFile]
  }
  
  @scala.inline
  implicit class ContentScriptFileMutableBuilder[Self <: ContentScriptFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: `0`): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    @scala.inline
    def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
    
    @scala.inline
    def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value :_*))
    
    @scala.inline
    def setContentScriptOptions(value: js.Any): Self = StObject.set(x, "contentScriptOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptOptionsUndefined: Self = StObject.set(x, "contentScriptOptions", js.undefined)
    
    @scala.inline
    def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
    
    @scala.inline
    def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value :_*))
    
    @scala.inline
    def setContentScriptWhen(value: start | ready | end): Self = StObject.set(x, "contentScriptWhen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptWhenUndefined: Self = StObject.set(x, "contentScriptWhen", js.undefined)
    
    @scala.inline
    def setContentStyle(value: String | js.Array[String]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleFile(value: String | js.Array[String]): Self = StObject.set(x, "contentStyleFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleFileUndefined: Self = StObject.set(x, "contentStyleFile", js.undefined)
    
    @scala.inline
    def setContentStyleFileVarargs(value: String*): Self = StObject.set(x, "contentStyleFile", js.Array(value :_*))
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setContentStyleVarargs(value: String*): Self = StObject.set(x, "contentStyle", js.Array(value :_*))
    
    @scala.inline
    def setContentURL(value: String | URL): Self = StObject.set(x, "contentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentURLUndefined: Self = StObject.set(x, "contentURL", js.undefined)
    
    @scala.inline
    def setContextMenu(value: Boolean): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ Error => js.Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => js.Any): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnMessage(value: /* message */ String => js.Any): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => js.Any): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setPosition(value: PanelPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
