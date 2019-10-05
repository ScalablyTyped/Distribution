package typings.gridDashTemplateDashParser.gridDashTemplateDashParserMod

import typings.std.Partial
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

@JSImport("grid-template-parser", "area")
@js.native
object area extends js.Object {
  def apply(): Area = js.native
  def apply(rect: Partial[Rect]): Area = js.native
}

