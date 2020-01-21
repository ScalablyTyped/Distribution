package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set the scoring configuration. This allows modifying the ranking of results
  * for a source.
  */
@js.native
trait SchemaSourceScoringConfig extends js.Object {
  /**
    * Importance of the source.
    */
  var sourceImportance: js.UndefOr[String] = js.native
}

object SchemaSourceScoringConfig {
  @scala.inline
  def apply(sourceImportance: String = null): SchemaSourceScoringConfig = {
    val __obj = js.Dynamic.literal()
    if (sourceImportance != null) __obj.updateDynamic("sourceImportance")(sourceImportance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceScoringConfig]
  }
}

