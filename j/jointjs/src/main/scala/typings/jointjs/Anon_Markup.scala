package typings.jointjs

import typings.jointjs.jointjsMod.diaNs.ElementNs.PositionType
import typings.jointjs.jointjsMod.diaNs.MarkupJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Markup extends js.Object {
  var markup: js.UndefOr[String | MarkupJSON] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
}

object Anon_Markup {
  @scala.inline
  def apply(markup: String | MarkupJSON = null, position: PositionType = null): Anon_Markup = {
    val __obj = js.Dynamic.literal()
    if (markup != null) __obj.updateDynamic("markup")(markup.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Markup]
  }
}

