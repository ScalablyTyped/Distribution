package typings.koaSession.anon

import typings.koaSession.koaSessionStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<koa-session.koa-session.Session> & {  _expire ? :number,   _maxAge ? :number} */
trait PartialSessionexpirenumbe extends js.Object {
  var _expire: js.UndefOr[Double] = js.undefined
  var _maxAge: js.UndefOr[Double] = js.undefined
  var inspect: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var maxAge: js.UndefOr[Double | session] = js.undefined
  var populated: js.UndefOr[Boolean] = js.undefined
  var save: js.UndefOr[js.Function0[Unit]] = js.undefined
  var toJSON: js.UndefOr[js.Function0[js.Object]] = js.undefined
}

object PartialSessionexpirenumbe {
  @scala.inline
  def apply(
    _expire: js.UndefOr[Double] = js.undefined,
    _maxAge: js.UndefOr[Double] = js.undefined,
    inspect: () => js.Object = null,
    length: js.UndefOr[Double] = js.undefined,
    maxAge: Double | session = null,
    populated: js.UndefOr[Boolean] = js.undefined,
    save: () => Unit = null,
    toJSON: () => js.Object = null
  ): PartialSessionexpirenumbe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_expire)) __obj.updateDynamic("_expire")(_expire.get.asInstanceOf[js.Any])
    if (!js.isUndefined(_maxAge)) __obj.updateDynamic("_maxAge")(_maxAge.get.asInstanceOf[js.Any])
    if (inspect != null) __obj.updateDynamic("inspect")(js.Any.fromFunction0(inspect))
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(populated)) __obj.updateDynamic("populated")(populated.get.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction0(save))
    if (toJSON != null) __obj.updateDynamic("toJSON")(js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PartialSessionexpirenumbe]
  }
}

