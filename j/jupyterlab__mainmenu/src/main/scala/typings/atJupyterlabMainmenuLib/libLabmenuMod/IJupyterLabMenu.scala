package typings
package atJupyterlabMainmenuLib.libLabmenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJupyterLabMenu
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * Add a group of menu items specific to a particular
    * plugin.
    */
  def addGroup(items: js.Array[atPhosphorWidgetsLib.libMenuMod.MenuNs.IItemOptions]): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  def addGroup(items: js.Array[atPhosphorWidgetsLib.libMenuMod.MenuNs.IItemOptions], rank: scala.Double): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
}

