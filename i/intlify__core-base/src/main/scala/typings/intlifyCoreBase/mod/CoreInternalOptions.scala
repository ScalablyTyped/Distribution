package typings.intlifyCoreBase.mod

import typings.intlifyVueDevtools.mod.VueDevToolsEmitter
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreInternalOptions extends StObject {
  
  var __datetimeFormatters: js.UndefOr[Map[String, typings.std.Intl.DateTimeFormat]] = js.undefined
  
  var __meta: js.UndefOr[MetaInfo] = js.undefined
  
  var __numberFormatters: js.UndefOr[Map[String, typings.std.Intl.NumberFormat]] = js.undefined
  
  var __v_emitter: js.UndefOr[VueDevToolsEmitter] = js.undefined
}
object CoreInternalOptions {
  
  inline def apply(): CoreInternalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreInternalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreInternalOptions] (val x: Self) extends AnyVal {
    
    inline def set__datetimeFormatters(value: Map[String, typings.std.Intl.DateTimeFormat]): Self = StObject.set(x, "__datetimeFormatters", value.asInstanceOf[js.Any])
    
    inline def set__datetimeFormattersUndefined: Self = StObject.set(x, "__datetimeFormatters", js.undefined)
    
    inline def set__meta(value: MetaInfo): Self = StObject.set(x, "__meta", value.asInstanceOf[js.Any])
    
    inline def set__metaUndefined: Self = StObject.set(x, "__meta", js.undefined)
    
    inline def set__numberFormatters(value: Map[String, typings.std.Intl.NumberFormat]): Self = StObject.set(x, "__numberFormatters", value.asInstanceOf[js.Any])
    
    inline def set__numberFormattersUndefined: Self = StObject.set(x, "__numberFormatters", js.undefined)
    
    inline def set__v_emitter(value: VueDevToolsEmitter): Self = StObject.set(x, "__v_emitter", value.asInstanceOf[js.Any])
    
    inline def set__v_emitterUndefined: Self = StObject.set(x, "__v_emitter", js.undefined)
  }
}
