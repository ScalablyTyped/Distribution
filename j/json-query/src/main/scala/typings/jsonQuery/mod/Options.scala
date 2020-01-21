package typings.jsonQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowRegexp: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[Context] = js.undefined
  var data: js.UndefOr[Context] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var globals: js.UndefOr[Boolean] = js.undefined
  var locals: js.UndefOr[Locals] = js.undefined
  var parent: js.UndefOr[Context] = js.undefined
  var rootContext: js.UndefOr[Context] = js.undefined
  var source: js.UndefOr[Context] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowRegexp: js.UndefOr[Boolean] = js.undefined,
    context: Context = null,
    data: Context = null,
    force: js.UndefOr[Boolean] = js.undefined,
    globals: js.UndefOr[Boolean] = js.undefined,
    locals: Locals = null,
    parent: Context = null,
    rootContext: Context = null,
    source: Context = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRegexp)) __obj.updateDynamic("allowRegexp")(allowRegexp.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(globals)) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (rootContext != null) __obj.updateDynamic("rootContext")(rootContext.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

