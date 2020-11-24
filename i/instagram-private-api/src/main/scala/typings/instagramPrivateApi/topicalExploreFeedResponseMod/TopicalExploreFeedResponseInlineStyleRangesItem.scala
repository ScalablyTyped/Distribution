package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseInlineStyleRangesItem extends js.Object {
  
  var inline_style: Double = js.native
  
  var length: Double = js.native
  
  var offset: Double = js.native
}
object TopicalExploreFeedResponseInlineStyleRangesItem {
  
  @scala.inline
  def apply(inline_style: Double, length: Double, offset: Double): TopicalExploreFeedResponseInlineStyleRangesItem = {
    val __obj = js.Dynamic.literal(inline_style = inline_style.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseInlineStyleRangesItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseInlineStyleRangesItemOps[Self <: TopicalExploreFeedResponseInlineStyleRangesItem] (val x: Self) extends AnyVal {
    
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
    def setInline_style(value: Double): Self = this.set("inline_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
}
