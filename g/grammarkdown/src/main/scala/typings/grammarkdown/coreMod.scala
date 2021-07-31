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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("grammarkdown/dist/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def binarySearch(array: js.Array[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def binarySearchBy[T, K](array: js.Array[T], key: K, selector: js.Function1[/* value */ T, K]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearchBy")(array.asInstanceOf[js.Any], key.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def binarySearchBy[T, K](
    array: js.Array[T],
    key: K,
    selector: js.Function1[/* value */ T, K],
    comparison: js.Function2[/* x */ K, /* y */ K, Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearchBy")(array.asInstanceOf[js.Any], key.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], comparison.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def compare(x: js.Any, y: js.Any): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  @scala.inline
  def compareNumbers(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareNumbers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def compareStrings(): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")().asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareStrings(x: String): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any]).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareStrings(x: String, y: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareStrings(x: String, y: String, ignoreCase: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareStrings(x: String, y: Unit, ignoreCase: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareStrings(x: Unit, y: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareStrings(x: Unit, y: String, ignoreCase: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  @scala.inline
  def compareStrings(x: Unit, y: Unit, ignoreCase: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  @scala.inline
  def concat[T](): js.UndefOr[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")().asInstanceOf[js.UndefOr[js.Array[T]]]
  @scala.inline
  def concat[T](a: js.Array[T]): js.UndefOr[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[T]]]
  @scala.inline
  def concat[T](a: js.Array[T], b: js.Array[T]): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
  @scala.inline
  def concat[T](a: Unit, b: js.Array[T]): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
  
  @scala.inline
  def concat_T_Array[T](a: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def concat_T_Array[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def concat_T_Array[T](a: Unit, b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def deduplicateSorted[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Double | Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deduplicateSorted")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("grammarkdown/dist/core", "emptyIterable")
  @js.native
  val emptyIterable: IterableIterator[scala.Nothing] = js.native
  
  @scala.inline
  def first[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def first[T](iterable: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def first[T](iterable: Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def forEach[T, U](array: js.Array[T], cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
  @scala.inline
  def forEach[T, U](array: Unit, cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
  
  @scala.inline
  def forEachPossiblyAsync[T, U](iterable: Iterable[T], callback: js.Function1[/* value */ T, js.UndefOr[js.Promise[U] | U]]): Unit | js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachPossiblyAsync")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Unit]]
  
  @scala.inline
  def getLocalPath(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalPath")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def identity[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def isFileUri(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileUri")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPromise[T](): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")().asInstanceOf[/* is std.Promise<T> */ Boolean]
  @scala.inline
  def isPromise[T](value: T): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  @scala.inline
  def isPromise[T](value: js.Promise[T]): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  
  @scala.inline
  def isUri(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUri")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def last[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def last[T](iterable: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def last[T](iterable: Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def mapFromObject[T](`object`: DictionaryLike[T]): Map[String, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapFromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Map[String, T]]
  
  @scala.inline
  def mapSet[K, V](map: Map[K, V], key: K, value: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSet")(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[V]
  @scala.inline
  def mapSet[K /* <: js.Object */, V](map: WeakMap[K, V], key: K, value: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSet")(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[V]
  
  @scala.inline
  def only[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("only")().asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def only[T](iterable: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def only[T](iterable: Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def pipe[T, U](result: T, next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(result.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[U | js.Promise[U]]
  @scala.inline
  def pipe[T, U](result: js.Promise[T], next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(result.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[U | js.Promise[U]]
  @scala.inline
  def pipe[T, U](result: Unit, next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(result.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[U | js.Promise[U]]
  
  @scala.inline
  def promiseFinally[T](promise: js.Thenable[T], onFinally: js.Function0[Unit]): js.Thenable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("promiseFinally")(promise.asInstanceOf[js.Any], onFinally.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[T]]
  
  @scala.inline
  def stableSort[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def toCancelToken(): js.UndefOr[CancelToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCancelToken")().asInstanceOf[js.UndefOr[CancelToken]]
  @scala.inline
  def toCancelToken(cancelable: Cancelable): js.UndefOr[CancelToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCancelToken")(cancelable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CancelToken]]
  
  @scala.inline
  def toCancelToken_CancelToken(cancelable: Cancelable): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("toCancelToken")(cancelable.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
  
  @scala.inline
  def wrapCancelToken(): js.UndefOr[CancelToken & CancellationToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapCancelToken")().asInstanceOf[js.UndefOr[CancelToken & CancellationToken]]
  @scala.inline
  def wrapCancelToken(cancelToken: CancelToken): js.UndefOr[CancelToken & CancellationToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapCancelToken")(cancelToken.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CancelToken & CancellationToken]]
  
  @scala.inline
  def wrapCancelToken_Intersection(cancelToken: CancelToken): CancelToken & CancellationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapCancelToken")(cancelToken.asInstanceOf[js.Any]).asInstanceOf[CancelToken & CancellationToken]
  
  type DictionaryLike[T] = StringDictionary[T] & NumberDictionary[T]
}
