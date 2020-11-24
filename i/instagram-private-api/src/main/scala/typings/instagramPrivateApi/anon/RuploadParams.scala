package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuploadParams extends js.Object {
  
  var name: js.Any = js.native
  
  var ruploadParams: js.Any = js.native
  
  var waterfallId: js.Any = js.native
}
object RuploadParams {
  
  @scala.inline
  def apply(name: js.Any, ruploadParams: js.Any, waterfallId: js.Any): RuploadParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ruploadParams = ruploadParams.asInstanceOf[js.Any], waterfallId = waterfallId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuploadParams]
  }
  
  @scala.inline
  implicit class RuploadParamsOps[Self <: RuploadParams] (val x: Self) extends AnyVal {
    
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
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuploadParams(value: js.Any): Self = this.set("ruploadParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterfallId(value: js.Any): Self = this.set("waterfallId", value.asInstanceOf[js.Any])
  }
}
