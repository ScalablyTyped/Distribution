package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgLoaderSettings extends StObject {
  
  var autoDetectLocale: js.UndefOr[Boolean] = js.undefined
  
  var cssPath: String
  
  var locale: js.UndefOr[String] = js.undefined
  
  var localePath: js.UndefOr[String] = js.undefined
  
  var preinit: js.UndefOr[js.Function] = js.undefined
  
  var ready: js.UndefOr[js.Function] = js.undefined
  
  var regional: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[String] = js.undefined
  
  var scriptPath: String
  
  var theme: js.UndefOr[String] = js.undefined
}
object IgLoaderSettings {
  
  inline def apply(cssPath: String, scriptPath: String): IgLoaderSettings = {
    val __obj = js.Dynamic.literal(cssPath = cssPath.asInstanceOf[js.Any], scriptPath = scriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLoaderSettings]
  }
  
  extension [Self <: IgLoaderSettings](x: Self) {
    
    inline def setAutoDetectLocale(value: Boolean): Self = StObject.set(x, "autoDetectLocale", value.asInstanceOf[js.Any])
    
    inline def setAutoDetectLocaleUndefined: Self = StObject.set(x, "autoDetectLocale", js.undefined)
    
    inline def setCssPath(value: String): Self = StObject.set(x, "cssPath", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocalePath(value: String): Self = StObject.set(x, "localePath", value.asInstanceOf[js.Any])
    
    inline def setLocalePathUndefined: Self = StObject.set(x, "localePath", js.undefined)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPreinit(value: js.Function): Self = StObject.set(x, "preinit", value.asInstanceOf[js.Any])
    
    inline def setPreinitUndefined: Self = StObject.set(x, "preinit", js.undefined)
    
    inline def setReady(value: js.Function): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setRegional(value: String): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setResources(value: String): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
