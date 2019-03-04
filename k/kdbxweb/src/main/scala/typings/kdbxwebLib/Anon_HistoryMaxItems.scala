package typings
package kdbxwebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HistoryMaxItems extends js.Object {
  var HistoryMaxItems: scala.Double
  var HistoryMaxSize: scala.Double
  var KeyEncryptionRounds: scala.Double
  var MntncHistoryDays: scala.Double
  var RecycleBinName: java.lang.String
}

object Anon_HistoryMaxItems {
  @scala.inline
  def apply(
    HistoryMaxItems: scala.Double,
    HistoryMaxSize: scala.Double,
    KeyEncryptionRounds: scala.Double,
    MntncHistoryDays: scala.Double,
    RecycleBinName: java.lang.String
  ): Anon_HistoryMaxItems = {
    val __obj = js.Dynamic.literal(HistoryMaxItems = HistoryMaxItems, HistoryMaxSize = HistoryMaxSize, KeyEncryptionRounds = KeyEncryptionRounds, MntncHistoryDays = MntncHistoryDays, RecycleBinName = RecycleBinName)
  
    __obj.asInstanceOf[Anon_HistoryMaxItems]
  }
}

