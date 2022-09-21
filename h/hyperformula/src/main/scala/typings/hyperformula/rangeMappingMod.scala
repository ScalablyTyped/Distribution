package typings.hyperformula

import typings.hyperformula.absoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.anon.RestRange
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.dependencyGraphMod.RangeVertex
import typings.hyperformula.maybeMod.Maybe
import typings.hyperformula.spanMod.Span
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMappingMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/RangeMapping", "RangeMapping")
  @js.native
  open class RangeMapping () extends StObject {
    
    /* private */ var entriesFromSheet: Any = js.native
    
    def fetchRange(start: SimpleCellAddress_, end: SimpleCellAddress_): RangeVertex = js.native
    
    /**
      * Finds smaller range does have own vertex.
      *
      * @param range
      */
    def findSmallerRange(range: AbsoluteCellRange): RestRange = js.native
    
    /* private */ var getByKey: Any = js.native
    
    def getMappingSize(sheet: Double): Maybe[Double] = js.native
    
    /**
      * Returns associated vertex for given range
      *
      * @param start - top-left corner of the range
      * @param end - bottom-right corner of the range
      */
    def getRange(start: SimpleCellAddress_, end: SimpleCellAddress_): Maybe[RangeVertex] = js.native
    
    def moveAllRangesInSheetAfterColumnByColumns(sheet: Double, column: Double, numberOfColumns: Double): AdjustRangesResult = js.native
    
    def moveAllRangesInSheetAfterRowByRows(sheet: Double, row: Double, numberOfRows: Double): AdjustRangesResult = js.native
    
    def moveRangesInsideSourceRange(sourceRange: AbsoluteCellRange, toRight: Double, toBottom: Double, toSheet: Double): Unit = js.native
    
    /** Map in which actual data is stored. */
    /* private */ var rangeMapping: Any = js.native
    
    def rangeVerticesContainedInRange(sourceRange: AbsoluteCellRange): IterableIterator[RangeVertex] = js.native
    
    def rangesInSheet(sheet: Double): IterableIterator[RangeVertex] = js.native
    
    /* private */ var removeByKey: Any = js.native
    
    def removeRange(vertex: RangeVertex): Unit = js.native
    
    def removeRangesInSheet(sheet: Double): IterableIterator[RangeVertex] = js.native
    
    /**
      * Saves range vertex
      *
      * @param vertex - vertex to save
      */
    def setRange(vertex: RangeVertex): Unit = js.native
    
    def truncateRanges(span: Span, coordinate: js.Function1[/* address */ SimpleCellAddress_, Double]): TruncateRangesResult = js.native
    
    /* private */ var updateVerticesFromSheet: Any = js.native
  }
  
  trait AdjustRangesResult extends StObject {
    
    var verticesWithChangedSize: js.Array[RangeVertex]
  }
  object AdjustRangesResult {
    
    inline def apply(verticesWithChangedSize: js.Array[RangeVertex]): AdjustRangesResult = {
      val __obj = js.Dynamic.literal(verticesWithChangedSize = verticesWithChangedSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjustRangesResult]
    }
    
    extension [Self <: AdjustRangesResult](x: Self) {
      
      inline def setVerticesWithChangedSize(value: js.Array[RangeVertex]): Self = StObject.set(x, "verticesWithChangedSize", value.asInstanceOf[js.Any])
      
      inline def setVerticesWithChangedSizeVarargs(value: RangeVertex*): Self = StObject.set(x, "verticesWithChangedSize", js.Array(value*))
    }
  }
  
  trait TruncateRangesResult
    extends StObject
       with AdjustRangesResult {
    
    var verticesToMerge: js.Array[js.Tuple2[RangeVertex, RangeVertex]]
    
    var verticesToRemove: js.Array[RangeVertex]
  }
  object TruncateRangesResult {
    
    inline def apply(
      verticesToMerge: js.Array[js.Tuple2[RangeVertex, RangeVertex]],
      verticesToRemove: js.Array[RangeVertex],
      verticesWithChangedSize: js.Array[RangeVertex]
    ): TruncateRangesResult = {
      val __obj = js.Dynamic.literal(verticesToMerge = verticesToMerge.asInstanceOf[js.Any], verticesToRemove = verticesToRemove.asInstanceOf[js.Any], verticesWithChangedSize = verticesWithChangedSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[TruncateRangesResult]
    }
    
    extension [Self <: TruncateRangesResult](x: Self) {
      
      inline def setVerticesToMerge(value: js.Array[js.Tuple2[RangeVertex, RangeVertex]]): Self = StObject.set(x, "verticesToMerge", value.asInstanceOf[js.Any])
      
      inline def setVerticesToMergeVarargs(value: (js.Tuple2[RangeVertex, RangeVertex])*): Self = StObject.set(x, "verticesToMerge", js.Array(value*))
      
      inline def setVerticesToRemove(value: js.Array[RangeVertex]): Self = StObject.set(x, "verticesToRemove", value.asInstanceOf[js.Any])
      
      inline def setVerticesToRemoveVarargs(value: RangeVertex*): Self = StObject.set(x, "verticesToRemove", js.Array(value*))
    }
  }
}
