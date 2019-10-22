package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderAnonColorSide extends js.Object {
  var border: js.UndefOr[Anon_ColorSide] = js.undefined
}

object Anon_BorderAnonColorSide {
  @scala.inline
  def apply(border: Anon_ColorSide = null): Anon_BorderAnonColorSide = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[Anon_BorderAnonColorSide]
  }
}

