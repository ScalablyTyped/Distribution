package typings
package historyLib.createHashHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashHistoryBuildOptions extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var getUserConfirmation: js.UndefOr[
    js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* result */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var hashType: js.UndefOr[HashType] = js.undefined
}

object HashHistoryBuildOptions {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    getUserConfirmation: (/* message */ java.lang.String, /* callback */ js.Function1[/* result */ scala.Boolean, scala.Unit]) => scala.Unit = null,
    hashType: HashType = null
  ): HashHistoryBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (hashType != null) __obj.updateDynamic("hashType")(hashType)
    __obj.asInstanceOf[HashHistoryBuildOptions]
  }
}

