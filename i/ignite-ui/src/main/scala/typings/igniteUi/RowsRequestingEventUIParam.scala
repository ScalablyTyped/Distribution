package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowsRequestingEventUIParam extends js.Object {
  /**
    * Gets the next chunk index.
    */
  var chunkIndex: js.UndefOr[Double] = js.undefined
  /**
    * Gets the chunk size.
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  /**
    * Gets a reference to igGridAppendRowsOnDemand.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object RowsRequestingEventUIParam {
  @scala.inline
  def apply(
    chunkIndex: js.UndefOr[Double] = js.undefined,
    chunkSize: js.UndefOr[Double] = js.undefined,
    owner: js.Any = null
  ): RowsRequestingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkIndex)) __obj.updateDynamic("chunkIndex")(chunkIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsRequestingEventUIParam]
  }
}

