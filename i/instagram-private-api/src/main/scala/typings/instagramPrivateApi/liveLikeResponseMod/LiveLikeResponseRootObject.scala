package typings.instagramPrivateApi.liveLikeResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveLikeResponseRootObject extends js.Object {
  
  var burst_likes: Double = js.native
  
  var likes: Double = js.native
  
  var status: String = js.native
}
object LiveLikeResponseRootObject {
  
  @scala.inline
  def apply(burst_likes: Double, likes: Double, status: String): LiveLikeResponseRootObject = {
    val __obj = js.Dynamic.literal(burst_likes = burst_likes.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveLikeResponseRootObject]
  }
  
  @scala.inline
  implicit class LiveLikeResponseRootObjectOps[Self <: LiveLikeResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setBurst_likes(value: Double): Self = this.set("burst_likes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikes(value: Double): Self = this.set("likes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
