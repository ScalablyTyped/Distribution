package typings.iitc.coreHooksMod.global

import typings.iitc.coreIitctypesMod.IITC.Link
import typings.iitc.coreIitctypesMod.IITC.LinkData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventLinkRemoved extends StObject {
  
  var data: LinkData
  
  var link: Link
}
object EventLinkRemoved {
  
  inline def apply(data: LinkData, link: Link): EventLinkRemoved = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLinkRemoved]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventLinkRemoved] (val x: Self) extends AnyVal {
    
    inline def setData(value: LinkData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
