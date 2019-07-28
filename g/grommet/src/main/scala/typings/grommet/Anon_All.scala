package typings.grommet

import typings.grommet.grommetStrings.all
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.dashed
import typings.grommet.grommetStrings.dotted
import typings.grommet.grommetStrings.double
import typings.grommet.grommetStrings.groove
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.inset
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.outset
import typings.grommet.grommetStrings.ridge
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.solid
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.vertical
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var color: js.UndefOr[String | Anon_Dark] = js.undefined
  var side: js.UndefOr[top | left | bottom | right | horizontal | vertical | all] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var style: js.UndefOr[solid | dashed | dotted | double | groove | ridge | inset | outset | hidden] = js.undefined
}

object Anon_All {
  @scala.inline
  def apply(
    color: String | Anon_Dark = null,
    side: top | left | bottom | right | horizontal | vertical | all = null,
    size: xsmall | small | medium | large | xlarge | String = null,
    style: solid | dashed | dotted | double | groove | ridge | inset | outset | hidden = null
  ): Anon_All = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_All]
  }
}

