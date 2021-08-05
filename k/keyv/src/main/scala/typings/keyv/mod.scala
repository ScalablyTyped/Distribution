package typings.keyv

import org.scalablytyped.runtime.StringDictionary
import typings.keyv.keyvBooleans.`true`
import typings.keyv.keyvStrings.mongo
import typings.keyv.keyvStrings.mongodb
import typings.keyv.keyvStrings.mysql
import typings.keyv.keyvStrings.postgres
import typings.keyv.keyvStrings.postgresql
import typings.keyv.keyvStrings.redis
import typings.keyv.keyvStrings.sqlite
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keyv", JSImport.Namespace)
  @js.native
  /**
    * @param opts The options object is also passed through to the storage adapter. Check your storage adapter docs for any extra options.
    */
  class ^[TValue] () extends Keyv[TValue] {
    def this(opts: Options[TValue]) = this()
    def this(uri: String) = this()
    def this(uri: String, opts: Options[TValue]) = this()
    def this(uri: Unit, opts: Options[TValue]) = this()
  }
  
  @js.native
  trait Keyv[TValue] extends EventEmitter {
    
    /** Delete all entries in the current namespace. */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Deletes an entry.
      *
      * Returns `true` if the key existed, `false` if not.
      */
    def delete(key: String): js.Promise[Boolean] = js.native
    
    /** Returns the value. */
    def get(key: String): js.Promise[js.UndefOr[TValue]] = js.native
    
    /**
      * Set a value.
      *
      * By default keys are persistent. You can set an expiry TTL in milliseconds.
      */
    def set(key: String, value: TValue): js.Promise[`true`] = js.native
    def set(key: String, value: TValue, ttl: Double): js.Promise[`true`] = js.native
  }
  
  trait Options[TValue]
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    /** Specify an adapter to use. e.g `'redis'` or `'mongodb'`. */
    var adapter: js.UndefOr[redis | mongodb | mongo | sqlite | postgresql | postgres | mysql] = js.undefined
    
    /** A custom deserialization function. */
    var deserialize: js.UndefOr[js.Function1[/* data */ String, TValue]] = js.undefined
    
    /** Namespace for the current instance. */
    var namespace: js.UndefOr[String] = js.undefined
    
    /** A custom serialization function. */
    var serialize: js.UndefOr[js.Function1[/* data */ TValue, String]] = js.undefined
    
    /** The storage adapter instance to be used by Keyv. */
    var store: js.UndefOr[Store[TValue]] = js.undefined
    
    /** Default TTL. Can be overridden by specififying a TTL on `.set()`. */
    var ttl: js.UndefOr[Double] = js.undefined
    
    /** The connection string URI. */
    var uri: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply[TValue](): Options[TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TValue]]
    }
    
    extension [Self <: Options[?], TValue](x: Self & Options[TValue]) {
      
      inline def setAdapter(value: redis | mongodb | mongo | sqlite | postgresql | postgres | mysql): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      inline def setDeserialize(value: /* data */ String => TValue): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setSerialize(value: /* data */ TValue => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setStore(value: Store[TValue]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  @js.native
  trait Store[TValue] extends StObject {
    
    def clear(): Unit | js.Promise[Unit] = js.native
    
    def delete(key: String): Boolean | js.Promise[Boolean] = js.native
    
    def get(key: String): js.UndefOr[TValue | js.Promise[js.UndefOr[TValue]]] = js.native
    
    def set(key: String, value: TValue): js.Any = js.native
    def set(key: String, value: TValue, ttl: Double): js.Any = js.native
  }
}
