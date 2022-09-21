package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserDisplayInfo extends StObject {
  
  /**
    * The avatar to show for this user
    */
  var avatarUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name to show for this user
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserDisplayInfo {
  
  inline def apply(): SchemaUserDisplayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDisplayInfo]
  }
  
  extension [Self <: SchemaUserDisplayInfo](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarUrlNull: Self = StObject.set(x, "avatarUrl", null)
    
    inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
