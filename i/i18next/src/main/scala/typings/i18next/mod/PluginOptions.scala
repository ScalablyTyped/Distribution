package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined i18next.i18next.MergeBy<{  detection :object | undefined,   backend :object | undefined,   cache :object | undefined,   i18nFormat :object | undefined}, i18next.i18next.CustomPluginOptions> */
trait PluginOptions extends StObject {
  
  var backend: js.UndefOr[js.Object] = js.undefined
  
  var cache: js.UndefOr[js.Object] = js.undefined
  
  var detection: js.UndefOr[js.Object] = js.undefined
  
  var i18nFormat: js.UndefOr[js.Object] = js.undefined
}
object PluginOptions {
  
  inline def apply(): PluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginOptions]
  }
  
  extension [Self <: PluginOptions](x: Self) {
    
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
