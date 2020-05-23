package typings.history.createBrowserHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserHistoryBuildOptions extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var forceRefresh: js.UndefOr[Boolean] = js.undefined
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
  ] = js.undefined
  var keyLength: js.UndefOr[Double] = js.undefined
}

object BrowserHistoryBuildOptions {
  @scala.inline
  def apply(
    basename: String = null,
    forceRefresh: js.UndefOr[Boolean] = js.undefined,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Unit = null,
    keyLength: js.UndefOr[Double] = js.undefined
  ): BrowserHistoryBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRefresh)) __obj.updateDynamic("forceRefresh")(forceRefresh.get.asInstanceOf[js.Any])
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (!js.isUndefined(keyLength)) __obj.updateDynamic("keyLength")(keyLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserHistoryBuildOptions]
  }
}

