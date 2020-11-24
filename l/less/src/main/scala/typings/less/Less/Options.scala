package typings.less.Less

import org.scalablytyped.runtime.StringDictionary
import typings.less.lessStrings.`parens-division`
import typings.less.lessStrings.`strict-legacy`
import typings.less.lessStrings.always
import typings.less.lessStrings.comment
import typings.less.lessStrings.parens
import typings.less.lessStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference to:
  * * https://github.com/less/less.js/blob/master/bin/lessc
  * * http://lesscss.org/usage/#less-options
  *
  * @interface Options
  */
@js.native
trait Options extends js.Object {
  
  /** @deprecated If false, No color in compiling. */
  var color: js.UndefOr[Boolean] = js.native
  
  /** @deprecated If true, compress using less built-in compression. */
  var compress: js.UndefOr[Boolean] = js.native
  
  var depends: js.UndefOr[Boolean] = js.native
  
  /** Whether output file information and line numbers in compiled CSS code. */
  var dumpLineNumbers: js.UndefOr[comment | String] = js.native
  
  /** Filename of the main file to be passed to less.render() */
  var filename: js.UndefOr[String] = js.native
  
  /** Defines a variable that can be referenced by the file. */
  var globalVars: js.UndefOr[StringDictionary[String]] = js.native
  
  /** @deprecated False by default. */
  var ieCompat: js.UndefOr[Boolean] = js.native
  
  /** If true, allow imports from insecure https hosts. */
  var insecure: js.UndefOr[Boolean] = js.native
  
  /** @deprecated If true, enable evaluation of JavaScript inline in `.less` files. */
  var javascriptEnabled: js.UndefOr[Boolean] = js.native
  
  /** True, if run the less parser and just reports errors without any output. */
  var lint: js.UndefOr[Boolean] = js.native
  
  /** Math mode options for avoiding symbol conficts on math expressions. */
  var math: js.UndefOr[always | strict | `parens-division` | parens | `strict-legacy` | Double] = js.native
  
  var maxLineLen: js.UndefOr[Double] = js.native
  
  /** Puts Var declaration at the end of base file. */
  var modifyVars: js.UndefOr[StringDictionary[String]] = js.native
  
  /** The locations for less looking for files in @import rules */
  var paths: js.UndefOr[js.Array[String]] = js.native
  
  /** Pre-load global Less.js plugins */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  
  /** Add a path to every generated import and url in output css files. */
  var rootpath: js.UndefOr[String] = js.native
  
  /** If true, stops any warnings from being shown. */
  var silent: js.UndefOr[Boolean] = js.native
  
  var sourceMap: js.UndefOr[SourceMapOption] = js.native
  
  var strictImports: js.UndefOr[Boolean] = js.native
  
  /** Without this option, Less attempts to guess at the output unit when it does maths. */
  var strictUnits: js.UndefOr[Boolean] = js.native
  
  /** Read files synchronously in Node.js */
  var syncImport: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setDepends(value: Boolean): Self = this.set("depends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepends: Self = this.set("depends", js.undefined)
    
    @scala.inline
    def setDumpLineNumbers(value: comment | String): Self = this.set("dumpLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDumpLineNumbers: Self = this.set("dumpLineNumbers", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setGlobalVars(value: StringDictionary[String]): Self = this.set("globalVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalVars: Self = this.set("globalVars", js.undefined)
    
    @scala.inline
    def setIeCompat(value: Boolean): Self = this.set("ieCompat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIeCompat: Self = this.set("ieCompat", js.undefined)
    
    @scala.inline
    def setInsecure(value: Boolean): Self = this.set("insecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecure: Self = this.set("insecure", js.undefined)
    
    @scala.inline
    def setJavascriptEnabled(value: Boolean): Self = this.set("javascriptEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJavascriptEnabled: Self = this.set("javascriptEnabled", js.undefined)
    
    @scala.inline
    def setLint(value: Boolean): Self = this.set("lint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLint: Self = this.set("lint", js.undefined)
    
    @scala.inline
    def setMath(value: always | strict | `parens-division` | parens | `strict-legacy` | Double): Self = this.set("math", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMath: Self = this.set("math", js.undefined)
    
    @scala.inline
    def setMaxLineLen(value: Double): Self = this.set("maxLineLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLineLen: Self = this.set("maxLineLen", js.undefined)
    
    @scala.inline
    def setModifyVars(value: StringDictionary[String]): Self = this.set("modifyVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifyVars: Self = this.set("modifyVars", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Plugin*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[Plugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRootpath(value: String): Self = this.set("rootpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootpath: Self = this.set("rootpath", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setSourceMap(value: SourceMapOption): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setStrictImports(value: Boolean): Self = this.set("strictImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictImports: Self = this.set("strictImports", js.undefined)
    
    @scala.inline
    def setStrictUnits(value: Boolean): Self = this.set("strictUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictUnits: Self = this.set("strictUnits", js.undefined)
    
    @scala.inline
    def setSyncImport(value: Boolean): Self = this.set("syncImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncImport: Self = this.set("syncImport", js.undefined)
  }
}
