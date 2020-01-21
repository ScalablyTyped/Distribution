package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the level of parallelism in a WorkItem&#39;s input, reported by
  * the worker.
  */
@js.native
trait SchemaReportedParallelism extends js.Object {
  /**
    * Specifies whether the parallelism is infinite. If true, &quot;value&quot;
    * is ignored. Infinite parallelism means the service will assume that the
    * work item can always be split into more non-empty work items by dynamic
    * splitting. This is a work-around for lack of support for infinity by the
    * current JSON-based Java RPC stack.
    */
  var isInfinite: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the level of parallelism in case it is finite.
    */
  var value: js.UndefOr[Double] = js.native
}

object SchemaReportedParallelism {
  @scala.inline
  def apply(isInfinite: js.UndefOr[Boolean] = js.undefined, value: Int | Double = null): SchemaReportedParallelism = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isInfinite)) __obj.updateDynamic("isInfinite")(isInfinite.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportedParallelism]
  }
}

