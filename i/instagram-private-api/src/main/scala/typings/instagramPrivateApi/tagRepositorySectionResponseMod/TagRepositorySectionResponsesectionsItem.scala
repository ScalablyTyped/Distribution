package typings.instagramPrivateApi.tagRepositorySectionResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagRepositorySectionResponsesectionsItem extends js.Object {
  
  var explore_item_info: js.Array[String] = js.native
  
  var feed_type: String = js.native
  
  var layout_content: js.Array[String] = js.native
  
  var layout_type: String = js.native
}
object TagRepositorySectionResponsesectionsItem {
  
  @scala.inline
  def apply(
    explore_item_info: js.Array[String],
    feed_type: String,
    layout_content: js.Array[String],
    layout_type: String
  ): TagRepositorySectionResponsesectionsItem = {
    val __obj = js.Dynamic.literal(explore_item_info = explore_item_info.asInstanceOf[js.Any], feed_type = feed_type.asInstanceOf[js.Any], layout_content = layout_content.asInstanceOf[js.Any], layout_type = layout_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRepositorySectionResponsesectionsItem]
  }
  
  @scala.inline
  implicit class TagRepositorySectionResponsesectionsItemOps[Self <: TagRepositorySectionResponsesectionsItem] (val x: Self) extends AnyVal {
    
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
    def setExplore_item_infoVarargs(value: String*): Self = this.set("explore_item_info", js.Array(value :_*))
    
    @scala.inline
    def setExplore_item_info(value: js.Array[String]): Self = this.set("explore_item_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeed_type(value: String): Self = this.set("feed_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout_contentVarargs(value: String*): Self = this.set("layout_content", js.Array(value :_*))
    
    @scala.inline
    def setLayout_content(value: js.Array[String]): Self = this.set("layout_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout_type(value: String): Self = this.set("layout_type", value.asInstanceOf[js.Any])
  }
}
