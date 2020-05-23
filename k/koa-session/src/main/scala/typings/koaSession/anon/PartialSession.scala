package typings.koaSession.anon

import typings.koaSession.koaSessionStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<koa-session.koa-session.Session> */
trait PartialSession extends js.Object {
  var inspect: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var maxAge: js.UndefOr[Double | session] = js.undefined
  var populated: js.UndefOr[Boolean] = js.undefined
  var save: js.UndefOr[js.Function0[Unit]] = js.undefined
  var toJSON: js.UndefOr[js.Function0[js.Object]] = js.undefined
}

object PartialSession {
  @scala.inline
  def apply(
    inspect: () => js.Object = null,
    length: js.UndefOr[Double] = js.undefined,
    maxAge: Double | session = null,
    populated: js.UndefOr[Boolean] = js.undefined,
    save: () => Unit = null,
    toJSON: () => js.Object = null
  ): PartialSession = {
    val __obj = js.Dynamic.literal()
    if (inspect != null) __obj.updateDynamic("inspect")(js.Any.fromFunction0(inspect))
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(populated)) __obj.updateDynamic("populated")(populated.get.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction0(save))
    if (toJSON != null) __obj.updateDynamic("toJSON")(js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PartialSession]
  }
}

