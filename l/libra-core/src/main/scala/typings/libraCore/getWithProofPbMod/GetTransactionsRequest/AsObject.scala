package typings.libraCore.getWithProofPbMod.GetTransactionsRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var fetchEvents: Boolean = js.native
  
  var limit: String = js.native
  
  var startVersion: String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(fetchEvents: Boolean, limit: String, startVersion: String): AsObject = {
    val __obj = js.Dynamic.literal(fetchEvents = fetchEvents.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], startVersion = startVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
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
    def setFetchEvents(value: Boolean): Self = this.set("fetchEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartVersion(value: String): Self = this.set("startVersion", value.asInstanceOf[js.Any])
  }
}
