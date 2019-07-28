package typings.igniteDashUi

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
    chunkIndex: Int | Double = null,
    chunkSize: Int | Double = null,
    owner: js.Any = null,
    rows: js.Array[_] = null
  ): RowsRequestedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (chunkIndex != null) __obj.updateDynamic("chunkIndex")(chunkIndex.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[RowsRequestedEventUIParam]
  }
}

