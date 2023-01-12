package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasteConfig extends StObject {
  
  /** Whether to hash files using SHA-1. */
  var computeSha1: js.UndefOr[Boolean] = js.undefined
  
  /** The platform to use as the default, e.g. 'ios'. */
  var defaultPlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to follow symlinks when crawling for files.
    *   This options cannot be used in projects which use watchman.
    *   Projects with `watchman` set to true will error if this option is set to true.
    */
  var enableSymlinks: js.UndefOr[Boolean] = js.undefined
  
  /** Force use of Node's `fs` APIs rather than shelling out to `find` */
  var forceNodeFilesystemAPI: js.UndefOr[Boolean] = js.undefined
  
  /** string to a custom implementation of Haste. */
  var hasteImplModulePath: js.UndefOr[String] = js.undefined
  
  /** Custom HasteMap module */
  var hasteMapModulePath: js.UndefOr[String] = js.undefined
  
  /** All platforms to target, e.g ['ios', 'android']. */
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether to retain all files, allowing e.g. search for tests in `node_modules`. */
  var retainAllFiles: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to throw on error on module collision. */
  var throwOnModuleCollision: js.UndefOr[Boolean] = js.undefined
}
object HasteConfig {
  
  inline def apply(): HasteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasteConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasteConfig] (val x: Self) extends AnyVal {
    
    inline def setComputeSha1(value: Boolean): Self = StObject.set(x, "computeSha1", value.asInstanceOf[js.Any])
    
    inline def setComputeSha1Undefined: Self = StObject.set(x, "computeSha1", js.undefined)
    
    inline def setDefaultPlatform(value: String): Self = StObject.set(x, "defaultPlatform", value.asInstanceOf[js.Any])
    
    inline def setDefaultPlatformNull: Self = StObject.set(x, "defaultPlatform", null)
    
    inline def setDefaultPlatformUndefined: Self = StObject.set(x, "defaultPlatform", js.undefined)
    
    inline def setEnableSymlinks(value: Boolean): Self = StObject.set(x, "enableSymlinks", value.asInstanceOf[js.Any])
    
    inline def setEnableSymlinksUndefined: Self = StObject.set(x, "enableSymlinks", js.undefined)
    
    inline def setForceNodeFilesystemAPI(value: Boolean): Self = StObject.set(x, "forceNodeFilesystemAPI", value.asInstanceOf[js.Any])
    
    inline def setForceNodeFilesystemAPIUndefined: Self = StObject.set(x, "forceNodeFilesystemAPI", js.undefined)
    
    inline def setHasteImplModulePath(value: String): Self = StObject.set(x, "hasteImplModulePath", value.asInstanceOf[js.Any])
    
    inline def setHasteImplModulePathUndefined: Self = StObject.set(x, "hasteImplModulePath", js.undefined)
    
    inline def setHasteMapModulePath(value: String): Self = StObject.set(x, "hasteMapModulePath", value.asInstanceOf[js.Any])
    
    inline def setHasteMapModulePathUndefined: Self = StObject.set(x, "hasteMapModulePath", js.undefined)
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setRetainAllFiles(value: Boolean): Self = StObject.set(x, "retainAllFiles", value.asInstanceOf[js.Any])
    
    inline def setRetainAllFilesUndefined: Self = StObject.set(x, "retainAllFiles", js.undefined)
    
    inline def setThrowOnModuleCollision(value: Boolean): Self = StObject.set(x, "throwOnModuleCollision", value.asInstanceOf[js.Any])
    
    inline def setThrowOnModuleCollisionUndefined: Self = StObject.set(x, "throwOnModuleCollision", js.undefined)
  }
}
