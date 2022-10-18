package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `3rdpartyWalkontableSrcCellRangeMod` {
  
  @JSImport("handsontable/3rdparty/walkontable/src/cell/range", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CellRange {
    def this(highlight: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default) = this()
    def this(
      highlight: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      from: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default
    ) = this()
    def this(
      highlight: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      from: Unit,
      to: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default
    ) = this()
    def this(
      highlight: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      from: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      to: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default
    ) = this()
  }
  
  @js.native
  trait CellRange extends StObject {
    
    def expand(cellCoords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): Boolean = js.native
    
    def expandByRange(expandingRange: CellRange): Boolean = js.native
    
    def flipDirectionHorizontally(): Unit = js.native
    
    def flipDirectionVertically(): Unit = js.native
    
    def forAll(callback: js.Function2[/* row */ Double, /* column */ Double, Boolean]): Unit = js.native
    
    var from: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getAll(): js.Array[Any] = js.native
    
    def getBordersSharedWith(range: CellRange): js.Array[Any] = js.native
    
    def getBottomEndCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getBottomLeftCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getBottomRightCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getBottomStartCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getDirection(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getHorizontalDirection(): String = js.native
    
    def getInner(): js.Array[Any] = js.native
    
    def getOppositeCorner(coords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    def getOppositeCorner(
      coords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      expandedRange: CellRange
    ): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterBottomEndCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterBottomLeftCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterBottomRightCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterBottomStartCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterHeight(): Double = js.native
    
    def getOuterTopEndCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterTopLeftCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterTopRightCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterTopStartCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterWidth(): Double = js.native
    
    def getTopEndCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getTopLeftCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getTopRightCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getTopStartCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getVerticalDirection(): String = js.native
    
    def getWidth(): Double = js.native
    
    var highlight: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def includes(cellCoords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): Boolean = js.native
    
    def includesRange(cellRange: CellRange): Boolean = js.native
    
    def isCorner(coords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): Boolean = js.native
    def isCorner(
      coords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      expandedRange: CellRange
    ): Boolean = js.native
    
    def isEqual(cellRange: CellRange): Boolean = js.native
    
    def isNorthWestOf(cellRange: CellRange): Boolean = js.native
    
    def isOverlappingHorizontally(cellRange: CellRange): Boolean = js.native
    
    def isOverlappingVertically(cellRange: CellRange): Boolean = js.native
    
    def isSingle(): Boolean = js.native
    
    def isSouthEastOf(cellRange: CellRange): Boolean = js.native
    
    def isValid(wot: Any): Boolean = js.native
    
    def overlaps(cellRange: CellRange): Boolean = js.native
    
    def setDirection(direction: String): Unit = js.native
    
    def setFrom(coords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): CellRange = js.native
    
    def setHighlight(coords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): CellRange = js.native
    
    def setTo(coords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): CellRange = js.native
    
    var to: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def toObject(): Any = js.native
  }
}
