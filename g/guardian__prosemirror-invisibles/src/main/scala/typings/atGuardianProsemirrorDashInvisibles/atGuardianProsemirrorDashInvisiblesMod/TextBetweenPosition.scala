package typings.atGuardianProsemirrorDashInvisibles.atGuardianProsemirrorDashInvisiblesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBetweenPosition extends js.Object {
  var pos: Double
  var text: String
}

object TextBetweenPosition {
  @scala.inline
  def apply(pos: Double, text: String): TextBetweenPosition = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextBetweenPosition]
  }
}

