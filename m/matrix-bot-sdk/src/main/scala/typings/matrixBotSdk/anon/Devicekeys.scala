package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devicekeys extends StObject {
  
  var device_keys: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceKeys */ Any
  ] = js.undefined
  
  var one_time_keys: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenericKeys */ Any
  ] = js.undefined
}
object Devicekeys {
  
  inline def apply(): Devicekeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Devicekeys]
  }
  
  extension [Self <: Devicekeys](x: Self) {
    
    inline def setDevice_keys(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceKeys */ Any
    ): Self = StObject.set(x, "device_keys", value.asInstanceOf[js.Any])
    
    inline def setDevice_keysUndefined: Self = StObject.set(x, "device_keys", js.undefined)
    
    inline def setOne_time_keys(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenericKeys */ Any
    ): Self = StObject.set(x, "one_time_keys", value.asInstanceOf[js.Any])
    
    inline def setOne_time_keysUndefined: Self = StObject.set(x, "one_time_keys", js.undefined)
  }
}
