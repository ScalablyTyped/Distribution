package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdPlayParam extends StObject {
  
  var creativetype: String
  
  var newstate: String
  
  var oldstate: String
  
  var tag: String
}
object AdPlayParam {
  
  inline def apply(creativetype: String, newstate: String, oldstate: String, tag: String): AdPlayParam = {
    val __obj = js.Dynamic.literal(creativetype = creativetype.asInstanceOf[js.Any], newstate = newstate.asInstanceOf[js.Any], oldstate = oldstate.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdPlayParam]
  }
  
  extension [Self <: AdPlayParam](x: Self) {
    
    inline def setCreativetype(value: String): Self = StObject.set(x, "creativetype", value.asInstanceOf[js.Any])
    
    inline def setNewstate(value: String): Self = StObject.set(x, "newstate", value.asInstanceOf[js.Any])
    
    inline def setOldstate(value: String): Self = StObject.set(x, "oldstate", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
