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
  def apply(chunkIndex: Int | Double = null, chunkSize: Int | Double = null, owner: js.Any = null): RowsRequestingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (chunkIndex != null) __obj.updateDynamic("chunkIndex")(chunkIndex.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsRequestingEventUIParam]
  }
}

