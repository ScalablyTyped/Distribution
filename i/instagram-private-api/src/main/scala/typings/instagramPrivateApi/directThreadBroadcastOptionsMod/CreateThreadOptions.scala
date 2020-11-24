package typings.instagramPrivateApi.directThreadBroadcastOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateThreadOptions extends js.Object {
  
  var userIds: (js.Array[String | Double]) | String | Double = js.native
}
object CreateThreadOptions {
  
  @scala.inline
  def apply(userIds: (js.Array[String | Double]) | String | Double): CreateThreadOptions = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThreadOptions]
  }
  
  @scala.inline
  implicit class CreateThreadOptionsOps[Self <: CreateThreadOptions] (val x: Self) extends AnyVal {
    
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
    def setUserIdsVarargs(value: (String | Double)*): Self = this.set("userIds", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: (js.Array[String | Double]) | String | Double): Self = this.set("userIds", value.asInstanceOf[js.Any])
  }
}
