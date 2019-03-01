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
    changedTableCount: js.Function0[scala.Double],
    deletedRowCount: js.Function0[scala.Double],
    insertedRowCount: js.Function0[scala.Double],
    success: js.Function0[scala.Boolean],
    updatedRowCount: js.Function0[scala.Double]
  ): TransactionStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changedTableCount")(changedTableCount)
    __obj.updateDynamic("deletedRowCount")(deletedRowCount)
    __obj.updateDynamic("insertedRowCount")(insertedRowCount)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("updatedRowCount")(updatedRowCount)
    __obj.asInstanceOf[TransactionStats]
  }
}

