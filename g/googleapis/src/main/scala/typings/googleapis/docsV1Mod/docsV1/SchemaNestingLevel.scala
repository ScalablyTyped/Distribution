package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties describing the look and feel of a list bullet at a
  * given level of nesting.
  */
@js.native
trait SchemaNestingLevel extends js.Object {
  /**
    * The alignment of the bullet within the space allotted for rendering the
    * bullet.
    */
  var bulletAlignment: js.UndefOr[String] = js.native
  /**
    * The format string used by bullets at this level of nesting.  The glyph
    * format contains one or more placeholders, and these placeholder are
    * replaced with the appropriate values depending on the glyph_type or
    * glyph_symbol. The placeholders follow the pattern `%[nesting_level]`.
    * Furthermore, placeholders can have prefixes and suffixes. Thus, the glyph
    * format follows the pattern
    * `&lt;prefix&gt;%[nesting_level]&lt;suffix&gt;`. Note that the prefix and
    * suffix are optional and can be arbitrary strings.  For example, the glyph
    * format `%0.` indicates that the rendered glyph will replace the
    * placeholder with the corresponding glyph for nesting level 0 followed by
    * a period as the suffix. So a list with a glyph type of UPPER_ALPHA and
    * glyph format `%0.` at nesting level 0 will result in a list with rendered
    * glyphs &lt;p&gt;`A.` &lt;p&gt;`B.` &lt;p&gt;`C.`  The glyph format can
    * contain placeholders for the current nesting level as well as
    * placeholders for parent nesting levels. For example, a list can have a
    * glyph format of `%0.` at nesting level 0 and a glyph format of `%0.%1.`
    * at nesting level 1. Assuming both nesting levels have DECIMAL glyph
    * types, this would result in a list with rendered glyphs &lt;p&gt;`1.`
    * &lt;p&gt;`2.` &lt;p&gt;`  2.1.` &lt;p&gt;`  2.2.` &lt;p&gt;`3.`  For
    * nesting levels that are ordered, the string that replaces a placeholder
    * in the glyph format for a particular paragraph depends on the
    * paragraph&#39;s order within the list.
    */
  var glyphFormat: js.UndefOr[String] = js.native
  /**
    * A custom glyph symbol used by bullets when paragraphs at this level of
    * nesting are unordered.  The glyph symbol replaces placeholders within the
    * glyph_format. For example, if the glyph_symbol is the solid circle
    * corresponding to Unicode U+25cf code point and the glyph_format is `%0`,
    * the rendered glyph would be the solid circle.
    */
  var glyphSymbol: js.UndefOr[String] = js.native
  /**
    * The type of glyph used by bullets when paragraphs at this level of
    * nesting are ordered.  The glyph type determines the type of glyph used to
    * replace placeholders within the glyph_format when paragraphs at this
    * level of nesting are ordered. For example, if the nesting level is 0, the
    * glyph_format is `%0.` and the glyph type is DECIMAL, then the rendered
    * glyph would replace the placeholder `%0` in the glyph format with a
    * number corresponding to list item&#39;s order within the list.
    */
  var glyphType: js.UndefOr[String] = js.native
  /**
    * The amount of indentation for the first line of paragraphs at this level
    * of nesting.
    */
  var indentFirstLine: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount of indentation for paragraphs at this level of nesting.
    * Applied to the side that corresponds to the start of the text, based on
    * the paragraph&#39;s content direction.
    */
  var indentStart: js.UndefOr[SchemaDimension] = js.native
  /**
    * The number of the first list item at this nesting level.  A value of 0 is
    * treated as a value of 1 for lettered lists and roman numeraled lists,
    * i.e. for values of both 0 and 1, lettered and roman numeraled lists will
    * begin at `a` and `i` respectively.  This value is ignored for nesting
    * levels with unordered glyphs.
    */
  var startNumber: js.UndefOr[Double] = js.native
  /**
    * The text style of bullets at this level of nesting.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaNestingLevel {
  @scala.inline
  def apply(): SchemaNestingLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNestingLevel]
  }
  @scala.inline
  implicit class SchemaNestingLevelOps[Self <: SchemaNestingLevel] (val x: Self) extends AnyVal {
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
    def setBulletAlignment(value: String): Self = this.set("bulletAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBulletAlignment: Self = this.set("bulletAlignment", js.undefined)
    @scala.inline
    def setGlyphFormat(value: String): Self = this.set("glyphFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphFormat: Self = this.set("glyphFormat", js.undefined)
    @scala.inline
    def setGlyphSymbol(value: String): Self = this.set("glyphSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphSymbol: Self = this.set("glyphSymbol", js.undefined)
    @scala.inline
    def setGlyphType(value: String): Self = this.set("glyphType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphType: Self = this.set("glyphType", js.undefined)
    @scala.inline
    def setIndentFirstLine(value: SchemaDimension): Self = this.set("indentFirstLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentFirstLine: Self = this.set("indentFirstLine", js.undefined)
    @scala.inline
    def setIndentStart(value: SchemaDimension): Self = this.set("indentStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentStart: Self = this.set("indentStart", js.undefined)
    @scala.inline
    def setStartNumber(value: Double): Self = this.set("startNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartNumber: Self = this.set("startNumber", js.undefined)
    @scala.inline
    def setTextStyle(value: SchemaTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

