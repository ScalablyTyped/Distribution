package typings.linguiMacro

import org.scalablytyped.runtime.Shortcut
import typings.linguiConf.mod.LinguiConfigNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod extends Shortcut {
  
  @JSImport("@lingui/macro/dist", JSImport.Default)
  @js.native
  val default: Any = js.native
  
  trait LinguiMacroOpts extends StObject {
    
    var extract: js.UndefOr[Boolean] = js.undefined
    
    var linguiConfig: js.UndefOr[LinguiConfigNormalized] = js.undefined
  }
  object LinguiMacroOpts {
    
    inline def apply(): LinguiMacroOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinguiMacroOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinguiMacroOpts] (val x: Self) extends AnyVal {
      
      inline def setExtract(value: Boolean): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      inline def setLinguiConfig(value: LinguiConfigNormalized): Self = StObject.set(x, "linguiConfig", value.asInstanceOf[js.Any])
      
      inline def setLinguiConfigUndefined: Self = StObject.set(x, "linguiConfig", js.undefined)
    }
  }
  
  type _To = Any
  
  /* This means you don't have to write `default`, but can instead just say `distMod.foo` */
  override def _to: Any = default
}
