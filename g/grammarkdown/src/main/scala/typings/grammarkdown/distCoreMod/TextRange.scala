package typings.grammarkdown.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRange extends js.Object {
  var end: Double
  var pos: Double
}

object TextRange {
  @scala.inline
  def apply(end: Double, pos: Double): TextRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextRange]
  }
}

