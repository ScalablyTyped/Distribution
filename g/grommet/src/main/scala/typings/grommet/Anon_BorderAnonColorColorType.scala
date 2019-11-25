package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderAnonColorColorType extends js.Object {
  var border: js.UndefOr[Anon_ColorColorType] = js.undefined
}

object Anon_BorderAnonColorColorType {
  @scala.inline
  def apply(border: Anon_ColorColorType = null): Anon_BorderAnonColorColorType = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderAnonColorColorType]
  }
}

