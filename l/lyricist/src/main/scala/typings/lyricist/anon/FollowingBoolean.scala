package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowingBoolean extends js.Object {
  
  var following: Boolean = js.native
}
object FollowingBoolean {
  
  @scala.inline
  def apply(following: Boolean): FollowingBoolean = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowingBoolean]
  }
  
  @scala.inline
  implicit class FollowingBooleanOps[Self <: FollowingBoolean] (val x: Self) extends AnyVal {
    
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
    def setFollowing(value: Boolean): Self = this.set("following", value.asInstanceOf[js.Any])
  }
}
