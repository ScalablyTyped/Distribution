package typings.handsontable

import typings.handsontable.anon.TypeofBasePlugin
import typings.handsontable.contextMenuContextMenuMod.PredefinedMenuItemKey
import typings.handsontable.contextMenuContextMenuMod.SeparatorObject
import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.autoColumnSize
import typings.handsontable.handsontableStrings.autoRowSize
import typings.handsontable.handsontableStrings.autofill
import typings.handsontable.handsontableStrings.basePlugin
import typings.handsontable.handsontableStrings.bindRowsWithHeaders
import typings.handsontable.handsontableStrings.collapsibleColumns
import typings.handsontable.handsontableStrings.columnSorting
import typings.handsontable.handsontableStrings.columnSummary
import typings.handsontable.handsontableStrings.comments
import typings.handsontable.handsontableStrings.contextMenu
import typings.handsontable.handsontableStrings.copyPaste
import typings.handsontable.handsontableStrings.customBorders
import typings.handsontable.handsontableStrings.dragToScroll
import typings.handsontable.handsontableStrings.dropdownMenu
import typings.handsontable.handsontableStrings.exportFile
import typings.handsontable.handsontableStrings.filters
import typings.handsontable.handsontableStrings.formulas
import typings.handsontable.handsontableStrings.hiddenColumns
import typings.handsontable.handsontableStrings.hiddenRows
import typings.handsontable.handsontableStrings.manualColumnFreeze
import typings.handsontable.handsontableStrings.manualColumnMove
import typings.handsontable.handsontableStrings.manualColumnResize
import typings.handsontable.handsontableStrings.manualRowMove
import typings.handsontable.handsontableStrings.manualRowResize
import typings.handsontable.handsontableStrings.mergeCells
import typings.handsontable.handsontableStrings.multiColumnSorting
import typings.handsontable.handsontableStrings.multipleSelectionHandles
import typings.handsontable.handsontableStrings.nestedHeaders
import typings.handsontable.handsontableStrings.nestedRows
import typings.handsontable.handsontableStrings.persistentState
import typings.handsontable.handsontableStrings.search
import typings.handsontable.handsontableStrings.touchScroll
import typings.handsontable.handsontableStrings.trimRows
import typings.handsontable.handsontableStrings.undoRedo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("handsontable/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/plugins", "AutoColumnSize")
  @js.native
  open class AutoColumnSize protected ()
    extends typings.handsontable.autoColumnSizeMod.AutoColumnSize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "AutoRowSize")
  @js.native
  open class AutoRowSize protected ()
    extends typings.handsontable.autoRowSizeMod.AutoRowSize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Autofill")
  @js.native
  open class Autofill protected ()
    extends typings.handsontable.autofillMod.Autofill {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "BasePlugin")
  @js.native
  open class BasePlugin protected ()
    extends typings.handsontable.pluginsBaseMod.BasePlugin {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "BindRowsWithHeaders")
  @js.native
  open class BindRowsWithHeaders protected ()
    extends typings.handsontable.bindRowsWithHeadersMod.BindRowsWithHeaders {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "CollapsibleColumns")
  @js.native
  open class CollapsibleColumns protected ()
    extends typings.handsontable.collapsibleColumnsMod.CollapsibleColumns {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ColumnSorting")
  @js.native
  open class ColumnSorting protected ()
    extends typings.handsontable.columnSortingMod.ColumnSorting {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ColumnSummary")
  @js.native
  open class ColumnSummary protected ()
    extends typings.handsontable.columnSummaryMod.ColumnSummary {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Comments")
  @js.native
  open class Comments protected ()
    extends typings.handsontable.commentsMod.Comments {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ContextMenu")
  @js.native
  open class ContextMenu protected ()
    extends typings.handsontable.contextMenuMod.ContextMenu {
    def this(hotInstance: default) = this()
  }
  /* static members */
  object ContextMenu {
    
    @JSImport("handsontable/plugins", "ContextMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("handsontable/plugins", "ContextMenu.DEFAULT_ITEMS")
    @js.native
    def DEFAULT_ITEMS: js.Array[PredefinedMenuItemKey] = js.native
    inline def DEFAULT_ITEMS_=(x: js.Array[PredefinedMenuItemKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ITEMS")(x.asInstanceOf[js.Any])
    
    @JSImport("handsontable/plugins", "ContextMenu.SEPARATOR")
    @js.native
    def SEPARATOR: SeparatorObject = js.native
    inline def SEPARATOR_=(x: SeparatorObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("handsontable/plugins", "CopyPaste")
  @js.native
  open class CopyPaste protected ()
    extends typings.handsontable.copyPasteMod.CopyPaste {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "CustomBorders")
  @js.native
  open class CustomBorders protected ()
    extends typings.handsontable.customBordersMod.CustomBorders {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "DragToScroll")
  @js.native
  open class DragToScroll protected ()
    extends typings.handsontable.dragToScrollMod.DragToScroll {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "DropdownMenu")
  @js.native
  open class DropdownMenu protected ()
    extends typings.handsontable.dropdownMenuMod.DropdownMenu {
    def this(hotInstance: default) = this()
  }
  /* static members */
  object DropdownMenu {
    
    @JSImport("handsontable/plugins", "DropdownMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("handsontable/plugins", "DropdownMenu.SEPARATOR")
    @js.native
    def SEPARATOR: typings.handsontable.dropdownMenuDropdownMenuMod.SeparatorObject = js.native
    inline def SEPARATOR_=(x: typings.handsontable.dropdownMenuDropdownMenuMod.SeparatorObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("handsontable/plugins", "ExportFile")
  @js.native
  open class ExportFile protected ()
    extends typings.handsontable.exportFileMod.ExportFile {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Filters")
  @js.native
  open class Filters protected ()
    extends typings.handsontable.filtersMod.Filters {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Formulas")
  @js.native
  open class Formulas protected ()
    extends typings.handsontable.formulasMod.Formulas {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "HiddenColumns")
  @js.native
  open class HiddenColumns protected ()
    extends typings.handsontable.hiddenColumnsMod.HiddenColumns {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "HiddenRows")
  @js.native
  open class HiddenRows protected ()
    extends typings.handsontable.hiddenRowsMod.HiddenRows {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualColumnFreeze")
  @js.native
  open class ManualColumnFreeze protected ()
    extends typings.handsontable.manualColumnFreezeMod.ManualColumnFreeze {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualColumnMove")
  @js.native
  open class ManualColumnMove protected ()
    extends typings.handsontable.manualColumnMoveMod.ManualColumnMove {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualColumnResize")
  @js.native
  open class ManualColumnResize protected ()
    extends typings.handsontable.manualColumnResizeMod.ManualColumnResize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualRowMove")
  @js.native
  open class ManualRowMove protected ()
    extends typings.handsontable.manualRowMoveMod.ManualRowMove {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualRowResize")
  @js.native
  open class ManualRowResize protected ()
    extends typings.handsontable.manualRowResizeMod.ManualRowResize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "MergeCells")
  @js.native
  open class MergeCells protected ()
    extends typings.handsontable.mergeCellsMod.MergeCells {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "MultiColumnSorting")
  @js.native
  open class MultiColumnSorting protected ()
    extends typings.handsontable.multiColumnSortingMod.MultiColumnSorting {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "MultipleSelectionHandles")
  @js.native
  open class MultipleSelectionHandles protected ()
    extends typings.handsontable.multipleSelectionHandlesMod.MultipleSelectionHandles {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "NestedHeaders")
  @js.native
  open class NestedHeaders protected ()
    extends typings.handsontable.nestedHeadersMod.NestedHeaders {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "NestedRows")
  @js.native
  open class NestedRows protected ()
    extends typings.handsontable.nestedRowsMod.NestedRows {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "PersistentState")
  @js.native
  open class PersistentState protected ()
    extends typings.handsontable.persistentStateMod.PersistentState {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Search")
  @js.native
  open class Search protected ()
    extends typings.handsontable.searchMod.Search {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "TouchScroll")
  @js.native
  open class TouchScroll protected ()
    extends typings.handsontable.touchScrollMod.TouchScroll {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "TrimRows")
  @js.native
  open class TrimRows protected ()
    extends typings.handsontable.trimRowsMod.TrimRows {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "UndoRedo")
  @js.native
  open class UndoRedo protected ()
    extends typings.handsontable.undoRedoMod.UndoRedo {
    def this(hotInstance: default) = this()
  }
  
  inline def getPlugin(pluginName: String): typings.handsontable.pluginsBaseMod.BasePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsBaseMod.BasePlugin]
  
  inline def getPlugin_autoColumnSize(pluginName: autoColumnSize): typings.handsontable.autoColumnSizeMod.AutoColumnSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.autoColumnSizeMod.AutoColumnSize]
  
  inline def getPlugin_autoRowSize(pluginName: autoRowSize): typings.handsontable.autoRowSizeMod.AutoRowSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.autoRowSizeMod.AutoRowSize]
  
  inline def getPlugin_autofill(pluginName: autofill): typings.handsontable.autofillMod.Autofill = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.autofillMod.Autofill]
  
  inline def getPlugin_basePlugin(pluginName: basePlugin): typings.handsontable.pluginsBaseMod.BasePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsBaseMod.BasePlugin]
  
  inline def getPlugin_bindRowsWithHeaders(pluginName: bindRowsWithHeaders): typings.handsontable.bindRowsWithHeadersMod.BindRowsWithHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.bindRowsWithHeadersMod.BindRowsWithHeaders]
  
  inline def getPlugin_collapsibleColumns(pluginName: collapsibleColumns): typings.handsontable.collapsibleColumnsMod.CollapsibleColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.collapsibleColumnsMod.CollapsibleColumns]
  
  inline def getPlugin_columnSorting(pluginName: columnSorting): typings.handsontable.columnSortingMod.ColumnSorting = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.columnSortingMod.ColumnSorting]
  
  inline def getPlugin_columnSummary(pluginName: columnSummary): typings.handsontable.columnSummaryMod.ColumnSummary = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.columnSummaryMod.ColumnSummary]
  
  inline def getPlugin_comments(pluginName: comments): typings.handsontable.commentsMod.Comments = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.commentsMod.Comments]
  
  inline def getPlugin_contextMenu(pluginName: contextMenu): typings.handsontable.contextMenuMod.ContextMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.contextMenuMod.ContextMenu]
  
  inline def getPlugin_copyPaste(pluginName: copyPaste): typings.handsontable.copyPasteMod.CopyPaste = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.copyPasteMod.CopyPaste]
  
  inline def getPlugin_customBorders(pluginName: customBorders): typings.handsontable.customBordersMod.CustomBorders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.customBordersMod.CustomBorders]
  
  inline def getPlugin_dragToScroll(pluginName: dragToScroll): typings.handsontable.dragToScrollMod.DragToScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.dragToScrollMod.DragToScroll]
  
  inline def getPlugin_dropdownMenu(pluginName: dropdownMenu): typings.handsontable.dropdownMenuMod.DropdownMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.dropdownMenuMod.DropdownMenu]
  
  inline def getPlugin_exportFile(pluginName: exportFile): typings.handsontable.exportFileMod.ExportFile = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.exportFileMod.ExportFile]
  
  inline def getPlugin_filters(pluginName: filters): typings.handsontable.filtersMod.Filters = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.filtersMod.Filters]
  
  inline def getPlugin_formulas(pluginName: formulas): typings.handsontable.formulasMod.Formulas = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.formulasMod.Formulas]
  
  inline def getPlugin_hiddenColumns(pluginName: hiddenColumns): typings.handsontable.hiddenColumnsMod.HiddenColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.hiddenColumnsMod.HiddenColumns]
  
  inline def getPlugin_hiddenRows(pluginName: hiddenRows): typings.handsontable.hiddenRowsMod.HiddenRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.hiddenRowsMod.HiddenRows]
  
  inline def getPlugin_manualColumnFreeze(pluginName: manualColumnFreeze): typings.handsontable.manualColumnFreezeMod.ManualColumnFreeze = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.manualColumnFreezeMod.ManualColumnFreeze]
  
  inline def getPlugin_manualColumnMove(pluginName: manualColumnMove): typings.handsontable.manualColumnMoveMod.ManualColumnMove = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.manualColumnMoveMod.ManualColumnMove]
  
  inline def getPlugin_manualColumnResize(pluginName: manualColumnResize): typings.handsontable.manualColumnResizeMod.ManualColumnResize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.manualColumnResizeMod.ManualColumnResize]
  
  inline def getPlugin_manualRowMove(pluginName: manualRowMove): typings.handsontable.manualRowMoveMod.ManualRowMove = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.manualRowMoveMod.ManualRowMove]
  
  inline def getPlugin_manualRowResize(pluginName: manualRowResize): typings.handsontable.manualRowResizeMod.ManualRowResize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.manualRowResizeMod.ManualRowResize]
  
  inline def getPlugin_mergeCells(pluginName: mergeCells): typings.handsontable.mergeCellsMod.MergeCells = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.mergeCellsMod.MergeCells]
  
  inline def getPlugin_multiColumnSorting(pluginName: multiColumnSorting): typings.handsontable.multiColumnSortingMod.MultiColumnSorting = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.multiColumnSortingMod.MultiColumnSorting]
  
  inline def getPlugin_multipleSelectionHandles(pluginName: multipleSelectionHandles): typings.handsontable.multipleSelectionHandlesMod.MultipleSelectionHandles = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.multipleSelectionHandlesMod.MultipleSelectionHandles]
  
  inline def getPlugin_nestedHeaders(pluginName: nestedHeaders): typings.handsontable.nestedHeadersMod.NestedHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.nestedHeadersMod.NestedHeaders]
  
  inline def getPlugin_nestedRows(pluginName: nestedRows): typings.handsontable.nestedRowsMod.NestedRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.nestedRowsMod.NestedRows]
  
  inline def getPlugin_persistentState(pluginName: persistentState): typings.handsontable.persistentStateMod.PersistentState = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.persistentStateMod.PersistentState]
  
  inline def getPlugin_search(pluginName: search): typings.handsontable.searchMod.Search = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.searchMod.Search]
  
  inline def getPlugin_touchScroll(pluginName: touchScroll): typings.handsontable.touchScrollMod.TouchScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.touchScrollMod.TouchScroll]
  
  inline def getPlugin_trimRows(pluginName: trimRows): typings.handsontable.trimRowsMod.TrimRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.trimRowsMod.TrimRows]
  
  inline def getPlugin_undoRedo(pluginName: undoRedo): typings.handsontable.undoRedoMod.UndoRedo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.undoRedoMod.UndoRedo]
  
  inline def getPluginsNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginsNames")().asInstanceOf[js.Array[String]]
  
  inline def registerAllPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllPlugins")().asInstanceOf[Unit]
  
  inline def registerPlugin(pluginClass: TypeofBasePlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerPlugin(pluginName: String, pluginClass: TypeofBasePlugin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginName.asInstanceOf[js.Any], pluginClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Plugins extends StObject {
    
    var autoColumnSize: typings.handsontable.autoColumnSizeMod.AutoColumnSize
    
    var autoRowSize: typings.handsontable.autoRowSizeMod.AutoRowSize
    
    var autofill: typings.handsontable.autofillMod.Autofill
    
    var basePlugin: typings.handsontable.pluginsBaseMod.BasePlugin
    
    var bindRowsWithHeaders: typings.handsontable.bindRowsWithHeadersMod.BindRowsWithHeaders
    
    var collapsibleColumns: typings.handsontable.collapsibleColumnsMod.CollapsibleColumns
    
    var columnSorting: typings.handsontable.columnSortingMod.ColumnSorting
    
    var columnSummary: typings.handsontable.columnSummaryMod.ColumnSummary
    
    var comments: typings.handsontable.commentsMod.Comments
    
    var contextMenu: typings.handsontable.contextMenuMod.ContextMenu
    
    var copyPaste: typings.handsontable.copyPasteMod.CopyPaste
    
    var customBorders: typings.handsontable.customBordersMod.CustomBorders
    
    var dragToScroll: typings.handsontable.dragToScrollMod.DragToScroll
    
    var dropdownMenu: typings.handsontable.dropdownMenuMod.DropdownMenu
    
    var exportFile: typings.handsontable.exportFileMod.ExportFile
    
    var filters: typings.handsontable.filtersMod.Filters
    
    var formulas: typings.handsontable.formulasMod.Formulas
    
    var hiddenColumns: typings.handsontable.hiddenColumnsMod.HiddenColumns
    
    var hiddenRows: typings.handsontable.hiddenRowsMod.HiddenRows
    
    var manualColumnFreeze: typings.handsontable.manualColumnFreezeMod.ManualColumnFreeze
    
    var manualColumnMove: typings.handsontable.manualColumnMoveMod.ManualColumnMove
    
    var manualColumnResize: typings.handsontable.manualColumnResizeMod.ManualColumnResize
    
    var manualRowMove: typings.handsontable.manualRowMoveMod.ManualRowMove
    
    var manualRowResize: typings.handsontable.manualRowResizeMod.ManualRowResize
    
    var mergeCells: typings.handsontable.mergeCellsMod.MergeCells
    
    var multiColumnSorting: typings.handsontable.multiColumnSortingMod.MultiColumnSorting
    
    var multipleSelectionHandles: typings.handsontable.multipleSelectionHandlesMod.MultipleSelectionHandles
    
    var nestedHeaders: typings.handsontable.nestedHeadersMod.NestedHeaders
    
    var nestedRows: typings.handsontable.nestedRowsMod.NestedRows
    
    var persistentState: typings.handsontable.persistentStateMod.PersistentState
    
    var search: typings.handsontable.searchMod.Search
    
    var touchScroll: typings.handsontable.touchScrollMod.TouchScroll
    
    var trimRows: typings.handsontable.trimRowsMod.TrimRows
    
    var undoRedo: typings.handsontable.undoRedoMod.UndoRedo
  }
  object Plugins {
    
    inline def apply(
      autoColumnSize: typings.handsontable.autoColumnSizeMod.AutoColumnSize,
      autoRowSize: typings.handsontable.autoRowSizeMod.AutoRowSize,
      autofill: typings.handsontable.autofillMod.Autofill,
      basePlugin: typings.handsontable.pluginsBaseMod.BasePlugin,
      bindRowsWithHeaders: typings.handsontable.bindRowsWithHeadersMod.BindRowsWithHeaders,
      collapsibleColumns: typings.handsontable.collapsibleColumnsMod.CollapsibleColumns,
      columnSorting: typings.handsontable.columnSortingMod.ColumnSorting,
      columnSummary: typings.handsontable.columnSummaryMod.ColumnSummary,
      comments: typings.handsontable.commentsMod.Comments,
      contextMenu: typings.handsontable.contextMenuMod.ContextMenu,
      copyPaste: typings.handsontable.copyPasteMod.CopyPaste,
      customBorders: typings.handsontable.customBordersMod.CustomBorders,
      dragToScroll: typings.handsontable.dragToScrollMod.DragToScroll,
      dropdownMenu: typings.handsontable.dropdownMenuMod.DropdownMenu,
      exportFile: typings.handsontable.exportFileMod.ExportFile,
      filters: typings.handsontable.filtersMod.Filters,
      formulas: typings.handsontable.formulasMod.Formulas,
      hiddenColumns: typings.handsontable.hiddenColumnsMod.HiddenColumns,
      hiddenRows: typings.handsontable.hiddenRowsMod.HiddenRows,
      manualColumnFreeze: typings.handsontable.manualColumnFreezeMod.ManualColumnFreeze,
      manualColumnMove: typings.handsontable.manualColumnMoveMod.ManualColumnMove,
      manualColumnResize: typings.handsontable.manualColumnResizeMod.ManualColumnResize,
      manualRowMove: typings.handsontable.manualRowMoveMod.ManualRowMove,
      manualRowResize: typings.handsontable.manualRowResizeMod.ManualRowResize,
      mergeCells: typings.handsontable.mergeCellsMod.MergeCells,
      multiColumnSorting: typings.handsontable.multiColumnSortingMod.MultiColumnSorting,
      multipleSelectionHandles: typings.handsontable.multipleSelectionHandlesMod.MultipleSelectionHandles,
      nestedHeaders: typings.handsontable.nestedHeadersMod.NestedHeaders,
      nestedRows: typings.handsontable.nestedRowsMod.NestedRows,
      persistentState: typings.handsontable.persistentStateMod.PersistentState,
      search: typings.handsontable.searchMod.Search,
      touchScroll: typings.handsontable.touchScrollMod.TouchScroll,
      trimRows: typings.handsontable.trimRowsMod.TrimRows,
      undoRedo: typings.handsontable.undoRedoMod.UndoRedo
    ): Plugins = {
      val __obj = js.Dynamic.literal(autoColumnSize = autoColumnSize.asInstanceOf[js.Any], autoRowSize = autoRowSize.asInstanceOf[js.Any], autofill = autofill.asInstanceOf[js.Any], basePlugin = basePlugin.asInstanceOf[js.Any], bindRowsWithHeaders = bindRowsWithHeaders.asInstanceOf[js.Any], collapsibleColumns = collapsibleColumns.asInstanceOf[js.Any], columnSorting = columnSorting.asInstanceOf[js.Any], columnSummary = columnSummary.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], copyPaste = copyPaste.asInstanceOf[js.Any], customBorders = customBorders.asInstanceOf[js.Any], dragToScroll = dragToScroll.asInstanceOf[js.Any], dropdownMenu = dropdownMenu.asInstanceOf[js.Any], exportFile = exportFile.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], formulas = formulas.asInstanceOf[js.Any], hiddenColumns = hiddenColumns.asInstanceOf[js.Any], hiddenRows = hiddenRows.asInstanceOf[js.Any], manualColumnFreeze = manualColumnFreeze.asInstanceOf[js.Any], manualColumnMove = manualColumnMove.asInstanceOf[js.Any], manualColumnResize = manualColumnResize.asInstanceOf[js.Any], manualRowMove = manualRowMove.asInstanceOf[js.Any], manualRowResize = manualRowResize.asInstanceOf[js.Any], mergeCells = mergeCells.asInstanceOf[js.Any], multiColumnSorting = multiColumnSorting.asInstanceOf[js.Any], multipleSelectionHandles = multipleSelectionHandles.asInstanceOf[js.Any], nestedHeaders = nestedHeaders.asInstanceOf[js.Any], nestedRows = nestedRows.asInstanceOf[js.Any], persistentState = persistentState.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], touchScroll = touchScroll.asInstanceOf[js.Any], trimRows = trimRows.asInstanceOf[js.Any], undoRedo = undoRedo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setAutoColumnSize(value: typings.handsontable.autoColumnSizeMod.AutoColumnSize): Self = StObject.set(x, "autoColumnSize", value.asInstanceOf[js.Any])
      
      inline def setAutoRowSize(value: typings.handsontable.autoRowSizeMod.AutoRowSize): Self = StObject.set(x, "autoRowSize", value.asInstanceOf[js.Any])
      
      inline def setAutofill(value: typings.handsontable.autofillMod.Autofill): Self = StObject.set(x, "autofill", value.asInstanceOf[js.Any])
      
      inline def setBasePlugin(value: typings.handsontable.pluginsBaseMod.BasePlugin): Self = StObject.set(x, "basePlugin", value.asInstanceOf[js.Any])
      
      inline def setBindRowsWithHeaders(value: typings.handsontable.bindRowsWithHeadersMod.BindRowsWithHeaders): Self = StObject.set(x, "bindRowsWithHeaders", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleColumns(value: typings.handsontable.collapsibleColumnsMod.CollapsibleColumns): Self = StObject.set(x, "collapsibleColumns", value.asInstanceOf[js.Any])
      
      inline def setColumnSorting(value: typings.handsontable.columnSortingMod.ColumnSorting): Self = StObject.set(x, "columnSorting", value.asInstanceOf[js.Any])
      
      inline def setColumnSummary(value: typings.handsontable.columnSummaryMod.ColumnSummary): Self = StObject.set(x, "columnSummary", value.asInstanceOf[js.Any])
      
      inline def setComments(value: typings.handsontable.commentsMod.Comments): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setContextMenu(value: typings.handsontable.contextMenuMod.ContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setCopyPaste(value: typings.handsontable.copyPasteMod.CopyPaste): Self = StObject.set(x, "copyPaste", value.asInstanceOf[js.Any])
      
      inline def setCustomBorders(value: typings.handsontable.customBordersMod.CustomBorders): Self = StObject.set(x, "customBorders", value.asInstanceOf[js.Any])
      
      inline def setDragToScroll(value: typings.handsontable.dragToScrollMod.DragToScroll): Self = StObject.set(x, "dragToScroll", value.asInstanceOf[js.Any])
      
      inline def setDropdownMenu(value: typings.handsontable.dropdownMenuMod.DropdownMenu): Self = StObject.set(x, "dropdownMenu", value.asInstanceOf[js.Any])
      
      inline def setExportFile(value: typings.handsontable.exportFileMod.ExportFile): Self = StObject.set(x, "exportFile", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: typings.handsontable.filtersMod.Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFormulas(value: typings.handsontable.formulasMod.Formulas): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
      
      inline def setHiddenColumns(value: typings.handsontable.hiddenColumnsMod.HiddenColumns): Self = StObject.set(x, "hiddenColumns", value.asInstanceOf[js.Any])
      
      inline def setHiddenRows(value: typings.handsontable.hiddenRowsMod.HiddenRows): Self = StObject.set(x, "hiddenRows", value.asInstanceOf[js.Any])
      
      inline def setManualColumnFreeze(value: typings.handsontable.manualColumnFreezeMod.ManualColumnFreeze): Self = StObject.set(x, "manualColumnFreeze", value.asInstanceOf[js.Any])
      
      inline def setManualColumnMove(value: typings.handsontable.manualColumnMoveMod.ManualColumnMove): Self = StObject.set(x, "manualColumnMove", value.asInstanceOf[js.Any])
      
      inline def setManualColumnResize(value: typings.handsontable.manualColumnResizeMod.ManualColumnResize): Self = StObject.set(x, "manualColumnResize", value.asInstanceOf[js.Any])
      
      inline def setManualRowMove(value: typings.handsontable.manualRowMoveMod.ManualRowMove): Self = StObject.set(x, "manualRowMove", value.asInstanceOf[js.Any])
      
      inline def setManualRowResize(value: typings.handsontable.manualRowResizeMod.ManualRowResize): Self = StObject.set(x, "manualRowResize", value.asInstanceOf[js.Any])
      
      inline def setMergeCells(value: typings.handsontable.mergeCellsMod.MergeCells): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
      
      inline def setMultiColumnSorting(value: typings.handsontable.multiColumnSortingMod.MultiColumnSorting): Self = StObject.set(x, "multiColumnSorting", value.asInstanceOf[js.Any])
      
      inline def setMultipleSelectionHandles(value: typings.handsontable.multipleSelectionHandlesMod.MultipleSelectionHandles): Self = StObject.set(x, "multipleSelectionHandles", value.asInstanceOf[js.Any])
      
      inline def setNestedHeaders(value: typings.handsontable.nestedHeadersMod.NestedHeaders): Self = StObject.set(x, "nestedHeaders", value.asInstanceOf[js.Any])
      
      inline def setNestedRows(value: typings.handsontable.nestedRowsMod.NestedRows): Self = StObject.set(x, "nestedRows", value.asInstanceOf[js.Any])
      
      inline def setPersistentState(value: typings.handsontable.persistentStateMod.PersistentState): Self = StObject.set(x, "persistentState", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: typings.handsontable.searchMod.Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setTouchScroll(value: typings.handsontable.touchScrollMod.TouchScroll): Self = StObject.set(x, "touchScroll", value.asInstanceOf[js.Any])
      
      inline def setTrimRows(value: typings.handsontable.trimRowsMod.TrimRows): Self = StObject.set(x, "trimRows", value.asInstanceOf[js.Any])
      
      inline def setUndoRedo(value: typings.handsontable.undoRedoMod.UndoRedo): Self = StObject.set(x, "undoRedo", value.asInstanceOf[js.Any])
    }
  }
}
