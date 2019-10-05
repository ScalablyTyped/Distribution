package typings.kdbush

import typings.kdbush.kdbushMod.ArrayType
import typings.kdbush.kdbushMod.Get
import typings.kdbush.kdbushMod.KDBush
import typings.std.ArrayConstructor
import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbush", JSImport.Namespace)
@js.native
object kdbushMod extends js.Object {
  @js.native
  class KDBush[T] () extends js.Object {
    var coords: js.Array[Double] = js.native
    var ids: js.Array[Double] = js.native
    var nodeSize: Double = js.native
    var points: js.Array[T] = js.native
    def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double] = js.native
    def within(x: Double, y: Double, r: Double): js.Array[Double] = js.native
  }
  
  def apply(points: Points): KDBush[Points] = js.native
  def apply[T](points: js.Array[T], getX: Get[T], getY: Get[T]): KDBush[T] = js.native
  def apply[T](points: js.Array[T], getX: Get[T], getY: Get[T], nodeSize: Double): KDBush[T] = js.native
  def apply[T](points: js.Array[T], getX: Get[T], getY: Get[T], nodeSize: Double, ArrayType: ArrayType): KDBush[T] = js.native
  type ArrayType = Int8ArrayConstructor | Int16ArrayConstructor | Int32ArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor | ArrayConstructor
  type Get[T] = js.Function1[/* point */ T, Double]
}

