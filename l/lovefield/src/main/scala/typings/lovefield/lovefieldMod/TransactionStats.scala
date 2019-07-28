package typings.lovefield.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionStats extends js.Object {
  def changedTableCount(): Double
  def deletedRowCount(): Double
  def insertedRowCount(): Double
  def success(): Boolean
  def updatedRowCount(): Double
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
}

