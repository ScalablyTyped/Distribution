package typings.lyricist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Author extends js.Object {
  
  var attribution: Double = js.native
  
  var pinned_role: js.UndefOr[js.Any] = js.native
  
  var user: User = js.native
}
object Author {
  
  @scala.inline
  def apply(attribution: Double, user: User): Author = {
    val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
    
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
    def setAttribution(value: Double): Self = this.set("attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned_role(value: js.Any): Self = this.set("pinned_role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned_role: Self = this.set("pinned_role", js.undefined)
  }
}
