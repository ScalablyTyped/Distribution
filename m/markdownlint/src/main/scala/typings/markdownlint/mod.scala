package typings.markdownlint

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.RegExp
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Lint specified Markdown files.
    *
    * @param {Options} options Configuration options.
    * @param {LintCallback} callback Callback (err, result) function.
    * @returns {void}
    */
  @JSImport("markdownlint", JSImport.Namespace)
  @js.native
  def apply(options: Options, callback: LintCallback): Unit = js.native
  
  /**
    * Gets the (semantic) version of the library.
    *
    * @returns {string} SemVer string.
    */
  @JSImport("markdownlint", "getVersion")
  @js.native
  def getVersion(): String = js.native
  
  /**
    * Read specified configuration file.
    *
    * @param {string} file Configuration file name.
    * @param {ConfigurationParser[] | ReadConfigCallback} parsers Parsing
    * function(s).
    * @param {ReadConfigCallback} [callback] Callback (err, result) function.
    * @returns {void}
    */
  @JSImport("markdownlint", "readConfig")
  @js.native
  def readConfig(file: String, parsers: js.Array[ConfigurationParser]): Unit = js.native
  @JSImport("markdownlint", "readConfig")
  @js.native
  def readConfig(file: String, parsers: js.Array[ConfigurationParser], callback: ReadConfigCallback): Unit = js.native
  @JSImport("markdownlint", "readConfig")
  @js.native
  def readConfig(file: String, parsers: ReadConfigCallback): Unit = js.native
  @JSImport("markdownlint", "readConfig")
  @js.native
  def readConfig(file: String, parsers: ReadConfigCallback, callback: ReadConfigCallback): Unit = js.native
  
  /**
    * Read specified configuration file synchronously.
    *
    * @param {string} file Configuration file name.
    * @param {ConfigurationParser[]} [parsers] Parsing function(s).
    * @returns {Configuration} Configuration object.
    */
  @JSImport("markdownlint", "readConfigSync")
  @js.native
  def readConfigSync(file: String): Configuration = js.native
  @JSImport("markdownlint", "readConfigSync")
  @js.native
  def readConfigSync(file: String, parsers: js.Array[ConfigurationParser]): Configuration = js.native
  
  /**
    * Lint specified Markdown files synchronously.
    *
    * @param {Options} options Configuration options.
    * @returns {LintResults} Results object.
    */
  @JSImport("markdownlint", "sync")
  @js.native
  def sync(options: Options): LintResults = js.native
  
  /**
    * Configuration object for linting rules. For a detailed schema, see
    * {@link ../schema/markdownlint-config-schema.json}.
    */
  type Configuration = StringDictionary[js.Any]
  
  /**
    * Parses a configuration string and returns a configuration object.
    */
  type ConfigurationParser = js.Function1[/* text */ String, Configuration]
  
  /**
    * Fix information.
    */
  @js.native
  trait FixInfo extends StObject {
    
    /**
      * Count of characters to delete.
      */
    var deleteCount: js.UndefOr[Double] = js.native
    
    /**
      * Column of the fix (1-based).
      */
    var editColumn: js.UndefOr[Double] = js.native
    
    /**
      * Text to insert (after deleting).
      */
    var insertText: js.UndefOr[String] = js.native
  }
  object FixInfo {
    
    @scala.inline
    def apply(): FixInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FixInfo]
    }
    
    @scala.inline
    implicit class FixInfoMutableBuilder[Self <: FixInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteCount(value: Double): Self = StObject.set(x, "deleteCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteCountUndefined: Self = StObject.set(x, "deleteCount", js.undefined)
      
      @scala.inline
      def setEditColumn(value: Double): Self = StObject.set(x, "editColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditColumnUndefined: Self = StObject.set(x, "editColumn", js.undefined)
      
      @scala.inline
      def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    }
  }
  
  /**
    * Called with the result of the lint operation.
    */
  type LintCallback = js.Function2[/* err */ Error | Null, /* results */ js.UndefOr[LintResults], Unit]
  
  /**
    * Lint error.
    */
  @js.native
  trait LintError extends StObject {
    
    /**
      * Context for the error.
      */
    var errorContext: String = js.native
    
    /**
      * Detail about the error.
      */
    var errorDetail: String = js.native
    
    /**
      * Column number (1-based) and length.
      */
    var errorRange: js.Array[Double] = js.native
    
    /**
      * Fix information.
      */
    var fixInfo: FixInfo = js.native
    
    /**
      * Line number (1-based).
      */
    var lineNumber: Double = js.native
    
    /**
      * Rule description.
      */
    var ruleDescription: String = js.native
    
    /**
      * Link to more information.
      */
    var ruleInformation: String = js.native
    
    /**
      * Rule name(s).
      */
    var ruleNames: js.Array[String] = js.native
  }
  object LintError {
    
    @scala.inline
    def apply(
      errorContext: String,
      errorDetail: String,
      errorRange: js.Array[Double],
      fixInfo: FixInfo,
      lineNumber: Double,
      ruleDescription: String,
      ruleInformation: String,
      ruleNames: js.Array[String]
    ): LintError = {
      val __obj = js.Dynamic.literal(errorContext = errorContext.asInstanceOf[js.Any], errorDetail = errorDetail.asInstanceOf[js.Any], errorRange = errorRange.asInstanceOf[js.Any], fixInfo = fixInfo.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], ruleDescription = ruleDescription.asInstanceOf[js.Any], ruleInformation = ruleInformation.asInstanceOf[js.Any], ruleNames = ruleNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintError]
    }
    
    @scala.inline
    implicit class LintErrorMutableBuilder[Self <: LintError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorContext(value: String): Self = StObject.set(x, "errorContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDetail(value: String): Self = StObject.set(x, "errorDetail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorRange(value: js.Array[Double]): Self = StObject.set(x, "errorRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorRangeVarargs(value: Double*): Self = StObject.set(x, "errorRange", js.Array(value :_*))
      
      @scala.inline
      def setFixInfo(value: FixInfo): Self = StObject.set(x, "fixInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleDescription(value: String): Self = StObject.set(x, "ruleDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleInformation(value: String): Self = StObject.set(x, "ruleInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNames(value: js.Array[String]): Self = StObject.set(x, "ruleNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNamesVarargs(value: String*): Self = StObject.set(x, "ruleNames", js.Array(value :_*))
    }
  }
  
  /**
    * Lint results (for resultVersion 3).
    */
  type LintResults = StringDictionary[js.Array[LintError]]
  
  /**
    * Markdown-It token.
    */
  @js.native
  trait MarkdownItToken extends StObject {
    
    /**
      * HTML attributes.
      */
    var attrs: js.Array[js.Array[String]] = js.native
    
    /**
      * Block-level token.
      */
    var block: Boolean = js.native
    
    /**
      * Child nodes.
      */
    var children: js.Array[MarkdownItToken] = js.native
    
    /**
      * Tag contents.
      */
    var content: String = js.native
    
    /**
      * Ignore element.
      */
    var hidden: Boolean = js.native
    
    /**
      * Fence info.
      */
    var info: String = js.native
    
    /**
      * Nesting level.
      */
    var level: Double = js.native
    
    /**
      * Line content.
      */
    var line: String = js.native
    
    /**
      * Line number (1-based).
      */
    var lineNumber: Double = js.native
    
    /**
      * Beginning/ending line numbers.
      */
    var map: js.Array[Double] = js.native
    
    /**
      * Markup text.
      */
    var markup: String = js.native
    
    /**
      * Arbitrary data.
      */
    var meta: js.Any = js.native
    
    /**
      * Level change.
      */
    var nesting: Double = js.native
    
    /**
      * HTML tag name.
      */
    var tag: String = js.native
    
    /**
      * Token type.
      */
    var `type`: String = js.native
  }
  object MarkdownItToken {
    
    @scala.inline
    def apply(
      attrs: js.Array[js.Array[String]],
      block: Boolean,
      children: js.Array[MarkdownItToken],
      content: String,
      hidden: Boolean,
      info: String,
      level: Double,
      line: String,
      lineNumber: Double,
      map: js.Array[Double],
      markup: String,
      meta: js.Any,
      nesting: Double,
      tag: String,
      `type`: String
    ): MarkdownItToken = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], markup = markup.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkdownItToken]
    }
    
    @scala.inline
    implicit class MarkdownItTokenMutableBuilder[Self <: MarkdownItToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: js.Array[js.Array[String]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsVarargs(value: js.Array[String]*): Self = StObject.set(x, "attrs", js.Array(value :_*))
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: js.Array[MarkdownItToken]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: MarkdownItToken*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Array[Double]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapVarargs(value: Double*): Self = StObject.set(x, "map", js.Array(value :_*))
      
      @scala.inline
      def setMarkup(value: String): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNesting(value: Double): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Configuration options.
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * Configuration object.
      */
    var config: js.UndefOr[Configuration] = js.native
    
    /**
      * Custom rules.
      */
    var customRules: js.UndefOr[js.Array[Rule] | Rule] = js.native
    
    /**
      * Files to lint.
      */
    var files: js.UndefOr[js.Array[String] | String] = js.native
    
    /**
      * Front matter pattern.
      */
    var frontMatter: js.UndefOr[RegExp] = js.native
    
    /**
      * True to catch exceptions.
      */
    var handleRuleFailures: js.UndefOr[Boolean] = js.native
    
    /**
      * Additional plugins.
      */
    var markdownItPlugins: js.UndefOr[js.Array[js.Array[_]]] = js.native
    
    /**
      * True to ignore HTML directives.
      */
    var noInlineConfig: js.UndefOr[Boolean] = js.native
    
    /**
      * Results object version.
      */
    var resultVersion: js.UndefOr[Double] = js.native
    
    /**
      * Strings to lint.
      */
    var strings: js.UndefOr[StringDictionary[String]] = js.native
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
      def setConfig(value: Configuration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setCustomRules(value: js.Array[Rule] | Rule): Self = StObject.set(x, "customRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRulesUndefined: Self = StObject.set(x, "customRules", js.undefined)
      
      @scala.inline
      def setCustomRulesVarargs(value: Rule*): Self = StObject.set(x, "customRules", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String] | String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFrontMatter(value: RegExp): Self = StObject.set(x, "frontMatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrontMatterUndefined: Self = StObject.set(x, "frontMatter", js.undefined)
      
      @scala.inline
      def setHandleRuleFailures(value: Boolean): Self = StObject.set(x, "handleRuleFailures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleRuleFailuresUndefined: Self = StObject.set(x, "handleRuleFailures", js.undefined)
      
      @scala.inline
      def setMarkdownItPlugins(value: js.Array[js.Array[_]]): Self = StObject.set(x, "markdownItPlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkdownItPluginsUndefined: Self = StObject.set(x, "markdownItPlugins", js.undefined)
      
      @scala.inline
      def setMarkdownItPluginsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "markdownItPlugins", js.Array(value :_*))
      
      @scala.inline
      def setNoInlineConfig(value: Boolean): Self = StObject.set(x, "noInlineConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoInlineConfigUndefined: Self = StObject.set(x, "noInlineConfig", js.undefined)
      
      @scala.inline
      def setResultVersion(value: Double): Self = StObject.set(x, "resultVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultVersionUndefined: Self = StObject.set(x, "resultVersion", js.undefined)
      
      @scala.inline
      def setStrings(value: StringDictionary[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    }
  }
  
  /**
    * markdown-it plugin.
    */
  type Plugin = js.Array[js.Any]
  
  /**
    * Called with the result of the readConfig operation.
    */
  type ReadConfigCallback = js.Function2[/* err */ Error | Null, /* config */ js.UndefOr[Configuration], Unit]
  
  /**
    * Rule definition.
    */
  @js.native
  trait Rule extends StObject {
    
    /**
      * Rule description.
      */
    var description: String = js.native
    
    /**
      * Rule implementation.
      */
    def function(params: RuleParams, onError: RuleOnError): Unit = js.native
    /**
      * Rule implementation.
      */
    @JSName("function")
    var function_Original: RuleFunction = js.native
    
    /**
      * Link to more information.
      */
    var information: js.UndefOr[URL] = js.native
    
    /**
      * Rule name(s).
      */
    var names: js.Array[String] = js.native
    
    /**
      * Rule tag(s).
      */
    var tags: js.Array[String] = js.native
  }
  
  /**
    * Rule configuration.
    */
  type RuleConfiguration = js.Any
  
  /**
    * Function to implement rule logic.
    */
  type RuleFunction = js.Function2[/* params */ RuleParams, /* onError */ RuleOnError, Unit]
  
  /**
    * Error-reporting callback.
    */
  type RuleOnError = js.Function1[/* onErrorInfo */ RuleOnErrorInfo, Unit]
  
  /**
    * Fix information for RuleOnErrorInfo.
    */
  @js.native
  trait RuleOnErrorFixInfo extends StObject {
    
    /**
      * Count of characters to delete.
      */
    var deleteCount: js.UndefOr[Double] = js.native
    
    /**
      * Column of the fix (1-based).
      */
    var editColumn: js.UndefOr[Double] = js.native
    
    /**
      * Text to insert (after deleting).
      */
    var insertText: js.UndefOr[String] = js.native
    
    /**
      * Line number (1-based).
      */
    var lineNumber: js.UndefOr[Double] = js.native
  }
  object RuleOnErrorFixInfo {
    
    @scala.inline
    def apply(): RuleOnErrorFixInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleOnErrorFixInfo]
    }
    
    @scala.inline
    implicit class RuleOnErrorFixInfoMutableBuilder[Self <: RuleOnErrorFixInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteCount(value: Double): Self = StObject.set(x, "deleteCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteCountUndefined: Self = StObject.set(x, "deleteCount", js.undefined)
      
      @scala.inline
      def setEditColumn(value: Double): Self = StObject.set(x, "editColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditColumnUndefined: Self = StObject.set(x, "editColumn", js.undefined)
      
      @scala.inline
      def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    }
  }
  
  /**
    * Fix information for RuleOnError callback.
    */
  @js.native
  trait RuleOnErrorInfo extends StObject {
    
    /**
      * Context for the error.
      */
    var context: js.UndefOr[String] = js.native
    
    /**
      * Details about the error.
      */
    var details: js.UndefOr[String] = js.native
    
    /**
      * Fix information.
      */
    var fixInfo: js.UndefOr[RuleOnErrorFixInfo] = js.native
    
    /**
      * Line number (1-based).
      */
    var lineNumber: Double = js.native
    
    /**
      * Column number (1-based) and length.
      */
    var range: js.UndefOr[js.Array[Double]] = js.native
  }
  object RuleOnErrorInfo {
    
    @scala.inline
    def apply(lineNumber: Double): RuleOnErrorInfo = {
      val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleOnErrorInfo]
    }
    
    @scala.inline
    implicit class RuleOnErrorInfoMutableBuilder[Self <: RuleOnErrorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setFixInfo(value: RuleOnErrorFixInfo): Self = StObject.set(x, "fixInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixInfoUndefined: Self = StObject.set(x, "fixInfo", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
    }
  }
  
  /**
    * Rule parameters.
    */
  @js.native
  trait RuleParams extends StObject {
    
    /**
      * Rule configuration.
      */
    var config: RuleConfiguration = js.native
    
    /**
      * Front matter lines.
      */
    var frontMatterLines: js.Array[String] = js.native
    
    /**
      * File/string lines.
      */
    var lines: js.Array[String] = js.native
    
    /**
      * File/string name.
      */
    var name: String = js.native
    
    /**
      * markdown-it token objects.
      */
    var tokens: js.Array[MarkdownItToken] = js.native
  }
  object RuleParams {
    
    @scala.inline
    def apply(
      config: RuleConfiguration,
      frontMatterLines: js.Array[String],
      lines: js.Array[String],
      name: String,
      tokens: js.Array[MarkdownItToken]
    ): RuleParams = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], frontMatterLines = frontMatterLines.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleParams]
    }
    
    @scala.inline
    implicit class RuleParamsMutableBuilder[Self <: RuleParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: RuleConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrontMatterLines(value: js.Array[String]): Self = StObject.set(x, "frontMatterLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrontMatterLinesVarargs(value: String*): Self = StObject.set(x, "frontMatterLines", js.Array(value :_*))
      
      @scala.inline
      def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens(value: js.Array[MarkdownItToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensVarargs(value: MarkdownItToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
    }
  }
  
  /**
    * Function to pretty-print lint results.
    */
  type ToStringCallback = js.Function1[/* ruleAliases */ js.UndefOr[Boolean], String]
}
