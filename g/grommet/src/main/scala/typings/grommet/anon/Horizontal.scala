package typings.grommet.anon

import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.scroll
import typings.grommet.grommetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Horizontal extends js.Object {
  var horizontal: js.UndefOr[auto | hidden | scroll | visible] = js.undefined
  var vertical: js.UndefOr[auto | hidden | scroll | visible] = js.undefined
}

object Horizontal {
  @scala.inline
  def apply(
    horizontal: auto | hidden | scroll | visible = null,
    vertical: auto | hidden | scroll | visible = null
  ): Horizontal = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horizontal]
  }
}

