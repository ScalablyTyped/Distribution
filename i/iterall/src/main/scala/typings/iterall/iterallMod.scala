package typings.iterall

import typings.std.AsyncIterable
import typings.std.AsyncIterator
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iterall", JSImport.Namespace)
@js.native
object iterallMod extends js.Object {
  @JSName("$$asyncIterator")
  var DollarDollarasyncIterator: js.Symbol = js.native
  @JSName("$$iterator")
  var DollarDollariterator: js.Symbol = js.native
  def createAsyncIterator(collection: js.Any): Unit | (AsyncIterator[_, _, js.UndefOr[scala.Nothing]]) = js.native
  def createAsyncIterator(collection: Anon_Length): AsyncIterator[_, _, js.UndefOr[scala.Nothing]] = js.native
  def createAsyncIterator[TValue](collection: AsyncIterable[TValue]): AsyncIterator[TValue, _, js.UndefOr[scala.Nothing]] = js.native
  def createAsyncIterator[TValue](collection: Iterable[js.Promise[TValue] | TValue]): AsyncIterator[TValue, _, js.UndefOr[scala.Nothing]] = js.native
  def createIterator(collection: js.Any): Unit | (Iterator[_, _, js.UndefOr[scala.Nothing]]) = js.native
  def createIterator(collection: Anon_Length): Iterator[_, _, js.UndefOr[scala.Nothing]] = js.native
  def createIterator[TValue](collection: Iterable[TValue]): Iterator[TValue, _, js.UndefOr[scala.Nothing]] = js.native
  def forAwaitEach[TCollection /* <: Anon_Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, _]
  ): js.Promise[Unit] = js.native
  def forAwaitEach[TCollection /* <: Anon_Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): js.Promise[Unit] = js.native
  @JSName("forAwaitEach")
  def forAwaitEach_TValueTCollection_AsyncIterableTValue[TValue, TCollection /* <: AsyncIterable[TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ Double, /* collection */ TCollection, _]
  ): js.Promise[Unit] = js.native
  @JSName("forAwaitEach")
  def forAwaitEach_TValueTCollection_AsyncIterableTValue[TValue, TCollection /* <: AsyncIterable[TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): js.Promise[Unit] = js.native
  @JSName("forAwaitEach")
  def forAwaitEach_TValueTCollection_IterableUnionPromiseTValueTValue[TValue, TCollection /* <: Iterable[js.Promise[TValue] | TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ Double, /* collection */ TCollection, _]
  ): js.Promise[Unit] = js.native
  @JSName("forAwaitEach")
  def forAwaitEach_TValueTCollection_IterableUnionPromiseTValueTValue[TValue, TCollection /* <: Iterable[js.Promise[TValue] | TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): js.Promise[Unit] = js.native
  def forEach[TCollection /* <: Anon_Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, _]
  ): Unit = js.native
  def forEach[TCollection /* <: Anon_Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): Unit = js.native
  @JSName("forEach")
  def forEach_TValueTCollection_IterableTValue[TValue, TCollection /* <: Iterable[TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ Double, /* collection */ TCollection, _]
  ): Unit = js.native
  @JSName("forEach")
  def forEach_TValueTCollection_IterableTValue[TValue, TCollection /* <: Iterable[TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): Unit = js.native
  def getAsyncIterator(asyncIterable: js.Any): Unit | (AsyncIterator[_, _, js.UndefOr[scala.Nothing]]) = js.native
  def getAsyncIterator[TValue](asyncIterable: AsyncIterable[TValue]): AsyncIterator[TValue, _, js.UndefOr[scala.Nothing]] = js.native
  def getAsyncIteratorMethod(asyncIterable: js.Any): Unit | (js.Function0[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]]) = js.native
  def getAsyncIteratorMethod[TValue](asyncIterable: AsyncIterable[TValue]): js.Function0[AsyncIterator[TValue, _, js.UndefOr[scala.Nothing]]] = js.native
  def getIterator(iterable: js.Any): Unit | (Iterator[_, _, js.UndefOr[scala.Nothing]]) = js.native
  def getIterator[TValue](iterable: Iterable[TValue]): Iterator[TValue, _, js.UndefOr[scala.Nothing]] = js.native
  def getIteratorMethod(iterable: js.Any): Unit | (js.Function0[Iterator[_, _, js.UndefOr[scala.Nothing]]]) = js.native
  def getIteratorMethod[TValue](iterable: Iterable[TValue]): js.Function0[Iterator[TValue, _, js.UndefOr[scala.Nothing]]] = js.native
  def isArrayLike(obj: js.Any): /* is iterall.Anon_Length */ Boolean = js.native
  def isAsyncIterable(obj: js.Any): /* is std.AsyncIterable<any> */ Boolean = js.native
  def isCollection(obj: js.Any): Boolean = js.native
  def isIterable(obj: js.Any): /* is std.Iterable<any> */ Boolean = js.native
}

