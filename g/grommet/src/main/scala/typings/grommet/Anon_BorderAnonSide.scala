package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderAnonSide extends js.Object {
  var border: js.UndefOr[Anon_Side] = js.undefined
}

object Anon_BorderAnonSide {
  @scala.inline
  def apply(border: Anon_Side = null): Anon_BorderAnonSide = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[Anon_BorderAnonSide]
  }
}

