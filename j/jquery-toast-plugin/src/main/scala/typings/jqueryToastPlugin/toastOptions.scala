package typings.jqueryToastPlugin

import typings.jqueryToastPlugin.jqueryToastPluginBooleans.`false`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-center`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-left`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-right`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`mid-center`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`top-center`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`top-left`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.`top-right`
import typings.jqueryToastPlugin.jqueryToastPluginStrings.center
import typings.jqueryToastPlugin.jqueryToastPluginStrings.error
import typings.jqueryToastPlugin.jqueryToastPluginStrings.fade
import typings.jqueryToastPlugin.jqueryToastPluginStrings.info
import typings.jqueryToastPlugin.jqueryToastPluginStrings.left
import typings.jqueryToastPlugin.jqueryToastPluginStrings.plain
import typings.jqueryToastPlugin.jqueryToastPluginStrings.right
import typings.jqueryToastPlugin.jqueryToastPluginStrings.slide
import typings.jqueryToastPlugin.jqueryToastPluginStrings.success
import typings.jqueryToastPlugin.jqueryToastPluginStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait toastOptions extends StObject {
  
  var afterHidden: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var afterShown: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var allowToastClose: js.UndefOr[Boolean] = js.undefined
  
  var beforeHide: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var beforeShow: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var bgColor: js.UndefOr[String] = js.undefined
  
  var heading: js.UndefOr[String] = js.undefined
  
  var hideAfter: js.UndefOr[Double | `false`] = js.undefined
  
  var icon: js.UndefOr[info | warning | error | success] = js.undefined
  
  var loader: js.UndefOr[Boolean] = js.undefined
  
  var loaderBg: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[
    `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
  ] = js.undefined
  
  var showHideTransition: js.UndefOr[fade | slide | plain] = js.undefined
  
  var stack: js.UndefOr[Double | `false`] = js.undefined
  
  var text: String
  
  var textAlign: js.UndefOr[left | right | center] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object toastOptions {
  
  @scala.inline
  def apply(text: String): toastOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[toastOptions]
  }
  
  @scala.inline
  implicit class toastOptionsMutableBuilder[Self <: toastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterHidden(value: () => js.Any): Self = StObject.set(x, "afterHidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterHiddenUndefined: Self = StObject.set(x, "afterHidden", js.undefined)
    
    @scala.inline
    def setAfterShown(value: () => js.Any): Self = StObject.set(x, "afterShown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterShownUndefined: Self = StObject.set(x, "afterShown", js.undefined)
    
    @scala.inline
    def setAllowToastClose(value: Boolean): Self = StObject.set(x, "allowToastClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowToastCloseUndefined: Self = StObject.set(x, "allowToastClose", js.undefined)
    
    @scala.inline
    def setBeforeHide(value: () => js.Any): Self = StObject.set(x, "beforeHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeHideUndefined: Self = StObject.set(x, "beforeHide", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: () => js.Any): Self = StObject.set(x, "beforeShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    @scala.inline
    def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setHideAfter(value: Double | `false`): Self = StObject.set(x, "hideAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAfterUndefined: Self = StObject.set(x, "hideAfter", js.undefined)
    
    @scala.inline
    def setIcon(value: info | warning | error | success): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLoader(value: Boolean): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderBg(value: String): Self = StObject.set(x, "loaderBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderBgUndefined: Self = StObject.set(x, "loaderBg", js.undefined)
    
    @scala.inline
    def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    @scala.inline
    def setPosition(
      value: `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowHideTransition(value: fade | slide | plain): Self = StObject.set(x, "showHideTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHideTransitionUndefined: Self = StObject.set(x, "showHideTransition", js.undefined)
    
    @scala.inline
    def setStack(value: Double | `false`): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: left | right | center): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
