package typings.i18nextDashSprintfDashPostprocessor.i18nextDashSprintfDashPostprocessorMod.i18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18n extends js.Object {
  def t(key: String, args: js.Any*): String
}

object I18n {
  @scala.inline
  def apply(t: (String, /* repeated */ js.Any) => String): I18n = {
    val __obj = js.Dynamic.literal(t = js.Any.fromFunction2(t))
  
    __obj.asInstanceOf[I18n]
  }
}

