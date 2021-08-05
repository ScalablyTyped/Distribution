package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedFeedResponseUsertags extends StObject {
  
  var in: js.Array[SavedFeedResponseInItem]
}
object SavedFeedResponseUsertags {
  
  inline def apply(in: js.Array[SavedFeedResponseInItem]): SavedFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseUsertags]
  }
  
  extension [Self <: SavedFeedResponseUsertags](x: Self) {
    
    inline def setIn(value: js.Array[SavedFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInVarargs(value: SavedFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
