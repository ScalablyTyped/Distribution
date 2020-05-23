package typings.jestJasmine2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fn extends js.Object {
  var fn: js.UndefOr[js.Function] = js.undefined
  var getSpy: js.UndefOr[js.Function0[_]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Fn {
  @scala.inline
  def apply(fn: js.Function = null, getSpy: () => _ = null, name: String = null): Fn = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(fn.asInstanceOf[js.Any])
    if (getSpy != null) __obj.updateDynamic("getSpy")(js.Any.fromFunction0(getSpy))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fn]
  }
}

