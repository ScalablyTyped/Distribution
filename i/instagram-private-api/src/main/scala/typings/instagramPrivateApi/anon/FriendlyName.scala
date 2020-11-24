package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.graphqlRequestOptionsMod.InsightsFriendlyName
import typings.instagramPrivateApi.graphqlRequestOptionsMod.InsightsSurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FriendlyName extends js.Object {
  
  var friendlyName: InsightsFriendlyName = js.native
  
  var name: js.UndefOr[InsightsSurface] = js.native
}
object FriendlyName {
  
  @scala.inline
  def apply(friendlyName: InsightsFriendlyName): FriendlyName = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FriendlyName]
  }
  
  @scala.inline
  implicit class FriendlyNameOps[Self <: FriendlyName] (val x: Self) extends AnyVal {
    
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
    def setFriendlyName(value: InsightsFriendlyName): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: InsightsSurface): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
