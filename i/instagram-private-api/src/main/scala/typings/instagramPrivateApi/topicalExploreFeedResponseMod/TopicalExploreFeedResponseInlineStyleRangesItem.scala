package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseInlineStyleRangesItem extends StObject {
  
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
  implicit class TopicalExploreFeedResponseInlineStyleRangesItemMutableBuilder[Self <: TopicalExploreFeedResponseInlineStyleRangesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInline_style(value: Double): Self = StObject.set(x, "inline_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
