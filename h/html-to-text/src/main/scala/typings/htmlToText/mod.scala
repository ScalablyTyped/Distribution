package typings.htmlToText

import typings.htmlToText.anon.ForceWrapOnLimit
import typings.htmlToText.anon.IsAttributeValue
import typings.htmlToText.htmlToTextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-to-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromString(str: String, options: HtmlToTextOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Formatter[T] = js.Function3[
    /* el */ T, 
    /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], 
    /* options */ HtmlToTextOptions, 
    String
  ]
  
  trait Formatters extends StObject {
    
    var anchor: js.UndefOr[Formatter[js.Any]] = js.undefined
    
    var blockquote: js.UndefOr[Formatter[js.Any]] = js.undefined
    
    var heading: js.UndefOr[Formatter[js.Any]] = js.undefined
    
    var horizontalLine: js.UndefOr[Formatter[js.Any]] = js.undefined
    
    var image: js.UndefOr[LeafFormatter[js.Any]] = js.undefined
    
    var lineBreak: js.UndefOr[Formatter[js.Any]] = js.undefined
    
    var listItem: js.UndefOr[Formatter[js.Any]] = js.undefined
    
    var orderedList: js.UndefOr[Formatter[js.Any]] = js.undefined
    
    var paragraph: js.UndefOr[Formatter[js.Any]] = js.undefined
    
    var table: js.UndefOr[Formatter[js.Any]] = js.undefined
    
    var text: js.UndefOr[LeafFormatter[js.Any]] = js.undefined
    
    var unorderedList: js.UndefOr[Formatter[js.Any]] = js.undefined
  }
  object Formatters {
    
    inline def apply(): Formatters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Formatters]
    }
    
    extension [Self <: Formatters](x: Self) {
      
      inline def setAnchor(
        value: (js.Any, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "anchor", js.Any.fromFunction3(value))
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setBlockquote(
        value: (js.Any, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "blockquote", js.Any.fromFunction3(value))
      
      inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      inline def setHeading(
        value: (js.Any, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "heading", js.Any.fromFunction3(value))
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setHorizontalLine(
        value: (js.Any, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "horizontalLine", js.Any.fromFunction3(value))
      
      inline def setHorizontalLineUndefined: Self = StObject.set(x, "horizontalLine", js.undefined)
      
      inline def setImage(value: (js.Any, /* options */ HtmlToTextOptions) => String): Self = StObject.set(x, "image", js.Any.fromFunction2(value))
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLineBreak(
        value: (js.Any, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "lineBreak", js.Any.fromFunction3(value))
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setListItem(
        value: (js.Any, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "listItem", js.Any.fromFunction3(value))
      
      inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
      
      inline def setOrderedList(
        value: (js.Any, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "orderedList", js.Any.fromFunction3(value))
      
      inline def setOrderedListUndefined: Self = StObject.set(x, "orderedList", js.undefined)
      
      inline def setParagraph(
        value: (js.Any, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "paragraph", js.Any.fromFunction3(value))
      
      inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
      
      inline def setTable(
        value: (js.Any, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "table", js.Any.fromFunction3(value))
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setText(value: (js.Any, /* options */ HtmlToTextOptions) => String): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUnorderedList(
        value: (js.Any, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
      ): Self = StObject.set(x, "unorderedList", js.Any.fromFunction3(value))
      
      inline def setUnorderedListUndefined: Self = StObject.set(x, "unorderedList", js.undefined)
    }
  }
  
  trait HtmlToTextOptions extends StObject {
    
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
    var decodeOptions: js.UndefOr[IsAttributeValue] = js.undefined
    
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
    var longWordSplit: js.UndefOr[ForceWrapOnLimit] = js.undefined
    
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
    
    inline def apply(): HtmlToTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlToTextOptions]
    }
    
    extension [Self <: HtmlToTextOptions](x: Self) {
      
      inline def setBaseElement(value: String | js.Array[String]): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      inline def setBaseElementVarargs(value: String*): Self = StObject.set(x, "baseElement", js.Array(value :_*))
      
      inline def setDecodeOptions(value: IsAttributeValue): Self = StObject.set(x, "decodeOptions", value.asInstanceOf[js.Any])
      
      inline def setDecodeOptionsUndefined: Self = StObject.set(x, "decodeOptions", js.undefined)
      
      inline def setFormat(value: Formatters): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHideLinkHrefIfSameAsText(value: Boolean): Self = StObject.set(x, "hideLinkHrefIfSameAsText", value.asInstanceOf[js.Any])
      
      inline def setHideLinkHrefIfSameAsTextUndefined: Self = StObject.set(x, "hideLinkHrefIfSameAsText", js.undefined)
      
      inline def setIgnoreHref(value: Boolean): Self = StObject.set(x, "ignoreHref", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHrefUndefined: Self = StObject.set(x, "ignoreHref", js.undefined)
      
      inline def setIgnoreImage(value: Boolean): Self = StObject.set(x, "ignoreImage", value.asInstanceOf[js.Any])
      
      inline def setIgnoreImageUndefined: Self = StObject.set(x, "ignoreImage", js.undefined)
      
      inline def setLinkHrefBaseUrl(value: String): Self = StObject.set(x, "linkHrefBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setLinkHrefBaseUrlUndefined: Self = StObject.set(x, "linkHrefBaseUrl", js.undefined)
      
      inline def setLongWordSplit(value: ForceWrapOnLimit): Self = StObject.set(x, "longWordSplit", value.asInstanceOf[js.Any])
      
      inline def setLongWordSplitUndefined: Self = StObject.set(x, "longWordSplit", js.undefined)
      
      inline def setNoLinkBrackets(value: Boolean): Self = StObject.set(x, "noLinkBrackets", value.asInstanceOf[js.Any])
      
      inline def setNoLinkBracketsUndefined: Self = StObject.set(x, "noLinkBrackets", js.undefined)
      
      inline def setPreserveNewlines(value: Boolean): Self = StObject.set(x, "preserveNewlines", value.asInstanceOf[js.Any])
      
      inline def setPreserveNewlinesUndefined: Self = StObject.set(x, "preserveNewlines", js.undefined)
      
      inline def setReturnDomByDefault(value: Boolean): Self = StObject.set(x, "returnDomByDefault", value.asInstanceOf[js.Any])
      
      inline def setReturnDomByDefaultUndefined: Self = StObject.set(x, "returnDomByDefault", js.undefined)
      
      inline def setSingleNewLineParagraphs(value: Boolean): Self = StObject.set(x, "singleNewLineParagraphs", value.asInstanceOf[js.Any])
      
      inline def setSingleNewLineParagraphsUndefined: Self = StObject.set(x, "singleNewLineParagraphs", js.undefined)
      
      inline def setTables(value: js.Array[String] | Boolean): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
      
      inline def setTablesVarargs(value: String*): Self = StObject.set(x, "tables", js.Array(value :_*))
      
      inline def setUnorderedListItemPrefix(value: String): Self = StObject.set(x, "unorderedListItemPrefix", value.asInstanceOf[js.Any])
      
      inline def setUnorderedListItemPrefixUndefined: Self = StObject.set(x, "unorderedListItemPrefix", js.undefined)
      
      inline def setUppercaseHeadings(value: Boolean): Self = StObject.set(x, "uppercaseHeadings", value.asInstanceOf[js.Any])
      
      inline def setUppercaseHeadingsUndefined: Self = StObject.set(x, "uppercaseHeadings", js.undefined)
      
      inline def setWordwrap(value: Double | `false`): Self = StObject.set(x, "wordwrap", value.asInstanceOf[js.Any])
      
      inline def setWordwrapNull: Self = StObject.set(x, "wordwrap", null)
      
      inline def setWordwrapUndefined: Self = StObject.set(x, "wordwrap", js.undefined)
    }
  }
  
  type LeafFormatter[T] = js.Function2[/* el */ T, /* options */ HtmlToTextOptions, String]
}
