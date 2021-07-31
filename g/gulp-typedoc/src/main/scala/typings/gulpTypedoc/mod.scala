package typings.gulpTypedoc

import typings.gulpTypedoc.gulpTypedocStrings.amd
import typings.gulpTypedoc.gulpTypedocStrings.commonjs
import typings.gulpTypedoc.gulpTypedocStrings.file
import typings.gulpTypedoc.gulpTypedocStrings.modules
import typings.gulpTypedoc.gulpTypedocStrings.none
import typings.gulpTypedoc.gulpTypedocStrings.system
import typings.gulpTypedoc.gulpTypedocStrings.umd
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The plugin takes an object, of which all properties are passed transparently to typedoc. Pipe in TypeScript files.
    * The documentation files are not piped out.
    *
    * @param options Typedoc options
    * @return Empty output stream (ends when the files are written)
    */
  @scala.inline
  def apply(options: Options): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-typedoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Logger = js.Function3[/* message */ String, /* level */ Double, /* newline */ Boolean, Unit]
  
  /**
    * Typedoc options
    */
  trait Options extends StObject {
    
    /**
      * Specifies the fully qualified name of the root symbol. Defaults to global namespace.
      */
    var entryPoint: js.UndefOr[String] = js.undefined
    
    /**
      * Exclude files by the given pattern when a path is provided as source. Supports standard minimatch patterns
      * (see TypeStrong/typedoc#170)
      */
    var exclude: js.UndefOr[String] = js.undefined
    
    /**
      * Prevent externally resolved TypeScript files from being documented.
      */
    var excludeExternals: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevent private members from being included in the generated documentation.
      */
    var excludePrivate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevent protected members from being included in the generated documentation.
      */
    var excludeProtected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define a pattern for files that should be considered being external.
      */
    var externalPattern: js.UndefOr[String] = js.undefined
    
    /**
      * Set the Google Analytics tracking ID and activate tracking code.
      */
    var gaID: js.UndefOr[String] = js.undefined
    
    /**
      * Set the site name for Google Analytics. Defaults to `auto`
      */
    var gaSite: js.UndefOr[String] = js.undefined
    
    /**
      * Use specified revision or branch instead of the last revision for linking to GitHub source files.
      */
    var gitRevision: js.UndefOr[String] = js.undefined
    
    /**
      * Do not print the TypeDoc link at the end of the page.
      */
    var hideGenerator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Turn on parsing of .d.ts declaration files.
      */
    var includeDeclarations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the location to look for included documents. One may use [[include:FILENAME]] in comments to include
      * documents from this location.
      */
    var includes: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the location and file name a json file describing the project is written to. When specified no
      * documentation will be generated.
      */
    var json: js.UndefOr[String] = js.undefined
    
    var logger: js.UndefOr[Logger | none] = js.undefined
    
    /**
      * Specifies the location with media files that should be copied to the output directory. In order to create a link
      * to media files use the pattern media://FILENAME in comments.
      */
    var media: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the output mode the project is used to be compiled with.
      */
    var mode: js.UndefOr[file | modules] = js.undefined
    
    /**
      * Specify module code generation: "commonjs", "amd", "system" or "umd".
      */
    var module: js.UndefOr[commonjs | amd | system | umd] = js.undefined
    
    /**
      * Set the name of the project that will be used in the header of the template.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the location the documentation should be written to.
      */
    var out: String
    
    /**
      * Specify the npm plugins that should be loaded.
      */
    var plugins: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Path to the readme file that should be displayed on the index page. Pass `none` to disable the index page and
      * start the documentation on the globals page.
      */
    var readme: js.UndefOr[String] = js.undefined
    
    /**
      * Specify ECMAScript target version: "ES3" (default), "ES5" or "ES6"
      */
    var target: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the path to the theme that should be used.
      */
    var theme: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(out: String): Options = {
      val __obj = js.Dynamic.literal(out = out.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
      
      @scala.inline
      def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeExternals(value: Boolean): Self = StObject.set(x, "excludeExternals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeExternalsUndefined: Self = StObject.set(x, "excludeExternals", js.undefined)
      
      @scala.inline
      def setExcludePrivate(value: Boolean): Self = StObject.set(x, "excludePrivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludePrivateUndefined: Self = StObject.set(x, "excludePrivate", js.undefined)
      
      @scala.inline
      def setExcludeProtected(value: Boolean): Self = StObject.set(x, "excludeProtected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeProtectedUndefined: Self = StObject.set(x, "excludeProtected", js.undefined)
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExternalPattern(value: String): Self = StObject.set(x, "externalPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalPatternUndefined: Self = StObject.set(x, "externalPattern", js.undefined)
      
      @scala.inline
      def setGaID(value: String): Self = StObject.set(x, "gaID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaIDUndefined: Self = StObject.set(x, "gaID", js.undefined)
      
      @scala.inline
      def setGaSite(value: String): Self = StObject.set(x, "gaSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaSiteUndefined: Self = StObject.set(x, "gaSite", js.undefined)
      
      @scala.inline
      def setGitRevision(value: String): Self = StObject.set(x, "gitRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitRevisionUndefined: Self = StObject.set(x, "gitRevision", js.undefined)
      
      @scala.inline
      def setHideGenerator(value: Boolean): Self = StObject.set(x, "hideGenerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideGeneratorUndefined: Self = StObject.set(x, "hideGenerator", js.undefined)
      
      @scala.inline
      def setIncludeDeclarations(value: Boolean): Self = StObject.set(x, "includeDeclarations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDeclarationsUndefined: Self = StObject.set(x, "includeDeclarations", js.undefined)
      
      @scala.inline
      def setIncludes(value: String): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      @scala.inline
      def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger | none): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerFunction3(value: (/* message */ String, /* level */ Double, /* newline */ Boolean) => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMode(value: file | modules): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setModule(value: commonjs | amd | system | umd): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
