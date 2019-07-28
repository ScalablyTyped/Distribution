package typings.intercomDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: js.UndefOr[String] = js.undefined
  var page: Double
  var per_page: Double
  var total_pages: Double
}

object Anon_Next {
  @scala.inline
  def apply(page: Double, per_page: Double, total_pages: Double, next: String = null): Anon_Next = {
    val __obj = js.Dynamic.literal(page = page, per_page = per_page, total_pages = total_pages)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_Next]
  }
}

