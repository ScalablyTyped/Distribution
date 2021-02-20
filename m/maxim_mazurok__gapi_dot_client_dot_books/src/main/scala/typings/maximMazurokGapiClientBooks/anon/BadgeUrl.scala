package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadgeUrl extends StObject {
  
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
  implicit class BadgeUrlMutableBuilder[Self <: BadgeUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadgeUrl(value: String): Self = StObject.set(x, "badgeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUrlUndefined: Self = StObject.set(x, "badgeUrl", js.undefined)
    
    @scala.inline
    def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
