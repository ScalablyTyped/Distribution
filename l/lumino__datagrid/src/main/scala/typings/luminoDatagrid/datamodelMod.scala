package typings.luminoDatagrid

import org.scalablytyped.runtime.StringDictionary
import typings.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.datamodelMod.DataModel.ChangedArgs
import typings.luminoDatagrid.datamodelMod.DataModel.ColumnRegion
import typings.luminoDatagrid.datamodelMod.DataModel.Metadata
import typings.luminoDatagrid.datamodelMod.DataModel.RowRegion
import typings.luminoDatagrid.luminoDatagridStrings.`cells-changed`
import typings.luminoDatagrid.luminoDatagridStrings.`columns-inserted`
import typings.luminoDatagrid.luminoDatagridStrings.`columns-moved`
import typings.luminoDatagrid.luminoDatagridStrings.`columns-removed`
import typings.luminoDatagrid.luminoDatagridStrings.`model-reset`
import typings.luminoDatagrid.luminoDatagridStrings.`rows-inserted`
import typings.luminoDatagrid.luminoDatagridStrings.`rows-moved`
import typings.luminoDatagrid.luminoDatagridStrings.`rows-removed`
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datamodelMod {
  
  @JSImport("@lumino/datagrid/lib/datamodel", "DataModel")
  @js.native
  abstract class DataModel () extends StObject {
    
    var _changed: js.Any = js.native
    
    /**
      * A signal emitted when the data model has changed.
      */
    val changed: ISignal[this.type, ChangedArgs] = js.native
    
    /**
      * Get the column count for a region in the data model.
      *
      * @param region - The column region of interest.
      *
      * @returns - The column count for the region.
      *
      * #### Notes
      * This method is called often, and so should be efficient.
      */
    def columnCount(region: ColumnRegion): Double = js.native
    
    /**
      * Get the data value for a cell in the data model.
      *
      * @param region - The cell region of interest.
      *
      * @param row - The row index of the cell of interest.
      *
      * @param column - The column index of the cell of interest.
      *
      * @returns The data value for the specified cell.
      *
      * #### Notes
      * The returned data should be treated as immutable.
      *
      * This method is called often, and so should be efficient.
      */
    def data(region: CellRegion, row: Double, column: Double): js.Any = js.native
    
    /**
      * Emit the `changed` signal for the data model.
      *
      * #### Notes
      * Subclasses should call this method whenever the data model has
      * changed so that attached data grids can update themselves.
      */
    /* protected */ def emitChanged(args: ChangedArgs): Unit = js.native
    
    /**
      * Get the metadata for a cell in the data model.
      *
      * @param region - The cell region of interest.
      *
      * @param row - The row index of the cell of interest.
      *
      * @param column - The column index of the cell of interest.
      *
      * @returns The metadata for the specified cell.
      *
      * #### Notes
      * The returned metadata should be treated as immutable.
      *
      * This method is called often, and so should be efficient.
      *
      * The default implementation returns `{}`.
      */
    def metadata(region: CellRegion, row: Double, column: Double): Metadata = js.native
    
    /**
      * Get the row count for a region in the data model.
      *
      * @param region - The row region of interest.
      *
      * @returns - The row count for the region.
      *
      * #### Notes
      * This method is called often, and so should be efficient.
      */
    def rowCount(region: RowRegion): Double = js.native
  }
  object DataModel {
    
    /**
      * A singleton empty metadata object.
      */
    @JSImport("@lumino/datagrid/lib/datamodel", "DataModel.emptyMetadata")
    @js.native
    val emptyMetadata: Metadata = js.native
    
    /**
      * A type alias for the data model cell regions.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.body
      - typings.luminoDatagrid.luminoDatagridStrings.`row-header`
      - typings.luminoDatagrid.luminoDatagridStrings.`column-header`
      - typings.luminoDatagrid.luminoDatagridStrings.`corner-header`
    */
    trait CellRegion extends StObject
    object CellRegion {
      
      @scala.inline
      def body: typings.luminoDatagrid.luminoDatagridStrings.body = "body".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.body]
      
      @scala.inline
      def `column-header`: typings.luminoDatagrid.luminoDatagridStrings.`column-header` = "column-header".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`column-header`]
      
      @scala.inline
      def `corner-header`: typings.luminoDatagrid.luminoDatagridStrings.`corner-header` = "corner-header".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`corner-header`]
      
      @scala.inline
      def `row-header`: typings.luminoDatagrid.luminoDatagridStrings.`row-header` = "row-header".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`row-header`]
    }
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when cells are changed in-place.
      */
    @js.native
    trait CellsChangedArgs extends ChangedArgs {
      
      /**
        * The column index of the first modified cell.
        */
      val column: Double = js.native
      
      /**
        * The number of columns in the modified cell range.
        */
      val columnSpan: Double = js.native
      
      /**
        * The region which contains the modified cells.
        */
      val region: CellRegion = js.native
      
      /**
        * The row index of the first modified cell.
        */
      val row: Double = js.native
      
      /**
        * The number of rows in the modified cell range.
        */
      val rowSpan: Double = js.native
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `cells-changed` = js.native
    }
    object CellsChangedArgs {
      
      @scala.inline
      def apply(
        column: Double,
        columnSpan: Double,
        region: CellRegion,
        row: Double,
        rowSpan: Double,
        `type`: `cells-changed`
      ): CellsChangedArgs = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CellsChangedArgs]
      }
      
      @scala.inline
      implicit class CellsChangedArgsMutableBuilder[Self <: CellsChangedArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegion(value: CellRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: `cells-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the args objects of the `changed` signal.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.datamodelMod.DataModel.RowsChangedArgs
      - typings.luminoDatagrid.datamodelMod.DataModel.ColumnsChangedArgs
      - typings.luminoDatagrid.datamodelMod.DataModel.RowsMovedArgs
      - typings.luminoDatagrid.datamodelMod.DataModel.ColumnsMovedArgs
      - typings.luminoDatagrid.datamodelMod.DataModel.CellsChangedArgs
      - typings.luminoDatagrid.datamodelMod.DataModel.ModelResetArgs
    */
    trait ChangedArgs extends StObject
    object ChangedArgs {
      
      @scala.inline
      def CellsChangedArgs(
        column: Double,
        columnSpan: Double,
        region: CellRegion,
        row: Double,
        rowSpan: Double,
        `type`: `cells-changed`
      ): typings.luminoDatagrid.datamodelMod.DataModel.CellsChangedArgs = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.luminoDatagrid.datamodelMod.DataModel.CellsChangedArgs]
      }
      
      @scala.inline
      def ColumnsChangedArgs(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): typings.luminoDatagrid.datamodelMod.DataModel.ColumnsChangedArgs = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.luminoDatagrid.datamodelMod.DataModel.ColumnsChangedArgs]
      }
      
      @scala.inline
      def ColumnsMovedArgs(destination: Double, index: Double, region: ColumnRegion, span: Double, `type`: `columns-moved`): typings.luminoDatagrid.datamodelMod.DataModel.ColumnsMovedArgs = {
        val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.luminoDatagrid.datamodelMod.DataModel.ColumnsMovedArgs]
      }
      
      @scala.inline
      def ModelResetArgs(`type`: `model-reset`): typings.luminoDatagrid.datamodelMod.DataModel.ModelResetArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.luminoDatagrid.datamodelMod.DataModel.ModelResetArgs]
      }
      
      @scala.inline
      def RowsChangedArgs(index: Double, region: RowRegion, span: Double, `type`: `rows-inserted` | `rows-removed`): typings.luminoDatagrid.datamodelMod.DataModel.RowsChangedArgs = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.luminoDatagrid.datamodelMod.DataModel.RowsChangedArgs]
      }
      
      @scala.inline
      def RowsMovedArgs(destination: Double, index: Double, region: RowRegion, span: Double, `type`: `rows-moved`): typings.luminoDatagrid.datamodelMod.DataModel.RowsMovedArgs = {
        val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.luminoDatagrid.datamodelMod.DataModel.RowsMovedArgs]
      }
    }
    
    /**
      * A type alias for the data model column regions.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.body
      - typings.luminoDatagrid.luminoDatagridStrings.`row-header`
    */
    trait ColumnRegion extends StObject
    object ColumnRegion {
      
      @scala.inline
      def body: typings.luminoDatagrid.luminoDatagridStrings.body = "body".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.body]
      
      @scala.inline
      def `row-header`: typings.luminoDatagrid.luminoDatagridStrings.`row-header` = "row-header".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`row-header`]
    }
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when columns are inserted or removed.
      */
    @js.native
    trait ColumnsChangedArgs extends ChangedArgs {
      
      /**
        * The index of the first modified column.
        */
      val index: Double = js.native
      
      /**
        * The region which contains the modified columns.
        */
      val region: ColumnRegion = js.native
      
      /**
        * The number of modified columns.
        */
      val span: Double = js.native
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `columns-inserted` | `columns-removed` = js.native
    }
    object ColumnsChangedArgs {
      
      @scala.inline
      def apply(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): ColumnsChangedArgs = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ColumnsChangedArgs]
      }
      
      @scala.inline
      implicit class ColumnsChangedArgsMutableBuilder[Self <: ColumnsChangedArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegion(value: ColumnRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: `columns-inserted` | `columns-removed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when columns are moved.
      */
    @js.native
    trait ColumnsMovedArgs extends ChangedArgs {
      
      /**
        * The ending index of the first modified column.
        */
      val destination: Double = js.native
      
      /**
        * The starting index of the first modified column.
        */
      val index: Double = js.native
      
      /**
        * The region which contains the modified columns.
        */
      val region: ColumnRegion = js.native
      
      /**
        * The number of modified columns.
        */
      val span: Double = js.native
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `columns-moved` = js.native
    }
    object ColumnsMovedArgs {
      
      @scala.inline
      def apply(destination: Double, index: Double, region: ColumnRegion, span: Double, `type`: `columns-moved`): ColumnsMovedArgs = {
        val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ColumnsMovedArgs]
      }
      
      @scala.inline
      implicit class ColumnsMovedArgsMutableBuilder[Self <: ColumnsMovedArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestination(value: Double): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegion(value: ColumnRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: `columns-moved`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The metadata for a column in a data model.
      */
    type Metadata = StringDictionary[js.Any]
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when the model has changed in a fashion that cannot be easily
      * expressed by the other args object types.
      *
      * This is the "big hammer" approach, and will cause any associated
      * data grid to perform a full reset. The other changed args types
      * should be used whenever possible.
      */
    @js.native
    trait ModelResetArgs extends ChangedArgs {
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `model-reset` = js.native
    }
    object ModelResetArgs {
      
      @scala.inline
      def apply(`type`: `model-reset`): ModelResetArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ModelResetArgs]
      }
      
      @scala.inline
      implicit class ModelResetArgsMutableBuilder[Self <: ModelResetArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: `model-reset`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the data model row regions.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.body
      - typings.luminoDatagrid.luminoDatagridStrings.`column-header`
    */
    trait RowRegion extends StObject
    object RowRegion {
      
      @scala.inline
      def body: typings.luminoDatagrid.luminoDatagridStrings.body = "body".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.body]
      
      @scala.inline
      def `column-header`: typings.luminoDatagrid.luminoDatagridStrings.`column-header` = "column-header".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`column-header`]
    }
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when rows are inserted or removed.
      */
    @js.native
    trait RowsChangedArgs extends ChangedArgs {
      
      /**
        * The index of the first modified row.
        */
      val index: Double = js.native
      
      /**
        * The region which contains the modified rows.
        */
      val region: RowRegion = js.native
      
      /**
        * The number of modified rows.
        */
      val span: Double = js.native
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `rows-inserted` | `rows-removed` = js.native
    }
    object RowsChangedArgs {
      
      @scala.inline
      def apply(index: Double, region: RowRegion, span: Double, `type`: `rows-inserted` | `rows-removed`): RowsChangedArgs = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[RowsChangedArgs]
      }
      
      @scala.inline
      implicit class RowsChangedArgsMutableBuilder[Self <: RowsChangedArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegion(value: RowRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: `rows-inserted` | `rows-removed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when rows are moved.
      */
    @js.native
    trait RowsMovedArgs extends ChangedArgs {
      
      /**
        * The ending index of the first modified row.
        */
      val destination: Double = js.native
      
      /**
        * The starting index of the first modified row.
        */
      val index: Double = js.native
      
      /**
        * The region which contains the modified rows.
        */
      val region: RowRegion = js.native
      
      /**
        * The number of modified rows.
        */
      val span: Double = js.native
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `rows-moved` = js.native
    }
    object RowsMovedArgs {
      
      @scala.inline
      def apply(destination: Double, index: Double, region: RowRegion, span: Double, `type`: `rows-moved`): RowsMovedArgs = {
        val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[RowsMovedArgs]
      }
      
      @scala.inline
      implicit class RowsMovedArgsMutableBuilder[Self <: RowsMovedArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestination(value: Double): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegion(value: RowRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: `rows-moved`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@lumino/datagrid/lib/datamodel", "MutableDataModel")
  @js.native
  abstract class MutableDataModel () extends DataModel {
    
    /**
      * Set the data value for a cell in the data model.
      *
      * @param region - The cell region of interest.
      *
      * @param row - The row index of the cell of interest.
      *
      * @param column - The column index of the cell of interest.
      *
      * @returns true if succeeds, false otherwise.
      *
      */
    def setData(region: CellRegion, row: Double, column: Double, value: js.Any): Boolean = js.native
  }
}
