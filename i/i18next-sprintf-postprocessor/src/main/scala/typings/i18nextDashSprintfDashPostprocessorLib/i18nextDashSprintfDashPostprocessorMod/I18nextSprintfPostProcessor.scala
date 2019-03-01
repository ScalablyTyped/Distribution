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
    overloadTranslationOptionHandler: js.Function1[
      js.Array[java.lang.String], 
      i18nextDashSprintfDashPostprocessorLib.Anon_PostProcess
    ],
    process: js.Function3[js.Any, java.lang.String, js.Any, js.Any],
    `type`: java.lang.String
  ): I18nextSprintfPostProcessor = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("overloadTranslationOptionHandler")(overloadTranslationOptionHandler)
    __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[I18nextSprintfPostProcessor]
  }
}

