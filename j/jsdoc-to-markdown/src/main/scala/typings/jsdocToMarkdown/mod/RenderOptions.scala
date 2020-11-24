package typings.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderOptions extends js.Object {
  
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
  implicit class RenderOptionsOps[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setExampleLang(value: String): Self = this.set("exampleLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExampleLang: Self = this.set("exampleLang", js.undefined)
    
    @scala.inline
    def setGlobalIndexFormat(value: StyleListFormat): Self = this.set("globalIndexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalIndexFormat: Self = this.set("globalIndexFormat", js.undefined)
    
    @scala.inline
    def setHeadingDepth(value: Double): Self = this.set("headingDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadingDepth: Self = this.set("headingDepth", js.undefined)
    
    @scala.inline
    def setHelperVarargs(value: String*): Self = this.set("helper", js.Array(value :_*))
    
    @scala.inline
    def setHelper(value: String | js.Array[String]): Self = this.set("helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    
    @scala.inline
    def setMemberIndexFormat(value: MemberIndexFormat): Self = this.set("memberIndexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberIndexFormat: Self = this.set("memberIndexFormat", js.undefined)
    
    @scala.inline
    def setModuleIndexFormat(value: StyleListFormat): Self = this.set("moduleIndexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleIndexFormat: Self = this.set("moduleIndexFormat", js.undefined)
    
    @scala.inline
    def setNameFormat(value: String): Self = this.set("nameFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameFormat: Self = this.set("nameFormat", js.undefined)
    
    @scala.inline
    def setNoGfm(value: Boolean): Self = this.set("noGfm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoGfm: Self = this.set("noGfm", js.undefined)
    
    @scala.inline
    def setParamListFormat(value: RenderListFormat): Self = this.set("paramListFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamListFormat: Self = this.set("paramListFormat", js.undefined)
    
    @scala.inline
    def setPartialVarargs(value: String*): Self = this.set("partial", js.Array(value :_*))
    
    @scala.inline
    def setPartial(value: String | js.Array[String]): Self = this.set("partial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
    
    @scala.inline
    def setPluginVarargs(value: String*): Self = this.set("plugin", js.Array(value :_*))
    
    @scala.inline
    def setPlugin(value: String | js.Array[String]): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    
    @scala.inline
    def setPropertyListFormat(value: RenderListFormat): Self = this.set("propertyListFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyListFormat: Self = this.set("propertyListFormat", js.undefined)
    
    @scala.inline
    def setSeperators(value: Boolean): Self = this.set("seperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeperators: Self = this.set("seperators", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
