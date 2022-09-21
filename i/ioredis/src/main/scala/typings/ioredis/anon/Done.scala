package typings.ioredis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done extends StObject {
  
  var done: Boolean
  
  var value: PartialSentinelAddress
}
object Done {
  
  inline def apply(done: Boolean, value: PartialSentinelAddress): Done = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done]
  }
  
  extension [Self <: Done](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: PartialSentinelAddress): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
