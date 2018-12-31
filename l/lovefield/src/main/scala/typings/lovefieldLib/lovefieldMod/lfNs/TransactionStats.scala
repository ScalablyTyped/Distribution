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

