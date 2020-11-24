package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
import typings.jwplayer.jwplayerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstFrameParam extends js.Object {
  
  var loadTime: Double = js.native
  
  var viewable: `0` | `1` = js.native
}
object FirstFrameParam {
  
  @scala.inline
  def apply(loadTime: Double, viewable: `0` | `1`): FirstFrameParam = {
    val __obj = js.Dynamic.literal(loadTime = loadTime.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstFrameParam]
  }
  
  @scala.inline
  implicit class FirstFrameParamOps[Self <: FirstFrameParam] (val x: Self) extends AnyVal {
    
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
    def setLoadTime(value: Double): Self = this.set("loadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewable(value: `0` | `1`): Self = this.set("viewable", value.asInstanceOf[js.Any])
  }
}
