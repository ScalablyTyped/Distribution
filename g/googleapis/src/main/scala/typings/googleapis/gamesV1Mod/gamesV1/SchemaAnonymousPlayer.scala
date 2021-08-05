package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an anonymous player
  */
trait SchemaAnonymousPlayer extends StObject {
  
  /**
    * The base URL for the image to display for the anonymous player.
    */
  var avatarImageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The name to display for the anonymous player.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#anonymousPlayer.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAnonymousPlayer {
  
  inline def apply(): SchemaAnonymousPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnonymousPlayer]
  }
  
  extension [Self <: SchemaAnonymousPlayer](x: Self) {
    
    inline def setAvatarImageUrl(value: String): Self = StObject.set(x, "avatarImageUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarImageUrlUndefined: Self = StObject.set(x, "avatarImageUrl", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
