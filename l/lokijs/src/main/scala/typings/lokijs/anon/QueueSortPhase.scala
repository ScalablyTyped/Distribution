package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueSortPhase extends js.Object {
  
  var queueSortPhase: js.UndefOr[Boolean] = js.native
}
object QueueSortPhase {
  
  @scala.inline
  def apply(): QueueSortPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueSortPhase]
  }
  
  @scala.inline
  implicit class QueueSortPhaseOps[Self <: QueueSortPhase] (val x: Self) extends AnyVal {
    
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
    def setQueueSortPhase(value: Boolean): Self = this.set("queueSortPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueSortPhase: Self = this.set("queueSortPhase", js.undefined)
  }
}
