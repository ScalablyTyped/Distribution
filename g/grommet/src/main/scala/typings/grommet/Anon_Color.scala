package typings.grommet

import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.strong
import typings.grommet.grommetStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[weak | medium | strong | Boolean] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: String = null, opacity: weak | medium | strong | Boolean = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

