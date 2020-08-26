package typings.ibmMobilefirst.WL.JSONStore

import typings.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicFindOptions extends Options {
  var filter: js.UndefOr[js.Array[String]] = js.native
  var sort: js.UndefOr[js.Array[String]] = js.native
}

object BasicFindOptions {
  @scala.inline
  def apply(): BasicFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicFindOptions]
  }
  @scala.inline
  implicit class BasicFindOptionsOps[Self <: BasicFindOptions] (val x: Self) extends AnyVal {
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
    def setFilterVarargs(value: String*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: js.Array[String]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setSortVarargs(value: String*): Self = this.set("sort", js.Array(value :_*))
    @scala.inline
    def setSort(value: js.Array[String]): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

