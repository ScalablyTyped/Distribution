package typings.gulpRubySass

import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Object to be exported
    * @param {string} source - Filename or directory
    * @param {Options} options - Additional processing rules/options
    */
  inline def apply(source: String): ReadableStream = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def apply(source: String, options: Options): ReadableStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  @JSImport("gulp-ruby-sass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The interface includes the node-ruby-sass only options.
    * Attention: sourcemap option type differs from the same SassOption's type.
    * @interface Options
    * @extends SassOptions
    */
  trait Options
    extends StObject
       with SassOptions {
    
    var bundleExec: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String] = js.undefined
    
    @JSName("sourcemap")
    var sourcemap_Options: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBundleExec(value: Boolean): Self = StObject.set(x, "bundleExec", value.asInstanceOf[js.Any])
      
      inline def setBundleExecUndefined: Self = StObject.set(x, "bundleExec", js.undefined)
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  /**
    * The interface includes all options that available for sass executable.
    * Options are converted from dashed to camelCase
    * @interface SassOptions
    */
  trait SassOptions extends StObject {
    
    var cacheLocation: js.UndefOr[String] = js.undefined
    
    var check: js.UndefOr[Boolean] = js.undefined
    
    var compass: js.UndefOr[Boolean] = js.undefined
    
    var debugInfo: js.UndefOr[Boolean] = js.undefined
    
    var defaultEncoding: js.UndefOr[String] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    var lineComments: js.UndefOr[Boolean] = js.undefined
    
    var lineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var loadPath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var noCache: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var require: js.UndefOr[String] = js.undefined
    
    var scss: js.UndefOr[Boolean] = js.undefined
    
    // Actually, there should be a string. However due to ts spec, overriding member should be the same type or a subtype.
    // http://stackoverflow.com/questions/19605557/incompatible-static-properties-in-three-d-ts-with-latest-typescript
    // We need Options.soucemap to be boolean, so here 'any' is used instead of string.
    var sourcemap: js.UndefOr[js.Any] = js.undefined
    
    var stdin: js.UndefOr[Boolean] = js.undefined
    
    var stopOnError: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var trace: js.UndefOr[Boolean] = js.undefined
    
    var unixNewlines: js.UndefOr[Boolean] = js.undefined
    
    var update: js.UndefOr[String] = js.undefined
    
    // All listed below options are acceptable by the sass executable and potentially may be used from js.
    // However I doubt are there cases when it's meaningful
    var watch: js.UndefOr[String] = js.undefined
  }
  object SassOptions {
    
    inline def apply(): SassOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SassOptions]
    }
    
    extension [Self <: SassOptions](x: Self) {
      
      inline def setCacheLocation(value: String): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
      
      inline def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setCompass(value: Boolean): Self = StObject.set(x, "compass", value.asInstanceOf[js.Any])
      
      inline def setCompassUndefined: Self = StObject.set(x, "compass", js.undefined)
      
      inline def setDebugInfo(value: Boolean): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
      
      inline def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
      
      inline def setDefaultEncoding(value: String): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setLineComments(value: Boolean): Self = StObject.set(x, "lineComments", value.asInstanceOf[js.Any])
      
      inline def setLineCommentsUndefined: Self = StObject.set(x, "lineComments", js.undefined)
      
      inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      inline def setLoadPath(value: String | js.Array[String]): Self = StObject.set(x, "loadPath", value.asInstanceOf[js.Any])
      
      inline def setLoadPathUndefined: Self = StObject.set(x, "loadPath", js.undefined)
      
      inline def setLoadPathVarargs(value: String*): Self = StObject.set(x, "loadPath", js.Array(value :_*))
      
      inline def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
      
      inline def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setScss(value: Boolean): Self = StObject.set(x, "scss", value.asInstanceOf[js.Any])
      
      inline def setScssUndefined: Self = StObject.set(x, "scss", js.undefined)
      
      inline def setSourcemap(value: js.Any): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
      
      inline def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStopOnError(value: Boolean): Self = StObject.set(x, "stopOnError", value.asInstanceOf[js.Any])
      
      inline def setStopOnErrorUndefined: Self = StObject.set(x, "stopOnError", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setUnixNewlines(value: Boolean): Self = StObject.set(x, "unixNewlines", value.asInstanceOf[js.Any])
      
      inline def setUnixNewlinesUndefined: Self = StObject.set(x, "unixNewlines", js.undefined)
      
      inline def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setWatch(value: String): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
