package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createGenerateClassNameMod {
  
  @JSImport("@material-ui/core/styles/createGenerateClassName", JSImport.Default)
  @js.native
  def default(): js.Any = js.native
  @JSImport("@material-ui/core/styles/createGenerateClassName", JSImport.Default)
  @js.native
  def default(options: GenerateClassNameOptions): js.Any = js.native
  
  @js.native
  trait GenerateClassNameOptions extends StObject {
    
    var dangerouslyUseGlobalCSS: js.UndefOr[Boolean] = js.native
    
    var productionPrefix: js.UndefOr[String] = js.native
    
    var seed: js.UndefOr[String] = js.native
  }
  object GenerateClassNameOptions {
    
    @scala.inline
    def apply(): GenerateClassNameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateClassNameOptions]
    }
    
    @scala.inline
    implicit class GenerateClassNameOptionsMutableBuilder[Self <: GenerateClassNameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDangerouslyUseGlobalCSS(value: Boolean): Self = StObject.set(x, "dangerouslyUseGlobalCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslyUseGlobalCSSUndefined: Self = StObject.set(x, "dangerouslyUseGlobalCSS", js.undefined)
      
      @scala.inline
      def setProductionPrefix(value: String): Self = StObject.set(x, "productionPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionPrefixUndefined: Self = StObject.set(x, "productionPrefix", js.undefined)
      
      @scala.inline
      def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
}
