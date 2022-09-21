package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDisplayInfo extends StObject {
  
  /** The avatar to show for this user */
  var avatarUrl: js.UndefOr[String] = js.undefined
  
  /** The name to show for this user */
  var displayName: js.UndefOr[String] = js.undefined
}
object UserDisplayInfo {
  
  inline def apply(): UserDisplayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDisplayInfo]
  }
  
  extension [Self <: UserDisplayInfo](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
