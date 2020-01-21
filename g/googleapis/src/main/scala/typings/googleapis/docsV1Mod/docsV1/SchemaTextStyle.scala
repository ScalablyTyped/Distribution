package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    backgroundColor: SchemaOptionalColor = null,
    baselineOffset: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    fontSize: SchemaDimension = null,
    foregroundColor: SchemaOptionalColor = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    link: SchemaLink = null,
    smallCaps: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined,
    weightedFontFamily: SchemaWeightedFontFamily = null
  ): SchemaTextStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (baselineOffset != null) __obj.updateDynamic("baselineOffset")(baselineOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(smallCaps)) __obj.updateDynamic("smallCaps")(smallCaps.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (weightedFontFamily != null) __obj.updateDynamic("weightedFontFamily")(weightedFontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextStyle]
  }
}

