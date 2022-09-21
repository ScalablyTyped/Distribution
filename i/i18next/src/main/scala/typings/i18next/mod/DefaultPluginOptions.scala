package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPluginOptions extends StObject {
  
  /**
    * Options for backend - check documentation of plugin
    * @default undefined
    */
  var backend: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Options for cache layer - check documentation of plugin
    * @default undefined
    */
  var cache: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Options for language detection - check documentation of plugin
    * @default undefined
    */
  var detection: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Options for i18n message format - check documentation of plugin
    * @default undefined
    */
  var i18nFormat: js.UndefOr[js.Object] = js.undefined
}
object DefaultPluginOptions {
  
  inline def apply(): DefaultPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPluginOptions]
  }
  
  extension [Self <: DefaultPluginOptions](x: Self) {
    
    inline def setBackend(value: js.Object): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    
    inline def setCache(value: js.Object): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setDetection(value: js.Object): Self = StObject.set(x, "detection", value.asInstanceOf[js.Any])
    
    inline def setDetectionUndefined: Self = StObject.set(x, "detection", js.undefined)
    
    inline def setI18nFormat(value: js.Object): Self = StObject.set(x, "i18nFormat", value.asInstanceOf[js.Any])
    
    inline def setI18nFormatUndefined: Self = StObject.set(x, "i18nFormat", js.undefined)
  }
}
