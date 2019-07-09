package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Markup extends js.Object {
  var markup: js.UndefOr[java.lang.String | jointjsLib.jointjsMod.diaNs.MarkupJSON] = js.undefined
  var position: js.UndefOr[jointjsLib.jointjsMod.diaNs.ElementNs.PositionType] = js.undefined
}

object Anon_Markup {
  @scala.inline
  def apply(
    markup: java.lang.String | jointjsLib.jointjsMod.diaNs.MarkupJSON = null,
    position: jointjsLib.jointjsMod.diaNs.ElementNs.PositionType = null
  ): Anon_Markup = {
    val __obj = js.Dynamic.literal()
    if (markup != null) __obj.updateDynamic("markup")(markup.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Markup]
  }
}

