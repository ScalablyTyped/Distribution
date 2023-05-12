package typings.interfaceDatastore

import typings.interfaceDatastore.interfaceDatastoreInts.`-1`
import typings.interfaceDatastore.interfaceDatastoreInts.`0`
import typings.interfaceDatastore.interfaceDatastoreInts.`1`
import typings.interfaceStore.mod.AbortOptions
import typings.interfaceStore.mod.Await
import typings.interfaceStore.mod.AwaitIterable
import typings.interfaceStore.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("interface-datastore", "Key")
  @js.native
  open class Key protected ()
    extends typings.interfaceDatastore.distSrcKeyMod.Key {
    /**
      * @param {string | Uint8Array} s
      * @param {boolean} [clean]
      */
    def this(s: String) = this()
    def this(s: js.typedarray.Uint8Array) = this()
    def this(s: String, clean: Boolean) = this()
    def this(s: js.typedarray.Uint8Array, clean: Boolean) = this()
  }
  /* static members */
  object Key {
    
    @JSImport("interface-datastore", "Key")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {*} other
      */
    inline def asKey(other: Any): typings.interfaceDatastore.distSrcKeyMod.Key | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(other.asInstanceOf[js.Any]).asInstanceOf[typings.interfaceDatastore.distSrcKeyMod.Key | Null]
    
    /**
      * Returns a randomly (uuid) generated key.
      *
      * @returns {Key}
      *
      * @example
      * ```js
      * Key.random()
      * // => Key('/f98719ea086343f7b71f32ea9d9d521d')
      * ```
      */
    inline def random(): typings.interfaceDatastore.distSrcKeyMod.Key = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.interfaceDatastore.distSrcKeyMod.Key]
    
    /**
      * Constructs a key out of a namespace array.
      *
      * @param {Array<string>} list - The array of namespaces
      * @returns {Key}
      *
      * @example
      * ```js
      * Key.withNamespaces(['one', 'two'])
      * // => Key('/one/two')
      * ```
      */
    inline def withNamespaces(list: js.Array[String]): typings.interfaceDatastore.distSrcKeyMod.Key = ^.asInstanceOf[js.Dynamic].applyDynamic("withNamespaces")(list.asInstanceOf[js.Any]).asInstanceOf[typings.interfaceDatastore.distSrcKeyMod.Key]
  }
  
  @js.native
  trait Batch[BatchOptionsExtension] extends StObject {
    
    def commit(): Await[Unit] = js.native
    def commit(options: AbortOptions & BatchOptionsExtension): Await[Unit] = js.native
    
    def delete(key: typings.interfaceDatastore.distSrcKeyMod.Key): Unit = js.native
    
    def put(key: typings.interfaceDatastore.distSrcKeyMod.Key, value: js.typedarray.Uint8Array): Unit = js.native
  }
  
  @js.native
  trait Datastore[HasOptionsExtension, PutOptionsExtension, PutManyOptionsExtension, GetOptionsExtension, GetManyOptionsExtension, DeleteOptionsExtension, DeleteManyOptionsExtension, QueryOptionsExtension, QueryKeysOptionsExtension, BatchOptionsExtension]
    extends StObject
       with Store[
          typings.interfaceDatastore.distSrcKeyMod.Key, 
          js.typedarray.Uint8Array, 
          Pair, 
          HasOptionsExtension, 
          PutOptionsExtension, 
          PutManyOptionsExtension, 
          GetOptionsExtension, 
          GetManyOptionsExtension, 
          DeleteOptionsExtension, 
          DeleteManyOptionsExtension
        ] {
    
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
    def batch(): Batch[BatchOptionsExtension] = js.native
    
    /**
      * Query the datastore.
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
    def query(query: Query): AwaitIterable[Pair] = js.native
    def query(query: Query, options: AbortOptions & QueryOptionsExtension): AwaitIterable[Pair] = js.native
    
    /**
      * Query the datastore.
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
    def queryKeys(query: KeyQuery): AwaitIterable[typings.interfaceDatastore.distSrcKeyMod.Key] = js.native
    def queryKeys(query: KeyQuery, options: AbortOptions & QueryKeysOptionsExtension): AwaitIterable[typings.interfaceDatastore.distSrcKeyMod.Key] = js.native
  }
  
  trait KeyQuery extends StObject {
    
    var filters: js.UndefOr[js.Array[KeyQueryFilter]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var orders: js.UndefOr[js.Array[KeyQueryOrder]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object KeyQuery {
    
    inline def apply(): KeyQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyQuery] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: js.Array[KeyQueryFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: KeyQueryFilter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrders(value: js.Array[KeyQueryOrder]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
      
      inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
      
      inline def setOrdersVarargs(value: KeyQueryOrder*): Self = StObject.set(x, "orders", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type KeyQueryFilter = js.Function1[/* item */ typings.interfaceDatastore.distSrcKeyMod.Key, Boolean]
  
  type KeyQueryOrder = js.Function2[
    /* a */ typings.interfaceDatastore.distSrcKeyMod.Key, 
    /* b */ typings.interfaceDatastore.distSrcKeyMod.Key, 
    `-1` | `0` | `1`
  ]
  
  trait Pair extends StObject {
    
    var key: typings.interfaceDatastore.distSrcKeyMod.Key
    
    var value: js.typedarray.Uint8Array
  }
  object Pair {
    
    inline def apply(key: typings.interfaceDatastore.distSrcKeyMod.Key, value: js.typedarray.Uint8Array): Pair = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pair] (val x: Self) extends AnyVal {
      
      inline def setKey(value: typings.interfaceDatastore.distSrcKeyMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Query extends StObject {
    
    var filters: js.UndefOr[js.Array[QueryFilter]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var orders: js.UndefOr[js.Array[QueryOrder]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Query {
    
    inline def apply(): Query = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: js.Array[QueryFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: QueryFilter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrders(value: js.Array[QueryOrder]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
      
      inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
      
      inline def setOrdersVarargs(value: QueryOrder*): Self = StObject.set(x, "orders", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type QueryFilter = js.Function1[/* item */ Pair, Boolean]
  
  type QueryOrder = js.Function2[/* a */ Pair, /* b */ Pair, `-1` | `0` | `1`]
}
