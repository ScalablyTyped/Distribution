package typings.intercomClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppApiKey extends StObject {
  
  var appApiKey: String = js.native
  
  var appId: String = js.native
}
object AppApiKey {
  
  @scala.inline
  def apply(appApiKey: String, appId: String): AppApiKey = {
    val __obj = js.Dynamic.literal(appApiKey = appApiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppApiKey]
  }
  
  @scala.inline
  implicit class AppApiKeyMutableBuilder[Self <: AppApiKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppApiKey(value: String): Self = StObject.set(x, "appApiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
  }
}
