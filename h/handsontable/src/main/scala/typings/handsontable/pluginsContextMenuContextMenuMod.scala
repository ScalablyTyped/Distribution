package typings.handsontable

import org.scalablytyped.runtime.StringDictionary
import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsContextMenuContextMenuMod {
  
  @JSImport("handsontable/plugins/contextMenu/contextMenu", "ContextMenu")
  @js.native
  open class ContextMenu protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def close(): Unit = js.native
    
    def executeCommand(
      commandName: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type any is not an array type */ params: Any
    ): Unit = js.native
    
    def isEnabled(): Boolean = js.native
    
    def open(event: Event): Unit = js.native
  }
  /* static members */
  object ContextMenu {
    
    @JSImport("handsontable/plugins/contextMenu/contextMenu", "ContextMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("handsontable/plugins/contextMenu/contextMenu", "ContextMenu.DEFAULT_ITEMS")
    @js.native
    def DEFAULT_ITEMS: js.Array[PredefinedMenuItemKey] = js.native
    inline def DEFAULT_ITEMS_=(x: js.Array[PredefinedMenuItemKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ITEMS")(x.asInstanceOf[js.Any])
    
    @JSImport("handsontable/plugins/contextMenu/contextMenu", "ContextMenu.SEPARATOR")
    @js.native
    def SEPARATOR: SeparatorObject = js.native
    inline def SEPARATOR_=(x: SeparatorObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
  
  trait DetailedSettings extends StObject {
    
    var callback: js.UndefOr[
        js.Function3[
          /* key */ String, 
          /* selection */ js.Array[Selection], 
          /* clickEvent */ MouseEvent, 
          Unit
        ]
      ] = js.undefined
    
    var items: js.Array[PredefinedMenuItemKey] | MenuConfig
  }
  object DetailedSettings {
    
    inline def apply(items: js.Array[PredefinedMenuItemKey] | MenuConfig): DetailedSettings = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetailedSettings] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* key */ String, /* selection */ js.Array[Selection], /* clickEvent */ MouseEvent) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setItems(value: js.Array[PredefinedMenuItemKey] | MenuConfig): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: PredefinedMenuItemKey*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  type MenuConfig = StringDictionary[MenuItemConfig]
  
  trait MenuItemConfig extends StObject {
    
    var callback: js.UndefOr[
        js.ThisFunction3[
          /* this */ default, 
          /* key */ String, 
          /* selection */ js.Array[Selection], 
          /* clickEvent */ MouseEvent, 
          Unit
        ]
      ] = js.undefined
    
    var disableSelection: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean | (js.ThisFunction0[/* this */ default, Boolean | Unit])] = js.undefined
    
    var hidden: js.UndefOr[Boolean | (js.ThisFunction0[/* this */ default, Boolean | Unit])] = js.undefined
    
    var isCommand: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String | (js.ThisFunction0[/* this */ default, String])] = js.undefined
    
    var renderer: js.UndefOr[
        js.ThisFunction6[
          /* this */ this.type, 
          /* hot */ default, 
          /* wrapper */ HTMLElement, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ Double | String, 
          /* itemValue */ String, 
          HTMLElement
        ]
      ] = js.undefined
    
    var submenu: js.UndefOr[SubmenuConfig] = js.undefined
  }
  object MenuItemConfig {
    
    inline def apply(): MenuItemConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemConfig] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: js.ThisFunction3[
              /* this */ default, 
              /* key */ String, 
              /* selection */ js.Array[Selection], 
              /* clickEvent */ MouseEvent, 
              Unit
            ]
      ): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDisableSelection(value: Boolean): Self = StObject.set(x, "disableSelection", value.asInstanceOf[js.Any])
      
      inline def setDisableSelectionUndefined: Self = StObject.set(x, "disableSelection", js.undefined)
      
      inline def setDisabled(value: Boolean | (js.ThisFunction0[/* this */ default, Boolean | Unit])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHidden(value: Boolean | (js.ThisFunction0[/* this */ default, Boolean | Unit])): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIsCommand(value: Boolean): Self = StObject.set(x, "isCommand", value.asInstanceOf[js.Any])
      
      inline def setIsCommandUndefined: Self = StObject.set(x, "isCommand", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setName(value: String | (js.ThisFunction0[/* this */ default, String])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRenderer(
        value: js.ThisFunction6[
              MenuItemConfig, 
              /* hot */ default, 
              /* wrapper */ HTMLElement, 
              /* row */ Double, 
              /* col */ Double, 
              /* prop */ Double | String, 
              /* itemValue */ String, 
              HTMLElement
            ]
      ): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setSubmenu(value: SubmenuConfig): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
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
    - typings.handsontable.handsontableStrings.copy_column_headers_only
    - typings.handsontable.handsontableStrings.copy_with_column_group_headers
    - typings.handsontable.handsontableStrings.copy_with_column_headers
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
    
    inline def `---------`: typings.handsontable.handsontableStrings.`---------` = "---------".asInstanceOf[typings.handsontable.handsontableStrings.`---------`]
    
    inline def add_child: typings.handsontable.handsontableStrings.add_child = "add_child".asInstanceOf[typings.handsontable.handsontableStrings.add_child]
    
    inline def alignment: typings.handsontable.handsontableStrings.alignment = "alignment".asInstanceOf[typings.handsontable.handsontableStrings.alignment]
    
    inline def borders: typings.handsontable.handsontableStrings.borders = "borders".asInstanceOf[typings.handsontable.handsontableStrings.borders]
    
    inline def clear_column: typings.handsontable.handsontableStrings.clear_column = "clear_column".asInstanceOf[typings.handsontable.handsontableStrings.clear_column]
    
    inline def col_left: typings.handsontable.handsontableStrings.col_left = "col_left".asInstanceOf[typings.handsontable.handsontableStrings.col_left]
    
    inline def col_right: typings.handsontable.handsontableStrings.col_right = "col_right".asInstanceOf[typings.handsontable.handsontableStrings.col_right]
    
    inline def commentsAddEdit: typings.handsontable.handsontableStrings.commentsAddEdit = "commentsAddEdit".asInstanceOf[typings.handsontable.handsontableStrings.commentsAddEdit]
    
    inline def commentsReadOnly: typings.handsontable.handsontableStrings.commentsReadOnly = "commentsReadOnly".asInstanceOf[typings.handsontable.handsontableStrings.commentsReadOnly]
    
    inline def commentsRemove: typings.handsontable.handsontableStrings.commentsRemove = "commentsRemove".asInstanceOf[typings.handsontable.handsontableStrings.commentsRemove]
    
    inline def copy: typings.handsontable.handsontableStrings.copy = "copy".asInstanceOf[typings.handsontable.handsontableStrings.copy]
    
    inline def copy_column_headers_only: typings.handsontable.handsontableStrings.copy_column_headers_only = "copy_column_headers_only".asInstanceOf[typings.handsontable.handsontableStrings.copy_column_headers_only]
    
    inline def copy_with_column_group_headers: typings.handsontable.handsontableStrings.copy_with_column_group_headers = "copy_with_column_group_headers".asInstanceOf[typings.handsontable.handsontableStrings.copy_with_column_group_headers]
    
    inline def copy_with_column_headers: typings.handsontable.handsontableStrings.copy_with_column_headers = "copy_with_column_headers".asInstanceOf[typings.handsontable.handsontableStrings.copy_with_column_headers]
    
    inline def cut: typings.handsontable.handsontableStrings.cut = "cut".asInstanceOf[typings.handsontable.handsontableStrings.cut]
    
    inline def detach_from_parent: typings.handsontable.handsontableStrings.detach_from_parent = "detach_from_parent".asInstanceOf[typings.handsontable.handsontableStrings.detach_from_parent]
    
    inline def filter_action_bar: typings.handsontable.handsontableStrings.filter_action_bar = "filter_action_bar".asInstanceOf[typings.handsontable.handsontableStrings.filter_action_bar]
    
    inline def filter_by_condition: typings.handsontable.handsontableStrings.filter_by_condition = "filter_by_condition".asInstanceOf[typings.handsontable.handsontableStrings.filter_by_condition]
    
    inline def filter_by_condition2: typings.handsontable.handsontableStrings.filter_by_condition2 = "filter_by_condition2".asInstanceOf[typings.handsontable.handsontableStrings.filter_by_condition2]
    
    inline def filter_by_value: typings.handsontable.handsontableStrings.filter_by_value = "filter_by_value".asInstanceOf[typings.handsontable.handsontableStrings.filter_by_value]
    
    inline def filter_operators: typings.handsontable.handsontableStrings.filter_operators = "filter_operators".asInstanceOf[typings.handsontable.handsontableStrings.filter_operators]
    
    inline def freeze_column: typings.handsontable.handsontableStrings.freeze_column = "freeze_column".asInstanceOf[typings.handsontable.handsontableStrings.freeze_column]
    
    inline def hidden_columns_hide: typings.handsontable.handsontableStrings.hidden_columns_hide = "hidden_columns_hide".asInstanceOf[typings.handsontable.handsontableStrings.hidden_columns_hide]
    
    inline def hidden_columns_show: typings.handsontable.handsontableStrings.hidden_columns_show = "hidden_columns_show".asInstanceOf[typings.handsontable.handsontableStrings.hidden_columns_show]
    
    inline def hidden_rows_hide: typings.handsontable.handsontableStrings.hidden_rows_hide = "hidden_rows_hide".asInstanceOf[typings.handsontable.handsontableStrings.hidden_rows_hide]
    
    inline def hidden_rows_show: typings.handsontable.handsontableStrings.hidden_rows_show = "hidden_rows_show".asInstanceOf[typings.handsontable.handsontableStrings.hidden_rows_show]
    
    inline def make_read_only: typings.handsontable.handsontableStrings.make_read_only = "make_read_only".asInstanceOf[typings.handsontable.handsontableStrings.make_read_only]
    
    inline def mergeCells: typings.handsontable.handsontableStrings.mergeCells = "mergeCells".asInstanceOf[typings.handsontable.handsontableStrings.mergeCells]
    
    inline def redo: typings.handsontable.handsontableStrings.redo = "redo".asInstanceOf[typings.handsontable.handsontableStrings.redo]
    
    inline def remove_col: typings.handsontable.handsontableStrings.remove_col = "remove_col".asInstanceOf[typings.handsontable.handsontableStrings.remove_col]
    
    inline def remove_row: typings.handsontable.handsontableStrings.remove_row = "remove_row".asInstanceOf[typings.handsontable.handsontableStrings.remove_row]
    
    inline def row_above: typings.handsontable.handsontableStrings.row_above = "row_above".asInstanceOf[typings.handsontable.handsontableStrings.row_above]
    
    inline def row_below: typings.handsontable.handsontableStrings.row_below = "row_below".asInstanceOf[typings.handsontable.handsontableStrings.row_below]
    
    inline def undo: typings.handsontable.handsontableStrings.undo = "undo".asInstanceOf[typings.handsontable.handsontableStrings.undo]
    
    inline def unfreeze_column: typings.handsontable.handsontableStrings.unfreeze_column = "unfreeze_column".asInstanceOf[typings.handsontable.handsontableStrings.unfreeze_column]
  }
  
  trait Selection extends StObject {
    
    var end: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default
    
    var start: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default
  }
  object Selection {
    
    inline def apply(
      end: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      start: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default
    ): Selection = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeparatorObject extends StObject {
    
    var name: String
  }
  object SeparatorObject {
    
    inline def apply(name: String): SeparatorObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeparatorObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeparatorObject] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = Boolean | js.Array[PredefinedMenuItemKey] | DetailedSettings
  
  trait SubmenuConfig extends StObject {
    
    var items: js.Array[SubmenuItemConfig]
  }
  object SubmenuConfig {
    
    inline def apply(items: js.Array[SubmenuItemConfig]): SubmenuConfig = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmenuConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubmenuConfig] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[SubmenuItemConfig]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: SubmenuItemConfig*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  /* Inlined parent std.Omit<handsontable.handsontable/plugins/contextMenu/contextMenu.MenuItemConfig, 'key'> */
  trait SubmenuItemConfig extends StObject {
    
    var callback: js.UndefOr[
        js.ThisFunction3[
          /* this */ default, 
          /* key */ String, 
          /* selection */ js.Array[Selection], 
          /* clickEvent */ MouseEvent, 
          Unit
        ]
      ] = js.undefined
    
    var disableSelection: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean | (js.ThisFunction0[/* this */ default, Boolean | Unit])] = js.undefined
    
    var hidden: js.UndefOr[Boolean | (js.ThisFunction0[/* this */ default, Boolean | Unit])] = js.undefined
    
    var isCommand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Submenu item `key` must be defined as "parent_key:sub_key" where "parent_key" is the parent MenuItemConfig key.
      */
    var key: String
    
    var name: js.UndefOr[String | (js.ThisFunction0[/* this */ default, String])] = js.undefined
    
    var renderer: js.UndefOr[
        js.ThisFunction6[
          /* this */ MenuItemConfig, 
          /* hot */ default, 
          /* wrapper */ HTMLElement, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ Double | String, 
          /* itemValue */ String, 
          HTMLElement
        ]
      ] = js.undefined
    
    var submenu: js.UndefOr[SubmenuConfig] = js.undefined
  }
  object SubmenuItemConfig {
    
    inline def apply(key: String): SubmenuItemConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmenuItemConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubmenuItemConfig] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: js.ThisFunction3[
              /* this */ default, 
              /* key */ String, 
              /* selection */ js.Array[Selection], 
              /* clickEvent */ MouseEvent, 
              Unit
            ]
      ): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDisableSelection(value: Boolean): Self = StObject.set(x, "disableSelection", value.asInstanceOf[js.Any])
      
      inline def setDisableSelectionUndefined: Self = StObject.set(x, "disableSelection", js.undefined)
      
      inline def setDisabled(value: Boolean | (js.ThisFunction0[/* this */ default, Boolean | Unit])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHidden(value: Boolean | (js.ThisFunction0[/* this */ default, Boolean | Unit])): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIsCommand(value: Boolean): Self = StObject.set(x, "isCommand", value.asInstanceOf[js.Any])
      
      inline def setIsCommandUndefined: Self = StObject.set(x, "isCommand", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: String | (js.ThisFunction0[/* this */ default, String])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRenderer(
        value: js.ThisFunction6[
              /* this */ MenuItemConfig, 
              /* hot */ default, 
              /* wrapper */ HTMLElement, 
              /* row */ Double, 
              /* col */ Double, 
              /* prop */ Double | String, 
              /* itemValue */ String, 
              HTMLElement
            ]
      ): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setSubmenu(value: SubmenuConfig): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    }
  }
}
