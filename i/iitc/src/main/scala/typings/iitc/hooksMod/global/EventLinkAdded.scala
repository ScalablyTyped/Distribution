package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventLinkAdded extends StObject {
  
  var link: Link
}
object EventLinkAdded {
  
  inline def apply(link: Link): EventLinkAdded = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLinkAdded]
  }
  
  extension [Self <: EventLinkAdded](x: Self) {
    
    inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
