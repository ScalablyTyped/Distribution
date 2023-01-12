package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cur extends StObject {
  
  var cur: Client
  
  var delta: Client
  
  var prev: Client
  
  var start: Client
  
  var velocity: Client
}
object Cur {
  
  inline def apply(cur: Client, delta: Client, prev: Client, start: Client, velocity: Client): Cur = {
    val __obj = js.Dynamic.literal(cur = cur.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cur]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cur] (val x: Self) extends AnyVal {
    
    inline def setCur(value: Client): Self = StObject.set(x, "cur", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: Client): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: Client): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Client): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Client): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
