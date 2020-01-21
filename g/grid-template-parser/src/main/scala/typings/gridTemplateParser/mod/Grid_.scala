package typings.gridTemplateParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grid_ extends js.Object {
  var areas: StringDictionary[Area_]
  var height: Double
  var width: Double
}

object Grid_ {
  @scala.inline
  def apply(areas: StringDictionary[Area_], height: Double, width: Double): Grid_ = {
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Grid_]
  }
}

