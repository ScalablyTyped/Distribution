package typings
package historyLib.createMemoryHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryHistoryBuildOptions extends js.Object {
  var getUserConfirmation: js.UndefOr[
    js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* result */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var initialEntries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var initialIndex: js.UndefOr[scala.Double] = js.undefined
  var keyLength: js.UndefOr[scala.Double] = js.undefined
}

object MemoryHistoryBuildOptions {
  @scala.inline
  def apply(
    getUserConfirmation: js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* result */ scala.Boolean, scala.Unit], 
      scala.Unit
    ] = null,
    initialEntries: js.Array[java.lang.String] = null,
    initialIndex: scala.Int | scala.Double = null,
    keyLength: scala.Int | scala.Double = null
  ): MemoryHistoryBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(getUserConfirmation)
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries)
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryHistoryBuildOptions]
  }
}

