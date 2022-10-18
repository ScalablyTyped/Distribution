package typings.ipfsBitswap.anon

import typings.ipfsBitswap.distSrcWantManagerMsgQueueMod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Priority extends StObject {
  
  var cid: CID
  
  var priority: Double
}
object Priority {
  
  inline def apply(cid: CID, priority: Double): Priority = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priority]
  }
  
  extension [Self <: Priority](x: Self) {
    
    inline def setCid(value: CID): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
