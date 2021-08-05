package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseUsertags extends StObject {
  
  var in: js.Array[TimelineFeedResponseInItem]
}
object TimelineFeedResponseUsertags {
  
  inline def apply(in: js.Array[TimelineFeedResponseInItem]): TimelineFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseUsertags]
  }
  
  extension [Self <: TimelineFeedResponseUsertags](x: Self) {
    
    inline def setIn(value: js.Array[TimelineFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInVarargs(value: TimelineFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
