package typings.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalIds extends js.Object {
  
  var errMsg: String = js.native
  
      // weixin album camera
  var localIds: js.Array[String] = js.native
  
  var sourceType: String = js.native
}
object LocalIds {
  
  @scala.inline
  def apply(errMsg: String, localIds: js.Array[String], sourceType: String): LocalIds = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], localIds = localIds.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalIds]
  }
  
  @scala.inline
  implicit class LocalIdsOps[Self <: LocalIds] (val x: Self) extends AnyVal {
    
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdsVarargs(value: String*): Self = this.set("localIds", js.Array(value :_*))
    
    @scala.inline
    def setLocalIds(value: js.Array[String]): Self = this.set("localIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: String): Self = this.set("sourceType", value.asInstanceOf[js.Any])
  }
}
