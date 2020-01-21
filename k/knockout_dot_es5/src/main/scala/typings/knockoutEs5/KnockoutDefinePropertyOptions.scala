package typings.knockoutEs5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutDefinePropertyOptions extends js.Object {
  var set: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  def get(): js.Any
}

object KnockoutDefinePropertyOptions {
  @scala.inline
  def apply(get: () => js.Any, set: /* value */ js.Any => Unit = null): KnockoutDefinePropertyOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    __obj.asInstanceOf[KnockoutDefinePropertyOptions]
  }
}

