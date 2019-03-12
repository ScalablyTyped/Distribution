package typings
package i18nextDashSprintfDashPostprocessorLib.i18nextDashSprintfDashPostprocessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nextSprintfPostProcessor extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
  def overloadTranslationOptionHandler(args: js.Array[java.lang.String]): i18nextDashSprintfDashPostprocessorLib.Anon_PostProcess
  def process(value: js.Any, key: java.lang.String, options: js.Any): js.Any
}

object I18nextSprintfPostProcessor {
  @scala.inline
  def apply(
    name: java.lang.String,
    overloadTranslationOptionHandler: js.Array[java.lang.String] => i18nextDashSprintfDashPostprocessorLib.Anon_PostProcess,
    process: (js.Any, java.lang.String, js.Any) => js.Any,
    `type`: java.lang.String
  ): I18nextSprintfPostProcessor = {
    val __obj = js.Dynamic.literal(name = name, overloadTranslationOptionHandler = js.Any.fromFunction1(overloadTranslationOptionHandler), process = js.Any.fromFunction3(process))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[I18nextSprintfPostProcessor]
  }
}

