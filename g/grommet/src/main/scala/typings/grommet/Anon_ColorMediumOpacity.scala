package typings.grommet

import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.strong
import typings.grommet.grommetStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorMediumOpacity extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.undefined
}

object Anon_ColorMediumOpacity {
  @scala.inline
  def apply(color: String = null, opacity: weak | medium | strong | Boolean | Double = null): Anon_ColorMediumOpacity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorMediumOpacity]
  }
}

