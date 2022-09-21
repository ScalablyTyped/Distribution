package typings.intlifyCoreBase.mod

import typings.intlifyVueDevtools.mod.VueDevToolsEmitter
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreInternalContext extends StObject {
  
  var __datetimeFormatters: Map[String, typings.std.Intl.DateTimeFormat]
  
  var __localeChainCache: js.UndefOr[Map[Locale, js.Array[Locale]]] = js.undefined
  
  var __meta: MetaInfo
  
  var __numberFormatters: Map[String, typings.std.Intl.NumberFormat]
  
  var __v_emitter: js.UndefOr[VueDevToolsEmitter] = js.undefined
}
object CoreInternalContext {
  
  inline def apply(
    __datetimeFormatters: Map[String, typings.std.Intl.DateTimeFormat],
    __meta: MetaInfo,
    __numberFormatters: Map[String, typings.std.Intl.NumberFormat]
  ): CoreInternalContext = {
    val __obj = js.Dynamic.literal(__datetimeFormatters = __datetimeFormatters.asInstanceOf[js.Any], __meta = __meta.asInstanceOf[js.Any], __numberFormatters = __numberFormatters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreInternalContext]
  }
  
  extension [Self <: CoreInternalContext](x: Self) {
    
    inline def set__datetimeFormatters(value: Map[String, typings.std.Intl.DateTimeFormat]): Self = StObject.set(x, "__datetimeFormatters", value.asInstanceOf[js.Any])
    
    inline def set__localeChainCache(value: Map[Locale, js.Array[Locale]]): Self = StObject.set(x, "__localeChainCache", value.asInstanceOf[js.Any])
    
    inline def set__localeChainCacheUndefined: Self = StObject.set(x, "__localeChainCache", js.undefined)
    
    inline def set__meta(value: MetaInfo): Self = StObject.set(x, "__meta", value.asInstanceOf[js.Any])
    
    inline def set__numberFormatters(value: Map[String, typings.std.Intl.NumberFormat]): Self = StObject.set(x, "__numberFormatters", value.asInstanceOf[js.Any])
    
    inline def set__v_emitter(value: VueDevToolsEmitter): Self = StObject.set(x, "__v_emitter", value.asInstanceOf[js.Any])
    
    inline def set__v_emitterUndefined: Self = StObject.set(x, "__v_emitter", js.undefined)
  }
}
