package typings
package i18nextDashSprintfDashPostprocessorLib.i18nextDashSprintfDashPostprocessorMod.i18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18n extends js.Object {
  def t(key: java.lang.String, args: js.Any*): java.lang.String
}

object I18n {
  @scala.inline
  def apply(t: js.Function2[java.lang.String, /* repeated */ js.Any, java.lang.String]): I18n = {
    val __obj = js.Dynamic.literal(t = t)
  
    __obj.asInstanceOf[I18n]
  }
}

