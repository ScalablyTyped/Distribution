package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseUsertags extends StObject {
  
  var in: js.Array[LocationFeedResponseInItem]
}
object LocationFeedResponseUsertags {
  
  inline def apply(in: js.Array[LocationFeedResponseInItem]): LocationFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseUsertags]
  }
  
  extension [Self <: LocationFeedResponseUsertags](x: Self) {
    
    inline def setIn(value: js.Array[LocationFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInVarargs(value: LocationFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
