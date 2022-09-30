package typings.interfaceStore

import typings.interfaceStore.interfaceStoreInts.`-1`
import typings.interfaceStore.interfaceStoreInts.`0`
import typings.interfaceStore.interfaceStoreInts.`1`
import typings.std.AbortSignal
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Await[T] = js.Promise[T] | T
  
  type AwaitIterable[T] = js.Iterable[T] | AsyncIterable[T]
  
  @js.native
  trait Batch[Key, Value] extends StObject {
    
    def commit(): js.Promise[Unit] = js.native
    def commit(options: Options): js.Promise[Unit] = js.native
    
    def delete(key: Key): Unit = js.native
    
    def put(key: Key, value: Value): Unit = js.native
  }
  
  trait KeyQuery[Key] extends StObject {
    
    var filters: js.UndefOr[js.Array[KeyQueryFilter[Key]]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var orders: js.UndefOr[js.Array[KeyQueryOrder[Key]]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object KeyQuery {
    
    inline def apply[Key](): KeyQuery[Key] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyQuery[Key]]
    }
    
    extension [Self <: KeyQuery[?], Key](x: Self & KeyQuery[Key]) {
      
      inline def setFilters(value: js.Array[KeyQueryFilter[Key]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: KeyQueryFilter[Key]*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrders(value: js.Array[KeyQueryOrder[Key]]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
      
      inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
      
      inline def setOrdersVarargs(value: KeyQueryOrder[Key]*): Self = StObject.set(x, "orders", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type KeyQueryFilter[Key] = js.Function1[/* item */ Key, Boolean]
  
  type KeyQueryOrder[Key] = js.Function2[/* a */ Key, /* b */ Key, `-1` | `0` | `1`]
  
  trait Options extends StObject {
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait Pair[Key, Value] extends StObject {
    
    var key: Key
    
    var value: Value
  }
  object Pair {
    
    inline def apply[Key, Value](key: Key, value: Value): Pair[Key, Value] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pair[Key, Value]]
    }
    
    extension [Self <: Pair[?, ?], Key, Value](x: Self & (Pair[Key, Value])) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Query[Key, Value] extends StObject {
    
    var filters: js.UndefOr[js.Array[QueryFilter[Key, Value]]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var orders: js.UndefOr[js.Array[QueryOrder[Key, Value]]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Query {
    
    inline def apply[Key, Value](): Query[Key, Value] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query[Key, Value]]
    }
    
    extension [Self <: Query[?, ?], Key, Value](x: Self & (Query[Key, Value])) {
      
      inline def setFilters(value: js.Array[QueryFilter[Key, Value]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: (QueryFilter[Key, Value])*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrders(value: js.Array[QueryOrder[Key, Value]]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
      
      inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
      
      inline def setOrdersVarargs(value: (QueryOrder[Key, Value])*): Self = StObject.set(x, "orders", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type QueryFilter[Key, Value] = js.Function1[/* item */ Pair[Key, Value], Boolean]
  
  type QueryOrder[Key, Value] = js.Function2[/* a */ Pair[Key, Value], /* b */ Pair[Key, Value], `-1` | `0` | `1`]
  
  @js.native
  trait Store[Key, Value] extends StObject {
    
    /**
      * This will return an object with which you can chain multiple operations together, with them only being executed on calling `commit`.
      *
      * @example
      * ```js
      * const b = store.batch()
      *
      * for (let i = 0; i < 100; i++) {
      *   b.put(new Key(`hello${i}`), new TextEncoder('utf8').encode(`hello world ${i}`))
      * }
      *
      * await b.commit()
      * console.log('put 100 values')
      * ```
      */
    def batch(): Batch[Key, Value] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Remove the record for the passed key
      *
      * @example
      *
      * ```js
      * await store.delete(new Key('awesome'))
      * console.log('deleted awesome content :(')
      * ```
      */
    def delete(key: Key): js.Promise[Unit] = js.native
    def delete(key: Key, options: Options): js.Promise[Unit] = js.native
    
    /**
      * Remove values for the passed keys
      *
      * @example
      *
      * ```js
      * const source = [new Key('awesome')]
      *
      * for await (const key of store.deleteMany(source)) {
      *   console.log(`deleted content with key ${key}`)
      * }
      * ```
      */
    def deleteMany(source: AwaitIterable[Key]): AsyncIterable[Key] = js.native
    def deleteMany(source: AwaitIterable[Key], options: Options): AsyncIterable[Key] = js.native
    
    /**
      * Retrieve the value stored under the given key
      *
      * @example
      * ```js
      * const value = await store.get(new Key('awesome'))
      * console.log('got content: %s', value.toString('utf8'))
      * // => got content: datastore
      * ```
      */
    def get(key: Key): js.Promise[Value] = js.native
    def get(key: Key, options: Options): js.Promise[Value] = js.native
    
    /**
      * Retrieve values for the passed keys
      *
      * @example
      * ```js
      * for await (const value of store.getMany([new Key('awesome')])) {
      *   console.log('got content:', new TextDecoder('utf8').decode(value))
      *   // => got content: datastore
      * }
      * ```
      */
    def getMany(source: AwaitIterable[Key]): AsyncIterable[Value] = js.native
    def getMany(source: AwaitIterable[Key], options: Options): AsyncIterable[Value] = js.native
    
    /**
      * Check for the existence of a value for the passed key
      *
      * @example
      * ```js
      *const exists = await store.has(new Key('awesome'))
      *
      *if (exists) {
      *  console.log('it is there')
      *} else {
      *  console.log('it is not there')
      *}
      *```
      */
    def has(key: Key): js.Promise[Boolean] = js.native
    def has(key: Key, options: Options): js.Promise[Boolean] = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    /**
      * Store the passed value under the passed key
      *
      * @example
      *
      * ```js
      * await store.put([{ key: new Key('awesome'), value: new Uint8Array([0, 1, 2, 3]) }])
      * ```
      */
    def put(key: Key, `val`: Value): js.Promise[Unit] = js.native
    def put(key: Key, `val`: Value, options: Options): js.Promise[Unit] = js.native
    
    /**
      * Store the given key/value pairs
      *
      * @example
      * ```js
      * const source = [{ key: new Key('awesome'), value: new Uint8Array([0, 1, 2, 3]) }]
      *
      * for await (const { key, value } of store.putMany(source)) {
      *   console.info(`put content for key ${key}`)
      * }
      * ```
      */
    def putMany(source: AwaitIterable[Pair[Key, Value]]): AsyncIterable[Pair[Key, Value]] = js.native
    def putMany(source: AwaitIterable[Pair[Key, Value]], options: Options): AsyncIterable[Pair[Key, Value]] = js.native
    
    /**
      * Query the store.
      *
      * @example
      * ```js
      * // retrieve __all__ key/value pairs from the store
      * let list = []
      * for await (const { key, value } of store.query({})) {
      *   list.push(value)
      * }
      * console.log('ALL THE VALUES', list)
      * ```
      */
    def query(query: Query[Key, Value]): AsyncIterable[Pair[Key, Value]] = js.native
    def query(query: Query[Key, Value], options: Options): AsyncIterable[Pair[Key, Value]] = js.native
    
    /**
      * Query the store.
      *
      * @example
      * ```js
      * // retrieve __all__ keys from the store
      * let list = []
      * for await (const key of store.queryKeys({})) {
      *   list.push(key)
      * }
      * console.log('ALL THE KEYS', key)
      * ```
      */
    def queryKeys(query: KeyQuery[Key]): AsyncIterable[Key] = js.native
    def queryKeys(query: KeyQuery[Key], options: Options): AsyncIterable[Key] = js.native
  }
}
