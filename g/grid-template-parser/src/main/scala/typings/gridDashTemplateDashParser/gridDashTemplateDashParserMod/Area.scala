package typings.gridDashTemplateDashParser.gridDashTemplateDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Area extends js.Object {
  var column: Track
  var row: Track
}

object Area {
  @scala.inline
  def apply(column: Track, row: Track): Area = {
    val __obj = js.Dynamic.literal(column = column, row = row)
  
    __obj.asInstanceOf[Area]
  }
}

