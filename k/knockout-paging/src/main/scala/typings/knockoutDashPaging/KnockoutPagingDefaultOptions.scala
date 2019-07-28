package typings.knockoutDashPaging

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
    val __obj = js.Dynamic.literal(pageNumber = pageNumber, pageSize = pageSize)
  
    __obj.asInstanceOf[KnockoutPagingDefaultOptions]
  }
}

