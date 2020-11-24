package typings.instagramPrivateApi.storiesTypesMod

import typings.instagramPrivateApi.anon.PkNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryServiceSeenInputItems extends js.Object {
  
  var id: String = js.native
  
  var taken_at: Double = js.native
  
  var user: PkNumber = js.native
}
object StoryServiceSeenInputItems {
  
  @scala.inline
  def apply(id: String, taken_at: Double, user: PkNumber): StoryServiceSeenInputItems = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryServiceSeenInputItems]
  }
  
  @scala.inline
  implicit class StoryServiceSeenInputItemsOps[Self <: StoryServiceSeenInputItems] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = this.set("taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: PkNumber): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
