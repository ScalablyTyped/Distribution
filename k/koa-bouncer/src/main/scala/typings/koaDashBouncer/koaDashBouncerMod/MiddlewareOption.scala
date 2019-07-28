package typings.koaDashBouncer.koaDashBouncerMod

import typings.koa.koaMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOption extends js.Object {
  var getBody: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.undefined
  var getParams: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.undefined
  var getQuery: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.undefined
}

object MiddlewareOption {
  @scala.inline
  def apply(
    getBody: /* ctx */ Context => _ = null,
    getParams: /* ctx */ Context => _ = null,
    getQuery: /* ctx */ Context => _ = null
  ): MiddlewareOption = {
    val __obj = js.Dynamic.literal()
    if (getBody != null) __obj.updateDynamic("getBody")(js.Any.fromFunction1(getBody))
    if (getParams != null) __obj.updateDynamic("getParams")(js.Any.fromFunction1(getParams))
    if (getQuery != null) __obj.updateDynamic("getQuery")(js.Any.fromFunction1(getQuery))
    __obj.asInstanceOf[MiddlewareOption]
  }
}

