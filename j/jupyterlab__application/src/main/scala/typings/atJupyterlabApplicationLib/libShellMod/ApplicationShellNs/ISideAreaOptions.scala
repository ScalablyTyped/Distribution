package typings
package atJupyterlabApplicationLib.libShellMod.ApplicationShellNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for adding a widget to a side area of the shell.
  */
trait ISideAreaOptions extends js.Object {
  /**
    * The rank order of the widget among its siblings.
    */
  var rank: js.UndefOr[scala.Double] = js.undefined
}

object ISideAreaOptions {
  @scala.inline
  def apply(rank: scala.Int | scala.Double = null): ISideAreaOptions = {
    val __obj = js.Dynamic.literal()
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISideAreaOptions]
  }
}

