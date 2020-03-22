package typings.grommet

import typings.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  var opacity: js.UndefOr[OpacityType] = js.undefined
}

object Anon3 {
  @scala.inline
  def apply(opacity: OpacityType = null): Anon3 = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
}

