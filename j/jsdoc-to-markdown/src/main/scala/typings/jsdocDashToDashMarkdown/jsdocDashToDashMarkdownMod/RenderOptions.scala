package typings.jsdocDashToDashMarkdown.jsdocDashToDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
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
  var exampleLang: js.UndefOr[String] = js.undefined
  var globalIndexFormat: js.UndefOr[StyleListFormat] = js.undefined
  /**
    * The initial heading depth.
    * For example, with a value of 2 the top-level markdown headings look like "## The heading".
    */
  var headingDepth: js.UndefOr[Double] = js.undefined
  /**
    * handlebars helper files to override or extend the default set.
    */
  var helper: js.UndefOr[String | js.Array[String]] = js.undefined
  var memberIndexFormat: js.UndefOr[MemberIndexFormat] = js.undefined
  var moduleIndexFormat: js.UndefOr[StyleListFormat] = js.undefined
  /**
    * Format identifier names in the code style,
    * (i.e. format using backticks or <code></code>).
    */
  var nameFormat: js.UndefOr[String] = js.undefined
  /**
    * By default, dmd generates github-flavoured markdown.
    * Not all markdown parsers render gfm correctly.
    * If your generated docs look incorrect on sites other than Github
    * (e.g. npmjs.org) try enabling this option to disable Github-specific syntax.
    */
  var noGfm: js.UndefOr[Boolean] = js.undefined
  /**
    * Two options to render parameter lists: 'list' or 'table' (default).
    * Table format works well in most cases but switch to list if things begin to look crowded / squashed.
    */
  var paramListFormat: js.UndefOr[RenderListFormat] = js.undefined
  /**
    * handlebars partial files to override or extend the default set.
    */
  var partial: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Use an installed package containing helper and/or partial overrides.
    */
  var plugin: js.UndefOr[String | js.Array[String]] = js.undefined
  var propertyListFormat: js.UndefOr[RenderListFormat] = js.undefined
  /**
    * Put <hr> breaks between identifiers. Improves readability on bulky docs.
    */
  var seperators: js.UndefOr[Boolean] = js.undefined
  /**
    * The template the supplied documentation will be rendered into.
    * Use the default or supply your own template for full control over the output.
    */
  var template: js.UndefOr[String] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    data: js.Array[js.Object] = null,
    exampleLang: String = null,
    globalIndexFormat: StyleListFormat = null,
    headingDepth: Int | Double = null,
    helper: String | js.Array[String] = null,
    memberIndexFormat: MemberIndexFormat = null,
    moduleIndexFormat: StyleListFormat = null,
    nameFormat: String = null,
    noGfm: js.UndefOr[Boolean] = js.undefined,
    paramListFormat: RenderListFormat = null,
    partial: String | js.Array[String] = null,
    plugin: String | js.Array[String] = null,
    propertyListFormat: RenderListFormat = null,
    seperators: js.UndefOr[Boolean] = js.undefined,
    template: String = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (exampleLang != null) __obj.updateDynamic("exampleLang")(exampleLang.asInstanceOf[js.Any])
    if (globalIndexFormat != null) __obj.updateDynamic("globalIndexFormat")(globalIndexFormat.asInstanceOf[js.Any])
    if (headingDepth != null) __obj.updateDynamic("headingDepth")(headingDepth.asInstanceOf[js.Any])
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (memberIndexFormat != null) __obj.updateDynamic("memberIndexFormat")(memberIndexFormat.asInstanceOf[js.Any])
    if (moduleIndexFormat != null) __obj.updateDynamic("moduleIndexFormat")(moduleIndexFormat.asInstanceOf[js.Any])
    if (nameFormat != null) __obj.updateDynamic("nameFormat")(nameFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(noGfm)) __obj.updateDynamic("noGfm")(noGfm.asInstanceOf[js.Any])
    if (paramListFormat != null) __obj.updateDynamic("paramListFormat")(paramListFormat.asInstanceOf[js.Any])
    if (partial != null) __obj.updateDynamic("partial")(partial.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (propertyListFormat != null) __obj.updateDynamic("propertyListFormat")(propertyListFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(seperators)) __obj.updateDynamic("seperators")(seperators.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

