package typings
package grommetLib.componentsCollapsibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleProps extends js.Object {
  var direction: js.UndefOr[grommetLib.grommetLibStrings.horizontal | grommetLib.grommetLibStrings.vertical] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
}

object CollapsibleProps {
  @scala.inline
  def apply(
    direction: grommetLib.grommetLibStrings.horizontal | grommetLib.grommetLibStrings.vertical = null,
    open: js.UndefOr[scala.Boolean] = js.undefined
  ): CollapsibleProps = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[CollapsibleProps]
  }
}

