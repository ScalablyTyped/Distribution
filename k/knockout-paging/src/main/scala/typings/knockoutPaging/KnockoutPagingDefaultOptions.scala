package typings.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPagingDefaultOptions extends js.Object {
  var pageNumber: Double = js.native
  var pageSize: Double = js.native
}

object KnockoutPagingDefaultOptions {
  @scala.inline
  def apply(pageNumber: Double, pageSize: Double): KnockoutPagingDefaultOptions = {
    val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagingDefaultOptions]
  }
  @scala.inline
  implicit class KnockoutPagingDefaultOptionsOps[Self <: KnockoutPagingDefaultOptions] (val x: Self) extends AnyVal {
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
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
  }
  
}

