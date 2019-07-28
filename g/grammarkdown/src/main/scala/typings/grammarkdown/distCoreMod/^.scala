package typings.grammarkdown.distCoreMod

import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Map
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val emptyIterable: IterableIterator[scala.Nothing] = js.native
  def binarySearch(array: js.Array[Double], value: Double): Double = js.native
  def compare(x: js.Any, y: js.Any): `1` | `0` | `-1` = js.native
  def compareStrings(): `1` | `0` | `-1` = js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: String): `1` | `0` | `-1` = js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: String, ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  def compareStrings(x: String): `1` | `0` | `-1` = js.native
  def compareStrings(x: String, y: js.UndefOr[scala.Nothing], ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  def compareStrings(x: String, y: String): `1` | `0` | `-1` = js.native
  def compareStrings(x: String, y: String, ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  def concat[T](): js.UndefOr[js.Array[T]] = js.native
  def concat[T](a: js.UndefOr[scala.Nothing], b: js.Array[T]): js.Array[T] = js.native
  def concat[T](a: js.Array[T]): js.Array[T] = js.native
  def concat[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = js.native
  @JSName("concat")
  def concat_T_Union[T](a: js.UndefOr[scala.Nothing], b: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  @JSName("concat")
  def concat_T_Union[T](a: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  @JSName("concat")
  def concat_T_Union[T](a: js.Array[T], b: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  def first[T](): js.UndefOr[T] = js.native
  def first[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  def first[T](iterable: Iterable[T]): js.UndefOr[T] = js.native
  def forEach[T, U](array: js.UndefOr[scala.Nothing], cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  def forEach[T, U](array: js.Array[T], cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  def forEachPossiblyAsync[T, U](iterable: Iterable[T], callback: js.Function1[/* value */ T, js.UndefOr[js.Promise[U] | U]]): Unit | js.Promise[Unit] = js.native
  def isPromise[T](): /* is std.Promise<T> */ Boolean = js.native
  def isPromise[T](value: T): /* is std.Promise<T> */ Boolean = js.native
  def isPromise[T](value: js.Promise[T]): /* is std.Promise<T> */ Boolean = js.native
  def last[T](): js.UndefOr[T] = js.native
  def last[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  def last[T](iterable: Iterable[T]): js.UndefOr[T] = js.native
  def mapFromObject[T](`object`: DictionaryLike[T]): Map[String, T] = js.native
  def mapSet[K, V](map: Map[K, V], key: K, value: V): V = js.native
  def mapSet[K /* <: js.Object */, V](map: WeakMap[K, V], key: K, value: V): V = js.native
  def only[T](): js.UndefOr[T] = js.native
  def only[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  def only[T](iterable: Iterable[T]): js.UndefOr[T] = js.native
  def pipe[T, U](result: T, next: js.Function1[js.UndefOr[/* value */ T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = js.native
  def pipe[T, U](
    result: js.UndefOr[scala.Nothing],
    next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]
  ): U | js.Promise[U] = js.native
  def pipe[T, U](
    result: js.Promise[T],
    next: js.Function1[js.UndefOr[/* value */ T], js.UndefOr[js.Promise[U] | U]]
  ): U | js.Promise[U] = js.native
  def promiseFinally[T](promise: js.Promise[T], onFinally: js.Function0[Unit]): js.Promise[T] = js.native
  def stableSort[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
}

