package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProfileSettings extends StObject {
  
  var friendsListVisibility: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#profileSettings`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the player's profile is visible to the currently signed in player.
    */
  var profileVisible: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaProfileSettings {
  
  inline def apply(): SchemaProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileSettings]
  }
  
  extension [Self <: SchemaProfileSettings](x: Self) {
    
    inline def setFriendsListVisibility(value: String): Self = StObject.set(x, "friendsListVisibility", value.asInstanceOf[js.Any])
    
    inline def setFriendsListVisibilityNull: Self = StObject.set(x, "friendsListVisibility", null)
    
    inline def setFriendsListVisibilityUndefined: Self = StObject.set(x, "friendsListVisibility", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfileVisible(value: Boolean): Self = StObject.set(x, "profileVisible", value.asInstanceOf[js.Any])
    
    inline def setProfileVisibleNull: Self = StObject.set(x, "profileVisible", null)
    
    inline def setProfileVisibleUndefined: Self = StObject.set(x, "profileVisible", js.undefined)
  }
}
