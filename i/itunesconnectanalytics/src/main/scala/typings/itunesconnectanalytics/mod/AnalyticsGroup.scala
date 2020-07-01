package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsGroup extends js.Object {
  var key: String
  var title: String
}

object AnalyticsGroup {
  @scala.inline
  def apply(key: String, title: String): AnalyticsGroup = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsGroup]
  }
}

