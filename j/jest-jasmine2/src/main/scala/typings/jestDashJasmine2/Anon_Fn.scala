package typings.jestDashJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fn extends js.Object {
  var fn: js.UndefOr[js.Function] = js.undefined
  var getSpy: js.UndefOr[js.Function0[_]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Anon_Fn {
  @scala.inline
  def apply(fn: js.Function = null, getSpy: () => _ = null, name: String = null): Anon_Fn = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(fn)
    if (getSpy != null) __obj.updateDynamic("getSpy")(js.Any.fromFunction0(getSpy))
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Fn]
  }
}

