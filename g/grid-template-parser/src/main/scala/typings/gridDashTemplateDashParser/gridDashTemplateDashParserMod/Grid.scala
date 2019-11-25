package typings.gridDashTemplateDashParser.gridDashTemplateDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grid extends js.Object {
  var areas: StringDictionary[Area]
  var height: Double
  var width: Double
}

object Grid {
  @scala.inline
  def apply(areas: StringDictionary[Area], height: Double, width: Double): Grid = {
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Grid]
  }
}

@JSImport("grid-template-parser", "grid")
@js.native
object grid extends js.Object {
  def apply(template: String): Grid = js.native
}

