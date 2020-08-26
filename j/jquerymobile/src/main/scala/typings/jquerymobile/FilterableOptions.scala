package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableOptions extends js.Object {
  var children: js.UndefOr[js.Any] = js.native
  var defaults: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var enhanced: js.UndefOr[Boolean] = js.native
  var filterCallback: js.UndefOr[js.Function2[/* index */ Double, /* searchValue */ js.UndefOr[String], Boolean]] = js.native
  var filterPlaceholder: js.UndefOr[String] = js.native
  var filterReveal: js.UndefOr[Boolean] = js.native
  var filterTheme: js.UndefOr[String] = js.native
  var input: js.Any = js.native
}

object FilterableOptions {
  @scala.inline
  def apply(input: js.Any): FilterableOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterableOptions]
  }
  @scala.inline
  implicit class FilterableOptionsOps[Self <: FilterableOptions] (val x: Self) extends AnyVal {
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
    def setInput(value: js.Any): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDefaults(value: Boolean): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEnhanced(value: Boolean): Self = this.set("enhanced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhanced: Self = this.set("enhanced", js.undefined)
    @scala.inline
    def setFilterCallback(value: (/* index */ Double, /* searchValue */ js.UndefOr[String]) => Boolean): Self = this.set("filterCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterCallback: Self = this.set("filterCallback", js.undefined)
    @scala.inline
    def setFilterPlaceholder(value: String): Self = this.set("filterPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPlaceholder: Self = this.set("filterPlaceholder", js.undefined)
    @scala.inline
    def setFilterReveal(value: Boolean): Self = this.set("filterReveal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterReveal: Self = this.set("filterReveal", js.undefined)
    @scala.inline
    def setFilterTheme(value: String): Self = this.set("filterTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterTheme: Self = this.set("filterTheme", js.undefined)
  }
  
}

