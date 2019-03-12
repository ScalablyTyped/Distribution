package typings
package lovefieldLib.lovefieldMod.lfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionStats extends js.Object {
  def changedTableCount(): scala.Double
  def deletedRowCount(): scala.Double
  def insertedRowCount(): scala.Double
  def success(): scala.Boolean
  def updatedRowCount(): scala.Double
}

object TransactionStats {
  @scala.inline
  def apply(
    changedTableCount: () => scala.Double,
    deletedRowCount: () => scala.Double,
    insertedRowCount: () => scala.Double,
    success: () => scala.Boolean,
    updatedRowCount: () => scala.Double
  ): TransactionStats = {
    val __obj = js.Dynamic.literal(changedTableCount = js.Any.fromFunction0(changedTableCount), deletedRowCount = js.Any.fromFunction0(deletedRowCount), insertedRowCount = js.Any.fromFunction0(insertedRowCount), success = js.Any.fromFunction0(success), updatedRowCount = js.Any.fromFunction0(updatedRowCount))
  
    __obj.asInstanceOf[TransactionStats]
  }
}

