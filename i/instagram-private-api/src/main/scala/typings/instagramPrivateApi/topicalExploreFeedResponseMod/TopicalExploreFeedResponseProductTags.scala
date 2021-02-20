package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseProductTags extends StObject {
  
  var in: js.Array[TopicalExploreFeedResponseInItem] = js.native
}
object TopicalExploreFeedResponseProductTags {
  
  @scala.inline
  def apply(in: js.Array[TopicalExploreFeedResponseInItem]): TopicalExploreFeedResponseProductTags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseProductTags]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseProductTagsMutableBuilder[Self <: TopicalExploreFeedResponseProductTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: js.Array[TopicalExploreFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInVarargs(value: TopicalExploreFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
