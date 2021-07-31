package typings.levelTtl

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.abstractLeveldown.mod.ErrorCallback
import typings.levelup.mod.LevelUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Augment levelup to handle a new 'ttl' option on put() and batch() that specifies
    * the number of milliseconds an entry should remain in the data store.
    * After the TTL, the entry will be automatically cleared for you.
    * @param db
    * @param opts
    * @see {@link https://github.com/level/level-ttl#usage level-ttl Usage}
    */
  @scala.inline
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]]): LevelTTL[K, V] = ^.asInstanceOf[js.Dynamic].apply(db.asInstanceOf[js.Any]).asInstanceOf[LevelTTL[K, V]]
  @scala.inline
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]], opts: LevelTTLOptions): LevelTTL[K, V] = (^.asInstanceOf[js.Dynamic].apply(db.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LevelTTL[K, V]]
  
  @JSImport("level-ttl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait LevelTTL[K, V] extends LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] {
    
    def stop(): Unit = js.native
    def stop(callback: ErrorCallback): Unit = js.native
    
    def ttl(key: K, ttl: Double): Unit = js.native
    def ttl(key: K, ttl: Double, callback: ErrorCallback): Unit = js.native
  }
  
  trait LevelTTLOptions extends StObject {
    
    /**
      * A number specifying the frequency of internal scans for checking for expired keys.
      * @default 10000
      */
    var checkFrequency: js.UndefOr[Double] = js.undefined
    
    /**
      * A number specifying the default time-to-live for new or updated values.
      * This can be overridden by explicitly setting the ttl value.
      * @default 0
      */
    var defaultTTL: js.UndefOr[Double] = js.undefined
    
    /**
      * Character specifying the key namespace for expiration values.
      * @default 'x'
      */
    var expiryNamespace: js.UndefOr[String] = js.undefined
    
    /**
      * A string for prefixing the modified database methods (i.e., put, del, batch, ttl, stop).
      */
    var methodPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Character specifying the key namespace for ttl values.
      * @default 'ttl'
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * Character for separating sublevel prefixes from user keys and each other. Should be outside the character (or byte) range of user keys.
      * @default ''
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * A custom storage database for the meta data.
      * If it's set, that storage will contain all the ttl meta data.
      * A use case for this would be to avoid mixing data and meta data in the same keyspace, since if it's not set, all data will be sharing the same keyspace.
      */
    var sub: js.UndefOr[LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]]] = js.undefined
  }
  object LevelTTLOptions {
    
    @scala.inline
    def apply(): LevelTTLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelTTLOptions]
    }
    
    @scala.inline
    implicit class LevelTTLOptionsMutableBuilder[Self <: LevelTTLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckFrequency(value: Double): Self = StObject.set(x, "checkFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckFrequencyUndefined: Self = StObject.set(x, "checkFrequency", js.undefined)
      
      @scala.inline
      def setDefaultTTL(value: Double): Self = StObject.set(x, "defaultTTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTTLUndefined: Self = StObject.set(x, "defaultTTL", js.undefined)
      
      @scala.inline
      def setExpiryNamespace(value: String): Self = StObject.set(x, "expiryNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryNamespaceUndefined: Self = StObject.set(x, "expiryNamespace", js.undefined)
      
      @scala.inline
      def setMethodPrefix(value: String): Self = StObject.set(x, "methodPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodPrefixUndefined: Self = StObject.set(x, "methodPrefix", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSub(value: LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    }
  }
}
