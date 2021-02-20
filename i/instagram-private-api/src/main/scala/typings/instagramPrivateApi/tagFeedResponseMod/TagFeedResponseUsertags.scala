package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponseUsertags extends StObject {
  
  var in: js.Array[TagFeedResponseInItem] = js.native
}
object TagFeedResponseUsertags {
  
  @scala.inline
  def apply(in: js.Array[TagFeedResponseInItem]): TagFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseUsertags]
  }
  
  @scala.inline
  implicit class TagFeedResponseUsertagsMutableBuilder[Self <: TagFeedResponseUsertags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: js.Array[TagFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInVarargs(value: TagFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
