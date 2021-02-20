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
import scala.scalajs.js.`|`
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
    def this(uri: js.UndefOr[scala.Nothing], opts: Options[TValue]) = this()
    def this(uri: String, opts: Options[TValue]) = this()
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
  
  @js.native
  trait Options[TValue]
    extends /* key */ StringDictionary[js.Any] {
    
    /** Specify an adapter to use. e.g `'redis'` or `'mongodb'`. */
    var adapter: js.UndefOr[redis | mongodb | mongo | sqlite | postgresql | postgres | mysql] = js.native
    
    /** A custom deserialization function. */
    var deserialize: js.UndefOr[js.Function1[/* data */ String, TValue]] = js.native
    
    /** Namespace for the current instance. */
    var namespace: js.UndefOr[String] = js.native
    
    /** A custom serialization function. */
    var serialize: js.UndefOr[js.Function1[/* data */ TValue, String]] = js.native
    
    /** The storage adapter instance to be used by Keyv. */
    var store: js.UndefOr[Store[TValue]] = js.native
    
    /** Default TTL. Can be overridden by specififying a TTL on `.set()`. */
    var ttl: js.UndefOr[Double] = js.native
    
    /** The connection string URI. */
    var uri: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[TValue](): Options[TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TValue]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], TValue] (val x: Self with Options[TValue]) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: redis | mongodb | mongo | sqlite | postgresql | postgres | mysql): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setDeserialize(value: /* data */ String => TValue): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setSerialize(value: /* data */ TValue => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      @scala.inline
      def setStore(value: Store[TValue]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
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
