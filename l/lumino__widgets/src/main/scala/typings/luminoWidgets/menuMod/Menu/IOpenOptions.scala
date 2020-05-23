package typings.luminoWidgets.menuMod.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for the `open` method on a menu.
  */
trait IOpenOptions extends js.Object {
  /**
    * Whether to force the X position of the menu.
    *
    * Setting to `true` will disable the logic which repositions the
    * X coordinate of the menu if it will not fit entirely on screen.
    *
    * The default is `false`.
    */
  var forceX: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to force the Y position of the menu.
    *
    * Setting to `true` will disable the logic which repositions the
    * Y coordinate of the menu if it will not fit entirely on screen.
    *
    * The default is `false`.
    */
  var forceY: js.UndefOr[Boolean] = js.undefined
}

object IOpenOptions {
  @scala.inline
  def apply(forceX: js.UndefOr[Boolean] = js.undefined, forceY: js.UndefOr[Boolean] = js.undefined): IOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceX)) __obj.updateDynamic("forceX")(forceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceY)) __obj.updateDynamic("forceY")(forceY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpenOptions]
  }
}

