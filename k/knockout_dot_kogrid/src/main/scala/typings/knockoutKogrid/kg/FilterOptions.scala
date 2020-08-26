package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOptions extends js.Object {
  /** Variable to contain the current search filter */
  var filterText: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
  ] = js.native
  /** Number of seconds to throttle before reapplying search */
  var filterThrottle: js.UndefOr[Double] = js.native
  /** Is the filtering internal or does it require a server visit. You should subscribe to filterText to refresh */
  var useExternalFilter: js.UndefOr[Boolean] = js.native
}

object FilterOptions {
  @scala.inline
  def apply(): FilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOptions]
  }
  @scala.inline
  implicit class FilterOptionsOps[Self <: FilterOptions] (val x: Self) extends AnyVal {
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
    def setFilterText(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = this.set("filterText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterText: Self = this.set("filterText", js.undefined)
    @scala.inline
    def setFilterThrottle(value: Double): Self = this.set("filterThrottle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterThrottle: Self = this.set("filterThrottle", js.undefined)
    @scala.inline
    def setUseExternalFilter(value: Boolean): Self = this.set("useExternalFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExternalFilter: Self = this.set("useExternalFilter", js.undefined)
  }
  
}

