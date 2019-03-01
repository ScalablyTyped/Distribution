package typings
package jqueryDashTruncateDashHtmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def truncate(options: TruncateOptions): JQuery
}

object JQuery {
  @scala.inline
  def apply(truncate: js.Function1[TruncateOptions, JQuery]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("truncate")(truncate)
    __obj.asInstanceOf[JQuery]
  }
}

