package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Nonblock extends js.Object {
  /**
    * Create a non-blocking notice. It lets the user click elements underneath it.
    */
  var nonblock: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The opacity of the notice (if it's non-blocking) when the mouse is over it.
    */
  var nonblock_opacity: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Nonblock {
  @scala.inline
  def apply(
    nonblock: js.UndefOr[scala.Boolean] = js.undefined,
    nonblock_opacity: scala.Int | scala.Double = null
  ): Anon_Nonblock = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nonblock)) __obj.updateDynamic("nonblock")(nonblock)
    if (nonblock_opacity != null) __obj.updateDynamic("nonblock_opacity")(nonblock_opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Nonblock]
  }
}

