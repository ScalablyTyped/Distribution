package typings.interfaceDatastore

import typings.interfaceDatastore.mod.Query.Filter
import typings.interfaceDatastore.mod.Query.Order
import typings.node.Buffer
import typings.std.AbortSignal
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.AsyncIterableIterator
import typings.std.Error
import typings.std.Iterable
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("interface-datastore", "Adapter")
  @js.native
  abstract class Adapter[Value] () extends StObject {
    
    /**
      * Create a new batch object.
      */
    def batch(): Batch[Value] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Remove the record for the passed key
      *
      * @param key
      * @param options
      */
    def delete(key: Key): js.Promise[Unit] = js.native
    def delete(key: Key, options: Options): js.Promise[Unit] = js.native
    
    /**
      * Remove values for the passed keys
      *
      * @param source
      * @param options
      */
    def deleteMany(source: AsyncIterable[Key]): AsyncIterableIterator[Key] = js.native
    def deleteMany(source: AsyncIterable[Key], options: Options): AsyncIterableIterator[Key] = js.native
    def deleteMany(source: Iterable[Key]): AsyncIterableIterator[Key] = js.native
    def deleteMany(source: Iterable[Key], options: Options): AsyncIterableIterator[Key] = js.native
    
    /**
      * Retrieve the value for the passed key
      *
      * @param key
      * @param options
      */
    def get(key: Key): js.Promise[Value] = js.native
    def get(key: Key, options: Options): js.Promise[Value] = js.native
    
    /**
      * Retrieve values for the passed keys
      *
      * @param source
      * @param options
      */
    def getMany(source: AsyncIterable[Key]): AsyncIterableIterator[Value] = js.native
    def getMany(source: AsyncIterable[Key], options: Options): AsyncIterableIterator[Value] = js.native
    def getMany(source: Iterable[Key]): AsyncIterableIterator[Value] = js.native
    def getMany(source: Iterable[Key], options: Options): AsyncIterableIterator[Value] = js.native
    
    /**
      * Check for the existence of a value for the passed key
      *
      * @param key
      */
    def has(key: Key): js.Promise[Boolean] = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    /**
      * Store the passed value under the passed key
      *
      * @param key
      * @param val
      * @param options
      */
    def put(key: Key, `val`: Value): js.Promise[Unit] = js.native
    def put(key: Key, `val`: Value, options: Options): js.Promise[Unit] = js.native
    
    /**
      * Store the given key/value pairs
      *
      * @param source
      * @param options
      */
    def putMany(source: AsyncIterable[Pair[Value]]): AsyncIterableIterator[Pair[Value]] = js.native
    def putMany(source: AsyncIterable[Pair[Value]], options: Options): AsyncIterableIterator[Pair[Value]] = js.native
    def putMany(source: Iterable[Pair[Value]]): AsyncIterableIterator[Pair[Value]] = js.native
    def putMany(source: Iterable[Pair[Value]], options: Options): AsyncIterableIterator[Pair[Value]] = js.native
    
    /**
      * Query the store.
      *
      * @param q
      * @param options
      */
    def query(q: Query[Value]): AsyncIterable[Pair[Value]] = js.native
    def query(q: Query[Value], options: Options): AsyncIterable[Pair[Value]] = js.native
  }
  
  object Errors {
    
    @JSImport("interface-datastore", "Errors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def abortedError(error: Error): ErrCode = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrCode]
    
    inline def dbDeleteFailedError(error: Error): ErrCode = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDeleteFailedError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrCode]
    
    inline def dbOpenFailedError(error: Error): ErrCode = ^.asInstanceOf[js.Dynamic].applyDynamic("dbOpenFailedError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrCode]
    
    inline def dbWriteFailedError(error: Error): ErrCode = ^.asInstanceOf[js.Dynamic].applyDynamic("dbWriteFailedError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrCode]
    
    inline def notFoundError(error: Error): ErrCode = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrCode]
  }
  
  @JSImport("interface-datastore", "Key")
  @js.native
  class Key protected () extends StObject {
    def this(s: String) = this()
    def this(s: Buffer) = this()
    def this(s: String, clean: Boolean) = this()
    def this(s: Buffer, clean: Boolean) = this()
    
    /**
      * Returns the "base" namespace of this key.
      *
      * @example
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').baseNamespace()
      * // => 'Actor:JohnCleese'
      */
    def baseNamespace(): String = js.native
    
    /**
      * Returns the `child` Key of this Key.
      *
      * @param key The child Key to add
      *
      * @example
      * new Key('/Comedy/MontyPython').child(new Key('Actor:JohnCleese'))
      * // => Key('/Comedy/MontyPython/Actor:JohnCleese')
      */
    def child(key: Key): Key = js.native
    
    /**
      * Cleanup the current key
      */
    def clean(): Unit = js.native
    
    /**
      * Concats one or more Keys into one new Key.
      *
      * @param keys The array of keys to concatenate
      */
    def concat(keys: Key*): Key = js.native
    
    /**
      * Return string representation of the key
      */
    var get: js.Any = js.native
    
    /**
      * Returns an "instance" of this type key (appends value to namespace).
      *
      * @param str The string to append
      *
      * @example
      * new Key('/Comedy/MontyPython/Actor').instance('JohnClesse')
      * // => Key('/Comedy/MontyPython/Actor:JohnCleese')
      */
    def instance(str: String): Key = js.native
    
    /**
      * Returns whether this key is a prefix of `other`
      *
      * @param other The other key to test against
      *
      * @example
      * new Key('/Comedy').isAncestorOf('/Comedy/MontyPython')
      * // => true
      */
    def isAncestorOf(other: Key): Boolean = js.native
    
    /**
      * Returns whether this key is a contains another as prefix.
      *
      * @param other The other Key to test against
      *
      * @example
      * new Key('/Comedy/MontyPython').isDecendantOf('/Comedy')
      * // => true
      */
    def isDecendantOf(other: Key): Boolean = js.native
    
    /**
      * Returns wether this key has only one namespace.
      */
    def isTopLevel(): Boolean = js.native
    
    /**
      * Check if the given key is sorted lower than ourself.
      *
      * @param key The other Key to check against
      */
    def less(key: Key): Boolean = js.native
    
    /**
      * Returns the `list` representation of this key.
      *
      * @example
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').list()
      * // => ['Comedy', 'MontyPythong', 'Actor:JohnCleese']
      */
    def list(): js.Array[String] = js.native
    
    /**
      * Returns the "name" of this key (field of last namespace).
      *
      * @example
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').name()
      * // => 'JohnCleese'
      */
    def name(): String = js.native
    
    /**
      * Returns the `namespaces` making up this Key.
      */
    def namespaces(): js.Array[String] = js.native
    
    /**
      * Returns the `parent` Key of this Key.
      *
      * @example
      * new Key("/Comedy/MontyPython/Actor:JohnCleese").parent()
      * // => Key("/Comedy/MontyPython")
      */
    def parent(): Key = js.native
    
    /**
      * Returns the "path" of this key (parent + type).
      *
      * @example
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').path()
      * // => Key('/Comedy/MontyPython/Actor')
      */
    def path(): Key = js.native
    
    /**
      * Returns the key with all parts in reversed order.
      *
      * @example
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').reverse()
      * // => Key('/Actor:JohnCleese/MontyPython/Comedy')
      */
    def reverse(): Key = js.native
    
    /**
      * Return the buffer representation of the key
      */
    def toBuffer(): Buffer = js.native
    
    def toString(encoding: String): String = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    /**
      * Returns the "type" of this key (value of last namespace).
      *
      * @example
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').type()
      * // => 'Actor'
      */
    def `type`(): String = js.native
  }
  /* static members */
  object Key {
    
    @JSImport("interface-datastore", "Key")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns whether the input is a valid Key.
      */
    inline def isKey(key: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Returns a randomly (uuid) generated key.
      *
      * @example
      * Key.random()
      * // => Key('/f98719ea086343f7b71f32ea9d9d521d')
      *
      */
    inline def random(): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Key]
    
    /**
      * Constructs a key out of a namespace array.
      *
      * @param list The array of namespaces
      *
      * @example
      * Key.withNamespaces(['one', 'two'])
      * // => Key('/one/two')
      */
    inline def withNamespaces(list: js.Array[String]): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("withNamespaces")(list.asInstanceOf[js.Any]).asInstanceOf[Key]
  }
  
  @JSImport("interface-datastore", "MemoryDatastore")
  @js.native
  class MemoryDatastore[Value] () extends Adapter[Value] {
    
    def _all(): AsyncIterable[Pair[Value]] = js.native
  }
  
  object utils {
    
    @JSImport("interface-datastore", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def filter[T](iterable: AsyncIterable[T], filterer: js.Function1[/* item */ T, Boolean]): AsyncGenerator[T, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(iterable.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, js.Any, js.Any]]
    
    inline def map[T, O](iterable: AsyncIterable[T], mapper: js.Function1[/* item */ T, O]): AsyncGenerator[O, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(iterable.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[O, js.Any, js.Any]]
    
    inline def replaceStartWith(s: String, r: RegExp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStartWith")(s.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def sortAll[T](iterable: AsyncIterable[T], sorter: js.Function1[/* items */ js.Array[T], js.Array[T]]): AsyncGenerator[T, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortAll")(iterable.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, js.Any, js.Any]]
    
    inline def take[T](iterable: AsyncIterable[T], n: Double): AsyncGenerator[T, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(iterable.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, js.Any, js.Any]]
    
    inline def tmpdir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpdir")().asInstanceOf[String]
  }
  
  @js.native
  trait Batch[Value] extends StObject {
    
    def commit(): js.Promise[Unit] = js.native
    def commit(options: Options): js.Promise[Unit] = js.native
    
    def delete(key: Key): Unit = js.native
    
    def put(key: Key, value: Value): Unit = js.native
  }
  
  type Datastore[Value] = Adapter[Value]
  
  trait ErrCode
    extends StObject
       with Error {
    
    var code: String
  }
  object ErrCode {
    
    inline def apply(code: String, message: String, name: String): ErrCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrCode]
    }
    
    extension [Self <: ErrCode](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var signal: AbortSignal
  }
  object Options {
    
    inline def apply(signal: AbortSignal): Options = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pair[Value] extends StObject {
    
    var key: Key
    
    var value: Value
  }
  object Pair {
    
    inline def apply[Value](key: Key, value: Value): Pair[Value] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pair[Value]]
    }
    
    extension [Self <: Pair[?], Value](x: Self & Pair[Value]) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Query[Value] extends StObject {
    
    var filters: js.UndefOr[js.Array[Filter[Value]]] = js.undefined
    
    var keysOnly: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var orders: js.UndefOr[js.Array[Order[Value]]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Query {
    
    inline def apply[Value](): Query[Value] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query[Value]]
    }
    
    type Filter[Value] = js.Function1[/* item */ Pair[Value], Boolean]
    
    type Order[Value] = js.Function1[/* items */ js.Array[Pair[Value]], js.Array[Pair[Value]]]
    
    extension [Self <: Query[?], Value](x: Self & Query[Value]) {
      
      inline def setFilters(value: js.Array[Filter[Value]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: Filter[Value]*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setKeysOnly(value: Boolean): Self = StObject.set(x, "keysOnly", value.asInstanceOf[js.Any])
      
      inline def setKeysOnlyUndefined: Self = StObject.set(x, "keysOnly", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrders(value: js.Array[Order[Value]]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
      
      inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
      
      inline def setOrdersVarargs(value: Order[Value]*): Self = StObject.set(x, "orders", js.Array(value :_*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
