package typings
package knockoutDotEs5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutDefinePropertyOptions extends js.Object {
  var set: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  def get(): js.Any
}

object KnockoutDefinePropertyOptions {
  @scala.inline
  def apply(get: js.Function0[js.Any], set: js.Function1[/* value */ js.Any, scala.Unit] = null): KnockoutDefinePropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    if (set != null) __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[KnockoutDefinePropertyOptions]
  }
}

