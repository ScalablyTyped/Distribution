package typings.intercomClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppApiKey extends StObject {
  
  var appApiKey: String
  
  var appId: String
}
object AppApiKey {
  
  inline def apply(appApiKey: String, appId: String): AppApiKey = {
    val __obj = js.Dynamic.literal(appApiKey = appApiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppApiKey]
  }
  
  extension [Self <: AppApiKey](x: Self) {
    
    inline def setAppApiKey(value: String): Self = StObject.set(x, "appApiKey", value.asInstanceOf[js.Any])
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
  }
}
