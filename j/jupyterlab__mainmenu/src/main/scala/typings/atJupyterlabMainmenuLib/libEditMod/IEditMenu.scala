package typings
package atJupyterlabMainmenuLib.libEditMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditMenu
  extends atJupyterlabMainmenuLib.libLabmenuMod.IJupyterLabMenu {
  /**
    * A set storing IClearers for the Edit menu.
    */
  val clearers: stdLib.Set[
    atJupyterlabMainmenuLib.libEditMod.IEditMenuNs.IClearer[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
  /**
    * A set storing IFindReplacers for the Edit menu.
    */
  val findReplacers: stdLib.Set[
    atJupyterlabMainmenuLib.libEditMod.IEditMenuNs.IFindReplacer[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
  /**
    * A set storing IGoToLiners for the Edit menu.
    */
  val goToLiners: stdLib.Set[
    atJupyterlabMainmenuLib.libEditMod.IEditMenuNs.IGoToLiner[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
  /**
    * A set storing IUndoers for the Edit menu.
    */
  val undoers: stdLib.Set[
    atJupyterlabMainmenuLib.libEditMod.IEditMenuNs.IUndoer[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
}

