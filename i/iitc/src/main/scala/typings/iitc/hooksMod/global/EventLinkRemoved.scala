package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Link
import typings.iitc.iitctypesMod.IITC.LinkData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventLinkRemoved extends js.Object {
  
  var data: LinkData = js.native
  
  var link: Link = js.native
}
object EventLinkRemoved {
  
  @scala.inline
  def apply(data: LinkData, link: Link): EventLinkRemoved = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLinkRemoved]
  }
  
  @scala.inline
  implicit class EventLinkRemovedOps[Self <: EventLinkRemoved] (val x: Self) extends AnyVal {
    
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
    def setData(value: LinkData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: Link): Self = this.set("link", value.asInstanceOf[js.Any])
  }
}
