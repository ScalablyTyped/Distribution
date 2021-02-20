package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventLinkAdded extends StObject {
  
  var link: Link = js.native
}
object EventLinkAdded {
  
  @scala.inline
  def apply(link: Link): EventLinkAdded = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLinkAdded]
  }
  
  @scala.inline
  implicit class EventLinkAddedMutableBuilder[Self <: EventLinkAdded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
