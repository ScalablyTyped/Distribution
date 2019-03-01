package typings
package atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBetweenPosition extends js.Object {
  var pos: scala.Double
  var text: java.lang.String
}

object TextBetweenPosition {
  @scala.inline
  def apply(pos: scala.Double, text: java.lang.String): TextBetweenPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextBetweenPosition]
  }
}

