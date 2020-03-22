package typings.jupyterlabMainmenu.editMod

import typings.jupyterlabMainmenu.editMod.IEditMenu.IClearer
import typings.jupyterlabMainmenu.editMod.IEditMenu.IGoToLiner
import typings.jupyterlabMainmenu.editMod.IEditMenu.IUndoer
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditMenu_ extends IJupyterLabMenu {
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

