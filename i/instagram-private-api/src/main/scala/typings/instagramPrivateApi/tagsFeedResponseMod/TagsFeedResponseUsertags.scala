package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsFeedResponseUsertags extends StObject {
  
  var in: js.Array[TagsFeedResponseInItem]
}
object TagsFeedResponseUsertags {
  
  inline def apply(in: js.Array[TagsFeedResponseInItem]): TagsFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseUsertags]
  }
  
  extension [Self <: TagsFeedResponseUsertags](x: Self) {
    
    inline def setIn(value: js.Array[TagsFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInVarargs(value: TagsFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
