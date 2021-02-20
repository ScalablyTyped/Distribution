package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsTrayFeedResponseTalliesItem extends StObject {
  
  var count: Double = js.native
  
  var font_size: js.UndefOr[Double] = js.native
  
  var text: String = js.native
}
object ReelsTrayFeedResponseTalliesItem {
  
  @scala.inline
  def apply(count: Double, text: String): ReelsTrayFeedResponseTalliesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseTalliesItem]
  }
  
  @scala.inline
  implicit class ReelsTrayFeedResponseTalliesItemMutableBuilder[Self <: ReelsTrayFeedResponseTalliesItem] (val x: Self) extends AnyVal {
    
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
