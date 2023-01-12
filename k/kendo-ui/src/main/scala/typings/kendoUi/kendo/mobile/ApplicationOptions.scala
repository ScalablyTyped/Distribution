package typings.kendoUi.kendo.mobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationOptions extends StObject {
  
  var browserHistory: js.UndefOr[Boolean] = js.undefined
  
  var hashBang: js.UndefOr[Boolean] = js.undefined
  
  var hideAddressBar: js.UndefOr[Boolean] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* e */ ApplicationEvent, Unit]] = js.undefined
  
  var initial: js.UndefOr[String] = js.undefined
  
  var layout: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[String] = js.undefined
  
  var modelScope: js.UndefOr[js.Object] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var pushState: js.UndefOr[Boolean] = js.undefined
  
  var retina: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var serverNavigation: js.UndefOr[Boolean] = js.undefined
  
  var skin: js.UndefOr[String] = js.undefined
  
  var statusBarStyle: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var updateDocumentTitle: js.UndefOr[Boolean] = js.undefined
  
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
  
  var webAppCapable: js.UndefOr[Boolean] = js.undefined
}
object ApplicationOptions {
  
  inline def apply(): ApplicationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationOptions] (val x: Self) extends AnyVal {
    
    inline def setBrowserHistory(value: Boolean): Self = StObject.set(x, "browserHistory", value.asInstanceOf[js.Any])
    
    inline def setBrowserHistoryUndefined: Self = StObject.set(x, "browserHistory", js.undefined)
    
    inline def setHashBang(value: Boolean): Self = StObject.set(x, "hashBang", value.asInstanceOf[js.Any])
    
    inline def setHashBangUndefined: Self = StObject.set(x, "hashBang", js.undefined)
    
    inline def setHideAddressBar(value: Boolean): Self = StObject.set(x, "hideAddressBar", value.asInstanceOf[js.Any])
    
    inline def setHideAddressBarUndefined: Self = StObject.set(x, "hideAddressBar", js.undefined)
    
    inline def setInit(value: /* e */ ApplicationEvent => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setModelScope(value: js.Object): Self = StObject.set(x, "modelScope", value.asInstanceOf[js.Any])
    
    inline def setModelScopeUndefined: Self = StObject.set(x, "modelScope", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPushState(value: Boolean): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
    
    inline def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    
    inline def setRetina(value: Boolean): Self = StObject.set(x, "retina", value.asInstanceOf[js.Any])
    
    inline def setRetinaUndefined: Self = StObject.set(x, "retina", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setServerNavigation(value: Boolean): Self = StObject.set(x, "serverNavigation", value.asInstanceOf[js.Any])
    
    inline def setServerNavigationUndefined: Self = StObject.set(x, "serverNavigation", js.undefined)
    
    inline def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setStatusBarStyle(value: String): Self = StObject.set(x, "statusBarStyle", value.asInstanceOf[js.Any])
    
    inline def setStatusBarStyleUndefined: Self = StObject.set(x, "statusBarStyle", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setUpdateDocumentTitle(value: Boolean): Self = StObject.set(x, "updateDocumentTitle", value.asInstanceOf[js.Any])
    
    inline def setUpdateDocumentTitleUndefined: Self = StObject.set(x, "updateDocumentTitle", js.undefined)
    
    inline def setUseNativeScrolling(value: Boolean): Self = StObject.set(x, "useNativeScrolling", value.asInstanceOf[js.Any])
    
    inline def setUseNativeScrollingUndefined: Self = StObject.set(x, "useNativeScrolling", js.undefined)
    
    inline def setWebAppCapable(value: Boolean): Self = StObject.set(x, "webAppCapable", value.asInstanceOf[js.Any])
    
    inline def setWebAppCapableUndefined: Self = StObject.set(x, "webAppCapable", js.undefined)
  }
}
