package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base EmbeddedObjectBorder
  * have been changed in this suggestion. For any field set to true, there is a
  * new suggested value.
  */
@js.native
trait SchemaEmbeddedObjectBorderSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to color.
    */
  var colorSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to dash_style.
    */
  var dashStyleSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to property_state.
    */
  var propertyStateSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to width.
    */
  var widthSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaEmbeddedObjectBorderSuggestionState {
  @scala.inline
  def apply(
    colorSuggested: js.UndefOr[Boolean] = js.undefined,
    dashStyleSuggested: js.UndefOr[Boolean] = js.undefined,
    propertyStateSuggested: js.UndefOr[Boolean] = js.undefined,
    widthSuggested: js.UndefOr[Boolean] = js.undefined
  ): SchemaEmbeddedObjectBorderSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorSuggested)) __obj.updateDynamic("colorSuggested")(colorSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(dashStyleSuggested)) __obj.updateDynamic("dashStyleSuggested")(dashStyleSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(propertyStateSuggested)) __obj.updateDynamic("propertyStateSuggested")(propertyStateSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(widthSuggested)) __obj.updateDynamic("widthSuggested")(widthSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEmbeddedObjectBorderSuggestionState]
  }
}

