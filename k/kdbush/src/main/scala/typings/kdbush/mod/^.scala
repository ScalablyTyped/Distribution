package typings.kdbush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbush", JSImport.Namespace)
@js.native
class ^[T] protected () extends KDBush[T] {
  def this(points: Points) = this()
  def this(points: js.Array[T], getX: Get[T], getY: Get[T]) = this()
  def this(points: js.Array[T], getX: Get[T], getY: Get[T], nodeSize: Double) = this()
  def this(
    points: js.Array[T],
    getX: Get[T],
    getY: Get[T],
    nodeSize: Double,
    ArrayType: typings.kdbush.mod.ArrayType
  ) = this()
  /* CompleteClass */
  override var coords: js.Array[Double] = js.native
  /* CompleteClass */
  override var ids: js.Array[Double] = js.native
  /* CompleteClass */
  override var nodeSize: Double = js.native
  /* CompleteClass */
  override var points: js.Array[T] = js.native
  /* CompleteClass */
  override def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double] = js.native
  /* CompleteClass */
  override def within(x: Double, y: Double, r: Double): js.Array[Double] = js.native
}

