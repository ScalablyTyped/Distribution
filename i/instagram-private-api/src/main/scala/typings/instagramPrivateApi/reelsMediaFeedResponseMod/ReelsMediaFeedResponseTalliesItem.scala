package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseTalliesItem extends StObject {
  
  var count: Double
  
  var font_size: js.UndefOr[Double] = js.undefined
  
  var text: String
}
object ReelsMediaFeedResponseTalliesItem {
  
  @scala.inline
  def apply(count: Double, text: String): ReelsMediaFeedResponseTalliesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseTalliesItem]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseTalliesItemMutableBuilder[Self <: ReelsMediaFeedResponseTalliesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_size(value: Double): Self = StObject.set(x, "font_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_sizeUndefined: Self = StObject.set(x, "font_size", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
