package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptMethods extends js.Object {
  var getValue: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var setValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[java.lang.String], this.type]] = js.undefined
}

object PromptMethods {
  @scala.inline
  def apply(
    getValue: () => java.lang.String = null,
    setValue: /* val */ js.UndefOr[java.lang.String] => PromptMethods = null
  ): PromptMethods = {
    val __obj = js.Dynamic.literal()
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[PromptMethods]
  }
}

