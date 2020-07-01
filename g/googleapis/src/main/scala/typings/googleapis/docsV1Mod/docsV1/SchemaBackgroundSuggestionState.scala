package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base Background have been
  * changed in this suggestion. For any field set to true, the Backgound has a
  * new suggested value.
  */
@js.native
trait SchemaBackgroundSuggestionState extends js.Object {
  /**
    * Indicates whether the current background color has been modified in this
    * suggestion.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaBackgroundSuggestionState {
  @scala.inline
  def apply(backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined): SchemaBackgroundSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColorSuggested)) __obj.updateDynamic("backgroundColorSuggested")(backgroundColorSuggested.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackgroundSuggestionState]
  }
}

