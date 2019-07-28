package typings.i18nextDashSprintfDashPostprocessor.i18nextDashSprintfDashPostprocessorMod

import typings.i18nextDashSprintfDashPostprocessor.Anon_PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nextSprintfPostProcessor extends js.Object {
  var name: String
  var `type`: String
  def overloadTranslationOptionHandler(args: js.Array[String]): Anon_PostProcess
  def process(value: js.Any, key: String, options: js.Any): js.Any
}

object I18nextSprintfPostProcessor {
  @scala.inline
  def apply(
    name: String,
    overloadTranslationOptionHandler: js.Array[String] => Anon_PostProcess,
    process: (js.Any, String, js.Any) => js.Any,
    `type`: String
  ): I18nextSprintfPostProcessor = {
    val __obj = js.Dynamic.literal(name = name, overloadTranslationOptionHandler = js.Any.fromFunction1(overloadTranslationOptionHandler), process = js.Any.fromFunction3(process))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[I18nextSprintfPostProcessor]
  }
}

