package typings.i18nextSprintfPostprocessor

import typings.i18nextSprintfPostprocessor.i18nextSprintfPostprocessorStrings.sprintf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostProcess extends js.Object {
  var postProcess: sprintf
  var sprintf: js.Array[String]
}

object AnonPostProcess {
  @scala.inline
  def apply(postProcess: sprintf, sprintf: js.Array[String]): AnonPostProcess = {
    val __obj = js.Dynamic.literal(postProcess = postProcess.asInstanceOf[js.Any], sprintf = sprintf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPostProcess]
  }
}

