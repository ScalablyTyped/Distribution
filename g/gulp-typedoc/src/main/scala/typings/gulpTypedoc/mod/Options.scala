package typings.gulpTypedoc.mod

import typings.gulpTypedoc.gulpTypedocStrings.amd
import typings.gulpTypedoc.gulpTypedocStrings.commonjs
import typings.gulpTypedoc.gulpTypedocStrings.file
import typings.gulpTypedoc.gulpTypedocStrings.modules
import typings.gulpTypedoc.gulpTypedocStrings.none
import typings.gulpTypedoc.gulpTypedocStrings.system
import typings.gulpTypedoc.gulpTypedocStrings.umd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Typedoc options
  */
@js.native
trait Options extends js.Object {
  
  /**
    * Specifies the fully qualified name of the root symbol. Defaults to global namespace.
    */
  var entryPoint: js.UndefOr[String] = js.native
  
  /**
    * Exclude files by the given pattern when a path is provided as source. Supports standard minimatch patterns
    * (see TypeStrong/typedoc#170)
    */
  var exclude: js.UndefOr[String] = js.native
  
  /**
    * Prevent externally resolved TypeScript files from being documented.
    */
  var excludeExternals: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent private members from being included in the generated documentation.
    */
  var excludePrivate: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent protected members from being included in the generated documentation.
    */
  var excludeProtected: js.UndefOr[Boolean] = js.native
  
  /**
    * Define a pattern for files that should be considered being external.
    */
  var externalPattern: js.UndefOr[String] = js.native
  
  /**
    * Set the Google Analytics tracking ID and activate tracking code.
    */
  var gaID: js.UndefOr[String] = js.native
  
  /**
    * Set the site name for Google Analytics. Defaults to `auto`
    */
  var gaSite: js.UndefOr[String] = js.native
  
  /**
    * Use specified revision or branch instead of the last revision for linking to GitHub source files.
    */
  var gitRevision: js.UndefOr[String] = js.native
  
  /**
    * Do not print the TypeDoc link at the end of the page.
    */
  var hideGenerator: js.UndefOr[Boolean] = js.native
  
  /**
    * Turn on parsing of .d.ts declaration files.
    */
  var includeDeclarations: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the location to look for included documents. One may use [[include:FILENAME]] in comments to include
    * documents from this location.
    */
  var includes: js.UndefOr[String] = js.native
  
  /**
    * Specifies the location and file name a json file describing the project is written to. When specified no
    * documentation will be generated.
    */
  var json: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[Logger | none] = js.native
  
  /**
    * Specifies the location with media files that should be copied to the output directory. In order to create a link
    * to media files use the pattern media://FILENAME in comments.
    */
  var media: js.UndefOr[String] = js.native
  
  /**
    * Specifies the output mode the project is used to be compiled with.
    */
  var mode: js.UndefOr[file | modules] = js.native
  
  /**
    * Specify module code generation: "commonjs", "amd", "system" or "umd".
    */
  var module: js.UndefOr[commonjs | amd | system | umd] = js.native
  
  /**
    * Set the name of the project that will be used in the header of the template.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specifies the location the documentation should be written to.
    */
  var out: String = js.native
  
  /**
    * Specify the npm plugins that should be loaded.
    */
  var plugins: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Path to the readme file that should be displayed on the index page. Pass `none` to disable the index page and
    * start the documentation on the globals page.
    */
  var readme: js.UndefOr[String] = js.native
  
  /**
    * Specify ECMAScript target version: "ES3" (default), "ES5" or "ES6"
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * Specify the path to the theme that should be used.
    */
  var theme: js.UndefOr[String] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(out: String): Options = {
    val __obj = js.Dynamic.literal(out = out.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOut(value: String): Self = this.set("out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPoint(value: String): Self = this.set("entryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPoint: Self = this.set("entryPoint", js.undefined)
    
    @scala.inline
    def setExclude(value: String): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExcludeExternals(value: Boolean): Self = this.set("excludeExternals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeExternals: Self = this.set("excludeExternals", js.undefined)
    
    @scala.inline
    def setExcludePrivate(value: Boolean): Self = this.set("excludePrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludePrivate: Self = this.set("excludePrivate", js.undefined)
    
    @scala.inline
    def setExcludeProtected(value: Boolean): Self = this.set("excludeProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeProtected: Self = this.set("excludeProtected", js.undefined)
    
    @scala.inline
    def setExternalPattern(value: String): Self = this.set("externalPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalPattern: Self = this.set("externalPattern", js.undefined)
    
    @scala.inline
    def setGaID(value: String): Self = this.set("gaID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaID: Self = this.set("gaID", js.undefined)
    
    @scala.inline
    def setGaSite(value: String): Self = this.set("gaSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaSite: Self = this.set("gaSite", js.undefined)
    
    @scala.inline
    def setGitRevision(value: String): Self = this.set("gitRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitRevision: Self = this.set("gitRevision", js.undefined)
    
    @scala.inline
    def setHideGenerator(value: Boolean): Self = this.set("hideGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideGenerator: Self = this.set("hideGenerator", js.undefined)
    
    @scala.inline
    def setIncludeDeclarations(value: Boolean): Self = this.set("includeDeclarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDeclarations: Self = this.set("includeDeclarations", js.undefined)
    
    @scala.inline
    def setIncludes(value: String): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludes: Self = this.set("includes", js.undefined)
    
    @scala.inline
    def setJson(value: String): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setLoggerFunction3(value: (/* message */ String, /* level */ Double, /* newline */ Boolean) => Unit): Self = this.set("logger", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLogger(value: Logger | none): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMode(value: file | modules): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setModule(value: commonjs | amd | system | umd): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setReadme(value: String): Self = this.set("readme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadme: Self = this.set("readme", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setVersion(value: Boolean): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
