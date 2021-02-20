package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsFeedResponseUsertags extends StObject {
  
  var in: js.Array[TagsFeedResponseInItem] = js.native
}
object TagsFeedResponseUsertags {
  
  @scala.inline
  def apply(in: js.Array[TagsFeedResponseInItem]): TagsFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseUsertags]
  }
  
  @scala.inline
  implicit class TagsFeedResponseUsertagsMutableBuilder[Self <: TagsFeedResponseUsertags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: js.Array[TagsFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInVarargs(value: TagsFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
