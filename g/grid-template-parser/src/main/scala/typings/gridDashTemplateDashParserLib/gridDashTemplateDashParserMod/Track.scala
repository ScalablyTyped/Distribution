package typings
package gridDashTemplateDashParserLib.gridDashTemplateDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Track extends js.Object {
  var end: scala.Double
  var span: scala.Double
  var start: scala.Double
}

object Track {
  @scala.inline
  def apply(end: scala.Double, span: scala.Double, start: scala.Double): Track = {
    val __obj = js.Dynamic.literal(end = end, span = span, start = start)
  
    __obj.asInstanceOf[Track]
  }
}

