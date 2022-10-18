package typings.luminoDatagrid

import typings.luminoDatagrid.luminoDatagridStrings.column
import typings.luminoDatagrid.luminoDatagridStrings.row
import typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.SelectData
import typings.luminoDatagrid.typesBasicmousehandlerMod.ResizeHandle
import typings.luminoDatagrid.typesCellrendererMod.CellRenderer.CellConfig
import typings.luminoDatagrid.typesCellrendererMod.CellRenderer.ConfigOption
import typings.luminoDatagrid.typesDatagridMod.DataGrid.CopyConfig
import typings.luminoDatagrid.typesDatagridMod.DataGrid.CopyFormatArgs
import typings.luminoDatagrid.typesDatagridMod.DataGrid.DefaultSizes_
import typings.luminoDatagrid.typesDatagridMod.DataGrid.HitTestResult
import typings.luminoDatagrid.typesDatagridMod.DataGrid.MinimumSizes_
import typings.luminoDatagrid.typesDatagridMod.DataGrid.Style
import typings.luminoDatagrid.typesDatamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.typesDatamodelMod.DataModel.Metadata
import typings.luminoDatagrid.typesRenderermapMod.RendererMap.Values
import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel.IOptions
import typings.luminoDatagrid.typesTextrendererMod.TextRenderer.FormatFunc
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/datagrid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lumino/datagrid", "BasicKeyHandler")
  @js.native
  open class BasicKeyHandler ()
    extends typings.luminoDatagrid.typesBasickeyhandlerMod.BasicKeyHandler
  
  @JSImport("@lumino/datagrid", "BasicMouseHandler")
  @js.native
  open class BasicMouseHandler ()
    extends typings.luminoDatagrid.typesBasicmousehandlerMod.BasicMouseHandler
  
  @JSImport("@lumino/datagrid", "BasicSelectionModel")
  @js.native
  open class BasicSelectionModel protected ()
    extends typings.luminoDatagrid.typesBasicselectionmodelMod.BasicSelectionModel {
    /**
      * Construct a new selection model.
      *
      * @param options - The options for initializing the model.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@lumino/datagrid", "BooleanCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class BooleanCellEditor ()
    extends typings.luminoDatagrid.typesCelleditorMod.BooleanCellEditor
  
  /* note: abstract class */ @JSImport("@lumino/datagrid", "CellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class CellEditor ()
    extends typings.luminoDatagrid.typesCelleditorMod.CellEditor
  
  @JSImport("@lumino/datagrid", "CellEditorController")
  @js.native
  open class CellEditorController ()
    extends typings.luminoDatagrid.typesCelleditorcontrollerMod.CellEditorController
  
  object CellGroup {
    
    @JSImport("@lumino/datagrid", "CellGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks if cell-groups are intersecting.
      * @param group1
      * @param group2
      */
    inline def areCellGroupsIntersecting(
      group1: typings.luminoDatagrid.typesCellgroupMod.CellGroup,
      group2: typings.luminoDatagrid.typesCellgroupMod.CellGroup
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCellGroupsIntersecting")(group1.asInstanceOf[js.Any], group2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if two cell-groups are intersecting
      * in the given axis.
      * @param group1
      * @param group2
      * @param axis
      */
    inline def areCellGroupsIntersectingAtAxis(
      group1: typings.luminoDatagrid.typesCellgroupMod.CellGroup,
      group2: typings.luminoDatagrid.typesCellgroupMod.CellGroup,
      axis: row | column
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCellGroupsIntersectingAtAxis")(group1.asInstanceOf[js.Any], group2.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def areCellsMerged(
      dataModel: typings.luminoDatagrid.typesDatamodelMod.DataModel,
      rgn: CellRegion,
      cell1: js.Array[Double],
      cell2: js.Array[Double]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCellsMerged")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any], cell1.asInstanceOf[js.Any], cell2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Calculates the cell boundary offsets needed for
      * a row or column at the given index by taking
      * into account merged cell groups in the region.
      * @param dataModel
      * @param regions
      * @param axis
      * @param sectionList
      * @param index
      */
    inline def calculateMergeOffsets(
      dataModel: typings.luminoDatagrid.typesDatamodelMod.DataModel,
      regions: js.Array[CellRegion],
      axis: row | column,
      sectionList: typings.luminoDatagrid.typesSectionlistMod.SectionList,
      index: Double
    ): js.Tuple3[Double, Double, typings.luminoDatagrid.typesCellgroupMod.CellGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateMergeOffsets")(dataModel.asInstanceOf[js.Any], regions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], sectionList.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, typings.luminoDatagrid.typesCellgroupMod.CellGroup]]
    
    /**
      * Retrieves a list of cell groups intersecting at
      * a given column.
      * @param dataModel data model of the grid.
      * @param rgn the cell region.
      * @param column the target column to look for intersections at.
      * @returns all cell groups intersecting with the column.
      */
    inline def getCellGroupsAtColumn(dataModel: typings.luminoDatagrid.typesDatamodelMod.DataModel, rgn: CellRegion, column: Double): js.Array[typings.luminoDatagrid.typesCellgroupMod.CellGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellGroupsAtColumn")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.luminoDatagrid.typesCellgroupMod.CellGroup]]
    
    /**
      * Returns all cell groups which belong to
      * a given cell cell region.
      * @param dataModel
      * @param rgn
      */
    inline def getCellGroupsAtRegion(dataModel: typings.luminoDatagrid.typesDatamodelMod.DataModel, rgn: CellRegion): js.Array[typings.luminoDatagrid.typesCellgroupMod.CellGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellGroupsAtRegion")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.luminoDatagrid.typesCellgroupMod.CellGroup]]
    
    /**
      * Retrieves a list of cell groups intersecting at
      * a given row.
      * @param dataModel data model of the grid.
      * @param rgn the cell region.
      * @param row the target row to look for intersections at.
      * @returns all cell groups intersecting with the row.
      */
    inline def getCellGroupsAtRow(dataModel: typings.luminoDatagrid.typesDatamodelMod.DataModel, rgn: CellRegion, row: Double): js.Array[typings.luminoDatagrid.typesCellgroupMod.CellGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellGroupsAtRow")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.luminoDatagrid.typesCellgroupMod.CellGroup]]
    
    /**
      * Returns a cell-group for the given row/index coordinates.
      * @param dataModel
      * @param rgn
      * @param row
      * @param column
      */
    inline def getGroup(
      dataModel: typings.luminoDatagrid.typesDatamodelMod.DataModel,
      rgn: CellRegion,
      row: Double,
      column: Double
    ): typings.luminoDatagrid.typesCellgroupMod.CellGroup | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getGroup")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any], row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[typings.luminoDatagrid.typesCellgroupMod.CellGroup | Null]
    
    /**
      * Retrieves the index of the cell-group to which
      * the cell at the given row, column belongs.
      * @param dataModel
      * @param rgn
      * @param row
      * @param column
      */
    inline def getGroupIndex(
      dataModel: typings.luminoDatagrid.typesDatamodelMod.DataModel,
      rgn: CellRegion,
      row: Double,
      column: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getGroupIndex")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any], row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Checks if cell group 1 is above cell group 2.
      * @param group1 cell group 1.
      * @param group2 cell group 2.
      * @returns boolean.
      */
    inline def isCellGroupAbove(
      group1: typings.luminoDatagrid.typesCellgroupMod.CellGroup,
      group2: typings.luminoDatagrid.typesCellgroupMod.CellGroup
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCellGroupAbove")(group1.asInstanceOf[js.Any], group2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if cell group 1 is below cell group 2.
      */
    inline def isCellGroupBelow(
      group1: typings.luminoDatagrid.typesCellgroupMod.CellGroup,
      group2: typings.luminoDatagrid.typesCellgroupMod.CellGroup
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCellGroupBelow")(group1.asInstanceOf[js.Any], group2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Merges a cell group with other cells groups in the
      * same region if they intersect.
      * @param dataModel the data model of the grid.
      * @param group the target cell group.
      * @param region the region of the cell group.
      * @returns a new cell group after merging has happened.
      */
    inline def joinCellGroupWithMergedCellGroups(
      dataModel: typings.luminoDatagrid.typesDatamodelMod.DataModel,
      group: typings.luminoDatagrid.typesCellgroupMod.CellGroup,
      region: CellRegion
    ): typings.luminoDatagrid.typesCellgroupMod.CellGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("joinCellGroupWithMergedCellGroups")(dataModel.asInstanceOf[js.Any], group.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[typings.luminoDatagrid.typesCellgroupMod.CellGroup]
    
    /**
      * Calculates and returns a merged cell-group from
      * two cell-group objects.
      * @param groups
      */
    inline def joinCellGroups(groups: js.Array[typings.luminoDatagrid.typesCellgroupMod.CellGroup]): typings.luminoDatagrid.typesCellgroupMod.CellGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("joinCellGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[typings.luminoDatagrid.typesCellgroupMod.CellGroup]
    
    /**
      * Merges a target cell group with any cell groups
      * it intersects with at a given row or column.
      * @param dataModel data model of the grid.
      * @param regions list of cell regions.
      * @param axis row or column.
      * @param group the target cell group.
      * @returns a new merged cell group.
      */
    inline def joinCellGroupsIntersectingAtAxis(
      dataModel: typings.luminoDatagrid.typesDatamodelMod.DataModel,
      regions: js.Array[CellRegion],
      axis: row | column,
      group: typings.luminoDatagrid.typesCellgroupMod.CellGroup
    ): typings.luminoDatagrid.typesCellgroupMod.CellGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("joinCellGroupsIntersectingAtAxis")(dataModel.asInstanceOf[js.Any], regions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[typings.luminoDatagrid.typesCellgroupMod.CellGroup]
  }
  
  /* note: abstract class */ @JSImport("@lumino/datagrid", "CellRenderer")
  @js.native
  open class CellRenderer ()
    extends typings.luminoDatagrid.typesCellrendererMod.CellRenderer
  object CellRenderer {
    
    @JSImport("@lumino/datagrid", "CellRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Resolve a config option for a cell renderer.
      *
      * @param option - The config option to resolve.
      *
      * @param config - The cell config object.
      *
      * @returns The resolved value for the option.
      */
    inline def resolveOption[T](option: ConfigOption[T], config: CellConfig): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOption")(option.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@lumino/datagrid", "DataGrid")
  @js.native
  /**
    * Construct a new data grid.
    *
    * @param options - The options for initializing the data grid.
    */
  open class DataGrid ()
    extends typings.luminoDatagrid.typesDatagridMod.DataGrid {
    def this(options: typings.luminoDatagrid.typesDatagridMod.DataGrid.IOptions) = this()
  }
  object DataGrid {
    
    @JSImport("@lumino/datagrid", "DataGrid")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A generic format function for the copy handler.
      *
      * @param args - The format args for the function.
      *
      * @returns The string representation of the value.
      *
      * #### Notes
      * This function uses `String()` to coerce a value to a string.
      */
    inline def copyFormatGeneric(args: CopyFormatArgs): String = ^.asInstanceOf[js.Dynamic].applyDynamic("copyFormatGeneric")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * The default copy config for a data grid.
      */
    @JSImport("@lumino/datagrid", "DataGrid.defaultCopyConfig")
    @js.native
    val defaultCopyConfig: CopyConfig = js.native
    
    /**
      * The default sizes for a data grid.
      */
    @JSImport("@lumino/datagrid", "DataGrid.defaultSizes")
    @js.native
    val defaultSizes: DefaultSizes_ = js.native
    
    /**
      * The default theme for a data grid.
      */
    @JSImport("@lumino/datagrid", "DataGrid.defaultStyle")
    @js.native
    val defaultStyle: Style = js.native
    
    /**
      * The default minimum sizes for a data grid.
      */
    @JSImport("@lumino/datagrid", "DataGrid.minimumSizes")
    @js.native
    val minimumSizes: MinimumSizes_ = js.native
  }
  
  /* note: abstract class */ @JSImport("@lumino/datagrid", "DataModel")
  @js.native
  open class DataModel ()
    extends typings.luminoDatagrid.typesDatamodelMod.DataModel
  object DataModel {
    
    /**
      * A singleton empty metadata object.
      */
    @JSImport("@lumino/datagrid", "DataModel.emptyMetadata")
    @js.native
    val emptyMetadata: Metadata = js.native
  }
  
  @JSImport("@lumino/datagrid", "DateCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class DateCellEditor ()
    extends typings.luminoDatagrid.typesCelleditorMod.DateCellEditor
  
  @JSImport("@lumino/datagrid", "DynamicOptionCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class DynamicOptionCellEditor ()
    extends typings.luminoDatagrid.typesCelleditorMod.DynamicOptionCellEditor
  
  @JSImport("@lumino/datagrid", "GraphicsContext")
  @js.native
  open class GraphicsContext protected ()
    extends typings.luminoDatagrid.typesGraphicscontextMod.GraphicsContext {
    /**
      * Create a new graphics context object.
      *
      * @param context - The 2D canvas rendering context to wrap.
      */
    def this(context: CanvasRenderingContext2D) = this()
  }
  
  @JSImport("@lumino/datagrid", "HyperlinkRenderer")
  @js.native
  /**
    * Construct a new text renderer.
    *
    * @param options - The options for initializing the renderer.
    */
  open class HyperlinkRenderer ()
    extends typings.luminoDatagrid.typesHyperlinkrendererMod.HyperlinkRenderer {
    def this(options: typings.luminoDatagrid.typesHyperlinkrendererMod.HyperlinkRenderer.IOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@lumino/datagrid", "InputCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class InputCellEditor ()
    extends typings.luminoDatagrid.typesCelleditorMod.InputCellEditor
  
  @JSImport("@lumino/datagrid", "IntegerCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class IntegerCellEditor ()
    extends typings.luminoDatagrid.typesCelleditorMod.IntegerCellEditor
  
  @JSImport("@lumino/datagrid", "IntegerInputValidator")
  @js.native
  open class IntegerInputValidator ()
    extends typings.luminoDatagrid.typesCelleditorMod.IntegerInputValidator
  
  @JSImport("@lumino/datagrid", "JSONModel")
  @js.native
  open class JSONModel protected ()
    extends typings.luminoDatagrid.typesJsonmodelMod.JSONModel {
    /**
      * Create a data model with static JSON data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: typings.luminoDatagrid.typesJsonmodelMod.JSONModel.IOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@lumino/datagrid", "MutableDataModel")
  @js.native
  open class MutableDataModel ()
    extends typings.luminoDatagrid.typesDatamodelMod.MutableDataModel
  
  @JSImport("@lumino/datagrid", "NumberCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class NumberCellEditor ()
    extends typings.luminoDatagrid.typesCelleditorMod.NumberCellEditor
  
  @JSImport("@lumino/datagrid", "NumberInputValidator")
  @js.native
  open class NumberInputValidator ()
    extends typings.luminoDatagrid.typesCelleditorMod.NumberInputValidator
  
  @JSImport("@lumino/datagrid", "OptionCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class OptionCellEditor ()
    extends typings.luminoDatagrid.typesCelleditorMod.OptionCellEditor
  
  @JSImport("@lumino/datagrid", "PassInputValidator")
  @js.native
  open class PassInputValidator ()
    extends typings.luminoDatagrid.typesCelleditorMod.PassInputValidator
  
  /**
    * A namespace for module-private functionality.
    */
  object Private {
    
    @JSImport("@lumino/datagrid", "Private")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A timer callback for the autoselect loop.
      *
      * @param grid - The datagrid of interest.
      *
      * @param data - The select data of interest.
      */
    inline def autoselect(grid: typings.luminoDatagrid.typesDatagridMod.DataGrid, data: SelectData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoselect")(grid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Compute the scroll timeout for the given delta distance.
      *
      * @param delta - The delta pixels from the origin.
      *
      * @returns The scaled timeout in milliseconds.
      */
    inline def computeTimeout(delta: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTimeout")(delta.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Creates a CellConfig object from a hit region.
      */
    inline def createCellConfigObject(grid: typings.luminoDatagrid.typesDatagridMod.DataGrid, hit: HitTestResult): js.UndefOr[CellConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCellConfigObject")(grid.asInstanceOf[js.Any], hit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CellConfig]]
    
    /**
      * A mapping of resize handle to cursor.
      */
    object cursorMap {
      
      @JSImport("@lumino/datagrid", "Private.cursorMap")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@lumino/datagrid", "Private.cursorMap.bottom")
      @js.native
      def bottom: String = js.native
      inline def bottom_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
      
      @JSImport("@lumino/datagrid", "Private.cursorMap.hyperlink")
      @js.native
      def hyperlink: String = js.native
      inline def hyperlink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(x.asInstanceOf[js.Any])
      
      @JSImport("@lumino/datagrid", "Private.cursorMap.left")
      @js.native
      def left: String = js.native
      inline def left_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
      
      @JSImport("@lumino/datagrid", "Private.cursorMap.none")
      @js.native
      def none: String = js.native
      inline def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
      
      @JSImport("@lumino/datagrid", "Private.cursorMap.right")
      @js.native
      def right: String = js.native
      inline def right_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
      
      @JSImport("@lumino/datagrid", "Private.cursorMap.top")
      @js.native
      def top: String = js.native
      inline def top_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Get the resize handle for a grid hit test.
      */
    inline def resizeHandleForHitTest(hit: HitTestResult): ResizeHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeHandleForHitTest")(hit.asInstanceOf[js.Any]).asInstanceOf[ResizeHandle]
  }
  
  @JSImport("@lumino/datagrid", "RendererMap")
  @js.native
  /**
    * Construct a new renderer map.
    *
    * @param values - The initial values for the map.
    *
    * @param fallback - The renderer of last resort.
    */
  open class RendererMap ()
    extends typings.luminoDatagrid.typesRenderermapMod.RendererMap {
    def this(values: Values) = this()
    def this(values: Unit, fallback: typings.luminoDatagrid.typesCellrendererMod.CellRenderer) = this()
    def this(values: Values, fallback: typings.luminoDatagrid.typesCellrendererMod.CellRenderer) = this()
  }
  
  @JSImport("@lumino/datagrid", "SectionList")
  @js.native
  open class SectionList protected ()
    extends typings.luminoDatagrid.typesSectionlistMod.SectionList {
    /**
      * Construct a new section list.
      *
      * @param options - The options for initializing the list.
      */
    def this(options: typings.luminoDatagrid.typesSectionlistMod.SectionList.IOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@lumino/datagrid", "SelectionModel")
  @js.native
  open class SelectionModel protected ()
    extends typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel {
    /**
      * Construct a new selection model.
      *
      * @param options - The options for initializing the model.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@lumino/datagrid", "TextCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class TextCellEditor ()
    extends typings.luminoDatagrid.typesCelleditorMod.TextCellEditor
  
  @JSImport("@lumino/datagrid", "TextInputValidator")
  @js.native
  open class TextInputValidator ()
    extends typings.luminoDatagrid.typesCelleditorMod.TextInputValidator
  
  @JSImport("@lumino/datagrid", "TextRenderer")
  @js.native
  /**
    * Construct a new text renderer.
    *
    * @param options - The options for initializing the renderer.
    */
  open class TextRenderer ()
    extends typings.luminoDatagrid.typesTextrendererMod.TextRenderer {
    def this(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.IOptions) = this()
  }
  object TextRenderer {
    
    @JSImport("@lumino/datagrid", "TextRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a date format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new date format function.
      *
      * #### Notes
      * This formatter uses `Date.toDateString()` to format the values.
      *
      * If a value is not a `Date` object, `new Date(value)` is used to
      * coerce the value to a date.
      *
      * The `formatIntlDateTime()` formatter is more flexible, but slower.
      */
    /**
      * The namespace for the `formatDate` function statics.
      */
    inline def formatDate(): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")().asInstanceOf[FormatFunc]
    /**
      * The namespace for the `formatDate` function statics.
      */
    inline def formatDate(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatDate.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    /**
      * Create a scientific notation format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new scientific notation format function.
      *
      * #### Notes
      * This formatter uses the builtin `Number()` and `toExponential()`
      * to coerce values.
      *
      * The `formatIntlNumber()` formatter is more flexible, but slower.
      */
    /**
      * The namespace for the `formatExponential` function statics.
      */
    inline def formatExponential(): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatExponential")().asInstanceOf[FormatFunc]
    /**
      * The namespace for the `formatExponential` function statics.
      */
    inline def formatExponential(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatExponential.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatExponential")(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    /**
      * Create a fixed decimal format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new fixed decimal format function.
      *
      * #### Notes
      * This formatter uses the builtin `Number()` and `toFixed()` to
      * coerce values.
      *
      * The `formatIntlNumber()` formatter is more flexible, but slower.
      */
    /**
      * The namespace for the `formatFixed` function statics.
      */
    inline def formatFixed(): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")().asInstanceOf[FormatFunc]
    /**
      * The namespace for the `formatFixed` function statics.
      */
    inline def formatFixed(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatFixed.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    /**
      * Create a generic text format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new generic text format function.
      *
      * #### Notes
      * This formatter uses the builtin `String()` to coerce any value
      * to a string.
      */
    /**
      * The namespace for the `formatGeneric` function statics.
      */
    inline def formatGeneric(): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatGeneric")().asInstanceOf[FormatFunc]
    /**
      * The namespace for the `formatGeneric` function statics.
      */
    inline def formatGeneric(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatGeneric.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatGeneric")(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    /**
      * Create an ISO datetime format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new ISO datetime format function.
      *
      * #### Notes
      * This formatter uses `Date.toISOString()` to format the values.
      *
      * If a value is not a `Date` object, `new Date(value)` is used to
      * coerce the value to a date.
      *
      * The `formatIntlDateTime()` formatter is more flexible, but slower.
      */
    /**
      * The namespace for the `formatISODateTime` function statics.
      */
    inline def formatISODateTime(): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISODateTime")().asInstanceOf[FormatFunc]
    /**
      * The namespace for the `formatISODateTime` function statics.
      */
    inline def formatISODateTime(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatISODateTime.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISODateTime")(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    /**
      * Create an international datetime format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new international datetime format function.
      *
      * #### Notes
      * This formatter uses the builtin `Intl.DateTimeFormat` object to
      * coerce values.
      *
      * This is the most flexible (but slowest) datetime formatter.
      */
    /**
      * The namespace for the `formatIntlDateTime` function statics.
      */
    inline def formatIntlDateTime(): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIntlDateTime")().asInstanceOf[FormatFunc]
    /**
      * The namespace for the `formatIntlDateTime` function statics.
      */
    inline def formatIntlDateTime(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatIntlDateTime.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIntlDateTime")(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    /**
      * Create an international number format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new international number format function.
      *
      * #### Notes
      * This formatter uses the builtin `Intl.NumberFormat` object to
      * coerce values.
      *
      * This is the most flexible (but slowest) number formatter.
      */
    /**
      * The namespace for the `formatIntlNumber` function statics.
      */
    inline def formatIntlNumber(): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIntlNumber")().asInstanceOf[FormatFunc]
    /**
      * The namespace for the `formatIntlNumber` function statics.
      */
    inline def formatIntlNumber(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatIntlNumber.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIntlNumber")(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    /**
      * Create a significant figure format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new significant figure format function.
      *
      * #### Notes
      * This formatter uses the builtin `Number()` and `toPrecision()`
      * to coerce values.
      *
      * The `formatIntlNumber()` formatter is more flexible, but slower.
      */
    /**
      * The namespace for the `formatPrecision` function statics.
      */
    inline def formatPrecision(): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPrecision")().asInstanceOf[FormatFunc]
    /**
      * The namespace for the `formatPrecision` function statics.
      */
    inline def formatPrecision(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatPrecision.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPrecision")(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    /**
      * Create a time format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new time format function.
      *
      * #### Notes
      * This formatter uses `Date.toTimeString()` to format the values.
      *
      * If a value is not a `Date` object, `new Date(value)` is used to
      * coerce the value to a date.
      *
      * The `formatIntlDateTime()` formatter is more flexible, but slower.
      */
    /**
      * The namespace for the `formatTime` function statics.
      */
    inline def formatTime(): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")().asInstanceOf[FormatFunc]
    /**
      * The namespace for the `formatTime` function statics.
      */
    inline def formatTime(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatTime.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    /**
      * Create a UTC datetime format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new UTC datetime format function.
      *
      * #### Notes
      * This formatter uses `Date.toUTCString()` to format the values.
      *
      * If a value is not a `Date` object, `new Date(value)` is used to
      * coerce the value to a date.
      *
      * The `formatIntlDateTime()` formatter is more flexible, but slower.
      */
    /**
      * The namespace for the `formatUTCDateTime` function statics.
      */
    inline def formatUTCDateTime(): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUTCDateTime")().asInstanceOf[FormatFunc]
    /**
      * The namespace for the `formatUTCDateTime` function statics.
      */
    inline def formatUTCDateTime(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatUTCDateTime.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUTCDateTime")(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    /**
      * Measure the height of a font.
      *
      * @param font - The CSS font string of interest.
      *
      * @returns The height of the font bounding box.
      *
      * #### Notes
      * This function uses a temporary DOM node to measure the text box
      * height for the specified font. The first call for a given font
      * will incur a DOM reflow, but the return value is cached, so any
      * subsequent call for the same font will return the cached value.
      */
    inline def measureFontHeight(font: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("measureFontHeight")(font.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  inline def resolveOption[T](
    option: typings.luminoDatagrid.typesCelleditorcontrollerMod.ConfigOption[T],
    config: typings.luminoDatagrid.typesCelleditorMod.CellEditor.CellConfig
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOption")(option.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
}
