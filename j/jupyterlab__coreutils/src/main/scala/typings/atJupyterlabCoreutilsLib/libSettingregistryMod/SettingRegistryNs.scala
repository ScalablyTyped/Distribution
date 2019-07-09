package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/settingregistry", "SettingRegistry")
@js.native
object SettingRegistryNs extends js.Object {
  /**
    * The instantiation options for a setting registry
    */
  trait IOptions extends js.Object {
    /**
      * The data connector used by the setting registry.
      */
    var connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
        atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin, 
        java.lang.String, 
        java.lang.String
      ]
    /**
      * Preloaded plugin data to populate the setting registry.
      */
    var plugins: js.UndefOr[js.Array[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin]] = js.undefined
    /**
      * The number of milliseconds before a `load()` call to the registry waits
      * before timing out if it requires a transformation that has not been
      * registered.
      *
      * #### Notes
      * The default value is 7000.
      */
    var timeout: js.UndefOr[scala.Double] = js.undefined
    /**
      * The validator used to enforce the settings JSON schema.
      */
    var validator: js.UndefOr[atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidator] = js.undefined
  }
  
  /**
    * Reconcile default and user shortcuts and return the composite list.
    *
    * @param defaults - The list of default shortcuts.
    *
    * @param user - The list of user shortcut overrides and additions.
    *
    * @returns A loadable list of shortcuts (omitting disabled and overridden).
    */
  def reconcileShortcuts(
    defaults: js.Array[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IShortcut],
    user: js.Array[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IShortcut]
  ): js.Array[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IShortcut] = js.native
}

