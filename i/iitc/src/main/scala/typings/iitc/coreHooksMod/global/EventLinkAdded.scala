package typings.iitc.coreHooksMod.global

import typings.iitc.coreIitctypesMod.IITC.Link
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventLinkAdded] (val x: Self) extends AnyVal {
    
    inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
