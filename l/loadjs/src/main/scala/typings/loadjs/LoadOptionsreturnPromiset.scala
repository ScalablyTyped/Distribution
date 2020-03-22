package typings.loadjs

import typings.loadjs.loadjsBooleans.`true`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined loadjs.loadjs.LoadOptions & {  returnPromise  :true} */
trait LoadOptionsreturnPromiset extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var before: js.UndefOr[js.Function2[/* path */ String, /* scriptEl */ HTMLElement, Unit]] = js.undefined
   // Arguments provided are different in case of returnPromise: true / false
  var error: js.UndefOr[js.Function1[/* depsNotFound */ js.Array[String], Unit]] = js.undefined
  var numRetries: js.UndefOr[Double] = js.undefined
  var returnPromise: `true`
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object LoadOptionsreturnPromiset {
  @scala.inline
  def apply(
    returnPromise: `true`,
    async: js.UndefOr[Boolean] = js.undefined,
    before: (/* path */ String, /* scriptEl */ HTMLElement) => Unit = null,
    error: /* depsNotFound */ js.Array[String] => Unit = null,
    numRetries: Int | Double = null,
    success: () => Unit = null
  ): LoadOptionsreturnPromiset = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (numRetries != null) __obj.updateDynamic("numRetries")(numRetries.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[LoadOptionsreturnPromiset]
  }
}

