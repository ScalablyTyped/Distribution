package typings.atJupyterlabUiDashComponents.libIconTabbarsvgMod

import typings.atJupyterlabUiDashComponents.libIconTabbarsvgMod.TabBarSvg.IOptions
import typings.atJupyterlabUiDashComponents.libStyleIconMod.IconKindType
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.TabBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components/lib/icon/tabbarsvg", "TabBarSvg")
@js.native
class TabBarSvg_[T] protected () extends TabBar[T] {
  /**
    * Construct a new tab bar. Sets the (icon) kind and overrides
    * the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  def this(options: IOptions[T]) = this()
  var _kind: IconKindType = js.native
}

