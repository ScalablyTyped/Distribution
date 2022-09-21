package typings.gulpJsonValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(option: GulpJsonValidatorOptions): Any = ^.asInstanceOf[js.Dynamic].apply(option.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("gulp-json-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GulpJsonValidatorOptions extends StObject {
    
    var allowDuplicatedKeys: js.UndefOr[Boolean] = js.undefined
  }
  object GulpJsonValidatorOptions {
    
    inline def apply(): GulpJsonValidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GulpJsonValidatorOptions]
    }
    
    extension [Self <: GulpJsonValidatorOptions](x: Self) {
      
      inline def setAllowDuplicatedKeys(value: Boolean): Self = StObject.set(x, "allowDuplicatedKeys", value.asInstanceOf[js.Any])
      
      inline def setAllowDuplicatedKeysUndefined: Self = StObject.set(x, "allowDuplicatedKeys", js.undefined)
    }
  }
}
