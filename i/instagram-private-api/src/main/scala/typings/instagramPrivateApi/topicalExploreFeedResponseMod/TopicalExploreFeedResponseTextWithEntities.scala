package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseTextWithEntities extends js.Object {
  
  var inline_style_ranges: js.Array[TopicalExploreFeedResponseInlineStyleRangesItem] = js.native
  
  var text: String = js.native
}
object TopicalExploreFeedResponseTextWithEntities {
  
  @scala.inline
  def apply(inline_style_ranges: js.Array[TopicalExploreFeedResponseInlineStyleRangesItem], text: String): TopicalExploreFeedResponseTextWithEntities = {
    val __obj = js.Dynamic.literal(inline_style_ranges = inline_style_ranges.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseTextWithEntities]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseTextWithEntitiesOps[Self <: TopicalExploreFeedResponseTextWithEntities] (val x: Self) extends AnyVal {
    
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
    def setInline_style_rangesVarargs(value: TopicalExploreFeedResponseInlineStyleRangesItem*): Self = this.set("inline_style_ranges", js.Array(value :_*))
    
    @scala.inline
    def setInline_style_ranges(value: js.Array[TopicalExploreFeedResponseInlineStyleRangesItem]): Self = this.set("inline_style_ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
