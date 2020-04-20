package typings.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPagingDefaultOptions extends js.Object {
  var pageNumber: Double
  var pageSize: Double
}

object KnockoutPagingDefaultOptions {
  @scala.inline
  def apply(pageNumber: Double, pageSize: Double): KnockoutPagingDefaultOptions = {
    val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagingDefaultOptions]
  }
}

