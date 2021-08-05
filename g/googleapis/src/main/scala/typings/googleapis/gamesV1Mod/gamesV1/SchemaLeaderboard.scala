package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the Leaderboard resource.
  */
trait SchemaLeaderboard extends StObject {
  
  /**
    * The icon for the leaderboard.
    */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The leaderboard ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the icon image being returned is a default image, or is
    * game-provided.
    */
  var isIconUrlDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#leaderboard.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the leaderboard.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * How scores are ordered. Possible values are:   -
    * &quot;LARGER_IS_BETTER&quot; - Larger values are better; scores are
    * sorted in descending order.  - &quot;SMALLER_IS_BETTER&quot; - Smaller
    * values are better; scores are sorted in ascending order.
    */
  var order: js.UndefOr[String] = js.undefined
}
object SchemaLeaderboard {
  
  inline def apply(): SchemaLeaderboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboard]
  }
  
  extension [Self <: SchemaLeaderboard](x: Self) {
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsIconUrlDefault(value: Boolean): Self = StObject.set(x, "isIconUrlDefault", value.asInstanceOf[js.Any])
    
    inline def setIsIconUrlDefaultUndefined: Self = StObject.set(x, "isIconUrlDefault", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
