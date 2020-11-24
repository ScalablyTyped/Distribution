package typings.jupyterlabSettingregistry

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabSettingregistry.settingregistryMod.SettingRegistry.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IShortcut
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingregistry", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * Instantiate a schema validator.
    */
  class DefaultSchemaValidator ()
    extends typings.jupyterlabSettingregistry.settingregistryMod.DefaultSchemaValidator
  
  @js.native
  object ISettingRegistry
    extends TopLevel[Token[typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry]] {
    
    /**
      * A namespace for plugin functionality.
      */
    @js.native
    object IPlugin extends js.Object
  }
  
  @js.native
  class SettingRegistry protected ()
    extends typings.jupyterlabSettingregistry.settingregistryMod.SettingRegistry {
    /**
      * Create a new setting registry.
      */
    def this(options: IOptions) = this()
  }
  @js.native
  object SettingRegistry extends js.Object {
    
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
  
  @js.native
  class Settings protected ()
    extends typings.jupyterlabSettingregistry.settingregistryMod.Settings {
    /**
      * Instantiate a new plugin settings manager.
      */
    def this(options: typings.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions) = this()
  }
}
