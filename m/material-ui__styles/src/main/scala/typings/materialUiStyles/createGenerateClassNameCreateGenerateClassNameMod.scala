package typings.materialUiStyles

import typings.jss.mod.GenerateId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createGenerateClassNameCreateGenerateClassNameMod {
  
  @JSImport("@material-ui/styles/createGenerateClassName/createGenerateClassName", JSImport.Default)
  @js.native
  def default(): GenerateId = js.native
  @JSImport("@material-ui/styles/createGenerateClassName/createGenerateClassName", JSImport.Default)
  @js.native
  def default(options: GenerateClassNameOptions): GenerateId = js.native
  
  @js.native
  trait GenerateClassNameOptions extends StObject {
    
    var disableGlobal: js.UndefOr[Boolean] = js.native
    
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
      def setDisableGlobal(value: Boolean): Self = StObject.set(x, "disableGlobal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableGlobalUndefined: Self = StObject.set(x, "disableGlobal", js.undefined)
      
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
