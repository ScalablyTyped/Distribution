package typings.growingIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GIOConfigOptions extends js.Object {
  
  /** 是否采集数据 */
  var dataCollect: js.UndefOr[Boolean] = js.native
  
  /** 是否检测hash变化 */
  var hashtag: js.UndefOr[Boolean] = js.native
}
object GIOConfigOptions {
  
  @scala.inline
  def apply(): GIOConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GIOConfigOptions]
  }
  
  @scala.inline
  implicit class GIOConfigOptionsOps[Self <: GIOConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setDataCollect(value: Boolean): Self = this.set("dataCollect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCollect: Self = this.set("dataCollect", js.undefined)
    
    @scala.inline
    def setHashtag(value: Boolean): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
  }
}
