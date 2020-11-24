package typings.instagramPrivateApi.mediaLikeOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedContextualLocation extends js.Object {
  
  var location_id: String | Double = js.native
  
  var module_name: feed_contextual_location = js.native
}
object FeedContextualLocation {
  
  @scala.inline
  def apply(location_id: String | Double, module_name: feed_contextual_location): FeedContextualLocation = {
    val __obj = js.Dynamic.literal(location_id = location_id.asInstanceOf[js.Any], module_name = module_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedContextualLocation]
  }
  
  @scala.inline
  implicit class FeedContextualLocationOps[Self <: FeedContextualLocation] (val x: Self) extends AnyVal {
    
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
    def setLocation_id(value: String | Double): Self = this.set("location_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule_name(value: feed_contextual_location): Self = this.set("module_name", value.asInstanceOf[js.Any])
  }
}
