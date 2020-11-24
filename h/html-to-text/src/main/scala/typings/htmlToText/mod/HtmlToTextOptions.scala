package typings.htmlToText.mod

import typings.htmlToText.anon.ForceWrapOnLimit
import typings.htmlToText.anon.IsAttributeValue
import typings.htmlToText.htmlToTextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlToTextOptions extends js.Object {
  
  /**
    * defines the tags whose text content will be captured from the html.
    * All content will be captured below the baseElement tags and added to the
    * resulting text output. This option allows the user to specify an array
    * of elements as base elements using a single tag with css class and id
    * parameters e.g. `[p.class1.class2#id1#id2, p.class1.class2#id1#id2]`.
    * Default: `"body"`
    */
  var baseElement: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * defines the text decoding options given to `he.decode`
    * For more information see the [he](https://github.com/mathiasbynens/he) module
    */
  var decodeOptions: js.UndefOr[IsAttributeValue] = js.native
  
  /**
    * Customize the formatting of individual element types.
    */
  var format: js.UndefOr[Formatters] = js.native
  
  /**
    *  By default links are translated the following
    *      <a href='link'>text</a> => becomes => text [link].
    *  If this option is set to true and link and text are the same,
    *  [link] will be hidden and only text visible.
    */
  var hideLinkHrefIfSameAsText: js.UndefOr[Boolean] = js.native
  
  /**
    *  Ignore all document links if true.
    */
  var ignoreHref: js.UndefOr[Boolean] = js.native
  
  /**
    *  Ignore all document images if true.
    */
  var ignoreImage: js.UndefOr[Boolean] = js.native
  
  /**
    *  Allows you to specify the server host for href attributes, where the links start at the root (/).
    *  For example, linkHrefBaseUrl = 'http://asdf.com' and <a href='/dir/subdir'>...</a>
    *  the link in the text will be http://asdf.com/dir/subdir.
    *  Keep in mind that linkHrefBaseUrl shouldn't end with a /.
    */
  var linkHrefBaseUrl: js.UndefOr[String] = js.native
  
  /**
    * describes how to wrap long words
    */
  var longWordSplit: js.UndefOr[ForceWrapOnLimit] = js.native
  
  /**
    *  Dont print brackets around the link if true
    */
  var noLinkBrackets: js.UndefOr[Boolean] = js.native
  
  /**
    *  By default, any newlines \n in a block of text will be removed.
    *  If true, these newlines will not be removed.
    */
  var preserveNewlines: js.UndefOr[Boolean] = js.native
  
  /**
    * convert the entire document if we don't find the tag we're looking for
    * if true
    */
  var returnDomByDefault: js.UndefOr[Boolean] = js.native
  
  /**
    *  By default, paragraphs are converted with two newlines (\n\n).
    *  Set to true to convert to a single newline.
    */
  var singleNewLineParagraphs: js.UndefOr[Boolean] = js.native
  
  /**
    *  Allows to select certain tables by the class or id attribute from the HTML
    *  document. This is necessary because the majority of HTML E-Mails uses a
    *  table based layout. Prefix your table selectors with an . for the class
    *  and with a # for the id attribute. All other tables are ignored.
    *  You can assign true to this attribute to select all tables. Default: []
    */
  var tables: js.UndefOr[js.Array[String] | Boolean] = js.native
  
  /**
    * defines the string that is used as item prefix for unordered lists `<ol>`.
    * Default: ' * '
    */
  var unorderedListItemPrefix: js.UndefOr[String] = js.native
  
  /**
    *  By default, headings (<h1>, <h2>, etc) are upper-cased.
    *  Set to false to leave headings as they are.
    */
  var uppercaseHeadings: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines after how many chars a line break should follow in p elements.
    * Set to null or false to disable word-wrapping. Default: 80
    */
  var wordwrap: js.UndefOr[Double | `false` | Null] = js.native
}
object HtmlToTextOptions {
  
  @scala.inline
  def apply(): HtmlToTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlToTextOptions]
  }
  
  @scala.inline
  implicit class HtmlToTextOptionsOps[Self <: HtmlToTextOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseElementVarargs(value: String*): Self = this.set("baseElement", js.Array(value :_*))
    
    @scala.inline
    def setBaseElement(value: String | js.Array[String]): Self = this.set("baseElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseElement: Self = this.set("baseElement", js.undefined)
    
    @scala.inline
    def setDecodeOptions(value: IsAttributeValue): Self = this.set("decodeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeOptions: Self = this.set("decodeOptions", js.undefined)
    
    @scala.inline
    def setFormat(value: Formatters): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHideLinkHrefIfSameAsText(value: Boolean): Self = this.set("hideLinkHrefIfSameAsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideLinkHrefIfSameAsText: Self = this.set("hideLinkHrefIfSameAsText", js.undefined)
    
    @scala.inline
    def setIgnoreHref(value: Boolean): Self = this.set("ignoreHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreHref: Self = this.set("ignoreHref", js.undefined)
    
    @scala.inline
    def setIgnoreImage(value: Boolean): Self = this.set("ignoreImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreImage: Self = this.set("ignoreImage", js.undefined)
    
    @scala.inline
    def setLinkHrefBaseUrl(value: String): Self = this.set("linkHrefBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkHrefBaseUrl: Self = this.set("linkHrefBaseUrl", js.undefined)
    
    @scala.inline
    def setLongWordSplit(value: ForceWrapOnLimit): Self = this.set("longWordSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongWordSplit: Self = this.set("longWordSplit", js.undefined)
    
    @scala.inline
    def setNoLinkBrackets(value: Boolean): Self = this.set("noLinkBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoLinkBrackets: Self = this.set("noLinkBrackets", js.undefined)
    
    @scala.inline
    def setPreserveNewlines(value: Boolean): Self = this.set("preserveNewlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveNewlines: Self = this.set("preserveNewlines", js.undefined)
    
    @scala.inline
    def setReturnDomByDefault(value: Boolean): Self = this.set("returnDomByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnDomByDefault: Self = this.set("returnDomByDefault", js.undefined)
    
    @scala.inline
    def setSingleNewLineParagraphs(value: Boolean): Self = this.set("singleNewLineParagraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleNewLineParagraphs: Self = this.set("singleNewLineParagraphs", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: String*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[String] | Boolean): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    
    @scala.inline
    def setUnorderedListItemPrefix(value: String): Self = this.set("unorderedListItemPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnorderedListItemPrefix: Self = this.set("unorderedListItemPrefix", js.undefined)
    
    @scala.inline
    def setUppercaseHeadings(value: Boolean): Self = this.set("uppercaseHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUppercaseHeadings: Self = this.set("uppercaseHeadings", js.undefined)
    
    @scala.inline
    def setWordwrap(value: Double | `false`): Self = this.set("wordwrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordwrap: Self = this.set("wordwrap", js.undefined)
    
    @scala.inline
    def setWordwrapNull: Self = this.set("wordwrap", null)
  }
}
