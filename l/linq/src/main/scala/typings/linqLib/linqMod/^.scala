package typings
package linqLib.linqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linq", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def choice[T](params: T*): IEnumerable[T] = js.native
  def cycle[T](params: T*): IEnumerable[T] = js.native
  def defer[T](enumerableFactory: js.Function0[IEnumerable[T]]): IEnumerable[T] = js.native
  def empty[T](): IEnumerable[T] = js.native
  def from(): IEnumerable[_] = js.native
  def from(obj: java.lang.String): IEnumerable[java.lang.String] = js.native
  def from(obj: js.Any): IEnumerable[linqLib.Anon_Key] = js.native
  def from(obj: scala.Boolean): IEnumerable[scala.Boolean] = js.native
  def from(obj: scala.Double): IEnumerable[scala.Double] = js.native
  def from[T](obj: js.Array[T]): IEnumerable[T] = js.native
  def from[T](obj: linqLib.Anon_Length[T]): IEnumerable[T] = js.native
  def from[T](obj: IEnumerable[T]): IEnumerable[T] = js.native
  def generate[T](func: js.Function0[T]): IEnumerable[T] = js.native
  def generate[T](func: js.Function0[T], count: scala.Double): IEnumerable[T] = js.native
  def make[T](element: T): IEnumerable[T] = js.native
  def matches[T](input: java.lang.String, pattern: java.lang.String): IEnumerable[T] = js.native
  def matches[T](input: java.lang.String, pattern: java.lang.String, flags: java.lang.String): IEnumerable[T] = js.native
  def matches[T](input: java.lang.String, pattern: stdLib.RegExp): IEnumerable[T] = js.native
  def range(start: scala.Double, count: scala.Double): IEnumerable[scala.Double] = js.native
  def range(start: scala.Double, count: scala.Double, step: scala.Double): IEnumerable[scala.Double] = js.native
  def rangeDown(start: scala.Double, count: scala.Double): IEnumerable[scala.Double] = js.native
  def rangeDown(start: scala.Double, count: scala.Double, step: scala.Double): IEnumerable[scala.Double] = js.native
  def rangeTo(start: scala.Double, to: scala.Double): IEnumerable[scala.Double] = js.native
  def rangeTo(start: scala.Double, to: scala.Double, step: scala.Double): IEnumerable[scala.Double] = js.native
  def repeat[T](element: T): IEnumerable[T] = js.native
  def repeat[T](element: T, count: scala.Double): IEnumerable[T] = js.native
  def repeatWithFinalize[T](initializer: js.Function0[T], finalizer: js.Function1[/* element */ T, scala.Unit]): IEnumerable[T] = js.native
  def toInfinity(): IEnumerable[scala.Double] = js.native
  def toInfinity(start: scala.Double): IEnumerable[scala.Double] = js.native
  def toInfinity(start: scala.Double, step: scala.Double): IEnumerable[scala.Double] = js.native
  def toNegativeInfinity(): IEnumerable[scala.Double] = js.native
  def toNegativeInfinity(start: scala.Double): IEnumerable[scala.Double] = js.native
  def toNegativeInfinity(start: scala.Double, step: scala.Double): IEnumerable[scala.Double] = js.native
  def unfold[T](seed: T, func: js.Function1[/* value */ T, T]): IEnumerable[T] = js.native
}

