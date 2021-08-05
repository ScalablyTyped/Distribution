package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFeedResponseUsertags extends StObject {
  
  var in: js.Array[TagFeedResponseInItem]
}
object TagFeedResponseUsertags {
  
  inline def apply(in: js.Array[TagFeedResponseInItem]): TagFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseUsertags]
  }
  
  extension [Self <: TagFeedResponseUsertags](x: Self) {
    
    inline def setIn(value: js.Array[TagFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInVarargs(value: TagFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
