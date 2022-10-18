package typings.iterall

import typings.iterall.anon.Length
import typings.std.AsyncIterable
import typings.std.AsyncIterator
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
  
  inline def createAsyncIterator(collection: Any): Unit | (AsyncIterator[Any, Any, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[Unit | (AsyncIterator[Any, Any, Unit])]
  inline def createAsyncIterator(collection: Length): AsyncIterator[Any, Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[Any, Any, Unit]]
  inline def createAsyncIterator[TValue](collection: js.Iterable[js.Promise[TValue] | TValue]): AsyncIterator[TValue, Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[TValue, Any, Unit]]
  inline def createAsyncIterator[TValue](collection: AsyncIterable[TValue]): AsyncIterator[TValue, Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[TValue, Any, Unit]]
  
  inline def createIterator(collection: Any): Unit | js.Iterator[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Iterator[Any]]
  inline def createIterator(collection: Length): js.Iterator[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[Any]]
  inline def createIterator[TValue](collection: js.Iterable[TValue]): js.Iterator[TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIterator")(collection.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[TValue]]
  
  inline def forAwaitEach[TCollection /* <: AsyncIterable[Any] */](
    collection: TCollection,
    callbackFn: js.Function3[
      (/* value */ Any) | (/* value */ ResolvedOf[TCollection]), 
      /* index */ Double, 
      /* collection */ TCollection, 
      Any
    ]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forAwaitEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forAwaitEach[TCollection /* <: AsyncIterable[Any] */](
    collection: TCollection,
    callbackFn: js.Function3[
      (/* value */ Any) | (/* value */ ResolvedOf[TCollection]), 
      /* index */ Double, 
      /* collection */ TCollection, 
      Any
    ],
    thisArg: Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forAwaitEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def forEach[TCollection /* <: js.Iterable[Any] */](
    collection: TCollection,
    callbackFn: js.Function3[
      (/* value */ Any) | (/* value */ ValueOf[TCollection]), 
      /* index */ Double, 
      /* collection */ TCollection, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach[TCollection /* <: js.Iterable[Any] */](
    collection: TCollection,
    callbackFn: js.Function3[
      (/* value */ Any) | (/* value */ ValueOf[TCollection]), 
      /* index */ Double, 
      /* collection */ TCollection, 
      Any
    ],
    thisArg: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(collection.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAsyncIterator(asyncIterable: Any): Unit | (AsyncIterator[Any, Any, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsyncIterator")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[Unit | (AsyncIterator[Any, Any, Unit])]
  inline def getAsyncIterator[TValue](asyncIterable: AsyncIterable[TValue]): AsyncIterator[TValue, Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsyncIterator")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[TValue, Any, Unit]]
  
  inline def getAsyncIteratorMethod(asyncIterable: Any): Unit | (js.Function0[AsyncIterator[Any, Any, Unit]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsyncIteratorMethod")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[Unit | (js.Function0[AsyncIterator[Any, Any, Unit]])]
  inline def getAsyncIteratorMethod[TValue](asyncIterable: AsyncIterable[TValue]): js.Function0[AsyncIterator[TValue, Any, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsyncIteratorMethod")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Function0[AsyncIterator[TValue, Any, Unit]]]
  
  inline def getIterator(iterable: Any): Unit | js.Iterator[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Iterator[Any]]
  inline def getIterator[TValue](iterable: js.Iterable[TValue]): js.Iterator[TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[TValue]]
  
  inline def getIteratorMethod(iterable: Any): Unit | js.Function0[js.Iterator[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIteratorMethod")(iterable.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Function0[js.Iterator[Any]]]
  inline def getIteratorMethod[TValue](iterable: js.Iterable[TValue]): js.Function0[js.Iterator[TValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIteratorMethod")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Iterator[TValue]]]
  
  inline def isArrayLike(obj: Any): /* is iterall.anon.Length */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLike")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is iterall.anon.Length */ Boolean]
  
  inline def isAsyncIterable(obj: Any): /* is std.AsyncIterable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsyncIterable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.AsyncIterable<any> */ Boolean]
  
  inline def isCollection(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIterable(obj: Any): /* is std.Iterable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<any> */ Boolean]
  
  @JSImport("iterall", "$$iterator")
  @js.native
  val iterator: js.Symbol = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TCollection extends std.AsyncIterable<infer TValue> ? TValue : TCollection extends std.Iterable<infer U> ? U extends std.Promise<infer TValue> ? TValue : U : never
    }}}
    */
  @js.native
  trait ResolvedOf[TCollection] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TCollection extends std.Iterable<infer TValue> ? TValue : never
    }}}
    */
  @js.native
  trait ValueOf[TCollection] extends StObject
}
