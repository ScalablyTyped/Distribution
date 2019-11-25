package typings.loadjs.loadjsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var before: js.UndefOr[js.Function2[/* path */ String, /* scriptEl */ HTMLElement, Unit]] = js.undefined
   // Arguments provided are different in case of returnPromise: true / false
  var error: js.UndefOr[js.Function1[/* depsNotFound */ js.Array[String], Unit]] = js.undefined
  var numRetries: js.UndefOr[Double] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object LoadOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    before: (/* path */ String, /* scriptEl */ HTMLElement) => Unit = null,
    error: /* depsNotFound */ js.Array[String] => Unit = null,
    numRetries: Int | Double = null,
    success: () => Unit = null
  ): LoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (numRetries != null) __obj.updateDynamic("numRetries")(numRetries.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[LoadOptions]
  }
}

