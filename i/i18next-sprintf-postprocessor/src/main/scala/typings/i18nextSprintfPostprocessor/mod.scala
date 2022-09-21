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
  
  trait I18nextSprintfPostProcessor
    extends StObject
       with PostProcessorModule {
    
    def overloadTranslationOptionHandler(args: js.Array[String]): PostProcess
    
    def process(value: Any, key: String, options: Any): Any
    
    @JSName("type")
    var type_I18nextSprintfPostProcessor: postProcessor
  }
  object I18nextSprintfPostProcessor {
    
    inline def apply(
      name: String,
      overloadTranslationOptionHandler: js.Array[String] => PostProcess,
      process: (Any, String, Any) => Any
    ): I18nextSprintfPostProcessor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], overloadTranslationOptionHandler = js.Any.fromFunction1(overloadTranslationOptionHandler), process = js.Any.fromFunction3(process))
      __obj.updateDynamic("type")("postProcessor")
      __obj.asInstanceOf[I18nextSprintfPostProcessor]
    }
    
    extension [Self <: I18nextSprintfPostProcessor](x: Self) {
      
      inline def setOverloadTranslationOptionHandler(value: js.Array[String] => PostProcess): Self = StObject.set(x, "overloadTranslationOptionHandler", js.Any.fromFunction1(value))
      
      inline def setProcess(value: (Any, String, Any) => Any): Self = StObject.set(x, "process", js.Any.fromFunction3(value))
      
      inline def setType(value: postProcessor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = I18nextSprintfPostProcessor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: I18nextSprintfPostProcessor = ^
  
  /* augmented module */
  object i18nextAugmentingMod {
    
    type TFunction = js.Function2[/* key */ String, /* repeated */ Any, String]
  }
}
