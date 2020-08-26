package typings.ionicUtilsFs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaddirPOptions extends js.Object {
  /**
    * Filter out items from the walk process from the final result.
    *
    * @return `true` to keep, otherwise the item is filtered out
    */
  val filter: js.UndefOr[js.Function1[/* item */ WalkerItem, Boolean]] = js.native
  /**
    * Called whenever an error occurs during the walk process.
    *
    * If excluded, the function will throw an error when first encountered.
    */
  val onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  val walkerOptions: js.UndefOr[WalkerOptions] = js.native
}

object ReaddirPOptions {
  @scala.inline
  def apply(): ReaddirPOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReaddirPOptions]
  }
  @scala.inline
  implicit class ReaddirPOptionsOps[Self <: ReaddirPOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilter(value: /* item */ WalkerItem => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setOnError(value: /* err */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setWalkerOptions(value: WalkerOptions): Self = this.set("walkerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWalkerOptions: Self = this.set("walkerOptions", js.undefined)
  }
  
}

