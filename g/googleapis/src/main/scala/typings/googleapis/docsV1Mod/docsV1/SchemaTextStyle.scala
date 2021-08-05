package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the styling that can be applied to text.  Inherited text styles
  * are represented as unset fields in this message. A text style&#39;s parent
  * depends on where the text style is defined:    * The TextStyle of text in a
  * Paragraph     inherits from the paragraph&#39;s corresponding named style
  * type.   * The TextStyle on a named style     inherits from the normal text
  * named style.   * The TextStyle of the normal text named style inherits from
  * the default text style in the Docs editor.   * The TextStyle on a Paragraph
  * element     that is contained in a table may inherit its text style from
  * the table     style.  If the text style does not inherit from a parent,
  * unsetting fields will revert the style to a value matching the defaults in
  * the Docs editor.
  */
trait SchemaTextStyle extends StObject {
  
  /**
    * The background color of the text. If set, the color is either an RGB
    * color or transparent, depending on the `color` field.
    */
  var backgroundColor: js.UndefOr[SchemaOptionalColor] = js.undefined
  
  /**
    * The text&#39;s vertical offset from its normal position.  Text with
    * `SUPERSCRIPT` or `SUBSCRIPT` baseline offsets is automatically rendered
    * in a smaller font size, computed based on the `font_size` field. The
    * `font_size` itself is not affected by changes in this field.
    */
  var baselineOffset: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not the text is rendered as bold.
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the text&#39;s font.
    */
  var fontSize: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The foreground color of the text. If set, the color is either an RGB
    * color or transparent, depending on the `color` field.
    */
  var foregroundColor: js.UndefOr[SchemaOptionalColor] = js.undefined
  
  /**
    * Whether or not the text is italicized.
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The hyperlink destination of the text. If unset, there is no link. Links
    * are not inherited from parent text.  Changing the link in an update
    * request causes some other changes to the text style of the range:  * When
    * setting a link, the text foreground color will be updated to the default
    * link color and the text will be underlined. If these fields are modified
    * in the same request, those values will be used instead of the   link
    * defaults. * Setting a link on a text range that overlaps with an existing
    * link will   also update the existing link to point to the new URL. *
    * Links are not settable on newline characters. As a result, setting a link
    * on a text range that crosses a paragraph boundary, such as
    * `&quot;ABCx/123&quot;`,   will separate the newline character(s) into
    * their own text runs. The   link will be applied separately to the runs
    * before and after the newline. * Removing a link will update the text
    * style of the range to match the   style of the preceding text (or the
    * default text styles if the preceding   text is another link) unless
    * different styles are being set in the same   request.
    */
  var link: js.UndefOr[SchemaLink] = js.undefined
  
  /**
    * Whether or not the text is in small capital letters.
    */
  var smallCaps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the text is struck through.
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the text is underlined.
    */
  var underline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The font family and rendered weight of the text.  If an update request
    * specifies values for both `weighted_font_family` and `bold`, the
    * `weighted_font_family` is applied first, then `bold`.  If
    * `weighted_font_family#weight` is not set, it defaults to `400`.  If
    * `weighted_font_family` is set, then `weighted_font_family#font_family`
    * must also be set with a non-empty value. Otherwise, a 400 bad request
    * error is returned.
    */
  var weightedFontFamily: js.UndefOr[SchemaWeightedFontFamily] = js.undefined
}
object SchemaTextStyle {
  
  inline def apply(): SchemaTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextStyle]
  }
  
  extension [Self <: SchemaTextStyle](x: Self) {
    
    inline def setBackgroundColor(value: SchemaOptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBaselineOffset(value: String): Self = StObject.set(x, "baselineOffset", value.asInstanceOf[js.Any])
    
    inline def setBaselineOffsetUndefined: Self = StObject.set(x, "baselineOffset", js.undefined)
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setFontSize(value: SchemaDimension): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setForegroundColor(value: SchemaOptionalColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setSmallCaps(value: Boolean): Self = StObject.set(x, "smallCaps", value.asInstanceOf[js.Any])
    
    inline def setSmallCapsUndefined: Self = StObject.set(x, "smallCaps", js.undefined)
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def setWeightedFontFamily(value: SchemaWeightedFontFamily): Self = StObject.set(x, "weightedFontFamily", value.asInstanceOf[js.Any])
    
    inline def setWeightedFontFamilyUndefined: Self = StObject.set(x, "weightedFontFamily", js.undefined)
  }
}
