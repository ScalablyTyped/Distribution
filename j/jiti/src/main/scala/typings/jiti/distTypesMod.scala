package typings.jiti

import org.scalablytyped.runtime.StringDictionary
import typings.jiti.anon.OmitTransformOptionssourc
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait JITIOptions extends StObject {
    
    var alias: js.UndefOr[Record[String, String]] = js.undefined
    
    var cache: js.UndefOr[Boolean | String] = js.undefined
    
    var cacheVersion: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var esmResolve: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var interopDefault: js.UndefOr[Boolean] = js.undefined
    
    var legacy: js.UndefOr[Boolean] = js.undefined
    
    var nativeModules: js.UndefOr[js.Array[String]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var requireCache: js.UndefOr[Boolean] = js.undefined
    
    var sourceMaps: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* opts */ TransformOptions, TRANSFORM_RESULT]] = js.undefined
    
    var transformModules: js.UndefOr[js.Array[String]] = js.undefined
    
    var transformOptions: js.UndefOr[OmitTransformOptionssourc] = js.undefined
    
    var v8cache: js.UndefOr[Boolean] = js.undefined
  }
  object JITIOptions {
    
    inline def apply(): JITIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JITIOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JITIOptions] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: Record[String, String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setCache(value: Boolean | String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCacheVersion(value: String): Self = StObject.set(x, "cacheVersion", value.asInstanceOf[js.Any])
      
      inline def setCacheVersionUndefined: Self = StObject.set(x, "cacheVersion", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEsmResolve(value: Boolean): Self = StObject.set(x, "esmResolve", value.asInstanceOf[js.Any])
      
      inline def setEsmResolveUndefined: Self = StObject.set(x, "esmResolve", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setInteropDefault(value: Boolean): Self = StObject.set(x, "interopDefault", value.asInstanceOf[js.Any])
      
      inline def setInteropDefaultUndefined: Self = StObject.set(x, "interopDefault", js.undefined)
      
      inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
      
      inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
      
      inline def setNativeModules(value: js.Array[String]): Self = StObject.set(x, "nativeModules", value.asInstanceOf[js.Any])
      
      inline def setNativeModulesUndefined: Self = StObject.set(x, "nativeModules", js.undefined)
      
      inline def setNativeModulesVarargs(value: String*): Self = StObject.set(x, "nativeModules", js.Array(value*))
      
      inline def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setRequireCache(value: Boolean): Self = StObject.set(x, "requireCache", value.asInstanceOf[js.Any])
      
      inline def setRequireCacheUndefined: Self = StObject.set(x, "requireCache", js.undefined)
      
      inline def setSourceMaps(value: Boolean): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
      
      inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
      
      inline def setTransform(value: /* opts */ TransformOptions => TRANSFORM_RESULT): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformModules(value: js.Array[String]): Self = StObject.set(x, "transformModules", value.asInstanceOf[js.Any])
      
      inline def setTransformModulesUndefined: Self = StObject.set(x, "transformModules", js.undefined)
      
      inline def setTransformModulesVarargs(value: String*): Self = StObject.set(x, "transformModules", js.Array(value*))
      
      inline def setTransformOptions(value: OmitTransformOptionssourc): Self = StObject.set(x, "transformOptions", value.asInstanceOf[js.Any])
      
      inline def setTransformOptionsUndefined: Self = StObject.set(x, "transformOptions", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setV8cache(value: Boolean): Self = StObject.set(x, "v8cache", value.asInstanceOf[js.Any])
      
      inline def setV8cacheUndefined: Self = StObject.set(x, "v8cache", js.undefined)
    }
  }
  
  trait TRANSFORM_RESULT extends StObject {
    
    var code: String
    
    var error: js.UndefOr[Any] = js.undefined
  }
  object TRANSFORM_RESULT {
    
    inline def apply(code: String): TRANSFORM_RESULT = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[TRANSFORM_RESULT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TRANSFORM_RESULT] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait TransformOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var legacy: js.UndefOr[Boolean] = js.undefined
    
    var retainLines: js.UndefOr[Boolean] = js.undefined
    
    var source: String
    
    var ts: js.UndefOr[Boolean] = js.undefined
  }
  object TransformOptions {
    
    inline def apply(source: String): TransformOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
      
      inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
      
      inline def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
      
      inline def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTs(value: Boolean): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    }
  }
}
