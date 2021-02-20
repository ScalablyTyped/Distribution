package typings.i18nextSprintfPostprocessor

import org.scalablytyped.runtime.Shortcut
import typings.i18nextSprintfPostprocessor.mod.I18nextSprintfPostProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonjsMod {
  
  object default extends Shortcut {
    
    @JSImport("i18next-sprintf-postprocessor/dist/commonjs", JSImport.Default)
    @js.native
    val ^ : I18nextSprintfPostProcessor = js.native
    
    type _To = I18nextSprintfPostProcessor
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: I18nextSprintfPostProcessor = ^
    
    /* augmented module */
    object i18nextAugmentingMod {
      
      type TFunction = js.Function2[/* key */ String, /* repeated */ js.Any, String]
    }
  }
}
