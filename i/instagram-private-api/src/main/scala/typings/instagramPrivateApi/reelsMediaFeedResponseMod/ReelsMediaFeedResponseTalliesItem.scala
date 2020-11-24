package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseTalliesItem extends js.Object {
  
  var count: Double = js.native
  
  var font_size: js.UndefOr[Double] = js.native
  
  var text: String = js.native
}
object ReelsMediaFeedResponseTalliesItem {
  
  @scala.inline
  def apply(count: Double, text: String): ReelsMediaFeedResponseTalliesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseTalliesItem]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseTalliesItemOps[Self <: ReelsMediaFeedResponseTalliesItem] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_size(value: Double): Self = this.set("font_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont_size: Self = this.set("font_size", js.undefined)
  }
}
