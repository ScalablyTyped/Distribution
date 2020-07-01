package typings.grommet.anon

import typings.grommet.utilsMod.EdgeSizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vertical extends js.Object {
  var horizontal: js.UndefOr[EdgeSizeType] = js.undefined
  var vertical: js.UndefOr[EdgeSizeType] = js.undefined
}

object Vertical {
  @scala.inline
  def apply(horizontal: EdgeSizeType = null, vertical: EdgeSizeType = null): Vertical = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertical]
  }
}

