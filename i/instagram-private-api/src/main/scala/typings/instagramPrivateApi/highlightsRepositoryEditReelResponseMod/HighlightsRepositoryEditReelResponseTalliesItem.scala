package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseTalliesItem extends StObject {
  
  var count: Double = js.native
  
  var text: String = js.native
}
object HighlightsRepositoryEditReelResponseTalliesItem {
  
  @scala.inline
  def apply(count: Double, text: String): HighlightsRepositoryEditReelResponseTalliesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseTalliesItem]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseTalliesItemMutableBuilder[Self <: HighlightsRepositoryEditReelResponseTalliesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
