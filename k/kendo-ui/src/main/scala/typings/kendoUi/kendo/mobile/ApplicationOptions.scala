package typings.kendoUi.kendo.mobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationOptions extends StObject {
  
  var browserHistory: js.UndefOr[Boolean] = js.native
  
  var hideAddressBar: js.UndefOr[Boolean] = js.native
  
  var init: js.UndefOr[js.Function1[/* e */ ApplicationEvent, Unit]] = js.native
  
  var initial: js.UndefOr[String] = js.native
  
  var layout: js.UndefOr[String] = js.native
  
  var loading: js.UndefOr[String] = js.native
  
  var modelScope: js.UndefOr[js.Object] = js.native
  
  var platform: js.UndefOr[String] = js.native
  
  var retina: js.UndefOr[Boolean] = js.native
  
  var serverNavigation: js.UndefOr[Boolean] = js.native
  
  var skin: js.UndefOr[String] = js.native
  
  var statusBarStyle: js.UndefOr[String] = js.native
  
  var transition: js.UndefOr[String] = js.native
  
  var updateDocumentTitle: js.UndefOr[Boolean] = js.native
  
  var useNativeScrolling: js.UndefOr[Boolean] = js.native
}
object ApplicationOptions {
  
  @scala.inline
  def apply(): ApplicationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationOptions]
  }
  
  @scala.inline
  implicit class ApplicationOptionsMutableBuilder[Self <: ApplicationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserHistory(value: Boolean): Self = StObject.set(x, "browserHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserHistoryUndefined: Self = StObject.set(x, "browserHistory", js.undefined)
    
    @scala.inline
    def setHideAddressBar(value: Boolean): Self = StObject.set(x, "hideAddressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAddressBarUndefined: Self = StObject.set(x, "hideAddressBar", js.undefined)
    
    @scala.inline
    def setInit(value: /* e */ ApplicationEvent => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setModelScope(value: js.Object): Self = StObject.set(x, "modelScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelScopeUndefined: Self = StObject.set(x, "modelScope", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setRetina(value: Boolean): Self = StObject.set(x, "retina", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetinaUndefined: Self = StObject.set(x, "retina", js.undefined)
    
    @scala.inline
    def setServerNavigation(value: Boolean): Self = StObject.set(x, "serverNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNavigationUndefined: Self = StObject.set(x, "serverNavigation", js.undefined)
    
    @scala.inline
    def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setStatusBarStyle(value: String): Self = StObject.set(x, "statusBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarStyleUndefined: Self = StObject.set(x, "statusBarStyle", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setUpdateDocumentTitle(value: Boolean): Self = StObject.set(x, "updateDocumentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDocumentTitleUndefined: Self = StObject.set(x, "updateDocumentTitle", js.undefined)
    
    @scala.inline
    def setUseNativeScrolling(value: Boolean): Self = StObject.set(x, "useNativeScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeScrollingUndefined: Self = StObject.set(x, "useNativeScrolling", js.undefined)
  }
}
