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
    val __obj = js.Dynamic.literal(HistoryMaxItems = HistoryMaxItems, HistoryMaxSize = HistoryMaxSize, KeyEncryptionRounds = KeyEncryptionRounds, MntncHistoryDays = MntncHistoryDays, RecycleBinName = RecycleBinName)
  
    __obj.asInstanceOf[Anon_HistoryMaxItems]
  }
}

