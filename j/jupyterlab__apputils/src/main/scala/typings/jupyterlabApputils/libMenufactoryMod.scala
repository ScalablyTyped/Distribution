package typings.jupyterlabApputils

import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IContextMenuItem
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IMenu
import typings.luminoWidgets.mod.ContextMenu
import typings.luminoWidgets.mod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMenufactoryMod {
  
  object MenuFactory {
    
    @JSImport("@jupyterlab/apputils/lib/menufactory", "MenuFactory")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert an item description in a context menu item object
      *
      * @param item Context menu item
      * @param menu Context menu to populate
      * @param menuFactory Empty menu factory
      */
    inline def addContextItem(
      item: IContextMenuItem,
      menu: ContextMenu,
      menuFactory: js.Function1[/* options */ IMenuOptions, Menu]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContextItem")(item.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], menuFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Create menus from their description
      *
      * @param data Menubar description
      * @param menuFactory Factory for empty menu
      */
    inline def createMenus(data: js.Array[IMenu], menuFactory: js.Function1[/* options */ IMenuOptions, Menu]): js.Array[Menu] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMenus")(data.asInstanceOf[js.Any], menuFactory.asInstanceOf[js.Any])).asInstanceOf[js.Array[Menu]]
    
    /**
      * Update an existing list of menu and returns
      * the new elements.
      *
      * #### Note
      * New elements are added to the current menu list.
      *
      * @param menus Current menus
      * @param data New description to take into account
      * @param menuFactory Empty menu factory
      * @returns Newly created menus
      */
    inline def updateMenus(
      menus: js.Array[Menu],
      data: js.Array[IMenu],
      menuFactory: js.Function1[/* options */ IMenuOptions, Menu]
    ): js.Array[Menu] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMenus")(menus.asInstanceOf[js.Any], data.asInstanceOf[js.Any], menuFactory.asInstanceOf[js.Any])).asInstanceOf[js.Array[Menu]]
    
    /**
      * Menu constructor options
      */
    trait IMenuOptions extends StObject {
      
      /**
        * The unique menu identifier.
        */
      var id: String
      
      /**
        * The menu label.
        */
      var label: js.UndefOr[String] = js.undefined
      
      /**
        * The menu rank.
        */
      var rank: js.UndefOr[Double] = js.undefined
    }
    object IMenuOptions {
      
      inline def apply(id: String): IMenuOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[IMenuOptions]
      }
      
      extension [Self <: IMenuOptions](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
  }
}
