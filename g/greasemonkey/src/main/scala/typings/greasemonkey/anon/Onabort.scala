package typings.greasemonkey.anon

import typings.greasemonkey.GM.ProgressResponse
import typings.greasemonkey.GM.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Onabort[TContext] extends js.Object {
  var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], Unit]] = js.undefined
}

object Onabort {
  @scala.inline
  def apply[TContext](
    onabort: /* response */ Response[TContext] => Unit = null,
    onerror: /* response */ Response[TContext] => Unit = null,
    onload: /* response */ Response[TContext] => Unit = null,
    onprogress: /* response */ ProgressResponse[TContext] => Unit = null
  ): Onabort[TContext] = {
    val __obj = js.Dynamic.literal()
    if (onabort != null) __obj.updateDynamic("onabort")(js.Any.fromFunction1(onabort))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (onprogress != null) __obj.updateDynamic("onprogress")(js.Any.fromFunction1(onprogress))
    __obj.asInstanceOf[Onabort[TContext]]
  }
}

