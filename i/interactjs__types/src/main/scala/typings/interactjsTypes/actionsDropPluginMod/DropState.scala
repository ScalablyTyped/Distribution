package typings.interactjsTypes.actionsDropPluginMod

import typings.interactjsTypes.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropState extends StObject {
  
  var activeDrops: js.Array[ActiveDrop]
  
  var cur: Element
  
  var events: FiredDropEvents
  
  var prev: Element
  
  var rejected: Boolean
}
object DropState {
  
  inline def apply(
    activeDrops: js.Array[ActiveDrop],
    cur: Element,
    events: FiredDropEvents,
    prev: Element,
    rejected: Boolean
  ): DropState = {
    val __obj = js.Dynamic.literal(activeDrops = activeDrops.asInstanceOf[js.Any], cur = cur.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropState] (val x: Self) extends AnyVal {
    
    inline def setActiveDrops(value: js.Array[ActiveDrop]): Self = StObject.set(x, "activeDrops", value.asInstanceOf[js.Any])
    
    inline def setActiveDropsVarargs(value: ActiveDrop*): Self = StObject.set(x, "activeDrops", js.Array(value*))
    
    inline def setCur(value: Element): Self = StObject.set(x, "cur", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: FiredDropEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: Element): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setRejected(value: Boolean): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
  }
}
