package typings.grommet.componentsCollapsibleMod

import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleProps extends js.Object {
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
}

object CollapsibleProps {
  @scala.inline
  def apply(direction: horizontal | vertical = null, open: js.UndefOr[Boolean] = js.undefined): CollapsibleProps = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleProps]
  }
}

