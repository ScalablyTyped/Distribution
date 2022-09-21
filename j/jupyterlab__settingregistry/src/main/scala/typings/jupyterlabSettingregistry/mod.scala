package typings.jupyterlabSettingregistry

import typings.jupyterlabSettingregistry.settingregistryMod.SettingRegistry.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IMenu
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IMenuItem
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IShortcut
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IToolbarItem
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
  open class DefaultSchemaValidator ()
    extends typings.jupyterlabSettingregistry.settingregistryMod.DefaultSchemaValidator
  
  @JSImport("@jupyterlab/settingregistry", "ISettingRegistry")
  @js.native
  val ISettingRegistry: Token[typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry] = js.native
  
  @JSImport("@jupyterlab/settingregistry", "SettingRegistry")
  @js.native
  open class SettingRegistry protected ()
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
      * Remove disabled entries from menu items
      *
      * @param items Menu items
      * @returns Filtered menu items
      */
    inline def filterDisabledItems[T /* <: IMenuItem */](items: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterDisabledItems")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    /**
      * Merge two set of menu items.
      *
      * @param reference Reference set of menu items
      * @param addition New items to add
      * @param warn Whether to warn if item is duplicated; default to false
      * @returns The merged set of items
      */
    inline def reconcileItems[T /* <: IMenuItem */](): js.UndefOr[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")().asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T]): js.UndefOr[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: js.Array[T]): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: js.Array[T], warn: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: js.Array[T], warn: Boolean, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: js.Array[T], warn: Unit, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: Unit, warn: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: Unit, warn: Boolean, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: Unit, warn: Unit, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: js.Array[T]): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: js.Array[T], warn: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: js.Array[T], warn: Boolean, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: js.Array[T], warn: Unit, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: Unit, warn: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: Unit, warn: Boolean, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: Unit, warn: Unit, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    
    /**
      * Reconcile the menus.
      *
      * @param reference The reference list of menus.
      * @param addition The list of menus to add.
      * @param warn Warn if the command items are duplicated within the same menu.
      * @returns The reconciled list of menus.
      */
    inline def reconcileMenus(): js.Array[IMenu] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")().asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu]): js.Array[IMenu] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: js.Array[IMenu]): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: js.Array[IMenu], warn: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: js.Array[IMenu], warn: Boolean, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: js.Array[IMenu], warn: Unit, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: Null, warn: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: Null, warn: Boolean, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: Null, warn: Unit, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: js.Array[IMenu]): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: js.Array[IMenu], warn: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: js.Array[IMenu], warn: Boolean, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: js.Array[IMenu], warn: Unit, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: Null, warn: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: Null, warn: Boolean, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: Null, warn: Unit, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    
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
    
    /**
      * Merge two set of toolbar items.
      *
      * @param reference Reference set of toolbar items
      * @param addition New items to add
      * @param warn Whether to warn if item is duplicated; default to false
      * @returns The merged set of items
      */
    inline def reconcileToolbarItems(): js.UndefOr[js.Array[IToolbarItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")().asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: js.Array[IToolbarItem]): js.UndefOr[js.Array[IToolbarItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: js.Array[IToolbarItem], addition: js.Array[IToolbarItem]): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: js.Array[IToolbarItem], addition: js.Array[IToolbarItem], warn: Boolean): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: js.Array[IToolbarItem], addition: Unit, warn: Boolean): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: Unit, addition: js.Array[IToolbarItem]): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: Unit, addition: js.Array[IToolbarItem], warn: Boolean): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: Unit, addition: Unit, warn: Boolean): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
  }
  
  @JSImport("@jupyterlab/settingregistry", "Settings")
  @js.native
  open class Settings protected ()
    extends typings.jupyterlabSettingregistry.settingregistryMod.Settings {
    /**
      * Instantiate a new plugin settings manager.
      */
    def this(options: typings.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions) = this()
  }
}
