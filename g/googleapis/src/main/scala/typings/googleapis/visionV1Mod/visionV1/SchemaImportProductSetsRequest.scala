package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the `ImportProductSets` method.
  */
@js.native
trait SchemaImportProductSetsRequest extends js.Object {
  /**
    * The input content for the list of requests.
    */
  var inputConfig: js.UndefOr[SchemaImportProductSetsInputConfig] = js.native
}

object SchemaImportProductSetsRequest {
  @scala.inline
  def apply(inputConfig: SchemaImportProductSetsInputConfig = null): SchemaImportProductSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportProductSetsRequest]
  }
}

