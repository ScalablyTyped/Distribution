package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set search results crowding limits. Crowding is a situation in which
  * multiple results from the same source or host &quot;crowd out&quot; other
  * results, diminishing the quality of search for users. To foster better
  * search quality and source diversity in search results, you can set a
  * condition to reduce repetitive results by source.
  */
@js.native
trait SchemaSourceCrowdingConfig extends js.Object {
  /**
    * Use a field to control results crowding. For example, if you want to
    * control overly similar results from Gmail topics, use `thread_id`. For
    * similar pages from Google Sites, you can use `webspace_id`. When matching
    * query results contain the same field value in `GenericMetadata`, crowding
    * limits are set on those records.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * Maximum number of results allowed from a source. No limits will be set on
    * results if this value is less than or equal to 0.
    */
  var numResults: js.UndefOr[Double] = js.native
  /**
    * Maximum number of suggestions allowed from a source. No limits will be
    * set on results if this value is less than or equal to 0.
    */
  var numSuggestions: js.UndefOr[Double] = js.native
  /**
    * Control results by content source. This option limits the total number of
    * results from a given source and ignores field-based crowding control.
    */
  var source: js.UndefOr[Boolean] = js.native
}

object SchemaSourceCrowdingConfig {
  @scala.inline
  def apply(
    field: String = null,
    numResults: Int | Double = null,
    numSuggestions: Int | Double = null,
    source: js.UndefOr[Boolean] = js.undefined
  ): SchemaSourceCrowdingConfig = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (numResults != null) __obj.updateDynamic("numResults")(numResults.asInstanceOf[js.Any])
    if (numSuggestions != null) __obj.updateDynamic("numSuggestions")(numSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceCrowdingConfig]
  }
}

