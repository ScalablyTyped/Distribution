package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseInlineStyleRangesItem extends StObject {
  
  var inline_style: Double
  
  var length: Double
  
  var offset: Double
}
object TopicalExploreFeedResponseInlineStyleRangesItem {
  
  inline def apply(inline_style: Double, length: Double, offset: Double): TopicalExploreFeedResponseInlineStyleRangesItem = {
    val __obj = js.Dynamic.literal(inline_style = inline_style.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseInlineStyleRangesItem]
  }
  
  extension [Self <: TopicalExploreFeedResponseInlineStyleRangesItem](x: Self) {
    
    inline def setInline_style(value: Double): Self = StObject.set(x, "inline_style", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
