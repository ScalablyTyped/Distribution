package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result count information
  */
@js.native
trait SchemaResultCounts extends js.Object {
  /**
    * Result count information for each source with results.
    */
  var sourceResultCounts: js.UndefOr[js.Array[SchemaSourceResultCount]] = js.native
}

object SchemaResultCounts {
  @scala.inline
  def apply(sourceResultCounts: js.Array[SchemaSourceResultCount] = null): SchemaResultCounts = {
    val __obj = js.Dynamic.literal()
    if (sourceResultCounts != null) __obj.updateDynamic("sourceResultCounts")(sourceResultCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResultCounts]
  }
}

