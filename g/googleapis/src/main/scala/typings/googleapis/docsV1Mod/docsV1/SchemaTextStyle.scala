package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SchemaTextStyle extends js.Object {
  
  /**
    * The background color of the text. If set, the color is either an RGB
    * color or transparent, depending on the `color` field.
    */
  var backgroundColor: js.UndefOr[SchemaOptionalColor] = js.native
  
  /**
    * The text&#39;s vertical offset from its normal position.  Text with
    * `SUPERSCRIPT` or `SUBSCRIPT` baseline offsets is automatically rendered
    * in a smaller font size, computed based on the `font_size` field. The
    * `font_size` itself is not affected by changes in this field.
    */
  var baselineOffset: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the text is rendered as bold.
    */
  var bold: js.UndefOr[Boolean] = js.native
  
  /**
    * The size of the text&#39;s font.
    */
  var fontSize: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The foreground color of the text. If set, the color is either an RGB
    * color or transparent, depending on the `color` field.
    */
  var foregroundColor: js.UndefOr[SchemaOptionalColor] = js.native
  
  /**
    * Whether or not the text is italicized.
    */
  var italic: js.UndefOr[Boolean] = js.native
  
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
  var link: js.UndefOr[SchemaLink] = js.native
  
  /**
    * Whether or not the text is in small capital letters.
    */
  var smallCaps: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the text is struck through.
    */
  var strikethrough: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the text is underlined.
    */
  var underline: js.UndefOr[Boolean] = js.native
  
  /**
    * The font family and rendered weight of the text.  If an update request
    * specifies values for both `weighted_font_family` and `bold`, the
    * `weighted_font_family` is applied first, then `bold`.  If
    * `weighted_font_family#weight` is not set, it defaults to `400`.  If
    * `weighted_font_family` is set, then `weighted_font_family#font_family`
    * must also be set with a non-empty value. Otherwise, a 400 bad request
    * error is returned.
    */
  var weightedFontFamily: js.UndefOr[SchemaWeightedFontFamily] = js.native
}
object SchemaTextStyle {
  
  @scala.inline
  def apply(): SchemaTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextStyle]
  }
  
  @scala.inline
  implicit class SchemaTextStyleOps[Self <: SchemaTextStyle] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: SchemaOptionalColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBaselineOffset(value: String): Self = this.set("baselineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineOffset: Self = this.set("baselineOffset", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setFontSize(value: SchemaDimension): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setForegroundColor(value: SchemaOptionalColor): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setLink(value: SchemaLink): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setSmallCaps(value: Boolean): Self = this.set("smallCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallCaps: Self = this.set("smallCaps", js.undefined)
    
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikethrough: Self = this.set("strikethrough", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    
    @scala.inline
    def setWeightedFontFamily(value: SchemaWeightedFontFamily): Self = this.set("weightedFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightedFontFamily: Self = this.set("weightedFontFamily", js.undefined)
  }
}
