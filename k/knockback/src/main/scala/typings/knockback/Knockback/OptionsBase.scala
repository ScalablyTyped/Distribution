package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsBase extends StObject {
  
  // a store used to cache and share view models.
  var factory: js.UndefOr[Factory] = js.undefined
  
  // a factory used to create view models.
  var options: js.UndefOr[js.Any] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  // the path to the value (used to create related observables from the factory).
  var store: js.UndefOr[Store] = js.undefined
}
object OptionsBase {
  
  inline def apply(): OptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBase]
  }
  
  extension [Self <: OptionsBase](x: Self) {
    
    inline def setFactory(value: Factory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
