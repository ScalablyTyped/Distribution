package typings.handsontable

import typings.handsontable.anon.From
import typings.handsontable.handsontableStrings.`E-W`
import typings.handsontable.handsontableStrings.`N-S`
import typings.handsontable.handsontableStrings.`S-N`
import typings.handsontable.handsontableStrings.`W-E`
import typings.handsontable.handsontableStrings.bottom
import typings.handsontable.handsontableStrings.left
import typings.handsontable.handsontableStrings.right
import typings.handsontable.handsontableStrings.top
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
    def this(
      highlight: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      from: Unit,
      to: Unit,
      isRtl: Boolean
    ) = this()
    def this(
      highlight: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      from: Unit,
      to: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      isRtl: Boolean
    ) = this()
    def this(
      highlight: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      from: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      to: Unit,
      isRtl: Boolean
    ) = this()
    def this(
      highlight: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      from: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      to: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      isRtl: Boolean
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
    
    def getAll(): js.Array[typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default] = js.native
    
    def getBordersSharedWith(range: CellRange): js.Array[top | right | bottom | left] = js.native
    
    def getBottomEndCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getBottomLeftCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getBottomRightCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getBottomStartCorner(): typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getCellsCount(): Double = js.native
    
    def getDirection(): DirectionType = js.native
    
    def getHeight(): Double = js.native
    
    def getHorizontalDirection(): `W-E` | `E-W` = js.native
    
    def getInner(): js.Array[typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default] = js.native
    
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
    
    def getVerticalDirection(): `N-S` | `S-N` = js.native
    
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
    
    def setDirection(direction: DirectionType): Unit = js.native
    
    def setFrom(coords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): CellRange = js.native
    
    def setHighlight(coords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): CellRange = js.native
    
    def setTo(coords: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): CellRange = js.native
    
    var to: typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def toObject(): From = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.`NW-SE`
    - typings.handsontable.handsontableStrings.`NE-SW`
    - typings.handsontable.handsontableStrings.`SE-NW`
    - typings.handsontable.handsontableStrings.`SW-NE`
  */
  trait DirectionType extends StObject
  object DirectionType {
    
    inline def `NE-SW`: typings.handsontable.handsontableStrings.`NE-SW` = "NE-SW".asInstanceOf[typings.handsontable.handsontableStrings.`NE-SW`]
    
    inline def `NW-SE`: typings.handsontable.handsontableStrings.`NW-SE` = "NW-SE".asInstanceOf[typings.handsontable.handsontableStrings.`NW-SE`]
    
    inline def `SE-NW`: typings.handsontable.handsontableStrings.`SE-NW` = "SE-NW".asInstanceOf[typings.handsontable.handsontableStrings.`SE-NW`]
    
    inline def `SW-NE`: typings.handsontable.handsontableStrings.`SW-NE` = "SW-NE".asInstanceOf[typings.handsontable.handsontableStrings.`SW-NE`]
  }
}
