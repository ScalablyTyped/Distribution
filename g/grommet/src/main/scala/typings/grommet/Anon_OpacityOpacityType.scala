package typings.grommet

import typings.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OpacityOpacityType extends js.Object {
  var opacity: js.UndefOr[OpacityType] = js.undefined
}

object Anon_OpacityOpacityType {
  @scala.inline
  def apply(opacity: OpacityType = null): Anon_OpacityOpacityType = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OpacityOpacityType]
  }
}

