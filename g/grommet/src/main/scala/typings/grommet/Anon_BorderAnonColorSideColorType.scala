package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderAnonColorSideColorType extends js.Object {
  var border: js.UndefOr[Anon_ColorSideColorType] = js.undefined
}

object Anon_BorderAnonColorSideColorType {
  @scala.inline
  def apply(border: Anon_ColorSideColorType = null): Anon_BorderAnonColorSideColorType = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[Anon_BorderAnonColorSideColorType]
  }
}

