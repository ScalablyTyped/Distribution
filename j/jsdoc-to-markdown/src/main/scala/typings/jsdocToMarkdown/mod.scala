package typings.jsdocToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsdoc-to-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[js.Promise[Unit]]
  
  inline def getJsdocData(options: JsdocOptions): js.Promise[js.Array[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsdocData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Object]]]
  
  inline def getJsdocDataSync(options: JsdocOptions): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsdocDataSync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  
  inline def getNamepaths(options: JsdocOptions): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamepaths")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def getTemplateData(options: JsdocOptions): js.Promise[js.Array[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Object]]]
  
  inline def getTemplateDataSync(options: JsdocOptions): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateDataSync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  
  inline def render(options: JsdocOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def render(options: RenderOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def renderSync(options: JsdocOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def renderSync(options: RenderOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait JsdocOptions extends StObject {
    
    /**
      * The path to the jsdoc configuration file.
      *  Default: path/to/jsdoc/conf.json.
      */
    var configure: js.UndefOr[String] = js.undefined
    
    /**
      * One or more filenames to process.
      * Accepts globs (e.g. *.js). Either files, source or data must be supplied.
      */
    var files: String | js.Array[String]
    
    /**
      * By default results are cached to speed up repeat invocations.
      * Set to true to disable this.
      */
    var `no-cache`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A string containing source code to process.
      * Either files, source or data must be supplied.
      */
    var source: js.UndefOr[String] = js.undefined
  }
  object JsdocOptions {
    
    inline def apply(files: String | js.Array[String]): JsdocOptions = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsdocOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsdocOptions] (val x: Self) extends AnyVal {
      
      inline def setConfigure(value: String): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
      
      inline def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def `setNo-cache`(value: Boolean): Self = StObject.set(x, "no-cache", value.asInstanceOf[js.Any])
      
      inline def `setNo-cacheUndefined`: Self = StObject.set(x, "no-cache", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.list
  */
  trait MemberIndexFormat extends StObject
  object MemberIndexFormat {
    
    inline def grouped: typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped = "grouped".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped]
    
    inline def list: typings.jsdocToMarkdown.jsdocToMarkdownStrings.list = "list".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.list]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.list
    - typings.jsdocToMarkdown.jsdocToMarkdownStrings.table
  */
  trait RenderListFormat extends StObject
  object RenderListFormat {
    
    inline def list: typings.jsdocToMarkdown.jsdocToMarkdownStrings.list = "list".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.list]
    
    inline def table: typings.jsdocToMarkdown.jsdocToMarkdownStrings.table = "table".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.table]
  }
  
  trait RenderOptions extends StObject {
    
    /**
      * Raw template data to use. Useful when you already have template data, obtained from .getTemplateData.
      * Either files, source or data must be supplied.
      */
    var data: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    /**
      * Specifies the default language used in '@example' blocks (for syntax-highlighting purposes).
      * In gfm mode, each '@example' is wrapped in a fenced-code block. Example usage: --example-lang js.
      * Use the special value none for no specific language.
      * While using this option, you can override the supplied language
      * for any '@example' by specifying the @lang subtag,
      * e.g @example @lang hbs. Specifying @example @lang off will disable code blocks for that example.
      */
    var `example-lang`: js.UndefOr[String] = js.undefined
    
    var `global-index-format`: js.UndefOr[StyleListFormat] = js.undefined
    
    /**
      * The initial heading depth.
      * For example, with a value of 2 the top-level markdown headings look like "## The heading".
      */
    var `heading-depth`: js.UndefOr[Double] = js.undefined
    
    /**
      * handlebars helper files to override or extend the default set.
      */
    var helper: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var `member-index-format`: js.UndefOr[MemberIndexFormat] = js.undefined
    
    var `module-index-format`: js.UndefOr[StyleListFormat] = js.undefined
    
    /**
      * Format identifier names in the code style,
      * (i.e. format using backticks or <code></code>).
      */
    var `name-format`: js.UndefOr[String] = js.undefined
    
    /**
      * By default, dmd generates github-flavoured markdown.
      * Not all markdown parsers render gfm correctly.
      * If your generated docs look incorrect on sites other than Github
      * (e.g. npmjs.org) try enabling this option to disable Github-specific syntax.
      */
    var `no-gfm`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Two options to render parameter lists: 'list' or 'table' (default).
      * Table format works well in most cases but switch to list if things begin to look crowded / squashed.
      */
    var `param-list-format`: js.UndefOr[RenderListFormat] = js.undefined
    
    /**
      * handlebars partial files to override or extend the default set.
      */
    var partial: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Use an installed package containing helper and/or partial overrides.
      */
    var plugin: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var `property-list-format`: js.UndefOr[RenderListFormat] = js.undefined
    
    /**
      * Put <hr> breaks between identifiers. Improves readability on bulky docs.
      */
    var separators: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The template the supplied documentation will be rendered into.
      * Use the default or supply your own template for full control over the output.
      */
    var template: js.UndefOr[String] = js.undefined
  }
  object RenderOptions {
    
    inline def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def `setExample-lang`(value: String): Self = StObject.set(x, "example-lang", value.asInstanceOf[js.Any])
      
      inline def `setExample-langUndefined`: Self = StObject.set(x, "example-lang", js.undefined)
      
      inline def `setGlobal-index-format`(value: StyleListFormat): Self = StObject.set(x, "global-index-format", value.asInstanceOf[js.Any])
      
      inline def `setGlobal-index-formatUndefined`: Self = StObject.set(x, "global-index-format", js.undefined)
      
      inline def `setHeading-depth`(value: Double): Self = StObject.set(x, "heading-depth", value.asInstanceOf[js.Any])
      
      inline def `setHeading-depthUndefined`: Self = StObject.set(x, "heading-depth", js.undefined)
      
      inline def setHelper(value: String | js.Array[String]): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
      
      inline def setHelperVarargs(value: String*): Self = StObject.set(x, "helper", js.Array(value*))
      
      inline def `setMember-index-format`(value: MemberIndexFormat): Self = StObject.set(x, "member-index-format", value.asInstanceOf[js.Any])
      
      inline def `setMember-index-formatUndefined`: Self = StObject.set(x, "member-index-format", js.undefined)
      
      inline def `setModule-index-format`(value: StyleListFormat): Self = StObject.set(x, "module-index-format", value.asInstanceOf[js.Any])
      
      inline def `setModule-index-formatUndefined`: Self = StObject.set(x, "module-index-format", js.undefined)
      
      inline def `setName-format`(value: String): Self = StObject.set(x, "name-format", value.asInstanceOf[js.Any])
      
      inline def `setName-formatUndefined`: Self = StObject.set(x, "name-format", js.undefined)
      
      inline def `setNo-gfm`(value: Boolean): Self = StObject.set(x, "no-gfm", value.asInstanceOf[js.Any])
      
      inline def `setNo-gfmUndefined`: Self = StObject.set(x, "no-gfm", js.undefined)
      
      inline def `setParam-list-format`(value: RenderListFormat): Self = StObject.set(x, "param-list-format", value.asInstanceOf[js.Any])
      
      inline def `setParam-list-formatUndefined`: Self = StObject.set(x, "param-list-format", js.undefined)
      
      inline def setPartial(value: String | js.Array[String]): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      inline def setPartialVarargs(value: String*): Self = StObject.set(x, "partial", js.Array(value*))
      
      inline def setPlugin(value: String | js.Array[String]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setPluginVarargs(value: String*): Self = StObject.set(x, "plugin", js.Array(value*))
      
      inline def `setProperty-list-format`(value: RenderListFormat): Self = StObject.set(x, "property-list-format", value.asInstanceOf[js.Any])
      
      inline def `setProperty-list-formatUndefined`: Self = StObject.set(x, "property-list-format", js.undefined)
      
      inline def setSeparators(value: Boolean): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
      
      inline def setSeparatorsUndefined: Self = StObject.set(x, "separators", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
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
    
    inline def dl: typings.jsdocToMarkdown.jsdocToMarkdownStrings.dl = "dl".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.dl]
    
    inline def grouped: typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped = "grouped".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.grouped]
    
    inline def none: typings.jsdocToMarkdown.jsdocToMarkdownStrings.none = "none".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.none]
    
    inline def table: typings.jsdocToMarkdown.jsdocToMarkdownStrings.table = "table".asInstanceOf[typings.jsdocToMarkdown.jsdocToMarkdownStrings.table]
  }
}
