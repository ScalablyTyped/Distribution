package typings.less

import org.scalablytyped.runtime.StringDictionary
import typings.less.lessStrings.`parens-division`
import typings.less.lessStrings.`strict-legacy`
import typings.less.lessStrings.always
import typings.less.lessStrings.comment
import typings.less.lessStrings.parens
import typings.less.lessStrings.strict
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Less {
  
  @js.native
  trait ImportManager extends StObject {
    
    var contents: StringDictionary[String] = js.native
  }
  object ImportManager {
    
    @scala.inline
    def apply(contents: StringDictionary[String]): ImportManager = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportManager]
    }
    
    @scala.inline
    implicit class ImportManagerMutableBuilder[Self <: ImportManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: StringDictionary[String]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Reference to:
    * * https://github.com/less/less.js/blob/master/bin/lessc
    * * http://lesscss.org/usage/#less-options
    *
    * @interface Options
    */
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setDepends(value: Boolean): Self = StObject.set(x, "depends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependsUndefined: Self = StObject.set(x, "depends", js.undefined)
      
      @scala.inline
      def setDumpLineNumbers(value: comment | String): Self = StObject.set(x, "dumpLineNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpLineNumbersUndefined: Self = StObject.set(x, "dumpLineNumbers", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setGlobalVars(value: StringDictionary[String]): Self = StObject.set(x, "globalVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalVarsUndefined: Self = StObject.set(x, "globalVars", js.undefined)
      
      @scala.inline
      def setIeCompat(value: Boolean): Self = StObject.set(x, "ieCompat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIeCompatUndefined: Self = StObject.set(x, "ieCompat", js.undefined)
      
      @scala.inline
      def setInsecure(value: Boolean): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
      
      @scala.inline
      def setJavascriptEnabled(value: Boolean): Self = StObject.set(x, "javascriptEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavascriptEnabledUndefined: Self = StObject.set(x, "javascriptEnabled", js.undefined)
      
      @scala.inline
      def setLint(value: Boolean): Self = StObject.set(x, "lint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLintUndefined: Self = StObject.set(x, "lint", js.undefined)
      
      @scala.inline
      def setMath(value: always | strict | `parens-division` | parens | `strict-legacy` | Double): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMathUndefined: Self = StObject.set(x, "math", js.undefined)
      
      @scala.inline
      def setMaxLineLen(value: Double): Self = StObject.set(x, "maxLineLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLineLenUndefined: Self = StObject.set(x, "maxLineLen", js.undefined)
      
      @scala.inline
      def setModifyVars(value: StringDictionary[String]): Self = StObject.set(x, "modifyVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyVarsUndefined: Self = StObject.set(x, "modifyVars", js.undefined)
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRootpath(value: String): Self = StObject.set(x, "rootpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootpathUndefined: Self = StObject.set(x, "rootpath", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setSourceMap(value: SourceMapOption): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setStrictImports(value: Boolean): Self = StObject.set(x, "strictImports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictImportsUndefined: Self = StObject.set(x, "strictImports", js.undefined)
      
      @scala.inline
      def setStrictUnits(value: Boolean): Self = StObject.set(x, "strictUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUnitsUndefined: Self = StObject.set(x, "strictUnits", js.undefined)
      
      @scala.inline
      def setSyncImport(value: Boolean): Self = StObject.set(x, "syncImport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncImportUndefined: Self = StObject.set(x, "syncImport", js.undefined)
    }
  }
  
  @js.native
  trait Plugin extends StObject {
    
    def install(less: LessStatic, pluginManager: PluginManager): Unit = js.native
  }
  object Plugin {
    
    @scala.inline
    def apply(install: (LessStatic, PluginManager) => Unit): Plugin = {
      val __obj = js.Dynamic.literal(install = js.Any.fromFunction2(install))
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstall(value: (LessStatic, PluginManager) => Unit): Self = StObject.set(x, "install", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait PluginManager extends StObject {
    
    def addPreProcessor(preProcessor: PreProcessor): Unit = js.native
    def addPreProcessor(preProcessor: PreProcessor, priority: Double): Unit = js.native
  }
  
  @js.native
  trait PreProcessor extends StObject {
    
    def process(src: String, extra: PreProcessorExtraInfo): String = js.native
  }
  object PreProcessor {
    
    @scala.inline
    def apply(process: (String, PreProcessorExtraInfo) => String): PreProcessor = {
      val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process))
      __obj.asInstanceOf[PreProcessor]
    }
    
    @scala.inline
    implicit class PreProcessorMutableBuilder[Self <: PreProcessor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcess(value: (String, PreProcessorExtraInfo) => String): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait PreProcessorExtraInfo extends StObject {
    
    var context: typings.less.anon.PluginManager = js.native
    
    var fileInfo: RootFileInfo = js.native
    
    var imports: StringDictionary[js.Any] = js.native
  }
  object PreProcessorExtraInfo {
    
    @scala.inline
    def apply(
      context: typings.less.anon.PluginManager,
      fileInfo: RootFileInfo,
      imports: StringDictionary[js.Any]
    ): PreProcessorExtraInfo = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fileInfo = fileInfo.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreProcessorExtraInfo]
    }
    
    @scala.inline
    implicit class PreProcessorExtraInfoMutableBuilder[Self <: PreProcessorExtraInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: typings.less.anon.PluginManager): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileInfo(value: RootFileInfo): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImports(value: StringDictionary[js.Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RefreshOutput extends StObject {
    
    var endTime: Date = js.native
    
    var sheets: Double = js.native
    
    var startTime: Date = js.native
    
    var totalMilliseconds: Double = js.native
  }
  object RefreshOutput {
    
    @scala.inline
    def apply(endTime: Date, sheets: Double, startTime: Date, totalMilliseconds: Double): RefreshOutput = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], sheets = sheets.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], totalMilliseconds = totalMilliseconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshOutput]
    }
    
    @scala.inline
    implicit class RefreshOutputMutableBuilder[Self <: RefreshOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheets(value: Double): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalMilliseconds(value: Double): Self = StObject.set(x, "totalMilliseconds", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenderError extends StObject {
    
    var column: Double = js.native
    
    var extract: js.Array[String] = js.native
    
    var filename: String = js.native
    
    var index: Double = js.native
    
    var line: Double = js.native
    
    var message: String = js.native
    
    var `type`: String = js.native
  }
  object RenderError {
    
    @scala.inline
    def apply(
      column: Double,
      extract: js.Array[String],
      filename: String,
      index: Double,
      line: Double,
      message: String,
      `type`: String
    ): RenderError = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], extract = extract.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderError]
    }
    
    @scala.inline
    implicit class RenderErrorMutableBuilder[Self <: RenderError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtract(value: js.Array[String]): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractVarargs(value: String*): Self = StObject.set(x, "extract", js.Array(value :_*))
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenderOutput extends StObject {
    
    var css: String = js.native
    
    var imports: js.Array[String] = js.native
    
    var map: String = js.native
  }
  object RenderOutput {
    
    @scala.inline
    def apply(css: String, imports: js.Array[String], map: String): RenderOutput = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOutput]
    }
    
    @scala.inline
    implicit class RenderOutputMutableBuilder[Self <: RenderOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value :_*))
      
      @scala.inline
      def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
  
  // https://github.com/less/less.js/blob/master/lib/less/import-manager.js#L10
  @js.native
  trait RootFileInfo extends StObject {
    
    /** path to the current file, absolute */
    var currentDirectory: String = js.native
    
    /** absolute path to the entry file */
    var entryPath: String = js.native
    
    /** full resolved filename of current file */
    var filename: String = js.native
    
    /** whether the file should not be output and only output parts that are referenced */
    var reference: Boolean = js.native
    
    var relativeUrls: Boolean = js.native
    
    /** whether to adjust URL's to be relative */
    var rewriteUrls: js.UndefOr[Boolean] = js.native
    
    /** filename of the base file */
    var rootFilename: String = js.native
    
    /** path to append to normal URLs for this node */
    var rootpath: String = js.native
  }
  object RootFileInfo {
    
    @scala.inline
    def apply(
      currentDirectory: String,
      entryPath: String,
      filename: String,
      reference: Boolean,
      relativeUrls: Boolean,
      rootFilename: String,
      rootpath: String
    ): RootFileInfo = {
      val __obj = js.Dynamic.literal(currentDirectory = currentDirectory.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], relativeUrls = relativeUrls.asInstanceOf[js.Any], rootFilename = rootFilename.asInstanceOf[js.Any], rootpath = rootpath.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootFileInfo]
    }
    
    @scala.inline
    implicit class RootFileInfoMutableBuilder[Self <: RootFileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentDirectory(value: String): Self = StObject.set(x, "currentDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference(value: Boolean): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUrls(value: Boolean): Self = StObject.set(x, "relativeUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewriteUrls(value: Boolean): Self = StObject.set(x, "rewriteUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewriteUrlsUndefined: Self = StObject.set(x, "rewriteUrls", js.undefined)
      
      @scala.inline
      def setRootFilename(value: String): Self = StObject.set(x, "rootFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootpath(value: String): Self = StObject.set(x, "rootpath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceMapOption extends StObject {
    
    var outputSourceFiles: js.UndefOr[Boolean] = js.native
    
    var sourceMapBasepath: js.UndefOr[String] = js.native
    
    var sourceMapFileInline: js.UndefOr[Boolean] = js.native
    
    var sourceMapRootpath: js.UndefOr[String] = js.native
    
    var sourceMapURL: js.UndefOr[String] = js.native
  }
  object SourceMapOption {
    
    @scala.inline
    def apply(): SourceMapOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceMapOption]
    }
    
    @scala.inline
    implicit class SourceMapOptionMutableBuilder[Self <: SourceMapOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputSourceFiles(value: Boolean): Self = StObject.set(x, "outputSourceFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputSourceFilesUndefined: Self = StObject.set(x, "outputSourceFiles", js.undefined)
      
      @scala.inline
      def setSourceMapBasepath(value: String): Self = StObject.set(x, "sourceMapBasepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapBasepathUndefined: Self = StObject.set(x, "sourceMapBasepath", js.undefined)
      
      @scala.inline
      def setSourceMapFileInline(value: Boolean): Self = StObject.set(x, "sourceMapFileInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapFileInlineUndefined: Self = StObject.set(x, "sourceMapFileInline", js.undefined)
      
      @scala.inline
      def setSourceMapRootpath(value: String): Self = StObject.set(x, "sourceMapRootpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapRootpathUndefined: Self = StObject.set(x, "sourceMapRootpath", js.undefined)
      
      @scala.inline
      def setSourceMapURL(value: String): Self = StObject.set(x, "sourceMapURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapURLUndefined: Self = StObject.set(x, "sourceMapURL", js.undefined)
    }
  }
  
  @js.native
  trait StaticOptions extends StObject {
    
    var async: Boolean = js.native
    
    var fileAsync: Boolean = js.native
    
    var modifyVars: StringDictionary[String] = js.native
  }
  object StaticOptions {
    
    @scala.inline
    def apply(async: Boolean, fileAsync: Boolean, modifyVars: StringDictionary[String]): StaticOptions = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fileAsync = fileAsync.asInstanceOf[js.Any], modifyVars = modifyVars.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticOptions]
    }
    
    @scala.inline
    implicit class StaticOptionsMutableBuilder[Self <: StaticOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileAsync(value: Boolean): Self = StObject.set(x, "fileAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyVars(value: StringDictionary[String]): Self = StObject.set(x, "modifyVars", value.asInstanceOf[js.Any])
    }
  }
}
