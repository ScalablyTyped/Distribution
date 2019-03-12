package typings
package kdbushLib.kdbushMod.kdbushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KDBush[T] extends js.Object {
  var coords: js.Array[scala.Double]
  var ids: js.Array[scala.Double]
  var nodeSize: scala.Double
  var points: js.Array[T]
  def range(minX: scala.Double, minY: scala.Double, maxX: scala.Double, maxY: scala.Double): js.Array[scala.Double]
  def within(x: scala.Double, y: scala.Double, r: scala.Double): js.Array[scala.Double]
}

object KDBush {
  @scala.inline
  def apply[T](
    coords: js.Array[scala.Double],
    ids: js.Array[scala.Double],
    nodeSize: scala.Double,
    points: js.Array[T],
    range: (scala.Double, scala.Double, scala.Double, scala.Double) => js.Array[scala.Double],
    within: (scala.Double, scala.Double, scala.Double) => js.Array[scala.Double]
  ): KDBush[T] = {
    val __obj = js.Dynamic.literal(coords = coords, ids = ids, nodeSize = nodeSize, points = points, range = js.Any.fromFunction4(range), within = js.Any.fromFunction3(within))
  
    __obj.asInstanceOf[KDBush[T]]
  }
}

