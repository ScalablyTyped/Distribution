package typings.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for @link{Objects.getObjectList} */
trait GetObjectListParams extends GetObjectViewParams {
  /** Whether docs should be included in the return list */ // TODO: What are docs?
  var include_docs: js.UndefOr[Boolean] = js.undefined
}

object GetObjectListParams {
  @scala.inline
  def apply(endkey: String, startkey: String, include_docs: js.UndefOr[Boolean] = js.undefined): GetObjectListParams = {
    val __obj = js.Dynamic.literal(endkey = endkey.asInstanceOf[js.Any], startkey = startkey.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectListParams]
  }
}

