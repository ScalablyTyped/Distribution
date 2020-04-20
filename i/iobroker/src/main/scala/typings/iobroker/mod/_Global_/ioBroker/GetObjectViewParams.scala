package typings.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for adapter.getObjectView */
trait GetObjectViewParams extends js.Object {
  /** Last id to include in the return list */
  var endkey: js.UndefOr[String] = js.undefined
  /** Whether docs should be included in the return list */ // TODO: What are docs?
  var include_docs: js.UndefOr[Boolean] = js.undefined
  /** First id to include in the return list */
  var startkey: js.UndefOr[String] = js.undefined
}

object GetObjectViewParams {
  @scala.inline
  def apply(endkey: String = null, include_docs: js.UndefOr[Boolean] = js.undefined, startkey: String = null): GetObjectViewParams = {
    val __obj = js.Dynamic.literal()
    if (endkey != null) __obj.updateDynamic("endkey")(endkey.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs.asInstanceOf[js.Any])
    if (startkey != null) __obj.updateDynamic("startkey")(startkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectViewParams]
  }
}

