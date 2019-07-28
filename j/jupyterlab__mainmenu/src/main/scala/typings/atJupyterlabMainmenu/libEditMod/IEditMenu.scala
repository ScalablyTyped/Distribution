package typings.atJupyterlabMainmenu.libEditMod

import typings.atJupyterlabMainmenu.libEditMod.IEditMenuNs.IClearer
import typings.atJupyterlabMainmenu.libEditMod.IEditMenuNs.IGoToLiner
import typings.atJupyterlabMainmenu.libEditMod.IEditMenuNs.IUndoer
import typings.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditMenu extends IJupyterLabMenu {
  /**
    * A set storing IClearers for the Edit menu.
    */
  val clearers: Set[IClearer[Widget]] = js.native
  /**
    * A set storing IGoToLiners for the Edit menu.
    */
  val goToLiners: Set[IGoToLiner[Widget]] = js.native
  /**
    * A set storing IUndoers for the Edit menu.
    */
  val undoers: Set[IUndoer[Widget]] = js.native
}

