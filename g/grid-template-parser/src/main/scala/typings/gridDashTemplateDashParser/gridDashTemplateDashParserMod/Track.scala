package typings.gridDashTemplateDashParser.gridDashTemplateDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Track extends js.Object {
  var end: Double
  var span: Double
  var start: Double
}

object Track {
  @scala.inline
  def apply(end: Double, span: Double, start: Double): Track = {
    val __obj = js.Dynamic.literal(end = end, span = span, start = start)
  
    __obj.asInstanceOf[Track]
  }
}

