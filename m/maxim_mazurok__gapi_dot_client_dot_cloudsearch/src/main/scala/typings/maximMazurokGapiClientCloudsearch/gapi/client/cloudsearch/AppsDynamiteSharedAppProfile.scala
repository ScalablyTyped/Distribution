package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedAppProfile extends StObject {
  
  /** Displayed user avatar emoji. */
  var avatarEmoji: js.UndefOr[String] = js.undefined
  
  /** Displayed user avatar url. */
  var avatarUrl: js.UndefOr[String] = js.undefined
  
  /** Displayed user name. */
  var name: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedAppProfile {
  
  inline def apply(): AppsDynamiteSharedAppProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedAppProfile]
  }
  
  extension [Self <: AppsDynamiteSharedAppProfile](x: Self) {
    
    inline def setAvatarEmoji(value: String): Self = StObject.set(x, "avatarEmoji", value.asInstanceOf[js.Any])
    
    inline def setAvatarEmojiUndefined: Self = StObject.set(x, "avatarEmoji", js.undefined)
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
