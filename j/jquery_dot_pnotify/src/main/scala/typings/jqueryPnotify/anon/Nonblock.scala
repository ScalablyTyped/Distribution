package typings.jqueryPnotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nonblock extends js.Object {
  /**
    * Create a non-blocking notice. It lets the user click elements underneath it.
    */
  var nonblock: js.UndefOr[Boolean] = js.undefined
  /**
    * The opacity of the notice (if it's non-blocking) when the mouse is over it.
    */
  var nonblock_opacity: js.UndefOr[Double] = js.undefined
}

object Nonblock {
  @scala.inline
  def apply(nonblock: js.UndefOr[Boolean] = js.undefined, nonblock_opacity: js.UndefOr[Double] = js.undefined): Nonblock = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nonblock)) __obj.updateDynamic("nonblock")(nonblock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonblock_opacity)) __obj.updateDynamic("nonblock_opacity")(nonblock_opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nonblock]
  }
}

