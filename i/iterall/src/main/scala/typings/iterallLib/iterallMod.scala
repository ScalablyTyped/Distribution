package typings
package iterallLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iterall", JSImport.Namespace)
@js.native
object iterallMod extends js.Object {
  @JSName("$$asyncIterator")
  var $$asyncIterator: js.Symbol = js.native
  @JSName("$$iterator")
  var $$iterator: js.Symbol = js.native
  def createAsyncIterator(collection: iterallLib.Anon_Length): stdLib.AsyncIterator[_] = js.native
  def createAsyncIterator(collection: js.Any): scala.Unit | stdLib.AsyncIterator[_] = js.native
  def createAsyncIterator[TValue](collection: stdLib.AsyncIterable[TValue]): stdLib.AsyncIterator[TValue] = js.native
  def createAsyncIterator[TValue](collection: stdLib.Iterable[js.Promise[TValue] | TValue]): stdLib.AsyncIterator[TValue] = js.native
  def createIterator(collection: iterallLib.Anon_Length): stdLib.Iterator[_] = js.native
  def createIterator(collection: js.Any): scala.Unit | stdLib.Iterator[_] = js.native
  def createIterator[TValue](collection: stdLib.Iterable[TValue]): stdLib.Iterator[TValue] = js.native
  def forAwaitEach[TCollection /* <: iterallLib.Anon_Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ scala.Double, /* collection */ TCollection, _]
  ): js.Promise[scala.Unit] = js.native
  def forAwaitEach[TCollection /* <: iterallLib.Anon_Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ scala.Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): js.Promise[scala.Unit] = js.native
  @JSName("forAwaitEach")
  def forAwaitEach_TValueTCollectionAsyncIterable[TValue, TCollection /* <: stdLib.AsyncIterable[TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ scala.Double, /* collection */ TCollection, _]
  ): js.Promise[scala.Unit] = js.native
  @JSName("forAwaitEach")
  def forAwaitEach_TValueTCollectionAsyncIterable[TValue, TCollection /* <: stdLib.AsyncIterable[TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ scala.Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): js.Promise[scala.Unit] = js.native
  @JSName("forAwaitEach")
  def forAwaitEach_TValueTCollectionIterable[TValue, TCollection /* <: stdLib.Iterable[js.Promise[TValue] | TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ scala.Double, /* collection */ TCollection, _]
  ): js.Promise[scala.Unit] = js.native
  @JSName("forAwaitEach")
  def forAwaitEach_TValueTCollectionIterable[TValue, TCollection /* <: stdLib.Iterable[js.Promise[TValue] | TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ scala.Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): js.Promise[scala.Unit] = js.native
  def forEach[TCollection /* <: iterallLib.Anon_Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ scala.Double, /* collection */ TCollection, _]
  ): scala.Unit = js.native
  def forEach[TCollection /* <: iterallLib.Anon_Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ scala.Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): scala.Unit = js.native
  @JSName("forEach")
  def forEach_TValueTCollectionIterable[TValue, TCollection /* <: stdLib.Iterable[TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ scala.Double, /* collection */ TCollection, _]
  ): scala.Unit = js.native
  @JSName("forEach")
  def forEach_TValueTCollectionIterable[TValue, TCollection /* <: stdLib.Iterable[TValue] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ TValue, /* index */ scala.Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): scala.Unit = js.native
  def getAsyncIterator(asyncIterable: js.Any): scala.Unit | stdLib.AsyncIterator[_] = js.native
  def getAsyncIterator[TValue](asyncIterable: stdLib.AsyncIterable[TValue]): stdLib.AsyncIterator[TValue] = js.native
  def getAsyncIteratorMethod(asyncIterable: js.Any): scala.Unit | js.Function0[stdLib.AsyncIterator[_]] = js.native
  def getAsyncIteratorMethod[TValue](asyncIterable: stdLib.AsyncIterable[TValue]): js.Function0[stdLib.AsyncIterator[TValue]] = js.native
  def getIterator(iterable: js.Any): scala.Unit | stdLib.Iterator[_] = js.native
  def getIterator[TValue](iterable: stdLib.Iterable[TValue]): stdLib.Iterator[TValue] = js.native
  def getIteratorMethod(iterable: js.Any): scala.Unit | js.Function0[stdLib.Iterator[_]] = js.native
  def getIteratorMethod[TValue](iterable: stdLib.Iterable[TValue]): js.Function0[stdLib.Iterator[TValue]] = js.native
  def isArrayLike(obj: js.Any): /* is Anon_Length */scala.Boolean = js.native
  def isAsyncIterable(obj: js.Any): /* is AsyncIterable */scala.Boolean = js.native
  def isCollection(obj: js.Any): scala.Boolean = js.native
  def isIterable(obj: js.Any): /* is Iterable */scala.Boolean = js.native
}

