package typings.markdownlint

import org.scalablytyped.runtime.StringDictionary
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Lint specified Markdown files.
    *
    * @param {Options} options Configuration options.
    * @param {LintCallback} callback Callback (err, result) function.
    * @returns {void}
    */
  inline def apply(options: Options, callback: LintCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("markdownlint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the (semantic) version of the library.
    *
    * @returns {string} SemVer string.
    */
  inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
  
  /**
    * Read specified configuration file.
    *
    * @param {string} file Configuration file name.
    * @param {ConfigurationParser[] | ReadConfigCallback} parsers Parsing
    * function(s).
    * @param {Object} [fs] File system implementation.
    * @param {ReadConfigCallback} [callback] Callback (err, result) function.
    * @returns {void}
    */
  inline def readConfig(file: String, parsers: js.Array[ConfigurationParser]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readConfig(file: String, parsers: js.Array[ConfigurationParser], fs: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readConfig(file: String, parsers: js.Array[ConfigurationParser], fs: Any, callback: ReadConfigCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readConfig(file: String, parsers: js.Array[ConfigurationParser], fs: Unit, callback: ReadConfigCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readConfig(file: String, parsers: ReadConfigCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readConfig(file: String, parsers: ReadConfigCallback, fs: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readConfig(file: String, parsers: ReadConfigCallback, fs: Any, callback: ReadConfigCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readConfig(file: String, parsers: ReadConfigCallback, fs: Unit, callback: ReadConfigCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Read specified configuration file synchronously.
    *
    * @param {string} file Configuration file name.
    * @param {ConfigurationParser[]} [parsers] Parsing function(s).
    * @param {Object} [fs] File system implementation.
    * @returns {Configuration} Configuration object.
    * @throws An Error if processing fails.
    */
  inline def readConfigSync(file: String): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("readConfigSync")(file.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  inline def readConfigSync(file: String, parsers: js.Array[ConfigurationParser]): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfigSync")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any])).asInstanceOf[Configuration]
  inline def readConfigSync(file: String, parsers: js.Array[ConfigurationParser], fs: Any): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfigSync")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[Configuration]
  inline def readConfigSync(file: String, parsers: Unit, fs: Any): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfigSync")(file.asInstanceOf[js.Any], parsers.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[Configuration]
  
  /**
    * Lint specified Markdown files synchronously.
    *
    * @param {Options} options Configuration options.
    * @returns {LintResults} Results object.
    */
  inline def sync(options: Options): LintResults = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[LintResults]
  
  /**
    * Configuration object for linting rules. For a detailed schema, see
    * {@link  ../schema/markdownlint-config-schema.json}.
    */
  type Configuration = StringDictionary[RuleConfiguration]
  
  /**
    * Parses a configuration string and returns a configuration object.
    */
  type ConfigurationParser = js.Function1[/* text */ String, Configuration]
  
  /**
    * Fix information.
    */
  trait FixInfo extends StObject {
    
    /**
      * Count of characters to delete.
      */
    var deleteCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Column of the fix (1-based).
      */
    var editColumn: js.UndefOr[Double] = js.undefined
    
    /**
      * Text to insert (after deleting).
      */
    var insertText: js.UndefOr[String] = js.undefined
    
    /**
      * Line number (1-based).
      */
    var lineNumber: js.UndefOr[Double] = js.undefined
  }
  object FixInfo {
    
    inline def apply(): FixInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FixInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixInfo] (val x: Self) extends AnyVal {
      
      inline def setDeleteCount(value: Double): Self = StObject.set(x, "deleteCount", value.asInstanceOf[js.Any])
      
      inline def setDeleteCountUndefined: Self = StObject.set(x, "deleteCount", js.undefined)
      
      inline def setEditColumn(value: Double): Self = StObject.set(x, "editColumn", value.asInstanceOf[js.Any])
      
      inline def setEditColumnUndefined: Self = StObject.set(x, "editColumn", js.undefined)
      
      inline def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
      
      inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    }
  }
  
  /**
    * Called with the result of the lint function.
    */
  type LintCallback = js.Function2[/* err */ js.Error | Null, /* results */ js.UndefOr[LintResults], Unit]
  
  /**
    * Lint error.
    */
  trait LintError extends StObject {
    
    /**
      * Context for the error.
      */
    var errorContext: String
    
    /**
      * Detail about the error.
      */
    var errorDetail: String
    
    /**
      * Column number (1-based) and length.
      */
    var errorRange: js.Array[Double]
    
    /**
      * Fix information.
      */
    var fixInfo: js.UndefOr[FixInfo] = js.undefined
    
    /**
      * Line number (1-based).
      */
    var lineNumber: Double
    
    /**
      * Rule description.
      */
    var ruleDescription: String
    
    /**
      * Link to more information.
      */
    var ruleInformation: String
    
    /**
      * Rule name(s).
      */
    var ruleNames: js.Array[String]
  }
  object LintError {
    
    inline def apply(
      errorContext: String,
      errorDetail: String,
      errorRange: js.Array[Double],
      lineNumber: Double,
      ruleDescription: String,
      ruleInformation: String,
      ruleNames: js.Array[String]
    ): LintError = {
      val __obj = js.Dynamic.literal(errorContext = errorContext.asInstanceOf[js.Any], errorDetail = errorDetail.asInstanceOf[js.Any], errorRange = errorRange.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], ruleDescription = ruleDescription.asInstanceOf[js.Any], ruleInformation = ruleInformation.asInstanceOf[js.Any], ruleNames = ruleNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LintError] (val x: Self) extends AnyVal {
      
      inline def setErrorContext(value: String): Self = StObject.set(x, "errorContext", value.asInstanceOf[js.Any])
      
      inline def setErrorDetail(value: String): Self = StObject.set(x, "errorDetail", value.asInstanceOf[js.Any])
      
      inline def setErrorRange(value: js.Array[Double]): Self = StObject.set(x, "errorRange", value.asInstanceOf[js.Any])
      
      inline def setErrorRangeVarargs(value: Double*): Self = StObject.set(x, "errorRange", js.Array(value*))
      
      inline def setFixInfo(value: FixInfo): Self = StObject.set(x, "fixInfo", value.asInstanceOf[js.Any])
      
      inline def setFixInfoUndefined: Self = StObject.set(x, "fixInfo", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setRuleDescription(value: String): Self = StObject.set(x, "ruleDescription", value.asInstanceOf[js.Any])
      
      inline def setRuleInformation(value: String): Self = StObject.set(x, "ruleInformation", value.asInstanceOf[js.Any])
      
      inline def setRuleNames(value: js.Array[String]): Self = StObject.set(x, "ruleNames", value.asInstanceOf[js.Any])
      
      inline def setRuleNamesVarargs(value: String*): Self = StObject.set(x, "ruleNames", js.Array(value*))
    }
  }
  
  /**
    * Lint results (for resultVersion 3).
    */
  type LintResults = StringDictionary[js.Array[LintError]]
  
  /**
    * Markdown-It token.
    */
  trait MarkdownItToken extends StObject {
    
    /**
      * HTML attributes.
      */
    var attrs: js.Array[js.Array[String]]
    
    /**
      * Block-level token.
      */
    var block: Boolean
    
    /**
      * Child nodes.
      */
    var children: js.Array[MarkdownItToken]
    
    /**
      * Tag contents.
      */
    var content: String
    
    /**
      * Ignore element.
      */
    var hidden: Boolean
    
    /**
      * Fence info.
      */
    var info: String
    
    /**
      * Nesting level.
      */
    var level: Double
    
    /**
      * Line content.
      */
    var line: String
    
    /**
      * Line number (1-based).
      */
    var lineNumber: Double
    
    /**
      * Beginning/ending line numbers.
      */
    var map: js.Array[Double]
    
    /**
      * Markup text.
      */
    var markup: String
    
    /**
      * Arbitrary data.
      */
    var meta: Any
    
    /**
      * Level change.
      */
    var nesting: Double
    
    /**
      * HTML tag name.
      */
    var tag: String
    
    /**
      * Token type.
      */
    var `type`: String
  }
  object MarkdownItToken {
    
    inline def apply(
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
      meta: Any,
      nesting: Double,
      tag: String,
      `type`: String
    ): MarkdownItToken = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], markup = markup.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkdownItToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkdownItToken] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: js.Array[js.Array[String]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: js.Array[String]*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[MarkdownItToken]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: MarkdownItToken*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Array[Double]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapVarargs(value: Double*): Self = StObject.set(x, "map", js.Array(value*))
      
      inline def setMarkup(value: String): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setNesting(value: Double): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Configuration options.
    */
  trait Options extends StObject {
    
    /**
      * Configuration object.
      */
    var config: js.UndefOr[Configuration] = js.undefined
    
    /**
      * Configuration parsers.
      */
    var configParsers: js.UndefOr[js.Array[ConfigurationParser]] = js.undefined
    
    /**
      * Custom rules.
      */
    var customRules: js.UndefOr[js.Array[Rule] | Rule] = js.undefined
    
    /**
      * Files to lint.
      */
    var files: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * Front matter pattern.
      */
    var frontMatter: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * File system implementation.
      */
    var fs: js.UndefOr[Any] = js.undefined
    
    /**
      * True to catch exceptions.
      */
    var handleRuleFailures: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional plugins.
      */
    var markdownItPlugins: js.UndefOr[js.Array[typings.std.Plugin]] = js.undefined
    
    /**
      * True to ignore HTML directives.
      */
    var noInlineConfig: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Results object version.
      */
    var resultVersion: js.UndefOr[Double] = js.undefined
    
    /**
      * Strings to lint.
      */
    var strings: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Configuration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigParsers(value: js.Array[ConfigurationParser]): Self = StObject.set(x, "configParsers", value.asInstanceOf[js.Any])
      
      inline def setConfigParsersUndefined: Self = StObject.set(x, "configParsers", js.undefined)
      
      inline def setConfigParsersVarargs(value: ConfigurationParser*): Self = StObject.set(x, "configParsers", js.Array(value*))
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCustomRules(value: js.Array[Rule] | Rule): Self = StObject.set(x, "customRules", value.asInstanceOf[js.Any])
      
      inline def setCustomRulesUndefined: Self = StObject.set(x, "customRules", js.undefined)
      
      inline def setCustomRulesVarargs(value: Rule*): Self = StObject.set(x, "customRules", js.Array(value*))
      
      inline def setFiles(value: js.Array[String] | String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFrontMatter(value: js.RegExp): Self = StObject.set(x, "frontMatter", value.asInstanceOf[js.Any])
      
      inline def setFrontMatterUndefined: Self = StObject.set(x, "frontMatter", js.undefined)
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setHandleRuleFailures(value: Boolean): Self = StObject.set(x, "handleRuleFailures", value.asInstanceOf[js.Any])
      
      inline def setHandleRuleFailuresUndefined: Self = StObject.set(x, "handleRuleFailures", js.undefined)
      
      inline def setMarkdownItPlugins(value: js.Array[typings.std.Plugin]): Self = StObject.set(x, "markdownItPlugins", value.asInstanceOf[js.Any])
      
      inline def setMarkdownItPluginsUndefined: Self = StObject.set(x, "markdownItPlugins", js.undefined)
      
      inline def setMarkdownItPluginsVarargs(value: typings.std.Plugin*): Self = StObject.set(x, "markdownItPlugins", js.Array(value*))
      
      inline def setNoInlineConfig(value: Boolean): Self = StObject.set(x, "noInlineConfig", value.asInstanceOf[js.Any])
      
      inline def setNoInlineConfigUndefined: Self = StObject.set(x, "noInlineConfig", js.undefined)
      
      inline def setResultVersion(value: Double): Self = StObject.set(x, "resultVersion", value.asInstanceOf[js.Any])
      
      inline def setResultVersionUndefined: Self = StObject.set(x, "resultVersion", js.undefined)
      
      inline def setStrings(value: StringDictionary[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    }
  }
  
  /**
    * A markdown-it plugin.
    */
  type Plugin = js.Array[Any]
  
  /**
    * Called with the result of the readConfig function.
    */
  type ReadConfigCallback = js.Function2[/* err */ js.Error | Null, /* config */ js.UndefOr[Configuration], Unit]
  
  /**
    * Called with the result of the resolveConfigExtends function.
    */
  type ResolveConfigExtendsCallback = js.Function2[/* err */ js.Error | Null, /* path */ js.UndefOr[String], Unit]
  
  /**
    * Rule definition.
    */
  trait Rule extends StObject {
    
    /**
      * True if asynchronous.
      */
    var asynchronous: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rule description.
      */
    var description: String
    
    /**
      * Rule implementation.
      */
    def function(params: RuleParams, onError: RuleOnError): Unit
    /**
      * Rule implementation.
      */
    @JSName("function")
    var function_Original: RuleFunction
    
    /**
      * Link to more information.
      */
    var information: js.UndefOr[URL] = js.undefined
    
    /**
      * Rule name(s).
      */
    var names: js.Array[String]
    
    /**
      * Rule tag(s).
      */
    var tags: js.Array[String]
  }
  object Rule {
    
    inline def apply(
      description: String,
      function: (/* params */ RuleParams, /* onError */ RuleOnError) => Unit,
      names: js.Array[String],
      tags: js.Array[String]
    ): Rule = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], function = js.Any.fromFunction2(function), names = names.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      inline def setAsynchronous(value: Boolean): Self = StObject.set(x, "asynchronous", value.asInstanceOf[js.Any])
      
      inline def setAsynchronousUndefined: Self = StObject.set(x, "asynchronous", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: (/* params */ RuleParams, /* onError */ RuleOnError) => Unit): Self = StObject.set(x, "function", js.Any.fromFunction2(value))
      
      inline def setInformation(value: URL): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
      
      inline def setInformationUndefined: Self = StObject.set(x, "information", js.undefined)
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  /**
    * Rule configuration.
    */
  type RuleConfiguration = Boolean | Any
  
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
  trait RuleOnErrorFixInfo extends StObject {
    
    /**
      * Count of characters to delete.
      */
    var deleteCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Column of the fix (1-based).
      */
    var editColumn: js.UndefOr[Double] = js.undefined
    
    /**
      * Text to insert (after deleting).
      */
    var insertText: js.UndefOr[String] = js.undefined
    
    /**
      * Line number (1-based).
      */
    var lineNumber: js.UndefOr[Double] = js.undefined
  }
  object RuleOnErrorFixInfo {
    
    inline def apply(): RuleOnErrorFixInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleOnErrorFixInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleOnErrorFixInfo] (val x: Self) extends AnyVal {
      
      inline def setDeleteCount(value: Double): Self = StObject.set(x, "deleteCount", value.asInstanceOf[js.Any])
      
      inline def setDeleteCountUndefined: Self = StObject.set(x, "deleteCount", js.undefined)
      
      inline def setEditColumn(value: Double): Self = StObject.set(x, "editColumn", value.asInstanceOf[js.Any])
      
      inline def setEditColumnUndefined: Self = StObject.set(x, "editColumn", js.undefined)
      
      inline def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
      
      inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    }
  }
  
  /**
    * Fix information for RuleOnError callback.
    */
  trait RuleOnErrorInfo extends StObject {
    
    /**
      * Context for the error.
      */
    var context: js.UndefOr[String] = js.undefined
    
    /**
      * Detail about the error.
      */
    var detail: js.UndefOr[String] = js.undefined
    
    /**
      * Fix information.
      */
    var fixInfo: js.UndefOr[RuleOnErrorFixInfo] = js.undefined
    
    /**
      * Line number (1-based).
      */
    var lineNumber: Double
    
    /**
      * Column number (1-based) and length.
      */
    var range: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object RuleOnErrorInfo {
    
    inline def apply(lineNumber: Double): RuleOnErrorInfo = {
      val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleOnErrorInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleOnErrorInfo] (val x: Self) extends AnyVal {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setFixInfo(value: RuleOnErrorFixInfo): Self = StObject.set(x, "fixInfo", value.asInstanceOf[js.Any])
      
      inline def setFixInfoUndefined: Self = StObject.set(x, "fixInfo", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    }
  }
  
  /**
    * Rule parameters.
    */
  trait RuleParams extends StObject {
    
    /**
      * Rule configuration.
      */
    var config: RuleConfiguration
    
    /**
      * Front matter lines.
      */
    var frontMatterLines: js.Array[String]
    
    /**
      * File/string lines.
      */
    var lines: js.Array[String]
    
    /**
      * File/string name.
      */
    var name: String
    
    /**
      * Token objects from markdown-it.
      */
    var tokens: js.Array[MarkdownItToken]
  }
  object RuleParams {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: RuleParams] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: RuleConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setFrontMatterLines(value: js.Array[String]): Self = StObject.set(x, "frontMatterLines", value.asInstanceOf[js.Any])
      
      inline def setFrontMatterLinesVarargs(value: String*): Self = StObject.set(x, "frontMatterLines", js.Array(value*))
      
      inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[MarkdownItToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: MarkdownItToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  /**
    * Function to pretty-print lint results.
    */
  type ToStringCallback = js.Function1[/* ruleAliases */ js.UndefOr[Boolean], String]
}
