package typings.kdbush.kdbushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbush", "KDBush")
@js.native
class KDBush[T] () extends js.Object {
  var coords: js.Array[Double] = js.native
  var ids: js.Array[Double] = js.native
  var nodeSize: Double = js.native
  var points: js.Array[T] = js.native
  def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double] = js.native
  def within(x: Double, y: Double, r: Double): js.Array[Double] = js.native
}

