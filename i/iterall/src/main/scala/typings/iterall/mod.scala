package typings.iterall

import typings.iterall.anon.Length
import typings.std.AsyncIterable
import typings.std.AsyncIterator
import typings.std.Iterable
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iterall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("iterall", "$$asyncIterator")
  @js.native
  val asyncIterator: js.Symbol = js.native
  
  @scala.inline
  def createAsyncIterator(collection: js.Any): Unit | (AsyncIterator[js.Any, js.Any, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[Unit | (AsyncIterator[js.Any, js.Any, Unit])]
  @scala.inline
  def createAsyncIterator(collection: Length): AsyncIterator[js.Any, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[js.Any, js.Any, Unit]]
  @scala.inline
  def createAsyncIterator[TValue](collection: AsyncIterable[TValue]): AsyncIterator[TValue, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[TValue, js.Any, Unit]]
  @scala.inline
  def createAsyncIterator[TValue](collection: Iterable[js.Promise[TValue] | TValue]): AsyncIterator[TValue, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[TValue, js.Any, Unit]]
  
  @scala.inline
  def createIterator(collection: js.Any): Unit | (Iterator[js.Any, js.Any, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("createIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[Unit | (Iterator[js.Any, js.Any, Unit])]
  @scala.inline
  def createIterator(collection: Length): Iterator[js.Any, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[Iterator[js.Any, js.Any, Unit]]
  @scala.inline
  def createIterator[TValue](collection: Iterable[TValue]): Iterator[TValue, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[Iterator[TValue, js.Any, Unit]]
  
  @scala.inline
  def forAwaitEach[TCollection /* <: Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, js.Any]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forAwaitEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def forAwaitEach[TCollection /* <: Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, js.Any],
    thisArg: js.Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forAwaitEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def forAwaitEach_TCollection_AsyncIterableAny[TCollection /* <: AsyncIterable[js.Any] */](
    collection: TCollection,
    callbackFn: js.Function3[
      /* value */ ResolvedOf[TCollection], 
      /* index */ Double, 
      /* collection */ TCollection, 
      js.Any
    ]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forAwaitEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def forAwaitEach_TCollection_AsyncIterableAny[TCollection /* <: AsyncIterable[js.Any] */](
    collection: TCollection,
    callbackFn: js.Function3[
      /* value */ ResolvedOf[TCollection], 
      /* index */ Double, 
      /* collection */ TCollection, 
      js.Any
    ],
    thisArg: js.Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forAwaitEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def forAwaitEach_TCollection_IterableAny[TCollection /* <: Iterable[js.Any] */](
    collection: TCollection,
    callbackFn: js.Function3[
      /* value */ ResolvedOf[TCollection], 
      /* index */ Double, 
      /* collection */ TCollection, 
      js.Any
    ]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forAwaitEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def forAwaitEach_TCollection_IterableAny[TCollection /* <: Iterable[js.Any] */](
    collection: TCollection,
    callbackFn: js.Function3[
      /* value */ ResolvedOf[TCollection], 
      /* index */ Double, 
      /* collection */ TCollection, 
      js.Any
    ],
    thisArg: js.Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forAwaitEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def forEach[TCollection /* <: Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def forEach[TCollection /* <: Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, js.Any],
    thisArg: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def forEach_TCollection_IterableAny[TCollection /* <: Iterable[js.Any] */](
    collection: TCollection,
    callbackFn: js.Function3[
      /* value */ ValueOf[TCollection], 
      /* index */ Double, 
      /* collection */ TCollection, 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def forEach_TCollection_IterableAny[TCollection /* <: Iterable[js.Any] */](
    collection: TCollection,
    callbackFn: js.Function3[
      /* value */ ValueOf[TCollection], 
      /* index */ Double, 
      /* collection */ TCollection, 
      js.Any
    ],
    thisArg: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getAsyncIterator(asyncIterable: js.Any): Unit | (AsyncIterator[js.Any, js.Any, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsyncIterator")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[Unit | (AsyncIterator[js.Any, js.Any, Unit])]
  @scala.inline
  def getAsyncIterator[TValue](asyncIterable: AsyncIterable[TValue]): AsyncIterator[TValue, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsyncIterator")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[TValue, js.Any, Unit]]
  
  @scala.inline
  def getAsyncIteratorMethod(asyncIterable: js.Any): Unit | (js.Function0[AsyncIterator[js.Any, js.Any, Unit]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsyncIteratorMethod")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[Unit | (js.Function0[AsyncIterator[js.Any, js.Any, Unit]])]
  @scala.inline
  def getAsyncIteratorMethod[TValue](asyncIterable: AsyncIterable[TValue]): js.Function0[AsyncIterator[TValue, js.Any, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsyncIteratorMethod")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Function0[AsyncIterator[TValue, js.Any, Unit]]]
  
  @scala.inline
  def getIterator(iterable: js.Any): Unit | (Iterator[js.Any, js.Any, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[Unit | (Iterator[js.Any, js.Any, Unit])]
  @scala.inline
  def getIterator[TValue](iterable: Iterable[TValue]): Iterator[TValue, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[Iterator[TValue, js.Any, Unit]]
  
  @scala.inline
  def getIteratorMethod(iterable: js.Any): Unit | (js.Function0[Iterator[js.Any, js.Any, Unit]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getIteratorMethod")(iterable.asInstanceOf[js.Any]).asInstanceOf[Unit | (js.Function0[Iterator[js.Any, js.Any, Unit]])]
  @scala.inline
  def getIteratorMethod[TValue](iterable: Iterable[TValue]): js.Function0[Iterator[TValue, js.Any, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIteratorMethod")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Iterator[TValue, js.Any, Unit]]]
  
  @scala.inline
  def isArrayLike(obj: js.Any): /* is iterall.anon.Length */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLike")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is iterall.anon.Length */ Boolean]
  
  @scala.inline
  def isAsyncIterable(obj: js.Any): /* is std.AsyncIterable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsyncIterable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.AsyncIterable<any> */ Boolean]
  
  @scala.inline
  def isCollection(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIterable(obj: js.Any): /* is std.Iterable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<any> */ Boolean]
  
  @JSImport("iterall", "$$iterator")
  @js.native
  val iterator: js.Symbol = js.native
  
  type ResolvedOf[TCollection] = js.Any
  
  type ValueOf[TCollection] = js.Any
}
