package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseCreativeConfig extends js.Object {
  
  var camera_facing: String = js.native
  
  var capture_type: String = js.native
  
  var should_render_try_it_on: Boolean = js.native
}
object HighlightsRepositoryEditReelResponseCreativeConfig {
  
  @scala.inline
  def apply(camera_facing: String, capture_type: String, should_render_try_it_on: Boolean): HighlightsRepositoryEditReelResponseCreativeConfig = {
    val __obj = js.Dynamic.literal(camera_facing = camera_facing.asInstanceOf[js.Any], capture_type = capture_type.asInstanceOf[js.Any], should_render_try_it_on = should_render_try_it_on.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseCreativeConfig]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseCreativeConfigOps[Self <: HighlightsRepositoryEditReelResponseCreativeConfig] (val x: Self) extends AnyVal {
    
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
    def setCamera_facing(value: String): Self = this.set("camera_facing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture_type(value: String): Self = this.set("capture_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShould_render_try_it_on(value: Boolean): Self = this.set("should_render_try_it_on", value.asInstanceOf[js.Any])
  }
}
