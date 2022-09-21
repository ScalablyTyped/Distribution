package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.anon.AspectRatio
import typings.interactjsTypes.scopeMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactjsModifiersPluginMod extends Shortcut {
  
  @JSImport("@interactjs/modifiers/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `interactjsModifiersPluginMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractStaticAugmentingMod {
    
    trait InteractStatic extends StObject {
      
      var modifiers: AspectRatio
    }
    object InteractStatic {
      
      inline def apply(modifiers: AspectRatio): InteractStatic = {
        val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
        __obj.asInstanceOf[InteractStatic]
      }
      
      extension [Self <: InteractStatic](x: Self) {
        
        inline def setModifiers(value: AspectRatio): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      }
    }
  }
}
