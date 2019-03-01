package typings
package jsonDashQueryLib.jsonDashQueryMod.JsonQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowRegexp: js.UndefOr[scala.Boolean] = js.undefined
  var context: js.UndefOr[Context] = js.undefined
  var data: js.UndefOr[Context] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var globals: js.UndefOr[scala.Boolean] = js.undefined
  var locals: js.UndefOr[Locals] = js.undefined
  var parent: js.UndefOr[Context] = js.undefined
  var rootContext: js.UndefOr[Context] = js.undefined
  var source: js.UndefOr[Context] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowRegexp: js.UndefOr[scala.Boolean] = js.undefined,
    context: Context = null,
    data: Context = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    globals: js.UndefOr[scala.Boolean] = js.undefined,
    locals: Locals = null,
    parent: Context = null,
    rootContext: Context = null,
    source: Context = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRegexp)) __obj.updateDynamic("allowRegexp")(allowRegexp)
    if (context != null) __obj.updateDynamic("context")(context)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(globals)) __obj.updateDynamic("globals")(globals)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (rootContext != null) __obj.updateDynamic("rootContext")(rootContext)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Options]
  }
}

