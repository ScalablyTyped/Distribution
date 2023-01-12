package typings.handsontable

import typings.handsontable.anon.TypeofBasePlugin
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
import typings.handsontable.pluginsContextMenuContextMenuMod.PredefinedMenuItemKey
import typings.handsontable.pluginsContextMenuContextMenuMod.SeparatorObject
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
    extends typings.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "AutoRowSize")
  @js.native
  open class AutoRowSize protected ()
    extends typings.handsontable.pluginsAutoRowSizeMod.AutoRowSize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Autofill")
  @js.native
  open class Autofill protected ()
    extends typings.handsontable.pluginsAutofillMod.Autofill {
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
    extends typings.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "CollapsibleColumns")
  @js.native
  open class CollapsibleColumns protected ()
    extends typings.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ColumnSorting")
  @js.native
  open class ColumnSorting protected ()
    extends typings.handsontable.pluginsColumnSortingMod.ColumnSorting {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ColumnSummary")
  @js.native
  open class ColumnSummary protected ()
    extends typings.handsontable.pluginsColumnSummaryMod.ColumnSummary {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Comments")
  @js.native
  open class Comments protected ()
    extends typings.handsontable.pluginsCommentsMod.Comments {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ContextMenu")
  @js.native
  open class ContextMenu protected ()
    extends typings.handsontable.pluginsContextMenuMod.ContextMenu {
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
    extends typings.handsontable.pluginsCopyPasteMod.CopyPaste {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "CustomBorders")
  @js.native
  open class CustomBorders protected ()
    extends typings.handsontable.pluginsCustomBordersMod.CustomBorders {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "DragToScroll")
  @js.native
  open class DragToScroll protected ()
    extends typings.handsontable.pluginsDragToScrollMod.DragToScroll {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "DropdownMenu")
  @js.native
  open class DropdownMenu protected ()
    extends typings.handsontable.pluginsDropdownMenuMod.DropdownMenu {
    def this(hotInstance: default) = this()
  }
  /* static members */
  object DropdownMenu {
    
    @JSImport("handsontable/plugins", "DropdownMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("handsontable/plugins", "DropdownMenu.SEPARATOR")
    @js.native
    def SEPARATOR: typings.handsontable.pluginsDropdownMenuDropdownMenuMod.SeparatorObject = js.native
    inline def SEPARATOR_=(x: typings.handsontable.pluginsDropdownMenuDropdownMenuMod.SeparatorObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("handsontable/plugins", "ExportFile")
  @js.native
  open class ExportFile protected ()
    extends typings.handsontable.pluginsExportFileMod.ExportFile {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Filters")
  @js.native
  open class Filters protected ()
    extends typings.handsontable.pluginsFiltersMod.Filters {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Formulas")
  @js.native
  open class Formulas protected ()
    extends typings.handsontable.pluginsFormulasMod.Formulas {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "HiddenColumns")
  @js.native
  open class HiddenColumns protected ()
    extends typings.handsontable.pluginsHiddenColumnsMod.HiddenColumns {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "HiddenRows")
  @js.native
  open class HiddenRows protected ()
    extends typings.handsontable.pluginsHiddenRowsMod.HiddenRows {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualColumnFreeze")
  @js.native
  open class ManualColumnFreeze protected ()
    extends typings.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualColumnMove")
  @js.native
  open class ManualColumnMove protected ()
    extends typings.handsontable.pluginsManualColumnMoveMod.ManualColumnMove {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualColumnResize")
  @js.native
  open class ManualColumnResize protected ()
    extends typings.handsontable.pluginsManualColumnResizeMod.ManualColumnResize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualRowMove")
  @js.native
  open class ManualRowMove protected ()
    extends typings.handsontable.pluginsManualRowMoveMod.ManualRowMove {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualRowResize")
  @js.native
  open class ManualRowResize protected ()
    extends typings.handsontable.pluginsManualRowResizeMod.ManualRowResize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "MergeCells")
  @js.native
  open class MergeCells protected ()
    extends typings.handsontable.pluginsMergeCellsMod.MergeCells {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "MultiColumnSorting")
  @js.native
  open class MultiColumnSorting protected ()
    extends typings.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "MultipleSelectionHandles")
  @js.native
  open class MultipleSelectionHandles protected ()
    extends typings.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "NestedHeaders")
  @js.native
  open class NestedHeaders protected ()
    extends typings.handsontable.pluginsNestedHeadersMod.NestedHeaders {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "NestedRows")
  @js.native
  open class NestedRows protected ()
    extends typings.handsontable.pluginsNestedRowsMod.NestedRows {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "PersistentState")
  @js.native
  open class PersistentState protected ()
    extends typings.handsontable.pluginsPersistentStateMod.PersistentState {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Search")
  @js.native
  open class Search protected ()
    extends typings.handsontable.pluginsSearchMod.Search {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "TouchScroll")
  @js.native
  open class TouchScroll protected ()
    extends typings.handsontable.pluginsTouchScrollMod.TouchScroll {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "TrimRows")
  @js.native
  open class TrimRows protected ()
    extends typings.handsontable.pluginsTrimRowsMod.TrimRows {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "UndoRedo")
  @js.native
  open class UndoRedo protected ()
    extends typings.handsontable.pluginsUndoRedoMod.UndoRedo {
    def this(hotInstance: default) = this()
  }
  
  inline def getPlugin(pluginName: String): typings.handsontable.pluginsBaseMod.BasePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsBaseMod.BasePlugin]
  
  inline def getPlugin_autoColumnSize(pluginName: autoColumnSize): typings.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize]
  
  inline def getPlugin_autoRowSize(pluginName: autoRowSize): typings.handsontable.pluginsAutoRowSizeMod.AutoRowSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsAutoRowSizeMod.AutoRowSize]
  
  inline def getPlugin_autofill(pluginName: autofill): typings.handsontable.pluginsAutofillMod.Autofill = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsAutofillMod.Autofill]
  
  inline def getPlugin_basePlugin(pluginName: basePlugin): typings.handsontable.pluginsBaseMod.BasePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsBaseMod.BasePlugin]
  
  inline def getPlugin_bindRowsWithHeaders(pluginName: bindRowsWithHeaders): typings.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders]
  
  inline def getPlugin_collapsibleColumns(pluginName: collapsibleColumns): typings.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns]
  
  inline def getPlugin_columnSorting(pluginName: columnSorting): typings.handsontable.pluginsColumnSortingMod.ColumnSorting = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsColumnSortingMod.ColumnSorting]
  
  inline def getPlugin_columnSummary(pluginName: columnSummary): typings.handsontable.pluginsColumnSummaryMod.ColumnSummary = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsColumnSummaryMod.ColumnSummary]
  
  inline def getPlugin_comments(pluginName: comments): typings.handsontable.pluginsCommentsMod.Comments = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsCommentsMod.Comments]
  
  inline def getPlugin_contextMenu(pluginName: contextMenu): typings.handsontable.pluginsContextMenuMod.ContextMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsContextMenuMod.ContextMenu]
  
  inline def getPlugin_copyPaste(pluginName: copyPaste): typings.handsontable.pluginsCopyPasteMod.CopyPaste = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsCopyPasteMod.CopyPaste]
  
  inline def getPlugin_customBorders(pluginName: customBorders): typings.handsontable.pluginsCustomBordersMod.CustomBorders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsCustomBordersMod.CustomBorders]
  
  inline def getPlugin_dragToScroll(pluginName: dragToScroll): typings.handsontable.pluginsDragToScrollMod.DragToScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsDragToScrollMod.DragToScroll]
  
  inline def getPlugin_dropdownMenu(pluginName: dropdownMenu): typings.handsontable.pluginsDropdownMenuMod.DropdownMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsDropdownMenuMod.DropdownMenu]
  
  inline def getPlugin_exportFile(pluginName: exportFile): typings.handsontable.pluginsExportFileMod.ExportFile = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsExportFileMod.ExportFile]
  
  inline def getPlugin_filters(pluginName: filters): typings.handsontable.pluginsFiltersMod.Filters = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsFiltersMod.Filters]
  
  inline def getPlugin_formulas(pluginName: formulas): typings.handsontable.pluginsFormulasMod.Formulas = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsFormulasMod.Formulas]
  
  inline def getPlugin_hiddenColumns(pluginName: hiddenColumns): typings.handsontable.pluginsHiddenColumnsMod.HiddenColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsHiddenColumnsMod.HiddenColumns]
  
  inline def getPlugin_hiddenRows(pluginName: hiddenRows): typings.handsontable.pluginsHiddenRowsMod.HiddenRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsHiddenRowsMod.HiddenRows]
  
  inline def getPlugin_manualColumnFreeze(pluginName: manualColumnFreeze): typings.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze]
  
  inline def getPlugin_manualColumnMove(pluginName: manualColumnMove): typings.handsontable.pluginsManualColumnMoveMod.ManualColumnMove = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsManualColumnMoveMod.ManualColumnMove]
  
  inline def getPlugin_manualColumnResize(pluginName: manualColumnResize): typings.handsontable.pluginsManualColumnResizeMod.ManualColumnResize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsManualColumnResizeMod.ManualColumnResize]
  
  inline def getPlugin_manualRowMove(pluginName: manualRowMove): typings.handsontable.pluginsManualRowMoveMod.ManualRowMove = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsManualRowMoveMod.ManualRowMove]
  
  inline def getPlugin_manualRowResize(pluginName: manualRowResize): typings.handsontable.pluginsManualRowResizeMod.ManualRowResize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsManualRowResizeMod.ManualRowResize]
  
  inline def getPlugin_mergeCells(pluginName: mergeCells): typings.handsontable.pluginsMergeCellsMod.MergeCells = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsMergeCellsMod.MergeCells]
  
  inline def getPlugin_multiColumnSorting(pluginName: multiColumnSorting): typings.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting]
  
  inline def getPlugin_multipleSelectionHandles(pluginName: multipleSelectionHandles): typings.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles]
  
  inline def getPlugin_nestedHeaders(pluginName: nestedHeaders): typings.handsontable.pluginsNestedHeadersMod.NestedHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsNestedHeadersMod.NestedHeaders]
  
  inline def getPlugin_nestedRows(pluginName: nestedRows): typings.handsontable.pluginsNestedRowsMod.NestedRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsNestedRowsMod.NestedRows]
  
  inline def getPlugin_persistentState(pluginName: persistentState): typings.handsontable.pluginsPersistentStateMod.PersistentState = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsPersistentStateMod.PersistentState]
  
  inline def getPlugin_search(pluginName: search): typings.handsontable.pluginsSearchMod.Search = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsSearchMod.Search]
  
  inline def getPlugin_touchScroll(pluginName: touchScroll): typings.handsontable.pluginsTouchScrollMod.TouchScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsTouchScrollMod.TouchScroll]
  
  inline def getPlugin_trimRows(pluginName: trimRows): typings.handsontable.pluginsTrimRowsMod.TrimRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsTrimRowsMod.TrimRows]
  
  inline def getPlugin_undoRedo(pluginName: undoRedo): typings.handsontable.pluginsUndoRedoMod.UndoRedo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typings.handsontable.pluginsUndoRedoMod.UndoRedo]
  
  inline def getPluginsNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginsNames")().asInstanceOf[js.Array[String]]
  
  inline def registerAllPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllPlugins")().asInstanceOf[Unit]
  
  inline def registerPlugin(pluginClass: TypeofBasePlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerPlugin(pluginName: String, pluginClass: TypeofBasePlugin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginName.asInstanceOf[js.Any], pluginClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Plugins extends StObject {
    
    var autoColumnSize: typings.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize
    
    var autoRowSize: typings.handsontable.pluginsAutoRowSizeMod.AutoRowSize
    
    var autofill: typings.handsontable.pluginsAutofillMod.Autofill
    
    var basePlugin: typings.handsontable.pluginsBaseMod.BasePlugin
    
    var bindRowsWithHeaders: typings.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders
    
    var collapsibleColumns: typings.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns
    
    var columnSorting: typings.handsontable.pluginsColumnSortingMod.ColumnSorting
    
    var columnSummary: typings.handsontable.pluginsColumnSummaryMod.ColumnSummary
    
    var comments: typings.handsontable.pluginsCommentsMod.Comments
    
    var contextMenu: typings.handsontable.pluginsContextMenuMod.ContextMenu
    
    var copyPaste: typings.handsontable.pluginsCopyPasteMod.CopyPaste
    
    var customBorders: typings.handsontable.pluginsCustomBordersMod.CustomBorders
    
    var dragToScroll: typings.handsontable.pluginsDragToScrollMod.DragToScroll
    
    var dropdownMenu: typings.handsontable.pluginsDropdownMenuMod.DropdownMenu
    
    var exportFile: typings.handsontable.pluginsExportFileMod.ExportFile
    
    var filters: typings.handsontable.pluginsFiltersMod.Filters
    
    var formulas: typings.handsontable.pluginsFormulasMod.Formulas
    
    var hiddenColumns: typings.handsontable.pluginsHiddenColumnsMod.HiddenColumns
    
    var hiddenRows: typings.handsontable.pluginsHiddenRowsMod.HiddenRows
    
    var manualColumnFreeze: typings.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze
    
    var manualColumnMove: typings.handsontable.pluginsManualColumnMoveMod.ManualColumnMove
    
    var manualColumnResize: typings.handsontable.pluginsManualColumnResizeMod.ManualColumnResize
    
    var manualRowMove: typings.handsontable.pluginsManualRowMoveMod.ManualRowMove
    
    var manualRowResize: typings.handsontable.pluginsManualRowResizeMod.ManualRowResize
    
    var mergeCells: typings.handsontable.pluginsMergeCellsMod.MergeCells
    
    var multiColumnSorting: typings.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting
    
    var multipleSelectionHandles: typings.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles
    
    var nestedHeaders: typings.handsontable.pluginsNestedHeadersMod.NestedHeaders
    
    var nestedRows: typings.handsontable.pluginsNestedRowsMod.NestedRows
    
    var persistentState: typings.handsontable.pluginsPersistentStateMod.PersistentState
    
    var search: typings.handsontable.pluginsSearchMod.Search
    
    var touchScroll: typings.handsontable.pluginsTouchScrollMod.TouchScroll
    
    var trimRows: typings.handsontable.pluginsTrimRowsMod.TrimRows
    
    var undoRedo: typings.handsontable.pluginsUndoRedoMod.UndoRedo
  }
  object Plugins {
    
    inline def apply(
      autoColumnSize: typings.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize,
      autoRowSize: typings.handsontable.pluginsAutoRowSizeMod.AutoRowSize,
      autofill: typings.handsontable.pluginsAutofillMod.Autofill,
      basePlugin: typings.handsontable.pluginsBaseMod.BasePlugin,
      bindRowsWithHeaders: typings.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders,
      collapsibleColumns: typings.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns,
      columnSorting: typings.handsontable.pluginsColumnSortingMod.ColumnSorting,
      columnSummary: typings.handsontable.pluginsColumnSummaryMod.ColumnSummary,
      comments: typings.handsontable.pluginsCommentsMod.Comments,
      contextMenu: typings.handsontable.pluginsContextMenuMod.ContextMenu,
      copyPaste: typings.handsontable.pluginsCopyPasteMod.CopyPaste,
      customBorders: typings.handsontable.pluginsCustomBordersMod.CustomBorders,
      dragToScroll: typings.handsontable.pluginsDragToScrollMod.DragToScroll,
      dropdownMenu: typings.handsontable.pluginsDropdownMenuMod.DropdownMenu,
      exportFile: typings.handsontable.pluginsExportFileMod.ExportFile,
      filters: typings.handsontable.pluginsFiltersMod.Filters,
      formulas: typings.handsontable.pluginsFormulasMod.Formulas,
      hiddenColumns: typings.handsontable.pluginsHiddenColumnsMod.HiddenColumns,
      hiddenRows: typings.handsontable.pluginsHiddenRowsMod.HiddenRows,
      manualColumnFreeze: typings.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze,
      manualColumnMove: typings.handsontable.pluginsManualColumnMoveMod.ManualColumnMove,
      manualColumnResize: typings.handsontable.pluginsManualColumnResizeMod.ManualColumnResize,
      manualRowMove: typings.handsontable.pluginsManualRowMoveMod.ManualRowMove,
      manualRowResize: typings.handsontable.pluginsManualRowResizeMod.ManualRowResize,
      mergeCells: typings.handsontable.pluginsMergeCellsMod.MergeCells,
      multiColumnSorting: typings.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting,
      multipleSelectionHandles: typings.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles,
      nestedHeaders: typings.handsontable.pluginsNestedHeadersMod.NestedHeaders,
      nestedRows: typings.handsontable.pluginsNestedRowsMod.NestedRows,
      persistentState: typings.handsontable.pluginsPersistentStateMod.PersistentState,
      search: typings.handsontable.pluginsSearchMod.Search,
      touchScroll: typings.handsontable.pluginsTouchScrollMod.TouchScroll,
      trimRows: typings.handsontable.pluginsTrimRowsMod.TrimRows,
      undoRedo: typings.handsontable.pluginsUndoRedoMod.UndoRedo
    ): Plugins = {
      val __obj = js.Dynamic.literal(autoColumnSize = autoColumnSize.asInstanceOf[js.Any], autoRowSize = autoRowSize.asInstanceOf[js.Any], autofill = autofill.asInstanceOf[js.Any], basePlugin = basePlugin.asInstanceOf[js.Any], bindRowsWithHeaders = bindRowsWithHeaders.asInstanceOf[js.Any], collapsibleColumns = collapsibleColumns.asInstanceOf[js.Any], columnSorting = columnSorting.asInstanceOf[js.Any], columnSummary = columnSummary.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], copyPaste = copyPaste.asInstanceOf[js.Any], customBorders = customBorders.asInstanceOf[js.Any], dragToScroll = dragToScroll.asInstanceOf[js.Any], dropdownMenu = dropdownMenu.asInstanceOf[js.Any], exportFile = exportFile.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], formulas = formulas.asInstanceOf[js.Any], hiddenColumns = hiddenColumns.asInstanceOf[js.Any], hiddenRows = hiddenRows.asInstanceOf[js.Any], manualColumnFreeze = manualColumnFreeze.asInstanceOf[js.Any], manualColumnMove = manualColumnMove.asInstanceOf[js.Any], manualColumnResize = manualColumnResize.asInstanceOf[js.Any], manualRowMove = manualRowMove.asInstanceOf[js.Any], manualRowResize = manualRowResize.asInstanceOf[js.Any], mergeCells = mergeCells.asInstanceOf[js.Any], multiColumnSorting = multiColumnSorting.asInstanceOf[js.Any], multipleSelectionHandles = multipleSelectionHandles.asInstanceOf[js.Any], nestedHeaders = nestedHeaders.asInstanceOf[js.Any], nestedRows = nestedRows.asInstanceOf[js.Any], persistentState = persistentState.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], touchScroll = touchScroll.asInstanceOf[js.Any], trimRows = trimRows.asInstanceOf[js.Any], undoRedo = undoRedo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
      
      inline def setAutoColumnSize(value: typings.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize): Self = StObject.set(x, "autoColumnSize", value.asInstanceOf[js.Any])
      
      inline def setAutoRowSize(value: typings.handsontable.pluginsAutoRowSizeMod.AutoRowSize): Self = StObject.set(x, "autoRowSize", value.asInstanceOf[js.Any])
      
      inline def setAutofill(value: typings.handsontable.pluginsAutofillMod.Autofill): Self = StObject.set(x, "autofill", value.asInstanceOf[js.Any])
      
      inline def setBasePlugin(value: typings.handsontable.pluginsBaseMod.BasePlugin): Self = StObject.set(x, "basePlugin", value.asInstanceOf[js.Any])
      
      inline def setBindRowsWithHeaders(value: typings.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders): Self = StObject.set(x, "bindRowsWithHeaders", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleColumns(value: typings.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns): Self = StObject.set(x, "collapsibleColumns", value.asInstanceOf[js.Any])
      
      inline def setColumnSorting(value: typings.handsontable.pluginsColumnSortingMod.ColumnSorting): Self = StObject.set(x, "columnSorting", value.asInstanceOf[js.Any])
      
      inline def setColumnSummary(value: typings.handsontable.pluginsColumnSummaryMod.ColumnSummary): Self = StObject.set(x, "columnSummary", value.asInstanceOf[js.Any])
      
      inline def setComments(value: typings.handsontable.pluginsCommentsMod.Comments): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setContextMenu(value: typings.handsontable.pluginsContextMenuMod.ContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setCopyPaste(value: typings.handsontable.pluginsCopyPasteMod.CopyPaste): Self = StObject.set(x, "copyPaste", value.asInstanceOf[js.Any])
      
      inline def setCustomBorders(value: typings.handsontable.pluginsCustomBordersMod.CustomBorders): Self = StObject.set(x, "customBorders", value.asInstanceOf[js.Any])
      
      inline def setDragToScroll(value: typings.handsontable.pluginsDragToScrollMod.DragToScroll): Self = StObject.set(x, "dragToScroll", value.asInstanceOf[js.Any])
      
      inline def setDropdownMenu(value: typings.handsontable.pluginsDropdownMenuMod.DropdownMenu): Self = StObject.set(x, "dropdownMenu", value.asInstanceOf[js.Any])
      
      inline def setExportFile(value: typings.handsontable.pluginsExportFileMod.ExportFile): Self = StObject.set(x, "exportFile", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: typings.handsontable.pluginsFiltersMod.Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFormulas(value: typings.handsontable.pluginsFormulasMod.Formulas): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
      
      inline def setHiddenColumns(value: typings.handsontable.pluginsHiddenColumnsMod.HiddenColumns): Self = StObject.set(x, "hiddenColumns", value.asInstanceOf[js.Any])
      
      inline def setHiddenRows(value: typings.handsontable.pluginsHiddenRowsMod.HiddenRows): Self = StObject.set(x, "hiddenRows", value.asInstanceOf[js.Any])
      
      inline def setManualColumnFreeze(value: typings.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze): Self = StObject.set(x, "manualColumnFreeze", value.asInstanceOf[js.Any])
      
      inline def setManualColumnMove(value: typings.handsontable.pluginsManualColumnMoveMod.ManualColumnMove): Self = StObject.set(x, "manualColumnMove", value.asInstanceOf[js.Any])
      
      inline def setManualColumnResize(value: typings.handsontable.pluginsManualColumnResizeMod.ManualColumnResize): Self = StObject.set(x, "manualColumnResize", value.asInstanceOf[js.Any])
      
      inline def setManualRowMove(value: typings.handsontable.pluginsManualRowMoveMod.ManualRowMove): Self = StObject.set(x, "manualRowMove", value.asInstanceOf[js.Any])
      
      inline def setManualRowResize(value: typings.handsontable.pluginsManualRowResizeMod.ManualRowResize): Self = StObject.set(x, "manualRowResize", value.asInstanceOf[js.Any])
      
      inline def setMergeCells(value: typings.handsontable.pluginsMergeCellsMod.MergeCells): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
      
      inline def setMultiColumnSorting(value: typings.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting): Self = StObject.set(x, "multiColumnSorting", value.asInstanceOf[js.Any])
      
      inline def setMultipleSelectionHandles(value: typings.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles): Self = StObject.set(x, "multipleSelectionHandles", value.asInstanceOf[js.Any])
      
      inline def setNestedHeaders(value: typings.handsontable.pluginsNestedHeadersMod.NestedHeaders): Self = StObject.set(x, "nestedHeaders", value.asInstanceOf[js.Any])
      
      inline def setNestedRows(value: typings.handsontable.pluginsNestedRowsMod.NestedRows): Self = StObject.set(x, "nestedRows", value.asInstanceOf[js.Any])
      
      inline def setPersistentState(value: typings.handsontable.pluginsPersistentStateMod.PersistentState): Self = StObject.set(x, "persistentState", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: typings.handsontable.pluginsSearchMod.Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setTouchScroll(value: typings.handsontable.pluginsTouchScrollMod.TouchScroll): Self = StObject.set(x, "touchScroll", value.asInstanceOf[js.Any])
      
      inline def setTrimRows(value: typings.handsontable.pluginsTrimRowsMod.TrimRows): Self = StObject.set(x, "trimRows", value.asInstanceOf[js.Any])
      
      inline def setUndoRedo(value: typings.handsontable.pluginsUndoRedoMod.UndoRedo): Self = StObject.set(x, "undoRedo", value.asInstanceOf[js.Any])
    }
  }
}
