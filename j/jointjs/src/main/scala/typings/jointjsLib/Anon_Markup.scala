package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Markup extends js.Object {
  var markup: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[jointjsLib.jointjsMod.diaNs.ElementNs.PositionType] = js.undefined
}

object Anon_Markup {
  @scala.inline
  def apply(
    markup: java.lang.String = null,
    position: jointjsLib.jointjsMod.diaNs.ElementNs.PositionType = null
  ): Anon_Markup = {
    val __obj = js.Dynamic.literal()
    if (markup != null) __obj.updateDynamic("markup")(markup)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Markup]
  }
}

