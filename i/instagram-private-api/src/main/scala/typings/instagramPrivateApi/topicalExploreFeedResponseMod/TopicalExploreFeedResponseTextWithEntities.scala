package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseTextWithEntities extends StObject {
  
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
  implicit class TopicalExploreFeedResponseTextWithEntitiesMutableBuilder[Self <: TopicalExploreFeedResponseTextWithEntities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInline_style_ranges(value: js.Array[TopicalExploreFeedResponseInlineStyleRangesItem]): Self = StObject.set(x, "inline_style_ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_style_rangesVarargs(value: TopicalExploreFeedResponseInlineStyleRangesItem*): Self = StObject.set(x, "inline_style_ranges", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
