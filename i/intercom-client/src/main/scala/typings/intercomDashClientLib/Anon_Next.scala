package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: js.UndefOr[java.lang.String] = js.undefined
  var page: scala.Double
  var per_page: scala.Double
  var total_pages: scala.Double
}

object Anon_Next {
  @scala.inline
  def apply(
    page: scala.Double,
    per_page: scala.Double,
    total_pages: scala.Double,
    next: java.lang.String = null
  ): Anon_Next = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("per_page")(per_page)
    __obj.updateDynamic("total_pages")(total_pages)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_Next]
  }
}

