package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED in favor of DynamicSourceSplit.
  */
@js.native
trait SchemaSourceFork extends js.Object {
  /**
    * DEPRECATED
    */
  var primary: js.UndefOr[SchemaSourceSplitShard] = js.native
  /**
    * DEPRECATED
    */
  var primarySource: js.UndefOr[SchemaDerivedSource] = js.native
  /**
    * DEPRECATED
    */
  var residual: js.UndefOr[SchemaSourceSplitShard] = js.native
  /**
    * DEPRECATED
    */
  var residualSource: js.UndefOr[SchemaDerivedSource] = js.native
}

object SchemaSourceFork {
  @scala.inline
  def apply(
    primary: SchemaSourceSplitShard = null,
    primarySource: SchemaDerivedSource = null,
    residual: SchemaSourceSplitShard = null,
    residualSource: SchemaDerivedSource = null
  ): SchemaSourceFork = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (primarySource != null) __obj.updateDynamic("primarySource")(primarySource.asInstanceOf[js.Any])
    if (residual != null) __obj.updateDynamic("residual")(residual.asInstanceOf[js.Any])
    if (residualSource != null) __obj.updateDynamic("residualSource")(residualSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceFork]
  }
}

