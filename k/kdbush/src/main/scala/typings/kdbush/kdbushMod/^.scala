package typings.kdbush.kdbushMod

import typings.kdbush.Points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbush", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(points: Points): KDBush[Points] = js.native
  def apply[T](points: js.Array[T], getX: Get[T], getY: Get[T]): KDBush[T] = js.native
  def apply[T](points: js.Array[T], getX: Get[T], getY: Get[T], nodeSize: Double): KDBush[T] = js.native
  def apply[T](points: js.Array[T], getX: Get[T], getY: Get[T], nodeSize: Double, ArrayType: ArrayType): KDBush[T] = js.native
}

