package typings.history.createHashHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashHistoryBuildOptions extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
  ] = js.undefined
  var hashType: js.UndefOr[HashType] = js.undefined
}

object HashHistoryBuildOptions {
  @scala.inline
  def apply(
    basename: String = null,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Unit = null,
    hashType: HashType = null
  ): HashHistoryBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (hashType != null) __obj.updateDynamic("hashType")(hashType)
    __obj.asInstanceOf[HashHistoryBuildOptions]
  }
}

