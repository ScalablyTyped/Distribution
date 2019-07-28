package typings.linq.linqMod

import typings.linq.Anon_Key
import typings.linq.Anon_Length
import typings.std.RegExp
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
  def from(obj: String): IEnumerable[String] = js.native
  def from(obj: js.Any): IEnumerable[Anon_Key] = js.native
  def from(obj: Boolean): IEnumerable[Boolean] = js.native
  def from(obj: Double): IEnumerable[Double] = js.native
  def from[T](obj: js.Array[T]): IEnumerable[T] = js.native
  def from[T](obj: Anon_Length[T]): IEnumerable[T] = js.native
  def from[T](obj: IEnumerable[T]): IEnumerable[T] = js.native
  def generate[T](func: js.Function0[T]): IEnumerable[T] = js.native
  def generate[T](func: js.Function0[T], count: Double): IEnumerable[T] = js.native
  def make[T](element: T): IEnumerable[T] = js.native
  def matches[T](input: String, pattern: String): IEnumerable[T] = js.native
  def matches[T](input: String, pattern: String, flags: String): IEnumerable[T] = js.native
  def matches[T](input: String, pattern: RegExp): IEnumerable[T] = js.native
  def range(start: Double, count: Double): IEnumerable[Double] = js.native
  def range(start: Double, count: Double, step: Double): IEnumerable[Double] = js.native
  def rangeDown(start: Double, count: Double): IEnumerable[Double] = js.native
  def rangeDown(start: Double, count: Double, step: Double): IEnumerable[Double] = js.native
  def rangeTo(start: Double, to: Double): IEnumerable[Double] = js.native
  def rangeTo(start: Double, to: Double, step: Double): IEnumerable[Double] = js.native
  def repeat[T](element: T): IEnumerable[T] = js.native
  def repeat[T](element: T, count: Double): IEnumerable[T] = js.native
  def repeatWithFinalize[T](initializer: js.Function0[T], finalizer: js.Function1[/* element */ T, Unit]): IEnumerable[T] = js.native
  def toInfinity(): IEnumerable[Double] = js.native
  def toInfinity(start: Double): IEnumerable[Double] = js.native
  def toInfinity(start: Double, step: Double): IEnumerable[Double] = js.native
  def toNegativeInfinity(): IEnumerable[Double] = js.native
  def toNegativeInfinity(start: Double): IEnumerable[Double] = js.native
  def toNegativeInfinity(start: Double, step: Double): IEnumerable[Double] = js.native
  def unfold[T](seed: T, func: js.Function1[/* value */ T, T]): IEnumerable[T] = js.native
}

