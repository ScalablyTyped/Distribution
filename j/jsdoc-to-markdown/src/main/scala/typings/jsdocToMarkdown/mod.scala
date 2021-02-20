package typings.jsdocToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsdoc-to-markdown", "clear")
  @js.native
  def clear(): js.Promise[Unit] = js.native
  
  @JSImport("jsdoc-to-markdown", "getJsdocData")
  @js.native
  def getJsdocData(options: JsdocOptions): js.Promise[js.Array[js.Object]] = js.native
  
  @JSImport("jsdoc-to-markdown", "getJsdocDataSync")
  @js.native
  def getJsdocDataSync(options: JsdocOptions): js.Array[js.Object] = js.native
  
  @JSImport("jsdoc-to-markdown", "getNamepaths")
  @js.native
  def getNamepaths(options: JsdocOptions): js.Promise[js.Object] = js.native
  
  @JSImport("jsdoc-to-markdown", "getTemplateData")
  @js.native
  def getTemplateData(options: JsdocOptions): js.Promise[js.Array[js.Object]] = js.native
  
  @JSImport("jsdoc-to-markdown", "getTemplateDataSync")
  @js.native
  def getTemplateDataSync(options: JsdocOptions): js.Array[js.Object] = js.native
  
  @JSImport("jsdoc-to-markdown", "render")
  @js.native
  def render(options: JsdocOptions): js.Promise[String] = js.native
  @JSImport("jsdoc-to-markdown", "render")
  @js.native
  def render(options: RenderOptions): js.Promise[String] = js.native
  
  @JSImport("jsdoc-to-markdown", "renderSync")
  @js.native
  def renderSync(options: JsdocOptions): String = js.native
  @JSImport("jsdoc-to-markdown", "renderSync")
  @js.native
  def renderSync(options: RenderOptions): String = js.native
  
  @js.native
  trait JsdocOptions extends StObject {
    
    /**
      * The path to the jsdoc configuration file.
      *  Default: path/to/jsdoc/conf.json.
      */
    var configure: js.UndefOr[String] = js.native
    
    /**
      * One or more filenames to process.
      * Accepts globs (e.g. *.js). Either files, source or data must be supplied.
      */
    var files: String | js.Array[String] = js.native
    
    /**
      * By default results are cached to speed up repeat invocations.
      * Set to true to disable this.
      */
    var noCache: js.UndefOr[Boolean] = js.native
    
    /**
      * A string containing source code to process.
      * Either files, source or data must be supplied.
      */
    var source: js.UndefOr[String] = js.native
  }
  object JsdocOptions {
    
    @scala.inline
    def apply(files: String | js.Array[String]): JsdocOptions = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsdocOptions]
    }
    
    @scala.inline
    implicit class JsdocOptionsMutableBuilder[Self <: JsdocOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigure(value: String): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
      
      @scala.inline
      def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.list
  */
  trait MemberIndexFormat extends StObject
  object MemberIndexFormat {
    
    @scala.inline
    def grouped: typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped = "grouped".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped]
    
    @scala.inline
    def list: typings.jsdocToMarkdown.jsdocToMarkdownStrings.list = "list".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.list]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.list
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.table
  */
  trait RenderListFormat extends StObject
  object RenderListFormat {
    
    @scala.inline
    def list: typings.jsdocToMarkdown.jsdocToMarkdownStrings.list = "list".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.list]
    
    @scala.inline
    def table: typings.jsdocToMarkdown.jsdocToMarkdownStrings.table = "table".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.table]
  }
  
  @js.native
  trait RenderOptions extends StObject {
    
    /**
      * Raw template data to use. Useful when you already have template data, obtained from .getTemplateData.
      * Either files, source or data must be supplied.
      */
    var data: js.UndefOr[js.Array[js.Object]] = js.native
    
    /**
      * Specifies the default language used in '@example' blocks (for syntax-highlighting purposes).
      * In gfm mode, each '@example' is wrapped in a fenced-code block. Example usage: --example-lang js.
      * Use the special value none for no specific language.
      * While using this option, you can override the supplied language
      * for any '@example' by specifying the @lang subtag,
      * e.g @example @lang hbs. Specifying @example @lang off will disable code blocks for that example.
      */
    var exampleLang: js.UndefOr[String] = js.native
    
    var globalIndexFormat: js.UndefOr[StyleListFormat] = js.native
    
    /**
      * The initial heading depth.
      * For example, with a value of 2 the top-level markdown headings look like "## The heading".
      */
    var headingDepth: js.UndefOr[Double] = js.native
    
    /**
      * handlebars helper files to override or extend the default set.
      */
    var helper: js.UndefOr[String | js.Array[String]] = js.native
    
    var memberIndexFormat: js.UndefOr[MemberIndexFormat] = js.native
    
    var moduleIndexFormat: js.UndefOr[StyleListFormat] = js.native
    
    /**
      * Format identifier names in the code style,
      * (i.e. format using backticks or <code></code>).
      */
    var nameFormat: js.UndefOr[String] = js.native
    
    /**
      * By default, dmd generates github-flavoured markdown.
      * Not all markdown parsers render gfm correctly.
      * If your generated docs look incorrect on sites other than Github
      * (e.g. npmjs.org) try enabling this option to disable Github-specific syntax.
      */
    var noGfm: js.UndefOr[Boolean] = js.native
    
    /**
      * Two options to render parameter lists: 'list' or 'table' (default).
      * Table format works well in most cases but switch to list if things begin to look crowded / squashed.
      */
    var paramListFormat: js.UndefOr[RenderListFormat] = js.native
    
    /**
      * handlebars partial files to override or extend the default set.
      */
    var partial: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Use an installed package containing helper and/or partial overrides.
      */
    var plugin: js.UndefOr[String | js.Array[String]] = js.native
    
    var propertyListFormat: js.UndefOr[RenderListFormat] = js.native
    
    /**
      * Put <hr> breaks between identifiers. Improves readability on bulky docs.
      */
    var seperators: js.UndefOr[Boolean] = js.native
    
    /**
      * The template the supplied documentation will be rendered into.
      * Use the default or supply your own template for full control over the output.
      */
    var template: js.UndefOr[String] = js.native
  }
  object RenderOptions {
    
    @scala.inline
    def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setExampleLang(value: String): Self = StObject.set(x, "exampleLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExampleLangUndefined: Self = StObject.set(x, "exampleLang", js.undefined)
      
      @scala.inline
      def setGlobalIndexFormat(value: StyleListFormat): Self = StObject.set(x, "globalIndexFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalIndexFormatUndefined: Self = StObject.set(x, "globalIndexFormat", js.undefined)
      
      @scala.inline
      def setHeadingDepth(value: Double): Self = StObject.set(x, "headingDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingDepthUndefined: Self = StObject.set(x, "headingDepth", js.undefined)
      
      @scala.inline
      def setHelper(value: String | js.Array[String]): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
      
      @scala.inline
      def setHelperVarargs(value: String*): Self = StObject.set(x, "helper", js.Array(value :_*))
      
      @scala.inline
      def setMemberIndexFormat(value: MemberIndexFormat): Self = StObject.set(x, "memberIndexFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberIndexFormatUndefined: Self = StObject.set(x, "memberIndexFormat", js.undefined)
      
      @scala.inline
      def setModuleIndexFormat(value: StyleListFormat): Self = StObject.set(x, "moduleIndexFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleIndexFormatUndefined: Self = StObject.set(x, "moduleIndexFormat", js.undefined)
      
      @scala.inline
      def setNameFormat(value: String): Self = StObject.set(x, "nameFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameFormatUndefined: Self = StObject.set(x, "nameFormat", js.undefined)
      
      @scala.inline
      def setNoGfm(value: Boolean): Self = StObject.set(x, "noGfm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoGfmUndefined: Self = StObject.set(x, "noGfm", js.undefined)
      
      @scala.inline
      def setParamListFormat(value: RenderListFormat): Self = StObject.set(x, "paramListFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamListFormatUndefined: Self = StObject.set(x, "paramListFormat", js.undefined)
      
      @scala.inline
      def setPartial(value: String | js.Array[String]): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      @scala.inline
      def setPartialVarargs(value: String*): Self = StObject.set(x, "partial", js.Array(value :_*))
      
      @scala.inline
      def setPlugin(value: String | js.Array[String]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      @scala.inline
      def setPluginVarargs(value: String*): Self = StObject.set(x, "plugin", js.Array(value :_*))
      
      @scala.inline
      def setPropertyListFormat(value: RenderListFormat): Self = StObject.set(x, "propertyListFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyListFormatUndefined: Self = StObject.set(x, "propertyListFormat", js.undefined)
      
      @scala.inline
      def setSeperators(value: Boolean): Self = StObject.set(x, "seperators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeperatorsUndefined: Self = StObject.set(x, "seperators", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.none
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.table
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.dl
  */
  trait StyleListFormat extends StObject
  object StyleListFormat {
    
    @scala.inline
    def dl: typings.jsdocToMarkdown.jsdocToMarkdownStrings.dl = "dl".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.dl]
    
    @scala.inline
    def grouped: typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped = "grouped".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped]
    
    @scala.inline
    def none: typings.jsdocToMarkdown.jsdocToMarkdownStrings.none = "none".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.none]
    
    @scala.inline
    def table: typings.jsdocToMarkdown.jsdocToMarkdownStrings.table = "table".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.table]
  }
}
