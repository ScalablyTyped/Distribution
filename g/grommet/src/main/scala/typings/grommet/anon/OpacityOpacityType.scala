package typings.grommet.anon

import typings.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacityOpacityType extends js.Object {
  var opacity: js.UndefOr[OpacityType] = js.undefined
}

object OpacityOpacityType {
  @scala.inline
  def apply(opacity: OpacityType = null): OpacityOpacityType = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityOpacityType]
  }
}

