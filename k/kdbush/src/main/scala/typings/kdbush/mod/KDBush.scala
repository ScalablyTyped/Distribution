package typings.kdbush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KDBush[T] extends js.Object {
  var coords: js.Array[Double]
  var ids: js.Array[Double]
  var nodeSize: Double
  var points: js.Array[T]
  def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double]
  def within(x: Double, y: Double, r: Double): js.Array[Double]
}

object KDBush {
  @scala.inline
  def apply[T](
    coords: js.Array[Double],
    ids: js.Array[Double],
    nodeSize: Double,
    points: js.Array[T],
    range: (Double, Double, Double, Double) => js.Array[Double],
    within: (Double, Double, Double) => js.Array[Double]
  ): KDBush[T] = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], nodeSize = nodeSize.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], range = js.Any.fromFunction4(range), within = js.Any.fromFunction3(within))
  
    __obj.asInstanceOf[KDBush[T]]
  }
}

