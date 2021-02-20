package typings.htmlToText

import typings.htmlToText.anon.ForceWrapOnLimit
import typings.htmlToText.anon.IsAttributeValue
import typings.htmlToText.htmlToTextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-to-text", "fromString")
  @js.native
  def fromString(str: String): String = js.native
  @JSImport("html-to-text", "fromString")
  @js.native
  def fromString(str: String, options: HtmlToTextOptions): String = js.native
  
  type Formatter[T] = js.Function3[
    /* el */ T, 
    /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], 
    /* options */ HtmlToTextOptions, 
    String
  ]
  
  @js.native
  trait Formatters extends StObject {
    
    var anchor: js.UndefOr[Formatter[_]] = js.native
    
    var blockquote: js.UndefOr[Formatter[_]] = js.native
    
    var heading: js.UndefOr[Formatter[_]] = js.native
    
    var horizontalLine: js.UndefOr[Formatter[_]] = js.native
    
    var image: js.UndefOr[LeafFormatter[_]] = js.native
    
    var lineBreak: js.UndefOr[Formatter[_]] = js.native
    
    var listItem: js.UndefOr[Formatter[_]] = js.native
    
    var orderedList: js.UndefOr[Formatter[_]] = js.native
    
    var paragraph: js.UndefOr[Formatter[_]] = js.native
    
    var table: js.UndefOr[Formatter[_]] = js.native
    
    var text: js.UndefOr[LeafFormatter[_]] = js.native
    
    var unorderedList: js.UndefOr[Formatter[_]] = js.native
  }
  object Formatters {
    
    @scala.inline
    def apply(): Formatters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Formatters]
    }
    
    @scala.inline
    implicit class FormattersMutableBuilder[Self <: Formatters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(
        value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "anchor", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setBlockquote(
        value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "blockquote", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      @scala.inline
      def setHeading(
        value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "heading", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      @scala.inline
      def setHorizontalLine(
        value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "horizontalLine", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHorizontalLineUndefined: Self = StObject.set(x, "horizontalLine", js.undefined)
      
      @scala.inline
      def setImage(value: (_, /* options */ HtmlToTextOptions) => String): Self = StObject.set(x, "image", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setLineBreak(
        value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "lineBreak", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      @scala.inline
      def setListItem(
        value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "listItem", js.Any.fromFunction3(value))
      
      @scala.inline
      def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
      
      @scala.inline
      def setOrderedList(
        value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "orderedList", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOrderedListUndefined: Self = StObject.set(x, "orderedList", js.undefined)
      
      @scala.inline
      def setParagraph(
        value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "paragraph", js.Any.fromFunction3(value))
      
      @scala.inline
      def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
      
      @scala.inline
      def setTable(
        value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "table", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setText(value: (_, /* options */ HtmlToTextOptions) => String): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setUnorderedList(
        value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "unorderedList", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnorderedListUndefined: Self = StObject.set(x, "unorderedList", js.undefined)
    }
  }
  
  @js.native
  trait HtmlToTextOptions extends StObject {
    
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
    implicit class HtmlToTextOptionsMutableBuilder[Self <: HtmlToTextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseElement(value: String | js.Array[String]): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      @scala.inline
      def setBaseElementVarargs(value: String*): Self = StObject.set(x, "baseElement", js.Array(value :_*))
      
      @scala.inline
      def setDecodeOptions(value: IsAttributeValue): Self = StObject.set(x, "decodeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeOptionsUndefined: Self = StObject.set(x, "decodeOptions", js.undefined)
      
      @scala.inline
      def setFormat(value: Formatters): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHideLinkHrefIfSameAsText(value: Boolean): Self = StObject.set(x, "hideLinkHrefIfSameAsText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideLinkHrefIfSameAsTextUndefined: Self = StObject.set(x, "hideLinkHrefIfSameAsText", js.undefined)
      
      @scala.inline
      def setIgnoreHref(value: Boolean): Self = StObject.set(x, "ignoreHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreHrefUndefined: Self = StObject.set(x, "ignoreHref", js.undefined)
      
      @scala.inline
      def setIgnoreImage(value: Boolean): Self = StObject.set(x, "ignoreImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreImageUndefined: Self = StObject.set(x, "ignoreImage", js.undefined)
      
      @scala.inline
      def setLinkHrefBaseUrl(value: String): Self = StObject.set(x, "linkHrefBaseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkHrefBaseUrlUndefined: Self = StObject.set(x, "linkHrefBaseUrl", js.undefined)
      
      @scala.inline
      def setLongWordSplit(value: ForceWrapOnLimit): Self = StObject.set(x, "longWordSplit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongWordSplitUndefined: Self = StObject.set(x, "longWordSplit", js.undefined)
      
      @scala.inline
      def setNoLinkBrackets(value: Boolean): Self = StObject.set(x, "noLinkBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoLinkBracketsUndefined: Self = StObject.set(x, "noLinkBrackets", js.undefined)
      
      @scala.inline
      def setPreserveNewlines(value: Boolean): Self = StObject.set(x, "preserveNewlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveNewlinesUndefined: Self = StObject.set(x, "preserveNewlines", js.undefined)
      
      @scala.inline
      def setReturnDomByDefault(value: Boolean): Self = StObject.set(x, "returnDomByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnDomByDefaultUndefined: Self = StObject.set(x, "returnDomByDefault", js.undefined)
      
      @scala.inline
      def setSingleNewLineParagraphs(value: Boolean): Self = StObject.set(x, "singleNewLineParagraphs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleNewLineParagraphsUndefined: Self = StObject.set(x, "singleNewLineParagraphs", js.undefined)
      
      @scala.inline
      def setTables(value: js.Array[String] | Boolean): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
      
      @scala.inline
      def setTablesVarargs(value: String*): Self = StObject.set(x, "tables", js.Array(value :_*))
      
      @scala.inline
      def setUnorderedListItemPrefix(value: String): Self = StObject.set(x, "unorderedListItemPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnorderedListItemPrefixUndefined: Self = StObject.set(x, "unorderedListItemPrefix", js.undefined)
      
      @scala.inline
      def setUppercaseHeadings(value: Boolean): Self = StObject.set(x, "uppercaseHeadings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUppercaseHeadingsUndefined: Self = StObject.set(x, "uppercaseHeadings", js.undefined)
      
      @scala.inline
      def setWordwrap(value: Double | `false`): Self = StObject.set(x, "wordwrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordwrapNull: Self = StObject.set(x, "wordwrap", null)
      
      @scala.inline
      def setWordwrapUndefined: Self = StObject.set(x, "wordwrap", js.undefined)
    }
  }
  
  type LeafFormatter[T] = js.Function2[/* el */ T, /* options */ HtmlToTextOptions, String]
}
