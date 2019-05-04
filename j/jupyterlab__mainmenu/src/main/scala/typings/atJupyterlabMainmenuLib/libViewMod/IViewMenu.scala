package typings
package atJupyterlabMainmenuLib.libViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewMenu
  extends atJupyterlabMainmenuLib.libLabmenuMod.IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val editorViewers: stdLib.Set[
    atJupyterlabMainmenuLib.libViewMod.IViewMenuNs.IEditorViewer[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
}

