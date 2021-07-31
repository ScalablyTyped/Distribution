package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseUsertags extends StObject {
  
  var in: js.Array[LocationFeedResponseInItem]
}
object LocationFeedResponseUsertags {
  
  @scala.inline
  def apply(in: js.Array[LocationFeedResponseInItem]): LocationFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseUsertags]
  }
  
  @scala.inline
  implicit class LocationFeedResponseUsertagsMutableBuilder[Self <: LocationFeedResponseUsertags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: js.Array[LocationFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInVarargs(value: LocationFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
