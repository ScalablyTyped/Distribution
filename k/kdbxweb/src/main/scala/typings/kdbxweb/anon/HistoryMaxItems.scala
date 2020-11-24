package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryMaxItems extends js.Object {
  
  var HistoryMaxItems: Double = js.native
  
  var HistoryMaxSize: Double = js.native
  
  var KeyEncryptionRounds: Double = js.native
  
  var MntncHistoryDays: Double = js.native
  
  var RecycleBinName: String = js.native
}
object HistoryMaxItems {
  
  @scala.inline
  def apply(
    HistoryMaxItems: Double,
    HistoryMaxSize: Double,
    KeyEncryptionRounds: Double,
    MntncHistoryDays: Double,
    RecycleBinName: String
  ): HistoryMaxItems = {
    val __obj = js.Dynamic.literal(HistoryMaxItems = HistoryMaxItems.asInstanceOf[js.Any], HistoryMaxSize = HistoryMaxSize.asInstanceOf[js.Any], KeyEncryptionRounds = KeyEncryptionRounds.asInstanceOf[js.Any], MntncHistoryDays = MntncHistoryDays.asInstanceOf[js.Any], RecycleBinName = RecycleBinName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryMaxItems]
  }
  
  @scala.inline
  implicit class HistoryMaxItemsOps[Self <: HistoryMaxItems] (val x: Self) extends AnyVal {
    
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
    def setHistoryMaxItems(value: Double): Self = this.set("HistoryMaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryMaxSize(value: Double): Self = this.set("HistoryMaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyEncryptionRounds(value: Double): Self = this.set("KeyEncryptionRounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMntncHistoryDays(value: Double): Self = this.set("MntncHistoryDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecycleBinName(value: String): Self = this.set("RecycleBinName", value.asInstanceOf[js.Any])
  }
}
