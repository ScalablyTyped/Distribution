package typings.lyricist.mod

import typings.lyricist.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarConfig extends js.Object {
  
  var bounding_box: Height = js.native
  
  var url: String = js.native
}
object AvatarConfig {
  
  @scala.inline
  def apply(bounding_box: Height, url: String): AvatarConfig = {
    val __obj = js.Dynamic.literal(bounding_box = bounding_box.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarConfig]
  }
  
  @scala.inline
  implicit class AvatarConfigOps[Self <: AvatarConfig] (val x: Self) extends AnyVal {
    
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
    def setBounding_box(value: Height): Self = this.set("bounding_box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
