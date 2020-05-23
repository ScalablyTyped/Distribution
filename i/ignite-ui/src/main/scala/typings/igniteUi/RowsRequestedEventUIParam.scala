package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowsRequestedEventUIParam extends js.Object {
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
  /**
    * Gets the requested rows.
    */
  var rows: js.UndefOr[js.Array[_]] = js.undefined
}

object RowsRequestedEventUIParam {
  @scala.inline
  def apply(
    chunkIndex: js.UndefOr[Double] = js.undefined,
    chunkSize: js.UndefOr[Double] = js.undefined,
    owner: js.Any = null,
    rows: js.Array[_] = null
  ): RowsRequestedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkIndex)) __obj.updateDynamic("chunkIndex")(chunkIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsRequestedEventUIParam]
  }
}

