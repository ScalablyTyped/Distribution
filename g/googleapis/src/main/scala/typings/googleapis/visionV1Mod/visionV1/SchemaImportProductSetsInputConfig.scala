package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The input content for the `ImportProductSets` method.
  */
@js.native
trait SchemaImportProductSetsInputConfig extends js.Object {
  /**
    * The Google Cloud Storage location for a csv file which preserves a list
    * of ImportProductSetRequests in each line.
    */
  var gcsSource: js.UndefOr[SchemaImportProductSetsGcsSource] = js.native
}

object SchemaImportProductSetsInputConfig {
  @scala.inline
  def apply(gcsSource: SchemaImportProductSetsGcsSource = null): SchemaImportProductSetsInputConfig = {
    val __obj = js.Dynamic.literal()
    if (gcsSource != null) __obj.updateDynamic("gcsSource")(gcsSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportProductSetsInputConfig]
  }
}

