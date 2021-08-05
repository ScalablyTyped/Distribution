package typings.gulpLoadPlugins

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Loads in any gulp plugins and attaches them to an object, freeing you up from having to manually require each gulp plugin. */
object mod {
  
  /** Loads in any gulp plugins and attaches them to an object, freeing you up from having to manually require each gulp plugin. */
  inline def apply[T /* <: IGulpPlugins */](): T = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[T]
  inline def apply[T /* <: IGulpPlugins */](options: IOptions): T = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("gulp-load-plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IOptions extends StObject {
    
    /** if true, transforms hyphenated plugin names to camel case, default true */
    var camelize: js.UndefOr[Boolean] = js.undefined
    
    /** where to find the plugins, searched up from process.cwd(), default 'package.json' */
    var config: js.UndefOr[String] = js.undefined
    
    /** whether the plugins should be lazy loaded on demand, default true */
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    /** the glob(s) to search for, default ['gulp-*', 'gulp.*'] */
    var pattern: js.UndefOr[js.Array[String]] = js.undefined
    
    /** a mapping of plugins to rename, the key being the NPM name of the package, and the value being an alias you define */
    var rename: js.UndefOr[IPluginNameMappings] = js.undefined
    
    /** what to remove from the name of the module when adding it to the context, default /^gulp(-|\.)/ */
    var replaceString: js.UndefOr[RegExp] = js.undefined
    
    /** which keys in the config to look within, default ['dependencies', 'devDependencies', 'peerDependencies'] */
    var scope: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setCamelize(value: Boolean): Self = StObject.set(x, "camelize", value.asInstanceOf[js.Any])
      
      inline def setCamelizeUndefined: Self = StObject.set(x, "camelize", js.undefined)
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value :_*))
      
      inline def setRename(value: IPluginNameMappings): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setReplaceString(value: RegExp): Self = StObject.set(x, "replaceString", value.asInstanceOf[js.Any])
      
      inline def setReplaceStringUndefined: Self = StObject.set(x, "replaceString", js.undefined)
      
      inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  type IPluginNameMappings = StringDictionary[String]
}
