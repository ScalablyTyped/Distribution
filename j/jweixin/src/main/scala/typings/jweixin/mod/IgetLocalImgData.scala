package typings.jweixin.mod

import typings.jweixin.anon.LocalData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgetLocalImgData extends BaseParams {
  
  var localId: String = js.native
  
   // 图片的localID
  // localData是图片的base64数据，可以用img标签显示
  @JSName("success")
  def success_MIgetLocalImgData(res: LocalData): Unit = js.native
}
object IgetLocalImgData {
  
  @scala.inline
  def apply(localId: String, success: LocalData => Unit): IgetLocalImgData = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IgetLocalImgData]
  }
  
  @scala.inline
  implicit class IgetLocalImgDataOps[Self <: IgetLocalImgData] (val x: Self) extends AnyVal {
    
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
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: LocalData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
