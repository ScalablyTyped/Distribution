package typings.gulpCache

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.gulpCache.mod.gc.IGulpCacheStatic
import typings.gulpUtil.mod.PluginError
import typings.node.NodeJS.ReadWriteStream
import typings.node.streamMod.Transform
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-cache", JSImport.Namespace)
  @js.native
  val ^ : IGulpCacheStatic = js.native
  
  type _To = IGulpCacheStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IGulpCacheStatic = ^
  
  object gc {
    
    trait ICacheOptions extends StObject {
      
      /**
        * Specifies the name of the directory where the cache
        * is to be stored.
        */
      var cacheDirName: String
    }
    object ICacheOptions {
      
      inline def apply(cacheDirName: String): ICacheOptions = {
        val __obj = js.Dynamic.literal(cacheDirName = cacheDirName.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICacheOptions]
      }
      
      extension [Self <: ICacheOptions](x: Self) {
        
        inline def setCacheDirName(value: String): Self = StObject.set(x, "cacheDirName", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Represents a cach store.
      */
    @js.native
    trait IGulpCache
      extends StObject
         with Instantiable1[/* options */ ICacheOptions, Any]
    
    trait IGulpCacheOptions extends StObject {
      
      /**
        * The cache instance to use for caching.
        */
      var fileCache: js.UndefOr[IGulpCache] = js.undefined
      
      /**
        * The hash generator to use.
        */
      var key: js.UndefOr[
            js.Function2[
              /* file */ File, 
              /* callback */ js.UndefOr[js.Function2[/* err */ Any, /* result */ String, Unit]], 
              String | js.Promise[String]
            ]
          ] = js.undefined
      
      /**
        * The name of the bucket which stores the cached objects.
        * Default value = 'default'
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Value representing the success of a task.
        */
      var success: js.UndefOr[Boolean | Predicate[Any]] = js.undefined
      
      /**
        * Content that is to be cached.
        */
      var value: js.UndefOr[js.Function1[/* result */ Any, js.Object | js.Promise[js.Object] | String]] = js.undefined
    }
    object IGulpCacheOptions {
      
      inline def apply(): IGulpCacheOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGulpCacheOptions]
      }
      
      extension [Self <: IGulpCacheOptions](x: Self) {
        
        inline def setFileCache(value: IGulpCache): Self = StObject.set(x, "fileCache", value.asInstanceOf[js.Any])
        
        inline def setFileCacheUndefined: Self = StObject.set(x, "fileCache", js.undefined)
        
        inline def setKey(
          value: (/* file */ File, /* callback */ js.UndefOr[js.Function2[/* err */ Any, /* result */ String, Unit]]) => String | js.Promise[String]
        ): Self = StObject.set(x, "key", js.Any.fromFunction2(value))
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSuccess(value: Boolean | Predicate[Any]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
        
        inline def setSuccessFunction1(value: Any => Boolean): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
        
        inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
        
        inline def setValue(value: /* result */ Any => js.Object | js.Promise[js.Object] | String): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait IGulpCacheStatic extends StObject {
      
      /**
        * Caches the result of a task.
        * @param task The task whose result is to be cached.
        */
      def apply(task: ReadWriteStream): Transform = js.native
      /**
        * Caches the result of a task.
        * @param task Task whose result is to be cached.
        * @param options Override values for available settings.
        */
      def apply(task: ReadWriteStream, options: IGulpCacheOptions): Transform = js.native
      
      /**
        * Represents a cache store.
        */
      var Cache: IGulpCache = js.native
      
      def clear(options: IGulpCacheOptions): Transform = js.native
      
      /**
        * Purges the cache.
        * @param err PluginError instance in case of a plugin error.
        *            If callback is not specified an exception of type
        *            'PluginError' is thrown.
        */
      def clearAll(): Unit = js.native
      def clearAll(callback: js.Function1[/* err */ PluginError, Unit]): Unit = js.native
    }
    
    type Predicate[T] = js.Function1[/* arg */ T, Boolean]
  }
}
