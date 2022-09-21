package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLeaderboard extends StObject {
  
  /**
    * The icon for the leaderboard.
    */
  var iconUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The leaderboard ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether the icon image being returned is a default image, or is game-provided.
    */
  var isIconUrlDefault: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#leaderboard`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the leaderboard.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How scores are ordered.
    */
  var order: js.UndefOr[String | Null] = js.undefined
}
object SchemaLeaderboard {
  
  inline def apply(): SchemaLeaderboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboard]
  }
  
  extension [Self <: SchemaLeaderboard](x: Self) {
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsIconUrlDefault(value: Boolean): Self = StObject.set(x, "isIconUrlDefault", value.asInstanceOf[js.Any])
    
    inline def setIsIconUrlDefaultNull: Self = StObject.set(x, "isIconUrlDefault", null)
    
    inline def setIsIconUrlDefaultUndefined: Self = StObject.set(x, "isIconUrlDefault", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
