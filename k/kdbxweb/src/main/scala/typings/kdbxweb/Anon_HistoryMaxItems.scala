package typings.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HistoryMaxItems extends js.Object {
  var HistoryMaxItems: Double
  var HistoryMaxSize: Double
  var KeyEncryptionRounds: Double
  var MntncHistoryDays: Double
  var RecycleBinName: String
}

object Anon_HistoryMaxItems {
  @scala.inline
  def apply(
    HistoryMaxItems: Double,
    HistoryMaxSize: Double,
    KeyEncryptionRounds: Double,
    MntncHistoryDays: Double,
    RecycleBinName: String
  ): Anon_HistoryMaxItems = {
    val __obj = js.Dynamic.literal(HistoryMaxItems = HistoryMaxItems.asInstanceOf[js.Any], HistoryMaxSize = HistoryMaxSize.asInstanceOf[js.Any], KeyEncryptionRounds = KeyEncryptionRounds.asInstanceOf[js.Any], MntncHistoryDays = MntncHistoryDays.asInstanceOf[js.Any], RecycleBinName = RecycleBinName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HistoryMaxItems]
  }
}

