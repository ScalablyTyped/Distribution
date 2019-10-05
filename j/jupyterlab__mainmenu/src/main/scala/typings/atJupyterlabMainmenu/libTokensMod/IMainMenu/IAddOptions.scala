package typings.atJupyterlabMainmenu.libTokensMod.IMainMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to add a menu to the main menu.
  */
trait IAddOptions extends js.Object {
  /**
    * The rank order of the menu among its siblings.
    */
  var rank: js.UndefOr[Double] = js.undefined
}

object IAddOptions {
  @scala.inline
  def apply(rank: Int | Double = null): IAddOptions = {
    val __obj = js.Dynamic.literal()
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddOptions]
  }
}

