package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseLayoutContent extends js.Object {
  
  var fill_items: js.UndefOr[js.Array[TopicalExploreFeedResponseFillItemsItem]] = js.native
  
  var medias: js.UndefOr[js.Array[TopicalExploreFeedResponseMediasItem]] = js.native
  
  var two_by_two_item: js.UndefOr[TopicalExploreFeedResponseTwoByTwoItem] = js.native
}
object TopicalExploreFeedResponseLayoutContent {
  
  @scala.inline
  def apply(): TopicalExploreFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicalExploreFeedResponseLayoutContent]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseLayoutContentOps[Self <: TopicalExploreFeedResponseLayoutContent] (val x: Self) extends AnyVal {
    
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
    def setFill_itemsVarargs(value: TopicalExploreFeedResponseFillItemsItem*): Self = this.set("fill_items", js.Array(value :_*))
    
    @scala.inline
    def setFill_items(value: js.Array[TopicalExploreFeedResponseFillItemsItem]): Self = this.set("fill_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill_items: Self = this.set("fill_items", js.undefined)
    
    @scala.inline
    def setMediasVarargs(value: TopicalExploreFeedResponseMediasItem*): Self = this.set("medias", js.Array(value :_*))
    
    @scala.inline
    def setMedias(value: js.Array[TopicalExploreFeedResponseMediasItem]): Self = this.set("medias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedias: Self = this.set("medias", js.undefined)
    
    @scala.inline
    def setTwo_by_two_item(value: TopicalExploreFeedResponseTwoByTwoItem): Self = this.set("two_by_two_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwo_by_two_item: Self = this.set("two_by_two_item", js.undefined)
  }
}
