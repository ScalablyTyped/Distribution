package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TransferableGridIndex")
@js.native
open class TransferableGridIndex protected () extends StObject {
  def this(extent: js.typedarray.ArrayBuffer) = this()
  def this(extent: Double) = this()
  def this(extent: js.typedarray.ArrayBuffer, n: Double) = this()
  def this(extent: Double, n: Double) = this()
  def this(extent: js.typedarray.ArrayBuffer, n: Double, padding: Double) = this()
  def this(extent: js.typedarray.ArrayBuffer, n: scala.Unit, padding: Double) = this()
  def this(extent: Double, n: Double, padding: Double) = this()
  def this(extent: Double, n: scala.Unit, padding: Double) = this()
  
  def _convertFromCellCoord(x: Any): Double = js.native
  
  def _convertToCellCoord(x: Any): Double = js.native
  
  def _forEachCell(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    fn: js.Function,
    arg1: Any,
    arg2: Any,
    intersectionTest: Any
  ): scala.Unit = js.native
  
  def _insertCell(x1: Double, y1: Double, x2: Double, y2: Double, cellIndex: Double, uid: Double): scala.Unit = js.native
  
  def _insertReadonly(): scala.Unit = js.native
  
  def _queryCell(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    cellIndex: Double,
    result: Any,
    seenUids: Any,
    intersectionTest: js.Function
  ): scala.Unit = js.native
  
  var arrayBuffer: js.typedarray.ArrayBuffer = js.native
  
  var bboxes: js.Array[Double] = js.native
  
  var cells: js.Array[js.Array[Double]] = js.native
  
  var d: Double = js.native
  
  var extent: Double = js.native
  
  def insert(key: Double, x1: Double, y1: Double, x2: Double, y2: Double): scala.Unit = js.native
  
  var keys: js.Array[Double] = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var n: Double = js.native
  
  var padding: Double = js.native
  
  def query(x1: Double, y1: Double, x2: Double, y2: Double): js.Array[Double] = js.native
  def query(x1: Double, y1: Double, x2: Double, y2: Double, intersectionTest: js.Function): js.Array[Double] = js.native
  
  var scale: Any = js.native
  
  def toArrayBuffer(): js.typedarray.ArrayBuffer = js.native
  
  var uid: Double = js.native
}
/* static members */
object TransferableGridIndex {
  
  @JSImport("maplibre-gl", "TransferableGridIndex")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize(serialized: SerializedGrid): TransferableGridIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any]).asInstanceOf[TransferableGridIndex]
  
  inline def serialize(grid: TransferableGridIndex): SerializedGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(grid.asInstanceOf[js.Any]).asInstanceOf[SerializedGrid]
  inline def serialize(grid: TransferableGridIndex, transferables: js.Array[Transferable]): SerializedGrid = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(grid.asInstanceOf[js.Any], transferables.asInstanceOf[js.Any])).asInstanceOf[SerializedGrid]
}
