package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Link
import typings.iitc.iitctypesMod.IITC.LinkData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventLinkRemoved extends StObject {
  
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
  implicit class EventLinkRemovedMutableBuilder[Self <: EventLinkRemoved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: LinkData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
