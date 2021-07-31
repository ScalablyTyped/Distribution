package typings.grumblerScripts

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait WebpackConfig extends StObject
  
  trait WebpackConfigOptions extends StObject {
    
    var alias: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var analyze: js.UndefOr[Boolean] = js.undefined
    
    var babelConfig: js.UndefOr[String] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var dynamic: js.UndefOr[Boolean] = js.undefined
    
    var entry: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var libraryTarget: js.UndefOr[String] = js.undefined
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var modulename: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var sourcemaps: js.UndefOr[Boolean] = js.undefined
    
    var test: js.UndefOr[Boolean] = js.undefined
    
    var vars: js.UndefOr[js.Object] = js.undefined
    
    var web: js.UndefOr[Boolean] = js.undefined
  }
  object WebpackConfigOptions {
    
    @scala.inline
    def apply(): WebpackConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebpackConfigOptions]
    }
    
    @scala.inline
    implicit class WebpackConfigOptionsMutableBuilder[Self <: WebpackConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: StringDictionary[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAnalyze(value: Boolean): Self = StObject.set(x, "analyze", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyzeUndefined: Self = StObject.set(x, "analyze", js.undefined)
      
      @scala.inline
      def setBabelConfig(value: String): Self = StObject.set(x, "babelConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabelConfigUndefined: Self = StObject.set(x, "babelConfig", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      @scala.inline
      def setEntry(value: String | js.Array[String]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      @scala.inline
      def setEntryVarargs(value: String*): Self = StObject.set(x, "entry", js.Array(value :_*))
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLibraryTarget(value: String): Self = StObject.set(x, "libraryTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibraryTargetUndefined: Self = StObject.set(x, "libraryTarget", js.undefined)
      
      @scala.inline
      def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setModulename(value: String): Self = StObject.set(x, "modulename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulenameUndefined: Self = StObject.set(x, "modulename", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
      
      @scala.inline
      def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setVars(value: js.Object): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
      
      @scala.inline
      def setWeb(value: Boolean): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    }
  }
}
