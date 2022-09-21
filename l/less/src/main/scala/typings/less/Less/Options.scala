package typings.less.Less

import org.scalablytyped.runtime.StringDictionary
import typings.less.lessStrings.`parens-division`
import typings.less.lessStrings.`strict-legacy`
import typings.less.lessStrings.always
import typings.less.lessStrings.comment
import typings.less.lessStrings.parens
import typings.less.lessStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference to:
  * * https://github.com/less/less.js/blob/master/bin/lessc
  * * http://lesscss.org/usage/#less-options
  *
  * @interface Options
  */
trait Options extends StObject {
  
  /** @deprecated If false, No color in compiling. */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated If true, compress using less built-in compression. */
  var compress: js.UndefOr[Boolean] = js.undefined
  
  var depends: js.UndefOr[Boolean] = js.undefined
  
  /** Whether output file information and line numbers in compiled CSS code. */
  var dumpLineNumbers: js.UndefOr[comment | String] = js.undefined
  
  /** Filename of the main file to be passed to less.render() */
  var filename: js.UndefOr[String] = js.undefined
  
  /** Defines a variable that can be referenced by the file. */
  var globalVars: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** @deprecated False by default. */
  var ieCompat: js.UndefOr[Boolean] = js.undefined
  
  /** If true, allow imports from insecure https hosts. */
  var insecure: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated If true, enable evaluation of JavaScript inline in `.less` files. */
  var javascriptEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** True, if run the less parser and just reports errors without any output. */
  var lint: js.UndefOr[Boolean] = js.undefined
  
  /** Math mode options for avoiding symbol conficts on math expressions. */
  var math: js.UndefOr[always | strict | `parens-division` | parens | `strict-legacy` | Double] = js.undefined
  
  var maxLineLen: js.UndefOr[Double] = js.undefined
  
  /** Puts Var declaration at the end of base file. */
  var modifyVars: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** The locations for less looking for files in @import rules */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Pre-load global Less.js plugins */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  
  /** Add a path to every generated import and url in output css files. */
  var rootpath: js.UndefOr[String] = js.undefined
  
  /** If true, stops any warnings from being shown. */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var sourceMap: js.UndefOr[SourceMapOption] = js.undefined
  
  var strictImports: js.UndefOr[Boolean] = js.undefined
  
  /** Without this option, Less attempts to guess at the output unit when it does maths. */
  var strictUnits: js.UndefOr[Boolean] = js.undefined
  
  /** Read files synchronously in Node.js */
  var syncImport: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setDepends(value: Boolean): Self = StObject.set(x, "depends", value.asInstanceOf[js.Any])
    
    inline def setDependsUndefined: Self = StObject.set(x, "depends", js.undefined)
    
    inline def setDumpLineNumbers(value: comment | String): Self = StObject.set(x, "dumpLineNumbers", value.asInstanceOf[js.Any])
    
    inline def setDumpLineNumbersUndefined: Self = StObject.set(x, "dumpLineNumbers", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setGlobalVars(value: StringDictionary[String]): Self = StObject.set(x, "globalVars", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarsUndefined: Self = StObject.set(x, "globalVars", js.undefined)
    
    inline def setIeCompat(value: Boolean): Self = StObject.set(x, "ieCompat", value.asInstanceOf[js.Any])
    
    inline def setIeCompatUndefined: Self = StObject.set(x, "ieCompat", js.undefined)
    
    inline def setInsecure(value: Boolean): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
    
    inline def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
    
    inline def setJavascriptEnabled(value: Boolean): Self = StObject.set(x, "javascriptEnabled", value.asInstanceOf[js.Any])
    
    inline def setJavascriptEnabledUndefined: Self = StObject.set(x, "javascriptEnabled", js.undefined)
    
    inline def setLint(value: Boolean): Self = StObject.set(x, "lint", value.asInstanceOf[js.Any])
    
    inline def setLintUndefined: Self = StObject.set(x, "lint", js.undefined)
    
    inline def setMath(value: always | strict | `parens-division` | parens | `strict-legacy` | Double): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
    
    inline def setMathUndefined: Self = StObject.set(x, "math", js.undefined)
    
    inline def setMaxLineLen(value: Double): Self = StObject.set(x, "maxLineLen", value.asInstanceOf[js.Any])
    
    inline def setMaxLineLenUndefined: Self = StObject.set(x, "maxLineLen", js.undefined)
    
    inline def setModifyVars(value: StringDictionary[String]): Self = StObject.set(x, "modifyVars", value.asInstanceOf[js.Any])
    
    inline def setModifyVarsUndefined: Self = StObject.set(x, "modifyVars", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setRootpath(value: String): Self = StObject.set(x, "rootpath", value.asInstanceOf[js.Any])
    
    inline def setRootpathUndefined: Self = StObject.set(x, "rootpath", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setSourceMap(value: SourceMapOption): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setStrictImports(value: Boolean): Self = StObject.set(x, "strictImports", value.asInstanceOf[js.Any])
    
    inline def setStrictImportsUndefined: Self = StObject.set(x, "strictImports", js.undefined)
    
    inline def setStrictUnits(value: Boolean): Self = StObject.set(x, "strictUnits", value.asInstanceOf[js.Any])
    
    inline def setStrictUnitsUndefined: Self = StObject.set(x, "strictUnits", js.undefined)
    
    inline def setSyncImport(value: Boolean): Self = StObject.set(x, "syncImport", value.asInstanceOf[js.Any])
    
    inline def setSyncImportUndefined: Self = StObject.set(x, "syncImport", js.undefined)
  }
}
