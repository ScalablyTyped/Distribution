package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createGenerateClassNameMod {
  
  @JSImport("@material-ui/core/styles/createGenerateClassName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Any]
  inline def default(options: GenerateClassNameOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait GenerateClassNameOptions extends StObject {
    
    var dangerouslyUseGlobalCSS: js.UndefOr[Boolean] = js.undefined
    
    var productionPrefix: js.UndefOr[String] = js.undefined
    
    var seed: js.UndefOr[String] = js.undefined
  }
  object GenerateClassNameOptions {
    
    inline def apply(): GenerateClassNameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateClassNameOptions]
    }
    
    extension [Self <: GenerateClassNameOptions](x: Self) {
      
      inline def setDangerouslyUseGlobalCSS(value: Boolean): Self = StObject.set(x, "dangerouslyUseGlobalCSS", value.asInstanceOf[js.Any])
      
      inline def setDangerouslyUseGlobalCSSUndefined: Self = StObject.set(x, "dangerouslyUseGlobalCSS", js.undefined)
      
      inline def setProductionPrefix(value: String): Self = StObject.set(x, "productionPrefix", value.asInstanceOf[js.Any])
      
      inline def setProductionPrefixUndefined: Self = StObject.set(x, "productionPrefix", js.undefined)
      
      inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
}
