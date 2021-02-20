package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StringDictionary
import typings.handsontable.mod.Handsontable.wot.CellCoords
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenu {
  
  type MenuConfig = StringDictionary[MenuItemConfig]
  
  @js.native
  trait MenuItemConfig extends StObject {
    
    var callback: js.UndefOr[
        js.ThisFunction3[
          /* this */ typings.handsontable.mod._Handsontable.Core, 
          /* key */ String, 
          /* selection */ js.Array[Selection], 
          /* clickEvent */ MouseEvent, 
          Unit
        ]
      ] = js.native
    
    var disableSelection: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[
        Boolean | (js.ThisFunction0[/* this */ typings.handsontable.mod._Handsontable.Core, Boolean | Unit])
      ] = js.native
    
    var hidden: js.UndefOr[
        Boolean | (js.ThisFunction0[/* this */ typings.handsontable.mod._Handsontable.Core, Boolean | Unit])
      ] = js.native
    
    var isCommand: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[
        String | (js.ThisFunction0[/* this */ typings.handsontable.mod._Handsontable.Core, String])
      ] = js.native
    
    var renderer: js.UndefOr[
        js.ThisFunction6[
          /* this */ this.type, 
          /* hot */ typings.handsontable.mod._Handsontable.Core, 
          /* wrapper */ HTMLElement, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ Double | String, 
          /* itemValue */ String, 
          HTMLElement
        ]
      ] = js.native
    
    var submenu: js.UndefOr[SubmenuConfig] = js.native
  }
  object MenuItemConfig {
    
    @scala.inline
    def apply(): MenuItemConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemConfig]
    }
    
    @scala.inline
    implicit class MenuItemConfigMutableBuilder[Self <: MenuItemConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(
        value: js.ThisFunction3[
              /* this */ typings.handsontable.mod._Handsontable.Core, 
              /* key */ String, 
              /* selection */ js.Array[Selection], 
              /* clickEvent */ MouseEvent, 
              Unit
            ]
      ): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDisableSelection(value: Boolean): Self = StObject.set(x, "disableSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSelectionUndefined: Self = StObject.set(x, "disableSelection", js.undefined)
      
      @scala.inline
      def setDisabled(
        value: Boolean | (js.ThisFunction0[/* this */ typings.handsontable.mod._Handsontable.Core, Boolean | Unit])
      ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHidden(
        value: Boolean | (js.ThisFunction0[/* this */ typings.handsontable.mod._Handsontable.Core, Boolean | Unit])
      ): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIsCommand(value: Boolean): Self = StObject.set(x, "isCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCommandUndefined: Self = StObject.set(x, "isCommand", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setName(value: String | (js.ThisFunction0[/* this */ typings.handsontable.mod._Handsontable.Core, String])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRenderer(
        value: js.ThisFunction6[
              MenuItemConfig, 
              /* hot */ typings.handsontable.mod._Handsontable.Core, 
              /* wrapper */ HTMLElement, 
              /* row */ Double, 
              /* col */ Double, 
              /* prop */ Double | String, 
              /* itemValue */ String, 
              HTMLElement
            ]
      ): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setSubmenu(value: SubmenuConfig): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.row_above
    - typings.handsontable.handsontableStrings.row_below
    - typings.handsontable.handsontableStrings.col_left
    - typings.handsontable.handsontableStrings.col_right
    - typings.handsontable.handsontableStrings.`---------`
    - typings.handsontable.handsontableStrings.remove_row
    - typings.handsontable.handsontableStrings.remove_col
    - typings.handsontable.handsontableStrings.clear_column
    - typings.handsontable.handsontableStrings.undo
    - typings.handsontable.handsontableStrings.redo
    - typings.handsontable.handsontableStrings.make_read_only
    - typings.handsontable.handsontableStrings.alignment
    - typings.handsontable.handsontableStrings.cut
    - typings.handsontable.handsontableStrings.copy
    - typings.handsontable.handsontableStrings.freeze_column
    - typings.handsontable.handsontableStrings.unfreeze_column
    - typings.handsontable.handsontableStrings.borders
    - typings.handsontable.handsontableStrings.commentsAddEdit
    - typings.handsontable.handsontableStrings.commentsRemove
    - typings.handsontable.handsontableStrings.commentsReadOnly
    - typings.handsontable.handsontableStrings.mergeCells
    - typings.handsontable.handsontableStrings.add_child
    - typings.handsontable.handsontableStrings.detach_from_parent
    - typings.handsontable.handsontableStrings.hidden_columns_hide
    - typings.handsontable.handsontableStrings.hidden_columns_show
    - typings.handsontable.handsontableStrings.hidden_rows_hide
    - typings.handsontable.handsontableStrings.hidden_rows_show
    - typings.handsontable.handsontableStrings.filter_by_condition
    - typings.handsontable.handsontableStrings.filter_operators
    - typings.handsontable.handsontableStrings.filter_by_condition2
    - typings.handsontable.handsontableStrings.filter_by_value
    - typings.handsontable.handsontableStrings.filter_action_bar
  */
  trait PredefinedMenuItemKey extends StObject
  object PredefinedMenuItemKey {
    
    @scala.inline
    def `---------`: typings.handsontable.handsontableStrings.`---------` = "---------".asInstanceOf[typings.handsontable.handsontableStrings.`---------`]
    
    @scala.inline
    def add_child: typings.handsontable.handsontableStrings.add_child = "add_child".asInstanceOf[typings.handsontable.handsontableStrings.add_child]
    
    @scala.inline
    def alignment: typings.handsontable.handsontableStrings.alignment = "alignment".asInstanceOf[typings.handsontable.handsontableStrings.alignment]
    
    @scala.inline
    def borders: typings.handsontable.handsontableStrings.borders = "borders".asInstanceOf[typings.handsontable.handsontableStrings.borders]
    
    @scala.inline
    def clear_column: typings.handsontable.handsontableStrings.clear_column = "clear_column".asInstanceOf[typings.handsontable.handsontableStrings.clear_column]
    
    @scala.inline
    def col_left: typings.handsontable.handsontableStrings.col_left = "col_left".asInstanceOf[typings.handsontable.handsontableStrings.col_left]
    
    @scala.inline
    def col_right: typings.handsontable.handsontableStrings.col_right = "col_right".asInstanceOf[typings.handsontable.handsontableStrings.col_right]
    
    @scala.inline
    def commentsAddEdit: typings.handsontable.handsontableStrings.commentsAddEdit = "commentsAddEdit".asInstanceOf[typings.handsontable.handsontableStrings.commentsAddEdit]
    
    @scala.inline
    def commentsReadOnly: typings.handsontable.handsontableStrings.commentsReadOnly = "commentsReadOnly".asInstanceOf[typings.handsontable.handsontableStrings.commentsReadOnly]
    
    @scala.inline
    def commentsRemove: typings.handsontable.handsontableStrings.commentsRemove = "commentsRemove".asInstanceOf[typings.handsontable.handsontableStrings.commentsRemove]
    
    @scala.inline
    def copy: typings.handsontable.handsontableStrings.copy = "copy".asInstanceOf[typings.handsontable.handsontableStrings.copy]
    
    @scala.inline
    def cut: typings.handsontable.handsontableStrings.cut = "cut".asInstanceOf[typings.handsontable.handsontableStrings.cut]
    
    @scala.inline
    def detach_from_parent: typings.handsontable.handsontableStrings.detach_from_parent = "detach_from_parent".asInstanceOf[typings.handsontable.handsontableStrings.detach_from_parent]
    
    @scala.inline
    def filter_action_bar: typings.handsontable.handsontableStrings.filter_action_bar = "filter_action_bar".asInstanceOf[typings.handsontable.handsontableStrings.filter_action_bar]
    
    @scala.inline
    def filter_by_condition: typings.handsontable.handsontableStrings.filter_by_condition = "filter_by_condition".asInstanceOf[typings.handsontable.handsontableStrings.filter_by_condition]
    
    @scala.inline
    def filter_by_condition2: typings.handsontable.handsontableStrings.filter_by_condition2 = "filter_by_condition2".asInstanceOf[typings.handsontable.handsontableStrings.filter_by_condition2]
    
    @scala.inline
    def filter_by_value: typings.handsontable.handsontableStrings.filter_by_value = "filter_by_value".asInstanceOf[typings.handsontable.handsontableStrings.filter_by_value]
    
    @scala.inline
    def filter_operators: typings.handsontable.handsontableStrings.filter_operators = "filter_operators".asInstanceOf[typings.handsontable.handsontableStrings.filter_operators]
    
    @scala.inline
    def freeze_column: typings.handsontable.handsontableStrings.freeze_column = "freeze_column".asInstanceOf[typings.handsontable.handsontableStrings.freeze_column]
    
    @scala.inline
    def hidden_columns_hide: typings.handsontable.handsontableStrings.hidden_columns_hide = "hidden_columns_hide".asInstanceOf[typings.handsontable.handsontableStrings.hidden_columns_hide]
    
    @scala.inline
    def hidden_columns_show: typings.handsontable.handsontableStrings.hidden_columns_show = "hidden_columns_show".asInstanceOf[typings.handsontable.handsontableStrings.hidden_columns_show]
    
    @scala.inline
    def hidden_rows_hide: typings.handsontable.handsontableStrings.hidden_rows_hide = "hidden_rows_hide".asInstanceOf[typings.handsontable.handsontableStrings.hidden_rows_hide]
    
    @scala.inline
    def hidden_rows_show: typings.handsontable.handsontableStrings.hidden_rows_show = "hidden_rows_show".asInstanceOf[typings.handsontable.handsontableStrings.hidden_rows_show]
    
    @scala.inline
    def make_read_only: typings.handsontable.handsontableStrings.make_read_only = "make_read_only".asInstanceOf[typings.handsontable.handsontableStrings.make_read_only]
    
    @scala.inline
    def mergeCells: typings.handsontable.handsontableStrings.mergeCells = "mergeCells".asInstanceOf[typings.handsontable.handsontableStrings.mergeCells]
    
    @scala.inline
    def redo: typings.handsontable.handsontableStrings.redo = "redo".asInstanceOf[typings.handsontable.handsontableStrings.redo]
    
    @scala.inline
    def remove_col: typings.handsontable.handsontableStrings.remove_col = "remove_col".asInstanceOf[typings.handsontable.handsontableStrings.remove_col]
    
    @scala.inline
    def remove_row: typings.handsontable.handsontableStrings.remove_row = "remove_row".asInstanceOf[typings.handsontable.handsontableStrings.remove_row]
    
    @scala.inline
    def row_above: typings.handsontable.handsontableStrings.row_above = "row_above".asInstanceOf[typings.handsontable.handsontableStrings.row_above]
    
    @scala.inline
    def row_below: typings.handsontable.handsontableStrings.row_below = "row_below".asInstanceOf[typings.handsontable.handsontableStrings.row_below]
    
    @scala.inline
    def undo: typings.handsontable.handsontableStrings.undo = "undo".asInstanceOf[typings.handsontable.handsontableStrings.undo]
    
    @scala.inline
    def unfreeze_column: typings.handsontable.handsontableStrings.unfreeze_column = "unfreeze_column".asInstanceOf[typings.handsontable.handsontableStrings.unfreeze_column]
  }
  
  @js.native
  trait Selection extends StObject {
    
    var end: CellCoords = js.native
    
    var start: CellCoords = js.native
  }
  object Selection {
    
    @scala.inline
    def apply(end: CellCoords, start: CellCoords): Selection = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selection]
    }
    
    @scala.inline
    implicit class SelectionMutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: CellCoords): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: CellCoords): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    var callback: js.UndefOr[
        js.Function3[
          /* key */ String, 
          /* selection */ js.Array[Selection], 
          /* clickEvent */ MouseEvent, 
          Unit
        ]
      ] = js.native
    
    var items: js.Array[PredefinedMenuItemKey] | MenuConfig = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(items: js.Array[PredefinedMenuItemKey] | MenuConfig): Settings = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(
        value: (/* key */ String, /* selection */ js.Array[Selection], /* clickEvent */ MouseEvent) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[PredefinedMenuItemKey] | MenuConfig): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: PredefinedMenuItemKey*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SubmenuConfig extends StObject {
    
    var items: js.Array[SubmenuItemConfig] = js.native
  }
  object SubmenuConfig {
    
    @scala.inline
    def apply(items: js.Array[SubmenuItemConfig]): SubmenuConfig = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmenuConfig]
    }
    
    @scala.inline
    implicit class SubmenuConfigMutableBuilder[Self <: SubmenuConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[SubmenuItemConfig]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: SubmenuItemConfig*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof handsontable.handsontable.Handsontable.contextMenu.MenuItemConfig ]: P} & {[ P in 'key' ]: never} & {[x: string] : never, [x: number] : never}[keyof handsontable.handsontable.Handsontable.contextMenu.MenuItemConfig] ]: handsontable.handsontable.Handsontable.contextMenu.MenuItemConfig[P]} */ @js.native
  trait SubmenuItemConfig extends StObject {
    
    /**
      * Submenu item `key` must be defined as "parent_key:sub_key" where "parent_key" is the parent MenuItemConfig key.
      */
    var key: String = js.native
  }
  object SubmenuItemConfig {
    
    @scala.inline
    def apply(key: String): SubmenuItemConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmenuItemConfig]
    }
    
    @scala.inline
    implicit class SubmenuItemConfigMutableBuilder[Self <: SubmenuItemConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
