package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseExploreItemInfo extends js.Object {
  
  var aspect_ratio: Double = js.native
  
  var autoplay: Boolean = js.native
  
  var num_columns: Double = js.native
  
  var total_num_columns: Double = js.native
}
object TopicalExploreFeedResponseExploreItemInfo {
  
  @scala.inline
  def apply(aspect_ratio: Double, autoplay: Boolean, num_columns: Double, total_num_columns: Double): TopicalExploreFeedResponseExploreItemInfo = {
    val __obj = js.Dynamic.literal(aspect_ratio = aspect_ratio.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], num_columns = num_columns.asInstanceOf[js.Any], total_num_columns = total_num_columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseExploreItemInfo]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseExploreItemInfoOps[Self <: TopicalExploreFeedResponseExploreItemInfo] (val x: Self) extends AnyVal {
    
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
    def setAspect_ratio(value: Double): Self = this.set("aspect_ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_columns(value: Double): Self = this.set("num_columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_num_columns(value: Double): Self = this.set("total_num_columns", value.asInstanceOf[js.Any])
  }
}
