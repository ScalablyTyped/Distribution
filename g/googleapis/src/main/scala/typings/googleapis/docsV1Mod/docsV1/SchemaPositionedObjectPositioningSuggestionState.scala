package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base
  * PositionedObjectPositioning have been changed in this suggestion. For any
  * field set to true, there is a new suggested value.
  */
@js.native
trait SchemaPositionedObjectPositioningSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to layout.
    */
  var layoutSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to left_offset.
    */
  var leftOffsetSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to top_offset.
    */
  var topOffsetSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaPositionedObjectPositioningSuggestionState {
  @scala.inline
  def apply(
    layoutSuggested: js.UndefOr[Boolean] = js.undefined,
    leftOffsetSuggested: js.UndefOr[Boolean] = js.undefined,
    topOffsetSuggested: js.UndefOr[Boolean] = js.undefined
  ): SchemaPositionedObjectPositioningSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(layoutSuggested)) __obj.updateDynamic("layoutSuggested")(layoutSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftOffsetSuggested)) __obj.updateDynamic("leftOffsetSuggested")(leftOffsetSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffsetSuggested)) __obj.updateDynamic("topOffsetSuggested")(topOffsetSuggested.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPositionedObjectPositioningSuggestionState]
  }
}

