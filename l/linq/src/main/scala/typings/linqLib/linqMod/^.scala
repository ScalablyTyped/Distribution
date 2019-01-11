package typings
package linqLib.linqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linq", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Utils: linqLib.Anon_CreateEnumerable = js.native
  def choice[T](params: T*): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def cycle[T](params: T*): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def defer[T](enumerableFactory: js.Function0[linqLib.linqMod.EnumerableNs.IEnumerable[T]]): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def empty[T](): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def from(): linqLib.linqMod.EnumerableNs.IEnumerable[_] = js.native
  def from(obj: java.lang.String): linqLib.linqMod.EnumerableNs.IEnumerable[java.lang.String] = js.native
  def from(obj: js.Any): linqLib.linqMod.EnumerableNs.IEnumerable[linqLib.Anon_Key] = js.native
  def from(obj: scala.Boolean): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Boolean] = js.native
  def from(obj: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def from[T](obj: js.Array[T]): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def from[T](obj: linqLib.Anon_Length[T]): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def from[T](obj: linqLib.linqMod.EnumerableNs.IEnumerable[T]): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def generate[T](func: js.Function0[T]): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def generate[T](func: js.Function0[T], count: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def make[T](element: T): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def matches[T](input: java.lang.String, pattern: java.lang.String): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def matches[T](input: java.lang.String, pattern: java.lang.String, flags: java.lang.String): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def matches[T](input: java.lang.String, pattern: stdLib.RegExp): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def range(start: scala.Double, count: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def range(start: scala.Double, count: scala.Double, step: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def rangeDown(start: scala.Double, count: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def rangeDown(start: scala.Double, count: scala.Double, step: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def rangeTo(start: scala.Double, to: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def rangeTo(start: scala.Double, to: scala.Double, step: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def repeat[T](element: T): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def repeat[T](element: T, count: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def repeatWithFinalize[T](initializer: js.Function0[T], finalizer: js.Function1[/* element */ T, scala.Unit]): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
  def toInfinity(): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def toInfinity(start: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def toInfinity(start: scala.Double, step: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def toNegativeInfinity(): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def toNegativeInfinity(start: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def toNegativeInfinity(start: scala.Double, step: scala.Double): linqLib.linqMod.EnumerableNs.IEnumerable[scala.Double] = js.native
  def unfold[T](seed: T, func: js.Function1[/* value */ T, T]): linqLib.linqMod.EnumerableNs.IEnumerable[T] = js.native
}

