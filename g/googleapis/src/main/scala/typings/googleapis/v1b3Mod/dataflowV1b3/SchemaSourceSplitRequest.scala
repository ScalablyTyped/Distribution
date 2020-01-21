package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the operation to split a high-level Source specification into
  * bundles (parts for parallel processing).  At a high level, splitting of a
  * source into bundles happens as follows: SourceSplitRequest is applied to
  * the source. If it returns SOURCE_SPLIT_OUTCOME_USE_CURRENT, no further
  * splitting happens and the source is used &quot;as is&quot;. Otherwise,
  * splitting is applied recursively to each produced DerivedSource.  As an
  * optimization, for any Source, if its does_not_need_splitting is true, the
  * framework assumes that splitting this source would return
  * SOURCE_SPLIT_OUTCOME_USE_CURRENT, and doesn&#39;t initiate a
  * SourceSplitRequest. This applies both to the initial source being split and
  * to bundles produced from it.
  */
@js.native
trait SchemaSourceSplitRequest extends js.Object {
  /**
    * Hints for tuning the splitting process.
    */
  var options: js.UndefOr[SchemaSourceSplitOptions] = js.native
  /**
    * Specification of the source to be split.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaSourceSplitRequest {
  @scala.inline
  def apply(options: SchemaSourceSplitOptions = null, source: SchemaSource = null): SchemaSourceSplitRequest = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceSplitRequest]
  }
}

