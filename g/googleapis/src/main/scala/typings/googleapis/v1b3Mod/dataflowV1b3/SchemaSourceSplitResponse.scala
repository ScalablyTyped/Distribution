package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a SourceSplitRequest.
  */
@js.native
trait SchemaSourceSplitResponse extends js.Object {
  /**
    * If outcome is SPLITTING_HAPPENED, then this is a list of bundles into
    * which the source was split. Otherwise this field is ignored. This list
    * can be empty, which means the source represents an empty input.
    */
  var bundles: js.UndefOr[js.Array[SchemaDerivedSource]] = js.native
  /**
    * Indicates whether splitting happened and produced a list of bundles. If
    * this is USE_CURRENT_SOURCE_AS_IS, the current source should be processed
    * &quot;as is&quot; without splitting. &quot;bundles&quot; is ignored in
    * this case. If this is SPLITTING_HAPPENED, then &quot;bundles&quot;
    * contains a list of bundles into which the source was split.
    */
  var outcome: js.UndefOr[String] = js.native
  /**
    * DEPRECATED in favor of bundles.
    */
  var shards: js.UndefOr[js.Array[SchemaSourceSplitShard]] = js.native
}

object SchemaSourceSplitResponse {
  @scala.inline
  def apply(
    bundles: js.Array[SchemaDerivedSource] = null,
    outcome: String = null,
    shards: js.Array[SchemaSourceSplitShard] = null
  ): SchemaSourceSplitResponse = {
    val __obj = js.Dynamic.literal()
    if (bundles != null) __obj.updateDynamic("bundles")(bundles.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (shards != null) __obj.updateDynamic("shards")(shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceSplitResponse]
  }
}

