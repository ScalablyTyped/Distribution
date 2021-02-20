package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppContent extends StObject {
  
  var appContent: typings.knuddelsUserappsApi.mod.global.AppContent = js.native
  
  var user: User = js.native
}
object AppContent {
  
  @scala.inline
  def apply(appContent: typings.knuddelsUserappsApi.mod.global.AppContent, user: User): AppContent = {
    val __obj = js.Dynamic.literal(appContent = appContent.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppContent]
  }
  
  @scala.inline
  implicit class AppContentMutableBuilder[Self <: AppContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppContent(value: typings.knuddelsUserappsApi.mod.global.AppContent): Self = StObject.set(x, "appContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
