package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerText extends js.Object {
  var container: js.UndefOr[Align] = js.undefined
  var text: js.UndefOr[`3`] = js.undefined
}

object ContainerText {
  @scala.inline
  def apply(container: Align = null, text: `3` = null): ContainerText = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerText]
  }
}

