package typings.i18nextSprintfPostprocessor.mod

import typings.i18next.mod.PostProcessorModule
import typings.i18nextSprintfPostprocessor.anon.PostProcess
import typings.i18nextSprintfPostprocessor.i18nextSprintfPostprocessorStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nextSprintfPostProcessor extends PostProcessorModule {
  @JSName("type")
  var type_I18nextSprintfPostProcessor: postProcessor
  def overloadTranslationOptionHandler(args: js.Array[String]): PostProcess
  def process(value: js.Any, key: String, options: js.Any): js.Any
}

object I18nextSprintfPostProcessor {
  @scala.inline
  def apply(
    name: String,
    overloadTranslationOptionHandler: js.Array[String] => PostProcess,
    process: (js.Any, String, js.Any) => js.Any,
    `type`: postProcessor
  ): I18nextSprintfPostProcessor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], overloadTranslationOptionHandler = js.Any.fromFunction1(overloadTranslationOptionHandler), process = js.Any.fromFunction3(process))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nextSprintfPostProcessor]
  }
}

