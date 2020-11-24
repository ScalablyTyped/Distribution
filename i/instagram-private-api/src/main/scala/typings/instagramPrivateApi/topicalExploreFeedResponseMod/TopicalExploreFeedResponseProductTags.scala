package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseProductTags extends js.Object {
  
  var in: js.Array[TopicalExploreFeedResponseInItem] = js.native
}
object TopicalExploreFeedResponseProductTags {
  
  @scala.inline
  def apply(in: js.Array[TopicalExploreFeedResponseInItem]): TopicalExploreFeedResponseProductTags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseProductTags]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseProductTagsOps[Self <: TopicalExploreFeedResponseProductTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInVarargs(value: TopicalExploreFeedResponseInItem*): Self = this.set("in", js.Array(value :_*))
    
    @scala.inline
    def setIn(value: js.Array[TopicalExploreFeedResponseInItem]): Self = this.set("in", value.asInstanceOf[js.Any])
  }
}
