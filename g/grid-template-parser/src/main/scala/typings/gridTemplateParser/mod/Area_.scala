package typings.gridTemplateParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Area_ extends js.Object {
  var column: Track
  var row: Track
}

object Area_ {
  @scala.inline
  def apply(column: Track, row: Track): Area_ = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area_]
  }
}

