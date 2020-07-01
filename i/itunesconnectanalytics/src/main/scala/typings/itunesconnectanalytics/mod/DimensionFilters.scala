package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionFilters extends js.Object {
  var dimensionKey: dimensionFilterKey
  var optionKeys: js.Array[String]
}

object DimensionFilters {
  @scala.inline
  def apply(dimensionKey: dimensionFilterKey, optionKeys: js.Array[String]): DimensionFilters = {
    val __obj = js.Dynamic.literal(dimensionKey = dimensionKey.asInstanceOf[js.Any], optionKeys = optionKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionFilters]
  }
}

