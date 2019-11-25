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
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Next]
  }
}

