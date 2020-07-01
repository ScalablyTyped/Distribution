package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Per source result count information.
  */
@js.native
trait SchemaSourceResultCount extends js.Object {
  /**
    * Whether there are more search results for this source.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * The estimated result count for this source.
    */
  var resultCountEstimate: js.UndefOr[String] = js.native
  /**
    * The exact result count for this source.
    */
  var resultCountExact: js.UndefOr[String] = js.native
  /**
    * The source the result count information is associated with.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaSourceResultCount {
  @scala.inline
  def apply(
    hasMoreResults: js.UndefOr[Boolean] = js.undefined,
    resultCountEstimate: String = null,
    resultCountExact: String = null,
    source: SchemaSource = null
  ): SchemaSourceResultCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasMoreResults)) __obj.updateDynamic("hasMoreResults")(hasMoreResults.get.asInstanceOf[js.Any])
    if (resultCountEstimate != null) __obj.updateDynamic("resultCountEstimate")(resultCountEstimate.asInstanceOf[js.Any])
    if (resultCountExact != null) __obj.updateDynamic("resultCountExact")(resultCountExact.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceResultCount]
  }
}

