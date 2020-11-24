package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoriesInsightsFeedResponseStories extends js.Object {
  
  var edges: js.Array[StoriesInsightsFeedResponseEdgesItem] = js.native
  
  var page_info: StoriesInsightsFeedResponsePageInfo = js.native
}
object StoriesInsightsFeedResponseStories {
  
  @scala.inline
  def apply(
    edges: js.Array[StoriesInsightsFeedResponseEdgesItem],
    page_info: StoriesInsightsFeedResponsePageInfo
  ): StoriesInsightsFeedResponseStories = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseStories]
  }
  
  @scala.inline
  implicit class StoriesInsightsFeedResponseStoriesOps[Self <: StoriesInsightsFeedResponseStories] (val x: Self) extends AnyVal {
    
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
    def setEdgesVarargs(value: StoriesInsightsFeedResponseEdgesItem*): Self = this.set("edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[StoriesInsightsFeedResponseEdgesItem]): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_info(value: StoriesInsightsFeedResponsePageInfo): Self = this.set("page_info", value.asInstanceOf[js.Any])
  }
}
