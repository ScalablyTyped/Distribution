package typings.i18nextSprintfPostprocessor

import org.scalablytyped.runtime.Shortcut
import typings.i18next.mod.PostProcessorModule
import typings.i18nextSprintfPostprocessor.anon.PostProcess
import typings.i18nextSprintfPostprocessor.i18nextSprintfPostprocessorStrings.postProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("i18next-sprintf-postprocessor", JSImport.Namespace)
  @js.native
  val ^ : I18nextSprintfPostProcessor = js.native
  
  @js.native
  trait I18nextSprintfPostProcessor
    extends StObject
       with PostProcessorModule {
    
    def overloadTranslationOptionHandler(args: js.Array[String]): PostProcess = js.native
    
    def process(value: Any, key: String, options: Any): Any = js.native
    
    @JSName("type")
    var type_I18nextSprintfPostProcessor: postProcessor = js.native
  }
  
  type _To = I18nextSprintfPostProcessor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: I18nextSprintfPostProcessor = ^
  
  /* augmented module */
  object i18nextAugmentingMod {
    
    type TFunction = js.Function2[/* key */ String, /* repeated */ Any, String]
  }
}
