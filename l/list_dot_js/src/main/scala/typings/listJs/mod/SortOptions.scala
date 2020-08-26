package typings.listJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortOptions extends js.Object {
  var alphabet: js.UndefOr[String] = js.native
  var insensitive: js.UndefOr[Boolean] = js.native
  var order: js.UndefOr[String] = js.native
  var sortFunction: js.UndefOr[js.Function2[/* a */ js.Object, /* b */ js.Object, js.UndefOr[Double]]] = js.native
}

object SortOptions {
  @scala.inline
  def apply(): SortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOptions]
  }
  @scala.inline
  implicit class SortOptionsOps[Self <: SortOptions] (val x: Self) extends AnyVal {
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
    def setAlphabet(value: String): Self = this.set("alphabet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphabet: Self = this.set("alphabet", js.undefined)
    @scala.inline
    def setInsensitive(value: Boolean): Self = this.set("insensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsensitive: Self = this.set("insensitive", js.undefined)
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setSortFunction(value: (/* a */ js.Object, /* b */ js.Object) => js.UndefOr[Double]): Self = this.set("sortFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSortFunction: Self = this.set("sortFunction", js.undefined)
  }
  
}

