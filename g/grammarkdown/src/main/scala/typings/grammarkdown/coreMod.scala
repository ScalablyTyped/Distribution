package typings.grammarkdown

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.esfxAsyncCanceltoken.mod.CancelToken
import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.grammarkdownNumbers.`-1`
import typings.grammarkdown.grammarkdownNumbers.`0`
import typings.grammarkdown.grammarkdownNumbers.`1`
import typings.prex.mod.CancellationToken
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Map
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  
  def binarySearch(array: js.Array[Double], value: Double): Double = js.native
  
  def binarySearchBy[T, K](array: js.Array[T], key: K, selector: js.Function1[/* value */ T, K]): Double = js.native
  def binarySearchBy[T, K](
    array: js.Array[T],
    key: K,
    selector: js.Function1[/* value */ T, K],
    comparison: js.Function2[/* x */ K, /* y */ K, Double]
  ): Double = js.native
  
  def compare(x: js.Any, y: js.Any): `1` | `0` | `-1` = js.native
  
  def compareNumbers(a: Double, b: Double): Double = js.native
  
  def compareStrings(): `1` | `0` | `-1` = js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: String): `1` | `0` | `-1` = js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: String, ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  def compareStrings(x: String): `1` | `0` | `-1` = js.native
  def compareStrings(x: String, y: js.UndefOr[scala.Nothing], ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  def compareStrings(x: String, y: String): `1` | `0` | `-1` = js.native
  def compareStrings(x: String, y: String, ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  
  def concat[T](): js.UndefOr[js.Array[T]] = js.native
  def concat[T](a: js.UndefOr[scala.Nothing], b: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  def concat[T](a: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  def concat[T](a: js.Array[T], b: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  @JSName("concat")
  def concat_T_Array[T](a: js.UndefOr[scala.Nothing], b: js.Array[T]): js.Array[T] = js.native
  @JSName("concat")
  def concat_T_Array[T](a: js.Array[T]): js.Array[T] = js.native
  @JSName("concat")
  def concat_T_Array[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = js.native
  
  def deduplicateSorted[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Double | Boolean]): js.Array[T] = js.native
  
  val emptyIterable: IterableIterator[scala.Nothing] = js.native
  
  def first[T](): js.UndefOr[T] = js.native
  def first[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  def first[T](iterable: Iterable[T]): js.UndefOr[T] = js.native
  
  def forEach[T, U](array: js.UndefOr[scala.Nothing], cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  def forEach[T, U](array: js.Array[T], cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  
  def forEachPossiblyAsync[T, U](iterable: Iterable[T], callback: js.Function1[/* value */ T, js.UndefOr[js.Promise[U] | U]]): Unit | js.Promise[Unit] = js.native
  
  def getLocalPath(file: String): String = js.native
  
  def identity[T](value: T): T = js.native
  
  def isFileUri(file: String): Boolean = js.native
  
  def isPromise[T](): /* is std.Promise<T> */ Boolean = js.native
  def isPromise[T](value: T): /* is std.Promise<T> */ Boolean = js.native
  def isPromise[T](value: js.Promise[T]): /* is std.Promise<T> */ Boolean = js.native
  
  def isUri(file: String): Boolean = js.native
  
  def last[T](): js.UndefOr[T] = js.native
  def last[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  def last[T](iterable: Iterable[T]): js.UndefOr[T] = js.native
  
  def mapFromObject[T](`object`: DictionaryLike[T]): Map[String, T] = js.native
  
  def mapSet[K, V](map: Map[K, V], key: K, value: V): V = js.native
  def mapSet[K /* <: js.Object */, V](map: WeakMap[K, V], key: K, value: V): V = js.native
  
  def only[T](): js.UndefOr[T] = js.native
  def only[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  def only[T](iterable: Iterable[T]): js.UndefOr[T] = js.native
  
  def pipe[T, U](result: T, next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = js.native
  def pipe[T, U](
    result: js.UndefOr[scala.Nothing],
    next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]
  ): U | js.Promise[U] = js.native
  def pipe[T, U](result: js.Promise[T], next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = js.native
  
  def promiseFinally[T](promise: js.Thenable[T], onFinally: js.Function0[Unit]): js.Thenable[T] = js.native
  
  def stableSort[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  
  def toCancelToken(): js.UndefOr[CancelToken] = js.native
  def toCancelToken(cancelable: Cancelable): js.UndefOr[CancelToken] = js.native
  @JSName("toCancelToken")
  def toCancelToken_CancelToken(cancelable: Cancelable): CancelToken = js.native
  
  def wrapCancelToken(): js.UndefOr[CancelToken with CancellationToken] = js.native
  def wrapCancelToken(cancelToken: CancelToken): js.UndefOr[CancelToken with CancellationToken] = js.native
  @JSName("wrapCancelToken")
  def wrapCancelToken_Intersection(cancelToken: CancelToken): CancelToken with CancellationToken = js.native
  
  type DictionaryLike[T] = StringDictionary[T] with NumberDictionary[T]
}
