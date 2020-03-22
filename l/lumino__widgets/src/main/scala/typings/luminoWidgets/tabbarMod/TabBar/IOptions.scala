package typings.luminoWidgets.tabbarMod.TabBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a tab bar.
  */
trait IOptions[T] extends js.Object {
  /**
    * Whether a tab can be deselected by the user.
    *
    * The default is `false`.
    */
  var allowDeselect: js.UndefOr[Boolean] = js.undefined
  /**
    * The selection behavior when inserting a tab.
    *
    * The default is `'select-tab-if-needed'`.
    */
  var insertBehavior: js.UndefOr[InsertBehavior] = js.undefined
  /**
    * The layout orientation of the tab bar.
    *
    * The default is `horizontal`.
    */
  var orientation: js.UndefOr[Orientation] = js.undefined
  /**
    * The selection behavior when removing a tab.
    *
    * The default is `'select-tab-after'`.
    */
  var removeBehavior: js.UndefOr[RemoveBehavior] = js.undefined
  /**
    * A renderer to use with the tab bar.
    *
    * The default is a shared renderer instance.
    */
  var renderer: js.UndefOr[IRenderer[T]] = js.undefined
  /**
    * Whether the tabs are movable by the user.
    *
    * The default is `false`.
    */
  var tabsMovable: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[T](
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    insertBehavior: InsertBehavior = null,
    orientation: Orientation = null,
    removeBehavior: RemoveBehavior = null,
    renderer: IRenderer[T] = null,
    tabsMovable: js.UndefOr[Boolean] = js.undefined
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect.asInstanceOf[js.Any])
    if (insertBehavior != null) __obj.updateDynamic("insertBehavior")(insertBehavior.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (removeBehavior != null) __obj.updateDynamic("removeBehavior")(removeBehavior.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(tabsMovable)) __obj.updateDynamic("tabsMovable")(tabsMovable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

