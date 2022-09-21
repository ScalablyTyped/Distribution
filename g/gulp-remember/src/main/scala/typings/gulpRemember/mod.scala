package typings.gulpRemember

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-remember", JSImport.Namespace)
  @js.native
  val ^ : IGulpRemember = js.native
  
  type ICache = StringDictionary[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ]
  
  @js.native
  trait IGulpRemember extends StObject {
    
    /**
      * Return a through stream that will:
      *   1. Remember all files that ever pass through it.
      *   2. Add all remembered files back into the stream when not present.
      * @param cacheName Name to give your cache
      */
    def apply(): Any = js.native
    def apply(cacheName: String): Any = js.native
    
    /**
      * Return a raw cache by name.
      * Useful for checking state. Manually adding or removing files is NOT recommended.
      *
      * @param cacheName Name of the cache to retrieve
      */
    def cacheFor(): ICache = js.native
    def cacheFor(cacheName: String): ICache = js.native
    
    /**
      * Forget about a file.
      * A warning is logged if either the named cache or file do not exist.
      * @param cacheName Name of the cache from which to drop the file
      * @param path Path of the file to forget
      */
    def forget(cacheName: String, path: String): Unit = js.native
    /**
      * Forget about a file.
      * A warning is logged if either the named cache or file do not exist.
      * @param path Path of the file to forget
      */
    def forget(path: String): Unit = js.native
    
    /**
      * Forget all files in one cache.
      * A warning is logged if the cache does not exist.
      *
      * @param cacheName Name of the cache to wipe
      */
    def forgetAll(): Unit = js.native
    def forgetAll(cacheName: String): Unit = js.native
  }
  
  type _To = IGulpRemember
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IGulpRemember = ^
}
