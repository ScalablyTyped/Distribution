package typings.keymaster

import typings.keymaster.anon.TagName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterEvent extends js.Object {
  
  var srcElement: js.UndefOr[TagName] = js.native
  
  var target: js.UndefOr[TagName] = js.native
}
object FilterEvent {
  
  @scala.inline
  def apply(): FilterEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterEvent]
  }
  
  @scala.inline
  implicit class FilterEventOps[Self <: FilterEvent] (val x: Self) extends AnyVal {
    
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
    def setSrcElement(value: TagName): Self = this.set("srcElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcElement: Self = this.set("srcElement", js.undefined)
    
    @scala.inline
    def setTarget(value: TagName): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
