package typings.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryCreateReelResponseRootObject extends js.Object {
  
  var reel: HighlightsRepositoryCreateReelResponseReel = js.native
  
  var status: String = js.native
}
object HighlightsRepositoryCreateReelResponseRootObject {
  
  @scala.inline
  def apply(reel: HighlightsRepositoryCreateReelResponseReel, status: String): HighlightsRepositoryCreateReelResponseRootObject = {
    val __obj = js.Dynamic.literal(reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseRootObject]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryCreateReelResponseRootObjectOps[Self <: HighlightsRepositoryCreateReelResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setReel(value: HighlightsRepositoryCreateReelResponseReel): Self = this.set("reel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
