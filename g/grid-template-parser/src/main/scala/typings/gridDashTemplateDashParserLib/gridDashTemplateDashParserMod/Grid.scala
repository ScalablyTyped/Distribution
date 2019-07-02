package typings
package gridDashTemplateDashParserLib.gridDashTemplateDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grid extends js.Object {
  var areas: org.scalablytyped.runtime.StringDictionary[Area]
  var height: scala.Double
  var width: scala.Double
}

object Grid {
  @scala.inline
  def apply(areas: org.scalablytyped.runtime.StringDictionary[Area], height: scala.Double, width: scala.Double): Grid = {
    val __obj = js.Dynamic.literal(areas = areas, height = height, width = width)
  
    __obj.asInstanceOf[Grid]
  }
}

