package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseRichTextDescriptionItem extends js.Object {
  
  var block_type: String = js.native
  
  var depth: Double = js.native
  
  var text_with_entities: TopicalExploreFeedResponseTextWithEntities = js.native
}
object TopicalExploreFeedResponseRichTextDescriptionItem {
  
  @scala.inline
  def apply(block_type: String, depth: Double, text_with_entities: TopicalExploreFeedResponseTextWithEntities): TopicalExploreFeedResponseRichTextDescriptionItem = {
    val __obj = js.Dynamic.literal(block_type = block_type.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], text_with_entities = text_with_entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseRichTextDescriptionItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseRichTextDescriptionItemOps[Self <: TopicalExploreFeedResponseRichTextDescriptionItem] (val x: Self) extends AnyVal {
    
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
    def setBlock_type(value: String): Self = this.set("block_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_with_entities(value: TopicalExploreFeedResponseTextWithEntities): Self = this.set("text_with_entities", value.asInstanceOf[js.Any])
  }
}
