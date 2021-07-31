package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseUsertags extends StObject {
  
  var in: js.Array[TopicalExploreFeedResponseInItem]
}
object TopicalExploreFeedResponseUsertags {
  
  @scala.inline
  def apply(in: js.Array[TopicalExploreFeedResponseInItem]): TopicalExploreFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseUsertags]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseUsertagsMutableBuilder[Self <: TopicalExploreFeedResponseUsertags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: js.Array[TopicalExploreFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInVarargs(value: TopicalExploreFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
