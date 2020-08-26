package typings.i18nextSprintfPostprocessor.mod

import typings.i18next.mod.PostProcessorModule
import typings.i18nextSprintfPostprocessor.anon.PostProcess
import typings.i18nextSprintfPostprocessor.i18nextSprintfPostprocessorStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nextSprintfPostProcessor extends PostProcessorModule {
  @JSName("type")
  var type_I18nextSprintfPostProcessor: postProcessor = js.native
  def overloadTranslationOptionHandler(args: js.Array[String]): PostProcess = js.native
  def process(value: js.Any, key: String, options: js.Any): js.Any = js.native
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
  @scala.inline
  implicit class I18nextSprintfPostProcessorOps[Self <: I18nextSprintfPostProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOverloadTranslationOptionHandler(value: js.Array[String] => PostProcess): Self = this.set("overloadTranslationOptionHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setProcess(value: (js.Any, String, js.Any) => js.Any): Self = this.set("process", js.Any.fromFunction3(value))
    @scala.inline
    def setType(value: postProcessor): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

