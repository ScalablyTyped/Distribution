package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdCompanionsParam extends StObject {
  
  var companions: js.Array[Any]
  
  var tag: String
}
object AdCompanionsParam {
  
  inline def apply(companions: js.Array[Any], tag: String): AdCompanionsParam = {
    val __obj = js.Dynamic.literal(companions = companions.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdCompanionsParam]
  }
  
  extension [Self <: AdCompanionsParam](x: Self) {
    
    inline def setCompanions(value: js.Array[Any]): Self = StObject.set(x, "companions", value.asInstanceOf[js.Any])
    
    inline def setCompanionsVarargs(value: Any*): Self = StObject.set(x, "companions", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
