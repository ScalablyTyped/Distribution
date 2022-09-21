package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "GridIndex")
@js.native
open class GridIndex[T /* <: GridKey */] protected () extends StObject {
  def this(width: Double, height: Double, cellSize: Double) = this()
  
  /* private */ var _circleAndRectCollide: Any = js.native
  
  /* private */ var _circlesCollide: Any = js.native
  
  /* private */ var _convertToXCellCoord: Any = js.native
  
  /* private */ var _convertToYCellCoord: Any = js.native
  
  /* private */ var _forEachCell: Any = js.native
  
  /* private */ var _insertBoxCell: Any = js.native
  
  /* private */ var _insertCircleCell: Any = js.native
  
  /* private */ var _query: Any = js.native
  
  /* private */ var _queryCell: Any = js.native
  
  /* private */ var _queryCellCircle: Any = js.native
  
  var bboxes: js.Array[Double] = js.native
  
  var boxCells: js.Array[js.Array[Double]] = js.native
  
  var boxKeys: js.Array[T] = js.native
  
  var boxUid: Double = js.native
  
  var circleCells: js.Array[js.Array[Double]] = js.native
  
  var circleKeys: js.Array[T] = js.native
  
  var circleUid: Double = js.native
  
  var circles: js.Array[Double] = js.native
  
  var height: Double = js.native
  
  def hitTest(x1: Double, y1: Double, x2: Double, y2: Double, overlapMode: OverlapMode): Boolean = js.native
  def hitTest(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    overlapMode: OverlapMode,
    predicate: js.Function1[/* key */ T, Boolean]
  ): Boolean = js.native
  
  def hitTestCircle(x: Double, y: Double, radius: Double, overlapMode: OverlapMode): Boolean = js.native
  def hitTestCircle(
    x: Double,
    y: Double,
    radius: Double,
    overlapMode: OverlapMode,
    predicate: js.Function1[/* key */ T, Boolean]
  ): Boolean = js.native
  
  def insert(key: T, x1: Double, y1: Double, x2: Double, y2: Double): scala.Unit = js.native
  
  def insertCircle(key: T, x: Double, y: Double, radius: Double): scala.Unit = js.native
  
  def keysLength(): Double = js.native
  
  def query(x1: Double, y1: Double, x2: Double, y2: Double): js.Array[QueryResult[T]] = js.native
  
  var width: Double = js.native
  
  var xCellCount: Double = js.native
  
  var xScale: Double = js.native
  
  var yCellCount: Double = js.native
  
  var yScale: Double = js.native
}
