package typings.jqueryDashTruncateDashHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def truncate(options: TruncateOptions): JQuery
}

object JQuery {
  @scala.inline
  def apply(truncate: TruncateOptions => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(truncate = js.Any.fromFunction1(truncate))
  
    __obj.asInstanceOf[JQuery]
  }
}

