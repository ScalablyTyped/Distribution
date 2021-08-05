package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppContent extends StObject {
  
  var appContent: typings.knuddelsUserappsApi.mod.global.AppContent
  
  var user: User
}
object AppContent {
  
  inline def apply(appContent: typings.knuddelsUserappsApi.mod.global.AppContent, user: User): AppContent = {
    val __obj = js.Dynamic.literal(appContent = appContent.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppContent]
  }
  
  extension [Self <: AppContent](x: Self) {
    
    inline def setAppContent(value: typings.knuddelsUserappsApi.mod.global.AppContent): Self = StObject.set(x, "appContent", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
