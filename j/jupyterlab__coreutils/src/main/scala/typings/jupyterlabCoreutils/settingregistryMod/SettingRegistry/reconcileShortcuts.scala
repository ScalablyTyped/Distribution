package typings.jupyterlabCoreutils.settingregistryMod.SettingRegistry

import typings.jupyterlabCoreutils.tokensMod.ISettingRegistry.IShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/settingregistry", "SettingRegistry.reconcileShortcuts")
@js.native
object reconcileShortcuts extends js.Object {
  /**
    * Reconcile default and user shortcuts and return the composite list.
    *
    * @param defaults - The list of default shortcuts.
    *
    * @param user - The list of user shortcut overrides and additions.
    *
    * @returns A loadable list of shortcuts (omitting disabled and overridden).
    */
  def apply(defaults: js.Array[IShortcut], user: js.Array[IShortcut]): js.Array[IShortcut] = js.native
}

