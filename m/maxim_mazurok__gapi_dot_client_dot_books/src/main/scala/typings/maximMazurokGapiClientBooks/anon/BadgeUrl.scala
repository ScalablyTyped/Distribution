package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadgeUrl extends js.Object {
  
  var badgeUrl: js.UndefOr[String] = js.native
  
  var categoryId: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object BadgeUrl {
  
  @scala.inline
  def apply(): BadgeUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeUrl]
  }
  
  @scala.inline
  implicit class BadgeUrlOps[Self <: BadgeUrl] (val x: Self) extends AnyVal {
    
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
    def setBadgeUrl(value: String): Self = this.set("badgeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeUrl: Self = this.set("badgeUrl", js.undefined)
    
    @scala.inline
    def setCategoryId(value: String): Self = this.set("categoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryId: Self = this.set("categoryId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
