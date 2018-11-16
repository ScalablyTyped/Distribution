package typings
package kdbushLib.kdbushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbush", JSImport.Namespace)
@js.native
object kdbushModMembers extends js.Object {
  def apply(points: kdbushLib.Points): kdbushLib.kdbushMod.kdbushNs.KDBush[kdbushLib.Points] = js.native
  def apply[T](points: js.Array[T], getX: kdbushLib.Get[T], getY: kdbushLib.Get[T]): kdbushLib.kdbushMod.kdbushNs.KDBush[T] = js.native
  def apply[T](points: js.Array[T], getX: kdbushLib.Get[T], getY: kdbushLib.Get[T], nodeSize: scala.Double): kdbushLib.kdbushMod.kdbushNs.KDBush[T] = js.native
  def apply[T](
    points: js.Array[T],
    getX: kdbushLib.Get[T],
    getY: kdbushLib.Get[T],
    nodeSize: scala.Double,
    ArrayType: kdbushLib.ArrayType
  ): kdbushLib.kdbushMod.kdbushNs.KDBush[T] = js.native
}

