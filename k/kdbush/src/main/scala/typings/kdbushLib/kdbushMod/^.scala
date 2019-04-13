package typings
package kdbushLib.kdbushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbush", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(points: kdbushLib.Points): KDBush[kdbushLib.Points] = js.native
  def apply[T](points: js.Array[T], getX: kdbushLib.Get[T], getY: kdbushLib.Get[T]): KDBush[T] = js.native
  def apply[T](points: js.Array[T], getX: kdbushLib.Get[T], getY: kdbushLib.Get[T], nodeSize: scala.Double): KDBush[T] = js.native
  def apply[T](
    points: js.Array[T],
    getX: kdbushLib.Get[T],
    getY: kdbushLib.Get[T],
    nodeSize: scala.Double,
    ArrayType: kdbushLib.ArrayType
  ): KDBush[T] = js.native
}

