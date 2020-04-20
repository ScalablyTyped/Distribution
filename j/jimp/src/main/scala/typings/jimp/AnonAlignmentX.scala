package typings.jimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignmentX extends js.Object {
  var alignmentX: Double
  var alignmentY: Double
  var text: String
}

object AnonAlignmentX {
  @scala.inline
  def apply(alignmentX: Double, alignmentY: Double, text: String): AnonAlignmentX = {
    val __obj = js.Dynamic.literal(alignmentX = alignmentX.asInstanceOf[js.Any], alignmentY = alignmentY.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignmentX]
  }
}

