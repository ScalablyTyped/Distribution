package typings.atJupyterlabUiDashComponents.libIconTabbarsvgMod

import typings.atJupyterlabUiDashComponents.libIconTabbarsvgMod.TabBarSvgNs.Renderer
import typings.atJupyterlabUiDashComponents.libStyleIconMod.IconKindType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components/lib/icon/tabbarsvg", "TabBarSvg")
@js.native
object TabBarSvgNs extends js.Object {
  trait IOptions[T]
    extends typings.atPhosphorWidgets.libTabbarMod.TabBarNs.IOptions[T] {
    /**
      * The kind of icon this tab bar widget should render.
      * Adds preset styling to the icons.
      */
    var kind: js.UndefOr[IconKindType] = js.undefined
  }
  
  /**
    * A modified implementation of the TabBar Renderer.
    */
  @js.native
  class Renderer ()
    extends typings.atPhosphorWidgets.atPhosphorWidgetsMod.TabBarNs.Renderer
  
  val defaultRenderer: Renderer = js.native
}

