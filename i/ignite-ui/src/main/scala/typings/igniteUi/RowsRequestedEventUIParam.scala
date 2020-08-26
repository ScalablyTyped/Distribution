package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowsRequestedEventUIParam extends js.Object {
  /**
    * Gets the next chunk index.
    */
  var chunkIndex: js.UndefOr[Double] = js.native
  /**
    * Gets the chunk size.
    */
  var chunkSize: js.UndefOr[Double] = js.native
  /**
    * Gets a reference to igGridAppendRowsOnDemand.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets the requested rows.
    */
  var rows: js.UndefOr[js.Array[_]] = js.native
}

object RowsRequestedEventUIParam {
  @scala.inline
  def apply(): RowsRequestedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowsRequestedEventUIParam]
  }
  @scala.inline
  implicit class RowsRequestedEventUIParamOps[Self <: RowsRequestedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChunkIndex(value: Double): Self = this.set("chunkIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkIndex: Self = this.set("chunkIndex", js.undefined)
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRowsVarargs(value: js.Any*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[_]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

