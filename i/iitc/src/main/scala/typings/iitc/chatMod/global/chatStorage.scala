package typings.iitc.chatMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait chatStorage extends js.Object {
  
  var newestTimestamp: Double = js.native
  
  var oldestTimestamp: Double = js.native
}
object chatStorage {
  
  @scala.inline
  def apply(newestTimestamp: Double, oldestTimestamp: Double): chatStorage = {
    val __obj = js.Dynamic.literal(newestTimestamp = newestTimestamp.asInstanceOf[js.Any], oldestTimestamp = oldestTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[chatStorage]
  }
  
  @scala.inline
  implicit class chatStorageOps[Self <: chatStorage] (val x: Self) extends AnyVal {
    
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
    def setNewestTimestamp(value: Double): Self = this.set("newestTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldestTimestamp(value: Double): Self = this.set("oldestTimestamp", value.asInstanceOf[js.Any])
  }
}
