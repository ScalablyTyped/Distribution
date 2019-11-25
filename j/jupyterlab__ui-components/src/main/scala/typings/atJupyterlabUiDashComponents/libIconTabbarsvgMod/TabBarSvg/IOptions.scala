package typings.atJupyterlabUiDashComponents.libIconTabbarsvgMod.TabBarSvg

import typings.atJupyterlabUiDashComponents.libStyleIconMod.IconKindType
import typings.atPhosphorWidgets.libTabbarMod.TabBar.IRenderer
import typings.atPhosphorWidgets.libTabbarMod.TabBar.InsertBehavior
import typings.atPhosphorWidgets.libTabbarMod.TabBar.Orientation
import typings.atPhosphorWidgets.libTabbarMod.TabBar.RemoveBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T]
  extends typings.atPhosphorWidgets.libTabbarMod.TabBar.IOptions[T] {
  /**
    * The kind of icon this tab bar widget should render.
    * Adds preset styling to the icons.
    */
  var kind: js.UndefOr[IconKindType] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[T](
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    insertBehavior: InsertBehavior = null,
    kind: IconKindType = null,
    orientation: Orientation = null,
    removeBehavior: RemoveBehavior = null,
    renderer: IRenderer[T] = null,
    tabsMovable: js.UndefOr[Boolean] = js.undefined
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect.asInstanceOf[js.Any])
    if (insertBehavior != null) __obj.updateDynamic("insertBehavior")(insertBehavior.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (removeBehavior != null) __obj.updateDynamic("removeBehavior")(removeBehavior.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(tabsMovable)) __obj.updateDynamic("tabsMovable")(tabsMovable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

