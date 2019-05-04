package typings
package atJupyterlabMainmenuLib.libRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRunMenu
  extends atJupyterlabMainmenuLib.libLabmenuMod.IJupyterLabMenu {
  /**
    * A set storing ICodeRunner for the Run menu.
    *
    * ### Notes
    * The key for the set may be used in menu labels.
    */
  val codeRunners: stdLib.Set[
    atJupyterlabMainmenuLib.libRunMod.IRunMenuNs.ICodeRunner[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
}

