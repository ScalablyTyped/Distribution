package typings.interactjsTypes.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordsSet extends StObject {
  
  var cur: CoordsSetMember
  
  var delta: CoordsSetMember
  
  var prev: CoordsSetMember
  
  var start: CoordsSetMember
  
  var velocity: CoordsSetMember
}
object CoordsSet {
  
  inline def apply(
    cur: CoordsSetMember,
    delta: CoordsSetMember,
    prev: CoordsSetMember,
    start: CoordsSetMember,
    velocity: CoordsSetMember
  ): CoordsSet = {
    val __obj = js.Dynamic.literal(cur = cur.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordsSet]
  }
  
  extension [Self <: CoordsSet](x: Self) {
    
    inline def setCur(value: CoordsSetMember): Self = StObject.set(x, "cur", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: CoordsSetMember): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: CoordsSetMember): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setStart(value: CoordsSetMember): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: CoordsSetMember): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
