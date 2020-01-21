package typings.gridTemplateParser.mod

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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Track]
  }
}

