package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configurations for a source while processing a Search or Suggest request.
  */
@js.native
trait SchemaSourceConfig extends js.Object {
  /**
    * The crowding configuration for the source.
    */
  var crowdingConfig: js.UndefOr[SchemaSourceCrowdingConfig] = js.native
  /**
    * The scoring configuration for the source.
    */
  var scoringConfig: js.UndefOr[SchemaSourceScoringConfig] = js.native
  /**
    * The source for which this configuration is to be used.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaSourceConfig {
  @scala.inline
  def apply(
    crowdingConfig: SchemaSourceCrowdingConfig = null,
    scoringConfig: SchemaSourceScoringConfig = null,
    source: SchemaSource = null
  ): SchemaSourceConfig = {
    val __obj = js.Dynamic.literal()
    if (crowdingConfig != null) __obj.updateDynamic("crowdingConfig")(crowdingConfig.asInstanceOf[js.Any])
    if (scoringConfig != null) __obj.updateDynamic("scoringConfig")(scoringConfig.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceConfig]
  }
}

