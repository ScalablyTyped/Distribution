package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for web detection request.
  */
@js.native
trait SchemaWebDetectionParams extends js.Object {
  /**
    * Whether to include results derived from the geo information in the image.
    */
  var includeGeoResults: js.UndefOr[Boolean] = js.native
}

object SchemaWebDetectionParams {
  @scala.inline
  def apply(includeGeoResults: js.UndefOr[Boolean] = js.undefined): SchemaWebDetectionParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeGeoResults)) __obj.updateDynamic("includeGeoResults")(includeGeoResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWebDetectionParams]
  }
}

