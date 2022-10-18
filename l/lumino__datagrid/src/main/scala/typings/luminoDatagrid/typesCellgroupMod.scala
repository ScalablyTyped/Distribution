package typings.luminoDatagrid

import typings.luminoDatagrid.luminoDatagridStrings.column
import typings.luminoDatagrid.luminoDatagridStrings.row
import typings.luminoDatagrid.typesDatamodelMod.DataModel
import typings.luminoDatagrid.typesDatamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.typesSectionlistMod.SectionList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCellgroupMod {
  
  trait CellGroup extends StObject {
    
    var c1: Double
    
    var c2: Double
    
    var r1: Double
    
    var r2: Double
  }
  object CellGroup {
    
    inline def apply(c1: Double, c2: Double, r1: Double, r2: Double): CellGroup = {
      val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], c2 = c2.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellGroup]
    }
    
    @JSImport("@lumino/datagrid/types/cellgroup", "CellGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks if cell-groups are intersecting.
      * @param group1
      * @param group2
      */
    inline def areCellGroupsIntersecting(group1: CellGroup, group2: CellGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCellGroupsIntersecting")(group1.asInstanceOf[js.Any], group2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if two cell-groups are intersecting
      * in the given axis.
      * @param group1
      * @param group2
      * @param axis
      */
    inline def areCellGroupsIntersectingAtAxis(group1: CellGroup, group2: CellGroup, axis: row | column): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCellGroupsIntersectingAtAxis")(group1.asInstanceOf[js.Any], group2.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def areCellsMerged(dataModel: DataModel, rgn: CellRegion, cell1: js.Array[Double], cell2: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCellsMerged")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any], cell1.asInstanceOf[js.Any], cell2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
      dataModel: DataModel,
      regions: js.Array[CellRegion],
      axis: row | column,
      sectionList: SectionList,
      index: Double
    ): js.Tuple3[Double, Double, CellGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateMergeOffsets")(dataModel.asInstanceOf[js.Any], regions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], sectionList.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, CellGroup]]
    
    /**
      * Retrieves a list of cell groups intersecting at
      * a given column.
      * @param dataModel data model of the grid.
      * @param rgn the cell region.
      * @param column the target column to look for intersections at.
      * @returns all cell groups intersecting with the column.
      */
    inline def getCellGroupsAtColumn(dataModel: DataModel, rgn: CellRegion, column: Double): js.Array[CellGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellGroupsAtColumn")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellGroup]]
    
    /**
      * Returns all cell groups which belong to
      * a given cell cell region.
      * @param dataModel
      * @param rgn
      */
    inline def getCellGroupsAtRegion(dataModel: DataModel, rgn: CellRegion): js.Array[CellGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellGroupsAtRegion")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellGroup]]
    
    /**
      * Retrieves a list of cell groups intersecting at
      * a given row.
      * @param dataModel data model of the grid.
      * @param rgn the cell region.
      * @param row the target row to look for intersections at.
      * @returns all cell groups intersecting with the row.
      */
    inline def getCellGroupsAtRow(dataModel: DataModel, rgn: CellRegion, row: Double): js.Array[CellGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellGroupsAtRow")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellGroup]]
    
    /**
      * Returns a cell-group for the given row/index coordinates.
      * @param dataModel
      * @param rgn
      * @param row
      * @param column
      */
    inline def getGroup(dataModel: DataModel, rgn: CellRegion, row: Double, column: Double): CellGroup | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getGroup")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any], row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[CellGroup | Null]
    
    /**
      * Retrieves the index of the cell-group to which
      * the cell at the given row, column belongs.
      * @param dataModel
      * @param rgn
      * @param row
      * @param column
      */
    inline def getGroupIndex(dataModel: DataModel, rgn: CellRegion, row: Double, column: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getGroupIndex")(dataModel.asInstanceOf[js.Any], rgn.asInstanceOf[js.Any], row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Checks if cell group 1 is above cell group 2.
      * @param group1 cell group 1.
      * @param group2 cell group 2.
      * @returns boolean.
      */
    inline def isCellGroupAbove(group1: CellGroup, group2: CellGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCellGroupAbove")(group1.asInstanceOf[js.Any], group2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if cell group 1 is below cell group 2.
      */
    inline def isCellGroupBelow(group1: CellGroup, group2: CellGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCellGroupBelow")(group1.asInstanceOf[js.Any], group2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Merges a cell group with other cells groups in the
      * same region if they intersect.
      * @param dataModel the data model of the grid.
      * @param group the target cell group.
      * @param region the region of the cell group.
      * @returns a new cell group after merging has happened.
      */
    inline def joinCellGroupWithMergedCellGroups(dataModel: DataModel, group: CellGroup, region: CellRegion): CellGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("joinCellGroupWithMergedCellGroups")(dataModel.asInstanceOf[js.Any], group.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[CellGroup]
    
    /**
      * Calculates and returns a merged cell-group from
      * two cell-group objects.
      * @param groups
      */
    inline def joinCellGroups(groups: js.Array[CellGroup]): CellGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("joinCellGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[CellGroup]
    
    /**
      * Merges a target cell group with any cell groups
      * it intersects with at a given row or column.
      * @param dataModel data model of the grid.
      * @param regions list of cell regions.
      * @param axis row or column.
      * @param group the target cell group.
      * @returns a new merged cell group.
      */
    inline def joinCellGroupsIntersectingAtAxis(dataModel: DataModel, regions: js.Array[CellRegion], axis: row | column, group: CellGroup): CellGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("joinCellGroupsIntersectingAtAxis")(dataModel.asInstanceOf[js.Any], regions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[CellGroup]
    
    extension [Self <: CellGroup](x: Self) {
      
      inline def setC1(value: Double): Self = StObject.set(x, "c1", value.asInstanceOf[js.Any])
      
      inline def setC2(value: Double): Self = StObject.set(x, "c2", value.asInstanceOf[js.Any])
      
      inline def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
      
      inline def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    }
  }
}
