package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbDragStartEventUIParam extends js.Object {
  /**
    * Gets which axis is being used to scroll - horizontal(true) or vertical(false).
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets a reference to the igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ThumbDragStartEventUIParam {
  @scala.inline
  def apply(horizontal: js.UndefOr[Boolean] = js.undefined, owner: js.Any = null): ThumbDragStartEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbDragStartEventUIParam]
  }
}

