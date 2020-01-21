package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base ImageProperties have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaImagePropertiesSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to angle.
    */
  var angleSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to brightness.
    */
  var brightnessSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to content_uri.
    */
  var contentUriSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to contrast.
    */
  var contrastSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in crop_properties have been
    * changed in this suggestion.
    */
  var cropPropertiesSuggestionState: js.UndefOr[SchemaCropPropertiesSuggestionState] = js.native
  /**
    * Indicates if there was a suggested change to source_uri.
    */
  var sourceUriSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to transparency.
    */
  var transparencySuggested: js.UndefOr[Boolean] = js.native
}

object SchemaImagePropertiesSuggestionState {
  @scala.inline
  def apply(
    angleSuggested: js.UndefOr[Boolean] = js.undefined,
    brightnessSuggested: js.UndefOr[Boolean] = js.undefined,
    contentUriSuggested: js.UndefOr[Boolean] = js.undefined,
    contrastSuggested: js.UndefOr[Boolean] = js.undefined,
    cropPropertiesSuggestionState: SchemaCropPropertiesSuggestionState = null,
    sourceUriSuggested: js.UndefOr[Boolean] = js.undefined,
    transparencySuggested: js.UndefOr[Boolean] = js.undefined
  ): SchemaImagePropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angleSuggested)) __obj.updateDynamic("angleSuggested")(angleSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(brightnessSuggested)) __obj.updateDynamic("brightnessSuggested")(brightnessSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(contentUriSuggested)) __obj.updateDynamic("contentUriSuggested")(contentUriSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(contrastSuggested)) __obj.updateDynamic("contrastSuggested")(contrastSuggested.asInstanceOf[js.Any])
    if (cropPropertiesSuggestionState != null) __obj.updateDynamic("cropPropertiesSuggestionState")(cropPropertiesSuggestionState.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceUriSuggested)) __obj.updateDynamic("sourceUriSuggested")(sourceUriSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(transparencySuggested)) __obj.updateDynamic("transparencySuggested")(transparencySuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImagePropertiesSuggestionState]
  }
}

