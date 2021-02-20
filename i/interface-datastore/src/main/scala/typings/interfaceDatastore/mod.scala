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
import scala.scalajs.js.`|`
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
    
    @JSImport("interface-datastore", "Errors.abortedError")
    @js.native
    def abortedError(error: Error): ErrCode = js.native
    
    @JSImport("interface-datastore", "Errors.dbDeleteFailedError")
    @js.native
    def dbDeleteFailedError(error: Error): ErrCode = js.native
    
    @JSImport("interface-datastore", "Errors.dbOpenFailedError")
    @js.native
    def dbOpenFailedError(error: Error): ErrCode = js.native
    
    @JSImport("interface-datastore", "Errors.dbWriteFailedError")
    @js.native
    def dbWriteFailedError(error: Error): ErrCode = js.native
    
    @JSImport("interface-datastore", "Errors.notFoundError")
    @js.native
    def notFoundError(error: Error): ErrCode = js.native
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
    
    /**
      * Returns whether the input is a valid Key.
      */
    @JSImport("interface-datastore", "Key.isKey")
    @js.native
    def isKey(key: js.Any): Boolean = js.native
    
    /**
      * Returns a randomly (uuid) generated key.
      *
      * @example
      * Key.random()
      * // => Key('/f98719ea086343f7b71f32ea9d9d521d')
      *
      */
    @JSImport("interface-datastore", "Key.random")
    @js.native
    def random(): Key = js.native
    
    /**
      * Constructs a key out of a namespace array.
      *
      * @param list The array of namespaces
      *
      * @example
      * Key.withNamespaces(['one', 'two'])
      * // => Key('/one/two')
      */
    @JSImport("interface-datastore", "Key.withNamespaces")
    @js.native
    def withNamespaces(list: js.Array[String]): Key = js.native
  }
  
  @JSImport("interface-datastore", "MemoryDatastore")
  @js.native
  class MemoryDatastore[Value] () extends Adapter[Value] {
    
    def _all(): AsyncIterable[Pair[Value]] = js.native
  }
  
  object utils {
    
    @JSImport("interface-datastore", "utils.filter")
    @js.native
    def filter[T](iterable: AsyncIterable[T], filterer: js.Function1[/* item */ T, Boolean]): AsyncGenerator[T, _, _] = js.native
    
    @JSImport("interface-datastore", "utils.map")
    @js.native
    def map[T, O](iterable: AsyncIterable[T], mapper: js.Function1[/* item */ T, O]): AsyncGenerator[O, _, _] = js.native
    
    @JSImport("interface-datastore", "utils.replaceStartWith")
    @js.native
    def replaceStartWith(s: String, r: RegExp): String = js.native
    
    @JSImport("interface-datastore", "utils.sortAll")
    @js.native
    def sortAll[T](iterable: AsyncIterable[T], sorter: js.Function1[/* items */ js.Array[T], js.Array[T]]): AsyncGenerator[T, _, _] = js.native
    
    @JSImport("interface-datastore", "utils.take")
    @js.native
    def take[T](iterable: AsyncIterable[T], n: Double): AsyncGenerator[T, _, _] = js.native
    
    @JSImport("interface-datastore", "utils.tmpdir")
    @js.native
    def tmpdir(): String = js.native
  }
  
  @js.native
  trait Batch[Value] extends StObject {
    
    def commit(): js.Promise[Unit] = js.native
    def commit(options: Options): js.Promise[Unit] = js.native
    
    def delete(key: Key): Unit = js.native
    
    def put(key: Key, value: Value): Unit = js.native
  }
  
  type Datastore[Value] = Adapter[Value]
  
  @js.native
  trait ErrCode extends Error {
    
    var code: String = js.native
  }
  object ErrCode {
    
    @scala.inline
    def apply(code: String, message: String, name: String): ErrCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrCode]
    }
    
    @scala.inline
    implicit class ErrCodeMutableBuilder[Self <: ErrCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var signal: AbortSignal = js.native
  }
  object Options {
    
    @scala.inline
    def apply(signal: AbortSignal): Options = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pair[Value] extends StObject {
    
    var key: Key = js.native
    
    var value: Value = js.native
  }
  object Pair {
    
    @scala.inline
    def apply[Value](key: Key, value: Value): Pair[Value] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pair[Value]]
    }
    
    @scala.inline
    implicit class PairMutableBuilder[Self <: Pair[_], Value] (val x: Self with Pair[Value]) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Query[Value] extends StObject {
    
    var filters: js.UndefOr[js.Array[Filter[Value]]] = js.native
    
    var keysOnly: js.UndefOr[Boolean] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var orders: js.UndefOr[js.Array[Order[Value]]] = js.native
    
    var prefix: js.UndefOr[String] = js.native
  }
  object Query {
    
    @scala.inline
    def apply[Value](): Query[Value] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query[Value]]
    }
    
    type Filter[Value] = js.Function1[/* item */ Pair[Value], Boolean]
    
    type Order[Value] = js.Function1[/* items */ js.Array[Pair[Value]], js.Array[Pair[Value]]]
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query[_], Value] (val x: Self with Query[Value]) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[Filter[Value]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: Filter[Value]*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setKeysOnly(value: Boolean): Self = StObject.set(x, "keysOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysOnlyUndefined: Self = StObject.set(x, "keysOnly", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrders(value: js.Array[Order[Value]]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
      
      @scala.inline
      def setOrdersVarargs(value: Order[Value]*): Self = StObject.set(x, "orders", js.Array(value :_*))
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
