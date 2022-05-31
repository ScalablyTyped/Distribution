package typings.jupyterlabSettingregistry

import typings.jupyterlabSettingregistry.settingregistryMod.SettingRegistry.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IShortcut
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/settingregistry", "DefaultSchemaValidator")
  @js.native
  /**
    * Instantiate a schema validator.
    */
  class DefaultSchemaValidator ()
    extends typings.jupyterlabSettingregistry.settingregistryMod.DefaultSchemaValidator
  
  @JSImport("@jupyterlab/settingregistry", "ISettingRegistry")
  @js.native
  val ISettingRegistry: Token[typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry] = js.native
  
  @JSImport("@jupyterlab/settingregistry", "SettingRegistry")
  @js.native
  class SettingRegistry protected ()
    extends typings.jupyterlabSettingregistry.settingregistryMod.SettingRegistry {
    /**
      * Create a new setting registry.
      */
    def this(options: IOptions) = this()
  }
  object SettingRegistry {
    
    @JSImport("@jupyterlab/settingregistry", "SettingRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Reconcile default and user shortcuts and return the composite list.
      *
      * @param defaults - The list of default shortcuts.
      *
      * @param user - The list of user shortcut overrides and additions.
      *
      * @returns A loadable list of shortcuts (omitting disabled and overridden).
      */
    inline def reconcileShortcuts(defaults: js.Array[IShortcut], user: js.Array[IShortcut]): js.Array[IShortcut] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileShortcuts")(defaults.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[js.Array[IShortcut]]
  }
  
  @JSImport("@jupyterlab/settingregistry", "Settings")
  @js.native
  class Settings protected ()
    extends typings.jupyterlabSettingregistry.settingregistryMod.Settings {
    /**
      * Instantiate a new plugin settings manager.
      */
    def this(options: typings.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions) = this()
  }
}
