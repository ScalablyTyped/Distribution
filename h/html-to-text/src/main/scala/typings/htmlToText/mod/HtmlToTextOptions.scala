package typings.htmlToText.mod

import typings.htmlToText.AnonForceWrapOnLimit
import typings.htmlToText.AnonIsAttributeValue
import typings.htmlToText.htmlToTextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlToTextOptions extends js.Object {
  /**
    * defines the tags whose text content will be captured from the html.
    * All content will be captured below the baseElement tags and added to the
    * resulting text output. This option allows the user to specify an array
    * of elements as base elements using a single tag with css class and id
    * parameters e.g. `[p.class1.class2#id1#id2, p.class1.class2#id1#id2]`.
    * Default: `"body"`
    */
  var baseElement: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * defines the text decoding options given to `he.decode`
    * For more information see the [he](https://github.com/mathiasbynens/he) module
    */
  var decodeOptions: js.UndefOr[AnonIsAttributeValue] = js.undefined
  /**
    * Customize the formatting of individual element types.
    */
  var format: js.UndefOr[Formatters] = js.undefined
  /**
    *  By default links are translated the following
    *      <a href='link'>text</a> => becomes => text [link].
    *  If this option is set to true and link and text are the same,
    *  [link] will be hidden and only text visible.
    */
  var hideLinkHrefIfSameAsText: js.UndefOr[Boolean] = js.undefined
  /**
    *  Ignore all document links if true.
    */
  var ignoreHref: js.UndefOr[Boolean] = js.undefined
  /**
    *  Ignore all document images if true.
    */
  var ignoreImage: js.UndefOr[Boolean] = js.undefined
  /**
    *  Allows you to specify the server host for href attributes, where the links start at the root (/).
    *  For example, linkHrefBaseUrl = 'http://asdf.com' and <a href='/dir/subdir'>...</a>
    *  the link in the text will be http://asdf.com/dir/subdir.
    *  Keep in mind that linkHrefBaseUrl shouldn't end with a /.
    */
  var linkHrefBaseUrl: js.UndefOr[String] = js.undefined
  /**
    * describes how to wrap long words
    */
  var longWordSplit: js.UndefOr[AnonForceWrapOnLimit] = js.undefined
  /**
    *  Dont print brackets around the link if true
    */
  var noLinkBrackets: js.UndefOr[Boolean] = js.undefined
  /**
    *  By default, any newlines \n in a block of text will be removed.
    *  If true, these newlines will not be removed.
    */
  var preserveNewlines: js.UndefOr[Boolean] = js.undefined
  /**
    * convert the entire document if we don't find the tag we're looking for
    * if true
    */
  var returnDomByDefault: js.UndefOr[Boolean] = js.undefined
  /**
    *  By default, paragraphs are converted with two newlines (\n\n).
    *  Set to true to convert to a single newline.
    */
  var singleNewLineParagraphs: js.UndefOr[Boolean] = js.undefined
  /**
    *  Allows to select certain tables by the class or id attribute from the HTML
    *  document. This is necessary because the majority of HTML E-Mails uses a
    *  table based layout. Prefix your table selectors with an . for the class
    *  and with a # for the id attribute. All other tables are ignored.
    *  You can assign true to this attribute to select all tables. Default: []
    */
  var tables: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  /**
    * defines the string that is used as item prefix for unordered lists `<ol>`.
    * Default: ' * '
    */
  var unorderedListItemPrefix: js.UndefOr[String] = js.undefined
  /**
    *  By default, headings (<h1>, <h2>, etc) are upper-cased.
    *  Set to false to leave headings as they are.
    */
  var uppercaseHeadings: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines after how many chars a line break should follow in p elements.
    * Set to null or false to disable word-wrapping. Default: 80
    */
  var wordwrap: js.UndefOr[Double | `false` | Null] = js.undefined
}

object HtmlToTextOptions {
  @scala.inline
  def apply(
    baseElement: String | js.Array[String] = null,
    decodeOptions: AnonIsAttributeValue = null,
    format: Formatters = null,
    hideLinkHrefIfSameAsText: js.UndefOr[Boolean] = js.undefined,
    ignoreHref: js.UndefOr[Boolean] = js.undefined,
    ignoreImage: js.UndefOr[Boolean] = js.undefined,
    linkHrefBaseUrl: String = null,
    longWordSplit: AnonForceWrapOnLimit = null,
    noLinkBrackets: js.UndefOr[Boolean] = js.undefined,
    preserveNewlines: js.UndefOr[Boolean] = js.undefined,
    returnDomByDefault: js.UndefOr[Boolean] = js.undefined,
    singleNewLineParagraphs: js.UndefOr[Boolean] = js.undefined,
    tables: js.Array[String] | Boolean = null,
    unorderedListItemPrefix: String = null,
    uppercaseHeadings: js.UndefOr[Boolean] = js.undefined,
    wordwrap: Double | `false` = null
  ): HtmlToTextOptions = {
    val __obj = js.Dynamic.literal()
    if (baseElement != null) __obj.updateDynamic("baseElement")(baseElement.asInstanceOf[js.Any])
    if (decodeOptions != null) __obj.updateDynamic("decodeOptions")(decodeOptions.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLinkHrefIfSameAsText)) __obj.updateDynamic("hideLinkHrefIfSameAsText")(hideLinkHrefIfSameAsText.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHref)) __obj.updateDynamic("ignoreHref")(ignoreHref.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreImage)) __obj.updateDynamic("ignoreImage")(ignoreImage.asInstanceOf[js.Any])
    if (linkHrefBaseUrl != null) __obj.updateDynamic("linkHrefBaseUrl")(linkHrefBaseUrl.asInstanceOf[js.Any])
    if (longWordSplit != null) __obj.updateDynamic("longWordSplit")(longWordSplit.asInstanceOf[js.Any])
    if (!js.isUndefined(noLinkBrackets)) __obj.updateDynamic("noLinkBrackets")(noLinkBrackets.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveNewlines)) __obj.updateDynamic("preserveNewlines")(preserveNewlines.asInstanceOf[js.Any])
    if (!js.isUndefined(returnDomByDefault)) __obj.updateDynamic("returnDomByDefault")(returnDomByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(singleNewLineParagraphs)) __obj.updateDynamic("singleNewLineParagraphs")(singleNewLineParagraphs.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (unorderedListItemPrefix != null) __obj.updateDynamic("unorderedListItemPrefix")(unorderedListItemPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(uppercaseHeadings)) __obj.updateDynamic("uppercaseHeadings")(uppercaseHeadings.asInstanceOf[js.Any])
    if (wordwrap != null) __obj.updateDynamic("wordwrap")(wordwrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlToTextOptions]
  }
}

