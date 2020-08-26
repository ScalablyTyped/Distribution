package typings.lovefield.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionStats extends js.Object {
  def changedTableCount(): Double = js.native
  def deletedRowCount(): Double = js.native
  def insertedRowCount(): Double = js.native
  def success(): Boolean = js.native
  def updatedRowCount(): Double = js.native
}

object TransactionStats {
  @scala.inline
  def apply(
    changedTableCount: () => Double,
    deletedRowCount: () => Double,
    insertedRowCount: () => Double,
    success: () => Boolean,
    updatedRowCount: () => Double
  ): TransactionStats = {
    val __obj = js.Dynamic.literal(changedTableCount = js.Any.fromFunction0(changedTableCount), deletedRowCount = js.Any.fromFunction0(deletedRowCount), insertedRowCount = js.Any.fromFunction0(insertedRowCount), success = js.Any.fromFunction0(success), updatedRowCount = js.Any.fromFunction0(updatedRowCount))
    __obj.asInstanceOf[TransactionStats]
  }
  @scala.inline
  implicit class TransactionStatsOps[Self <: TransactionStats] (val x: Self) extends AnyVal {
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
    def setChangedTableCount(value: () => Double): Self = this.set("changedTableCount", js.Any.fromFunction0(value))
    @scala.inline
    def setDeletedRowCount(value: () => Double): Self = this.set("deletedRowCount", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertedRowCount(value: () => Double): Self = this.set("insertedRowCount", js.Any.fromFunction0(value))
    @scala.inline
    def setSuccess(value: () => Boolean): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdatedRowCount(value: () => Double): Self = this.set("updatedRowCount", js.Any.fromFunction0(value))
  }
  
}

