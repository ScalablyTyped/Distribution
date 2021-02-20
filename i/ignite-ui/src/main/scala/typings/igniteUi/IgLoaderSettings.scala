package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLoaderSettings extends StObject {
  
  var autoDetectLocale: js.UndefOr[Boolean] = js.native
  
  var cssPath: String = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var localePath: js.UndefOr[String] = js.native
  
  var preinit: js.UndefOr[js.Function] = js.native
  
  var ready: js.UndefOr[js.Function] = js.native
  
  var regional: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[String] = js.native
  
  var scriptPath: String = js.native
  
  var theme: js.UndefOr[String] = js.native
}
object IgLoaderSettings {
  
  @scala.inline
  def apply(cssPath: String, scriptPath: String): IgLoaderSettings = {
    val __obj = js.Dynamic.literal(cssPath = cssPath.asInstanceOf[js.Any], scriptPath = scriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLoaderSettings]
  }
  
  @scala.inline
  implicit class IgLoaderSettingsMutableBuilder[Self <: IgLoaderSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDetectLocale(value: Boolean): Self = StObject.set(x, "autoDetectLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDetectLocaleUndefined: Self = StObject.set(x, "autoDetectLocale", js.undefined)
    
    @scala.inline
    def setCssPath(value: String): Self = StObject.set(x, "cssPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalePath(value: String): Self = StObject.set(x, "localePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalePathUndefined: Self = StObject.set(x, "localePath", js.undefined)
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setPreinit(value: js.Function): Self = StObject.set(x, "preinit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreinitUndefined: Self = StObject.set(x, "preinit", js.undefined)
    
    @scala.inline
    def setReady(value: js.Function): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setRegional(value: String): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setResources(value: String): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
