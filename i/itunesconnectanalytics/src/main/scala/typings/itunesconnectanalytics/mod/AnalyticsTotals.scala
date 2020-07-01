package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsTotals extends js.Object {
  var key: String
  var `type`: String
  var value: Double
}

object AnalyticsTotals {
  @scala.inline
  def apply(key: String, `type`: String, value: Double): AnalyticsTotals = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsTotals]
  }
}

