package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base NestingLevel have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaNestingLevelSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to bullet_alignment.
    */
  var bulletAlignmentSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to glyph_format.
    */
  var glyphFormatSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to glyph_symbol.
    */
  var glyphSymbolSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to glyph_type.
    */
  var glyphTypeSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to indent_first_line.
    */
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to indent_start.
    */
  var indentStartSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to start_number.
    */
  var startNumberSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in text style have been changed
    * in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}

object SchemaNestingLevelSuggestionState {
  @scala.inline
  def apply(
    bulletAlignmentSuggested: js.UndefOr[Boolean] = js.undefined,
    glyphFormatSuggested: js.UndefOr[Boolean] = js.undefined,
    glyphSymbolSuggested: js.UndefOr[Boolean] = js.undefined,
    glyphTypeSuggested: js.UndefOr[Boolean] = js.undefined,
    indentFirstLineSuggested: js.UndefOr[Boolean] = js.undefined,
    indentStartSuggested: js.UndefOr[Boolean] = js.undefined,
    startNumberSuggested: js.UndefOr[Boolean] = js.undefined,
    textStyleSuggestionState: SchemaTextStyleSuggestionState = null
  ): SchemaNestingLevelSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bulletAlignmentSuggested)) __obj.updateDynamic("bulletAlignmentSuggested")(bulletAlignmentSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphFormatSuggested)) __obj.updateDynamic("glyphFormatSuggested")(glyphFormatSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphSymbolSuggested)) __obj.updateDynamic("glyphSymbolSuggested")(glyphSymbolSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphTypeSuggested)) __obj.updateDynamic("glyphTypeSuggested")(glyphTypeSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentFirstLineSuggested)) __obj.updateDynamic("indentFirstLineSuggested")(indentFirstLineSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentStartSuggested)) __obj.updateDynamic("indentStartSuggested")(indentStartSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startNumberSuggested)) __obj.updateDynamic("startNumberSuggested")(startNumberSuggested.get.asInstanceOf[js.Any])
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNestingLevelSuggestionState]
  }
}

