package typings.jsforce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatedDate extends js.Object {
  
  var createdDate: String = js.native
  
  var replayId: js.UndefOr[Double] = js.native
  
  var `type`: String = js.native
}
object CreatedDate {
  
  @scala.inline
  def apply(createdDate: String, `type`: String): CreatedDate = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedDate]
  }
  
  @scala.inline
  implicit class CreatedDateOps[Self <: CreatedDate] (val x: Self) extends AnyVal {
    
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
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayId(value: Double): Self = this.set("replayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplayId: Self = this.set("replayId", js.undefined)
  }
}
