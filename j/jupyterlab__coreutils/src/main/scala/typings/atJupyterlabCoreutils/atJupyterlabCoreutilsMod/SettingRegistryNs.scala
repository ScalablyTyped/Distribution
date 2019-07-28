package typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod

import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistryNs.IShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "SettingRegistry")
@js.native
object SettingRegistryNs extends js.Object {
  /**
    * Reconcile default and user shortcuts and return the composite list.
    *
    * @param defaults - The list of default shortcuts.
    *
    * @param user - The list of user shortcut overrides and additions.
    *
    * @returns A loadable list of shortcuts (omitting disabled and overridden).
    */
  def reconcileShortcuts(defaults: js.Array[IShortcut], user: js.Array[IShortcut]): js.Array[IShortcut] = js.native
}

