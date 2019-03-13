package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Onabort[TContext] extends js.Object {
  var onabort: js.UndefOr[js.Function1[/* response */ greasemonkeyLib.GMNs.Response[TContext], scala.Unit]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* response */ greasemonkeyLib.GMNs.Response[TContext], scala.Unit]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* response */ greasemonkeyLib.GMNs.Response[TContext], scala.Unit]] = js.undefined
  var onprogress: js.UndefOr[
    js.Function1[/* response */ greasemonkeyLib.GMNs.ProgressResponse[TContext], scala.Unit]
  ] = js.undefined
}

object Anon_Onabort {
  @scala.inline
  def apply[TContext](
    onabort: /* response */ greasemonkeyLib.GMNs.Response[TContext] => scala.Unit = null,
    onerror: /* response */ greasemonkeyLib.GMNs.Response[TContext] => scala.Unit = null,
    onload: /* response */ greasemonkeyLib.GMNs.Response[TContext] => scala.Unit = null,
    onprogress: /* response */ greasemonkeyLib.GMNs.ProgressResponse[TContext] => scala.Unit = null
  ): Anon_Onabort[TContext] = {
    val __obj = js.Dynamic.literal()
    if (onabort != null) __obj.updateDynamic("onabort")(js.Any.fromFunction1(onabort))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (onprogress != null) __obj.updateDynamic("onprogress")(js.Any.fromFunction1(onprogress))
    __obj.asInstanceOf[Anon_Onabort[TContext]]
  }
}

