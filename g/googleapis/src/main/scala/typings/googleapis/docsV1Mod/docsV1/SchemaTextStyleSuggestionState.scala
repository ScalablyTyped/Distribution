package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base TextStyle have been
  * changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaTextStyleSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to background_color.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to baseline_offset.
    */
  var baselineOffsetSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to bold.
    */
  var boldSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to font_size.
    */
  var fontSizeSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to foreground_color.
    */
  var foregroundColorSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to italic.
    */
  var italicSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to link.
    */
  var linkSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to small_caps.
    */
  var smallCapsSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to strikethrough.
    */
  var strikethroughSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to underline.
    */
  var underlineSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to weighted_font_family.
    */
  var weightedFontFamilySuggested: js.UndefOr[Boolean] = js.native
}

object SchemaTextStyleSuggestionState {
  @scala.inline
  def apply(
    backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined,
    baselineOffsetSuggested: js.UndefOr[Boolean] = js.undefined,
    boldSuggested: js.UndefOr[Boolean] = js.undefined,
    fontSizeSuggested: js.UndefOr[Boolean] = js.undefined,
    foregroundColorSuggested: js.UndefOr[Boolean] = js.undefined,
    italicSuggested: js.UndefOr[Boolean] = js.undefined,
    linkSuggested: js.UndefOr[Boolean] = js.undefined,
    smallCapsSuggested: js.UndefOr[Boolean] = js.undefined,
    strikethroughSuggested: js.UndefOr[Boolean] = js.undefined,
    underlineSuggested: js.UndefOr[Boolean] = js.undefined,
    weightedFontFamilySuggested: js.UndefOr[Boolean] = js.undefined
  ): SchemaTextStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColorSuggested)) __obj.updateDynamic("backgroundColorSuggested")(backgroundColorSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(baselineOffsetSuggested)) __obj.updateDynamic("baselineOffsetSuggested")(baselineOffsetSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(boldSuggested)) __obj.updateDynamic("boldSuggested")(boldSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSizeSuggested)) __obj.updateDynamic("fontSizeSuggested")(fontSizeSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(foregroundColorSuggested)) __obj.updateDynamic("foregroundColorSuggested")(foregroundColorSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(italicSuggested)) __obj.updateDynamic("italicSuggested")(italicSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(linkSuggested)) __obj.updateDynamic("linkSuggested")(linkSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(smallCapsSuggested)) __obj.updateDynamic("smallCapsSuggested")(smallCapsSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethroughSuggested)) __obj.updateDynamic("strikethroughSuggested")(strikethroughSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineSuggested)) __obj.updateDynamic("underlineSuggested")(underlineSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(weightedFontFamilySuggested)) __obj.updateDynamic("weightedFontFamilySuggested")(weightedFontFamilySuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextStyleSuggestionState]
  }
}

