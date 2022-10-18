package typings.htmlToText

import org.scalablytyped.runtime.StringDictionary
import typings.htmlToText.htmlToTextBooleans.`false`
import typings.htmlToText.htmlToTextStrings.occurrence
import typings.htmlToText.htmlToTextStrings.selectors
import typings.htmlToText.libBlockTextBuilderMod.BlockTextBuilder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-to-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(): compiledFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")().asInstanceOf[compiledFunction]
  inline def compile(options: HtmlToTextOptions): compiledFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(options.asInstanceOf[js.Any]).asInstanceOf[compiledFunction]
  
  inline def convert(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convert(html: String, options: HtmlToTextOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromString(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromString(html: String, options: HtmlToTextOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def htmlToText(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlToText")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def htmlToText(html: String, options: HtmlToTextOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlToText")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait BaseElementsOptions extends StObject {
    
    /**
      * When multiple selectors are set, this option specifies
      * whether the selectors order has to be reflected in the output text.
      *
      * `'selectors'` (default) - matches for the first selector will appear first, etc;
      *
      * `'occurrence'` - all bases will appear in the same order as in input HTML.
      */
    var orderBy: js.UndefOr[selectors | occurrence] = js.undefined
    
    /**
      * Use the entire document if none of provided selectors matched.
      */
    var returnDomByDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The resulting text output will be composed from the text content of elements
      * matched with these selectors.
      */
    var selectors: js.UndefOr[js.Array[String]] = js.undefined
  }
  object BaseElementsOptions {
    
    inline def apply(): BaseElementsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseElementsOptions]
    }
    
    extension [Self <: BaseElementsOptions](x: Self) {
      
      inline def setOrderBy(value: selectors | occurrence): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      inline def setReturnDomByDefault(value: Boolean): Self = StObject.set(x, "returnDomByDefault", value.asInstanceOf[js.Any])
      
      inline def setReturnDomByDefaultUndefined: Self = StObject.set(x, "returnDomByDefault", js.undefined)
      
      inline def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value*))
    }
  }
  
  trait DecodeOptions extends StObject {
    
    /**
      * TLDR: If set to `true` - leave attribute values raw, don't parse them as text content.
      */
    var isAttributeValue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * TLDR: If set to `true` - throw an error on invalid HTML input.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptions {
    
    inline def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    extension [Self <: DecodeOptions](x: Self) {
      
      inline def setIsAttributeValue(value: Boolean): Self = StObject.set(x, "isAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setIsAttributeValueUndefined: Self = StObject.set(x, "isAttributeValue", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait DomNode extends StObject {
    
    /**
      * Tag attributes dictionary.
      */
    var attribs: js.UndefOr[Any] = js.undefined
    
    /**
      * Child nodes.
      * Not optional for typescript use.
      */
    var children: js.Array[DomNode]
    
    /**
      * Content of a data node.
      */
    var data: js.UndefOr[String] = js.undefined
    
    /**
      * Tag name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Parent node.
      */
    var parent: js.UndefOr[DomNode] = js.undefined
    
    /**
      * Type of node - "text", "tag", "comment", "script", etc.
      */
    var `type`: String
  }
  object DomNode {
    
    inline def apply(children: js.Array[DomNode], `type`: String): DomNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomNode]
    }
    
    extension [Self <: DomNode](x: Self) {
      
      inline def setAttribs(value: Any): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      inline def setAttribsUndefined: Self = StObject.set(x, "attribs", js.undefined)
      
      inline def setChildren(value: js.Array[DomNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: DomNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParent(value: DomNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatCallback = js.Function4[
    /* elem */ DomNode, 
    /* walk */ RecursiveCallback, 
    /* builder */ BlockTextBuilder, 
    /* formatOptions */ FormatOptions, 
    Unit
  ]
  
  trait FormatOptions
    extends StObject
       with /**
    * User defined values are supported.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * (Only for: `anchor` and `image` formatters.) Server host for link `href` attributes and image `src` attributes
      * relative to the root (the ones that start with `/`).
      *
      * For example, with `baseUrl = 'http://asdf.com'` and `<a href='/dir/subdir'>...</a>`
      * the link in the text will be `http://asdf.com/dir/subdir`.
      *
      * Keep in mind that `baseUrl` should not end with a `/`.
      */
    var baseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * (Only for: `table`, `dataTable` formatter.) Number of spaces between data table columns.
      */
    var colSpacing: js.UndefOr[Double] = js.undefined
    
    /**
      * (Only for: `anchor` formatter.) By default links are translated in the following way:
      *
      * `<a href='link'>text</a>` => becomes => `text [link]`.
      *
      * If this option is set to `true` and `link` and `text` are the same,
      * `[link]` will be omitted and only `text` will be present.
      */
    var hideLinkHrefIfSameAsText: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Only for: `anchor` formatter.) Ignore all links. Only process internal text of anchor tags.
      */
    var ignoreHref: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Only for: `unorderedList` formatter.) String prefix for each list item.
      */
    var itemPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Number of line breaks to separate previous block from this one.
      *
      * Note that N+1 line breaks are needed to make N empty lines.
      */
    var leadingLineBreaks: js.UndefOr[Double] = js.undefined
    
    /**
      * (Only for: `horizontalLine` formatter.) Length of the `<hr/>` line.
      *
      * If numeric value is provided - it is used.
      * Otherwise, if global `wordwrap` number is provided - it is used.
      * If neither is true, then the fallback value of 40 is used.
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * Surround links with these brackets.<br/>Set to `false` or `['', '']` to disable.
      * @default ['[', ']']
      */
    var linkBrackets: js.UndefOr[(js.Tuple2[String, String]) | `false`] = js.undefined
    
    /**
      * (Only for: `table`, `dataTable` formatter.) Data table cell content will be wrapped to fit this width
      * instead of global `wordwrap` limit.
      *
      * Set to `undefined` in order to fall back to `wordwrap` limit.
      */
    var maxColumnWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * (Only for: `anchor` formatter.) Ignore anchor links (where `href='#...'`).
      */
    var noAnchorUrl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated. Use linkBrackets instead.
      * (Only for: `anchor` formatter.) Don't print brackets around links.
      */
    var noLinkBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Only for: `table`, `dataTable` formatter.) Number of empty lines between data table rows.
      */
    var rowSpacing: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of line breaks to separate this block from the next one.
      *
      * Note that N+1 line breaks are needed to make N empty lines.
      */
    var trailingLineBreaks: js.UndefOr[Double] = js.undefined
    
    /**
      * (Only for: `blockquote` formatter.) Trim empty lines from blockquote.
      */
    var trimEmptyLines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Only for: `heading` formatter.) By default, headings (`<h1>`, `<h2>`, etc) are uppercased.
      *
      * Set this to `false` to leave headings as they are.
      */
    var uppercase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Only for: `table`, `dataTable` formatter.) By default, heading cells (`<th>`) are uppercased.
      *
      * Set this to `false` to leave heading cells as they are.
      */
    var uppercaseHeaderCells: js.UndefOr[Boolean] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setColSpacing(value: Double): Self = StObject.set(x, "colSpacing", value.asInstanceOf[js.Any])
      
      inline def setColSpacingUndefined: Self = StObject.set(x, "colSpacing", js.undefined)
      
      inline def setHideLinkHrefIfSameAsText(value: Boolean): Self = StObject.set(x, "hideLinkHrefIfSameAsText", value.asInstanceOf[js.Any])
      
      inline def setHideLinkHrefIfSameAsTextUndefined: Self = StObject.set(x, "hideLinkHrefIfSameAsText", js.undefined)
      
      inline def setIgnoreHref(value: Boolean): Self = StObject.set(x, "ignoreHref", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHrefUndefined: Self = StObject.set(x, "ignoreHref", js.undefined)
      
      inline def setItemPrefix(value: String): Self = StObject.set(x, "itemPrefix", value.asInstanceOf[js.Any])
      
      inline def setItemPrefixUndefined: Self = StObject.set(x, "itemPrefix", js.undefined)
      
      inline def setLeadingLineBreaks(value: Double): Self = StObject.set(x, "leadingLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setLeadingLineBreaksUndefined: Self = StObject.set(x, "leadingLineBreaks", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLinkBrackets(value: (js.Tuple2[String, String]) | `false`): Self = StObject.set(x, "linkBrackets", value.asInstanceOf[js.Any])
      
      inline def setLinkBracketsUndefined: Self = StObject.set(x, "linkBrackets", js.undefined)
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
      
      inline def setNoAnchorUrl(value: Boolean): Self = StObject.set(x, "noAnchorUrl", value.asInstanceOf[js.Any])
      
      inline def setNoAnchorUrlUndefined: Self = StObject.set(x, "noAnchorUrl", js.undefined)
      
      inline def setNoLinkBrackets(value: Boolean): Self = StObject.set(x, "noLinkBrackets", value.asInstanceOf[js.Any])
      
      inline def setNoLinkBracketsUndefined: Self = StObject.set(x, "noLinkBrackets", js.undefined)
      
      inline def setRowSpacing(value: Double): Self = StObject.set(x, "rowSpacing", value.asInstanceOf[js.Any])
      
      inline def setRowSpacingUndefined: Self = StObject.set(x, "rowSpacing", js.undefined)
      
      inline def setTrailingLineBreaks(value: Double): Self = StObject.set(x, "trailingLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setTrailingLineBreaksUndefined: Self = StObject.set(x, "trailingLineBreaks", js.undefined)
      
      inline def setTrimEmptyLines(value: Boolean): Self = StObject.set(x, "trimEmptyLines", value.asInstanceOf[js.Any])
      
      inline def setTrimEmptyLinesUndefined: Self = StObject.set(x, "trimEmptyLines", js.undefined)
      
      inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      inline def setUppercaseHeaderCells(value: Boolean): Self = StObject.set(x, "uppercaseHeaderCells", value.asInstanceOf[js.Any])
      
      inline def setUppercaseHeaderCellsUndefined: Self = StObject.set(x, "uppercaseHeaderCells", js.undefined)
      
      inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
  
  trait HtmlToTextOptions extends StObject {
    
    /**
      * The following are deprecated options.  See the documentation.
      */
    /**
      * @deprecated. Use baseElements.selectors instead.
      */
    var baseElement: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Options for narrowing down to informative parts of HTML document.
      */
    var baseElements: js.UndefOr[BaseElementsOptions] = js.undefined
    
    /**
      * Text decoding options given to `he.decode`.
      *
      * For more informations see the [he](https://github.com/mathiasbynens/he) module.
      */
    var decodeOptions: js.UndefOr[DecodeOptions] = js.undefined
    
    /**
      * A dictionary with custom formatting functions for specific kinds of elements.
      *
      * Keys are custom string identifiers, values are callbacks.
      */
    var formatters: js.UndefOr[Record[String, FormatCallback]] = js.undefined
    
    /**
      *  @deprecated See the documentation.
      */
    var hideLinkHrefIfSameAsText: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  @deprecated See the documentation.
      */
    var ignoreHref: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  @deprecated See the documentation.
      */
    var ignoreImage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options for handling complex documents and limiting the output size.
      */
    var limits: js.UndefOr[LimitsOptions] = js.undefined
    
    /**
      *  @deprecated See the documentation.
      */
    var linkHrefBaseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Describes how to wrap long words.
      */
    var longWordSplit: js.UndefOr[LongWordSplitOptions] = js.undefined
    
    /**
      *  @deprecated See the documentation.
      */
    var noLinkBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, any newlines `\n` from the input HTML are dropped.
      *
      * If `true`, these newlines will be preserved in the output.
      */
    var preserveNewlines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated. Use baseElements instead.
      */
    var returnDomByDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Instructions for how to render HTML elements based on matched selectors.
      *
      * Use this to (re)define options for new or already supported tags.
      */
    var selectors: js.UndefOr[js.Array[SelectorDefinition]] = js.undefined
    
    /**
      *  @deprecated See the documentation.
      */
    var singleNewLineParagraphs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated. Use selectors with `format: 'dataTable'` instead.
      */
    var tables: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    /**
      * @deprecated. Use selectors instead.
      */
    var tags: js.UndefOr[TagDefinitions] = js.undefined
    
    /**
      *  @deprecated See the documentation.
      */
    var unorderedListItemPrefix: js.UndefOr[String] = js.undefined
    
    /**
      *  @deprecated See the documentation.
      */
    var uppercaseHeadings: js.UndefOr[Boolean] = js.undefined
    
    /**
      * All characters that are considered whitespace.
      * Default is according to HTML specifications.
      */
    var whitespaceCharacters: js.UndefOr[String] = js.undefined
    
    /**
      * After how many chars a line break should follow in `p` elements.
      *
      * Set to `null` or `false` to disable word-wrapping.
      */
    var wordwrap: js.UndefOr[Double | Boolean | Null] = js.undefined
  }
  object HtmlToTextOptions {
    
    inline def apply(): HtmlToTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlToTextOptions]
    }
    
    extension [Self <: HtmlToTextOptions](x: Self) {
      
      inline def setBaseElement(value: String | js.Array[String]): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setBaseElementUndefined: Self = StObject.set(x, "baseElement", js.undefined)
      
      inline def setBaseElementVarargs(value: String*): Self = StObject.set(x, "baseElement", js.Array(value*))
      
      inline def setBaseElements(value: BaseElementsOptions): Self = StObject.set(x, "baseElements", value.asInstanceOf[js.Any])
      
      inline def setBaseElementsUndefined: Self = StObject.set(x, "baseElements", js.undefined)
      
      inline def setDecodeOptions(value: DecodeOptions): Self = StObject.set(x, "decodeOptions", value.asInstanceOf[js.Any])
      
      inline def setDecodeOptionsUndefined: Self = StObject.set(x, "decodeOptions", js.undefined)
      
      inline def setFormatters(value: Record[String, FormatCallback]): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      inline def setHideLinkHrefIfSameAsText(value: Boolean): Self = StObject.set(x, "hideLinkHrefIfSameAsText", value.asInstanceOf[js.Any])
      
      inline def setHideLinkHrefIfSameAsTextUndefined: Self = StObject.set(x, "hideLinkHrefIfSameAsText", js.undefined)
      
      inline def setIgnoreHref(value: Boolean): Self = StObject.set(x, "ignoreHref", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHrefUndefined: Self = StObject.set(x, "ignoreHref", js.undefined)
      
      inline def setIgnoreImage(value: Boolean): Self = StObject.set(x, "ignoreImage", value.asInstanceOf[js.Any])
      
      inline def setIgnoreImageUndefined: Self = StObject.set(x, "ignoreImage", js.undefined)
      
      inline def setLimits(value: LimitsOptions): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      inline def setLinkHrefBaseUrl(value: String): Self = StObject.set(x, "linkHrefBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setLinkHrefBaseUrlUndefined: Self = StObject.set(x, "linkHrefBaseUrl", js.undefined)
      
      inline def setLongWordSplit(value: LongWordSplitOptions): Self = StObject.set(x, "longWordSplit", value.asInstanceOf[js.Any])
      
      inline def setLongWordSplitUndefined: Self = StObject.set(x, "longWordSplit", js.undefined)
      
      inline def setNoLinkBrackets(value: Boolean): Self = StObject.set(x, "noLinkBrackets", value.asInstanceOf[js.Any])
      
      inline def setNoLinkBracketsUndefined: Self = StObject.set(x, "noLinkBrackets", js.undefined)
      
      inline def setPreserveNewlines(value: Boolean): Self = StObject.set(x, "preserveNewlines", value.asInstanceOf[js.Any])
      
      inline def setPreserveNewlinesUndefined: Self = StObject.set(x, "preserveNewlines", js.undefined)
      
      inline def setReturnDomByDefault(value: Boolean): Self = StObject.set(x, "returnDomByDefault", value.asInstanceOf[js.Any])
      
      inline def setReturnDomByDefaultUndefined: Self = StObject.set(x, "returnDomByDefault", js.undefined)
      
      inline def setSelectors(value: js.Array[SelectorDefinition]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setSelectorsVarargs(value: SelectorDefinition*): Self = StObject.set(x, "selectors", js.Array(value*))
      
      inline def setSingleNewLineParagraphs(value: Boolean): Self = StObject.set(x, "singleNewLineParagraphs", value.asInstanceOf[js.Any])
      
      inline def setSingleNewLineParagraphsUndefined: Self = StObject.set(x, "singleNewLineParagraphs", js.undefined)
      
      inline def setTables(value: js.Array[String] | Boolean): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
      
      inline def setTablesVarargs(value: String*): Self = StObject.set(x, "tables", js.Array(value*))
      
      inline def setTags(value: TagDefinitions): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUnorderedListItemPrefix(value: String): Self = StObject.set(x, "unorderedListItemPrefix", value.asInstanceOf[js.Any])
      
      inline def setUnorderedListItemPrefixUndefined: Self = StObject.set(x, "unorderedListItemPrefix", js.undefined)
      
      inline def setUppercaseHeadings(value: Boolean): Self = StObject.set(x, "uppercaseHeadings", value.asInstanceOf[js.Any])
      
      inline def setUppercaseHeadingsUndefined: Self = StObject.set(x, "uppercaseHeadings", js.undefined)
      
      inline def setWhitespaceCharacters(value: String): Self = StObject.set(x, "whitespaceCharacters", value.asInstanceOf[js.Any])
      
      inline def setWhitespaceCharactersUndefined: Self = StObject.set(x, "whitespaceCharacters", js.undefined)
      
      inline def setWordwrap(value: Double | Boolean): Self = StObject.set(x, "wordwrap", value.asInstanceOf[js.Any])
      
      inline def setWordwrapNull: Self = StObject.set(x, "wordwrap", null)
      
      inline def setWordwrapUndefined: Self = StObject.set(x, "wordwrap", js.undefined)
    }
  }
  
  trait LimitsOptions extends StObject {
    
    /**
      * ...]
      * A string to put in place of skipped content.
      */
    var ellipsis: js.UndefOr[String] = js.undefined
    
    /**
      * Process only this many child nodes of any element.
      *
      * Remaining nodes, if any, will be replaced with ellipsis.
      *
      * Text nodes are counted along with tags.
      *
      * No limit if undefined.
      */
    var maxChildNodes: js.UndefOr[Double] = js.undefined
    
    /**
      * Only go to a certain depth starting from `Options.baseElement`.
      *
      * Replace deeper nodes with ellipsis.
      *
      * No depth limit if undefined.
      */
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * If the input string is longer than this value - it will be truncated
      * and a message will be sent to `stderr`.
      *
      * Ellipsis is not used in this case.
      */
    var maxInputLength: js.UndefOr[Double] = js.undefined
  }
  object LimitsOptions {
    
    inline def apply(): LimitsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitsOptions]
    }
    
    extension [Self <: LimitsOptions](x: Self) {
      
      inline def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setMaxChildNodes(value: Double): Self = StObject.set(x, "maxChildNodes", value.asInstanceOf[js.Any])
      
      inline def setMaxChildNodesUndefined: Self = StObject.set(x, "maxChildNodes", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setMaxInputLength(value: Double): Self = StObject.set(x, "maxInputLength", value.asInstanceOf[js.Any])
      
      inline def setMaxInputLengthUndefined: Self = StObject.set(x, "maxInputLength", js.undefined)
    }
  }
  
  trait LongWordSplitOptions extends StObject {
    
    /**
      * Break long words on the `Options.wordwrap` limit when there are no characters to wrap on.
      */
    var forceWrapOnLimit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array containing the characters that may be wrapped on.
      */
    var wrapCharacters: js.UndefOr[js.Array[String]] = js.undefined
  }
  object LongWordSplitOptions {
    
    inline def apply(): LongWordSplitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LongWordSplitOptions]
    }
    
    extension [Self <: LongWordSplitOptions](x: Self) {
      
      inline def setForceWrapOnLimit(value: Boolean): Self = StObject.set(x, "forceWrapOnLimit", value.asInstanceOf[js.Any])
      
      inline def setForceWrapOnLimitUndefined: Self = StObject.set(x, "forceWrapOnLimit", js.undefined)
      
      inline def setWrapCharacters(value: js.Array[String]): Self = StObject.set(x, "wrapCharacters", value.asInstanceOf[js.Any])
      
      inline def setWrapCharactersUndefined: Self = StObject.set(x, "wrapCharacters", js.undefined)
      
      inline def setWrapCharactersVarargs(value: String*): Self = StObject.set(x, "wrapCharacters", js.Array(value*))
    }
  }
  
  type RecursiveCallback = js.Function2[/* nodes */ js.Array[DomNode], /* builder */ BlockTextBuilder, Unit]
  
  trait SelectorDefinition extends StObject {
    
    /**
      * Identifier of a {@link FormatCallback}, built-in or provided in `Options.formatters` dictionary.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Options to customize the formatter for this tag.
      */
    var options: js.UndefOr[FormatOptions] = js.undefined
    
    /**
      * CSS selector. Refer to README for notes on supported selectors etc.
      */
    var selector: String
  }
  object SelectorDefinition {
    
    inline def apply(selector: String): SelectorDefinition = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorDefinition]
    }
    
    extension [Self <: SelectorDefinition](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOptions(value: FormatOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagDefinition extends StObject {
    
    /**
      * Identifier of a {@link FormatCallback}, built-in or provided in `Options.formatters` dictionary.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Options to customize the formatter for this tag.
      */
    var options: js.UndefOr[FormatOptions] = js.undefined
  }
  object TagDefinition {
    
    inline def apply(): TagDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagDefinition]
    }
    
    extension [Self <: TagDefinition](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOptions(value: FormatOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait TagDefinitions extends StObject {
    
    @JSName("")
    var _empty: js.UndefOr[TagDefinition] = js.undefined
    
    var a: js.UndefOr[TagDefinition] = js.undefined
    
    var article: js.UndefOr[TagDefinition] = js.undefined
    
    var aside: js.UndefOr[TagDefinition] = js.undefined
    
    var blockquote: js.UndefOr[TagDefinition] = js.undefined
    
    var br: js.UndefOr[TagDefinition] = js.undefined
    
    var div: js.UndefOr[TagDefinition] = js.undefined
    
    var footer: js.UndefOr[TagDefinition] = js.undefined
    
    var form: js.UndefOr[TagDefinition] = js.undefined
    
    var h1: js.UndefOr[TagDefinition] = js.undefined
    
    var h2: js.UndefOr[TagDefinition] = js.undefined
    
    var h3: js.UndefOr[TagDefinition] = js.undefined
    
    var h4: js.UndefOr[TagDefinition] = js.undefined
    
    var h5: js.UndefOr[TagDefinition] = js.undefined
    
    var h6: js.UndefOr[TagDefinition] = js.undefined
    
    var header: js.UndefOr[TagDefinition] = js.undefined
    
    var hr: js.UndefOr[TagDefinition] = js.undefined
    
    var img: js.UndefOr[TagDefinition] = js.undefined
    
    var main: js.UndefOr[TagDefinition] = js.undefined
    
    var nav: js.UndefOr[TagDefinition] = js.undefined
    
    var ol: js.UndefOr[TagDefinition] = js.undefined
    
    var p: js.UndefOr[TagDefinition] = js.undefined
    
    var pre: js.UndefOr[TagDefinition] = js.undefined
    
    var table: js.UndefOr[TagDefinition] = js.undefined
    
    var ul: js.UndefOr[TagDefinition] = js.undefined
    
    var wbr: js.UndefOr[TagDefinition] = js.undefined
  }
  object TagDefinitions {
    
    inline def apply(): TagDefinitions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagDefinitions]
    }
    
    extension [Self <: TagDefinitions](x: Self) {
      
      inline def setA(value: TagDefinition): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setArticle(value: TagDefinition): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
      
      inline def setArticleUndefined: Self = StObject.set(x, "article", js.undefined)
      
      inline def setAside(value: TagDefinition): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
      
      inline def setAsideUndefined: Self = StObject.set(x, "aside", js.undefined)
      
      inline def setBlockquote(value: TagDefinition): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      inline def setBr(value: TagDefinition): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      inline def setDiv(value: TagDefinition): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
      
      inline def setFooter(value: TagDefinition): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setForm(value: TagDefinition): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setH1(value: TagDefinition): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      inline def setH2(value: TagDefinition): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      inline def setH3(value: TagDefinition): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      inline def setH4(value: TagDefinition): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      inline def setH5(value: TagDefinition): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      inline def setH6(value: TagDefinition): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      inline def setHeader(value: TagDefinition): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHr(value: TagDefinition): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      inline def setImg(value: TagDefinition): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setMain(value: TagDefinition): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setNav(value: TagDefinition): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      inline def setOl(value: TagDefinition): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
      
      inline def setP(value: TagDefinition): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPre(value: TagDefinition): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setTable(value: TagDefinition): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setUl(value: TagDefinition): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      inline def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
      
      inline def setWbr(value: TagDefinition): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
      
      inline def setWbrUndefined: Self = StObject.set(x, "wbr", js.undefined)
      
      inline def set_empty(value: TagDefinition): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
      
      inline def set_emptyUndefined: Self = StObject.set(x, "", js.undefined)
    }
  }
  
  type compiledFunction = js.Function1[/* str */ String, String]
}
