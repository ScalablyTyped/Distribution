package typings.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHistoryMaxItems extends js.Object {
  var HistoryMaxItems: Double
  var HistoryMaxSize: Double
  var KeyEncryptionRounds: Double
  var MntncHistoryDays: Double
  var RecycleBinName: String
}

object AnonHistoryMaxItems {
  @scala.inline
  def apply(
    HistoryMaxItems: Double,
    HistoryMaxSize: Double,
    KeyEncryptionRounds: Double,
    MntncHistoryDays: Double,
    RecycleBinName: String
  ): AnonHistoryMaxItems = {
    val __obj = js.Dynamic.literal(HistoryMaxItems = HistoryMaxItems.asInstanceOf[js.Any], HistoryMaxSize = HistoryMaxSize.asInstanceOf[js.Any], KeyEncryptionRounds = KeyEncryptionRounds.asInstanceOf[js.Any], MntncHistoryDays = MntncHistoryDays.asInstanceOf[js.Any], RecycleBinName = RecycleBinName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHistoryMaxItems]
  }
}

