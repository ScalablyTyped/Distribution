package typings
package atIonicUtilsDashFsLib.atIonicUtilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirPOptions extends js.Object {
  /**
    * Filter out items from the walk process from the final result.
    *
    * @return `true` to keep, otherwise the item is filtered out
    */
  val filter: js.UndefOr[js.Function1[/* item */ WalkerItem, scala.Boolean]] = js.undefined
  /**
    * Called whenever an error occurs during the walk process.
    *
    * If excluded, the function will throw an error when first encountered.
    */
  val onError: js.UndefOr[js.Function1[/* err */ nodeLib.Error, scala.Unit]] = js.undefined
  val walkerOptions: js.UndefOr[WalkerOptions] = js.undefined
}

object ReaddirPOptions {
  @scala.inline
  def apply(
    filter: js.Function1[/* item */ WalkerItem, scala.Boolean] = null,
    onError: js.Function1[/* err */ nodeLib.Error, scala.Unit] = null,
    walkerOptions: WalkerOptions = null
  ): ReaddirPOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (walkerOptions != null) __obj.updateDynamic("walkerOptions")(walkerOptions)
    __obj.asInstanceOf[ReaddirPOptions]
  }
}

