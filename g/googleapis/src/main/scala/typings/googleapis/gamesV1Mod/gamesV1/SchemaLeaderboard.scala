package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the Leaderboard resource.
  */
@js.native
trait SchemaLeaderboard extends StObject {
  
  /**
    * The icon for the leaderboard.
    */
  var iconUrl: js.UndefOr[String] = js.native
  
  /**
    * The leaderboard ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the icon image being returned is a default image, or is
    * game-provided.
    */
  var isIconUrlDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#leaderboard.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of the leaderboard.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * How scores are ordered. Possible values are:   -
    * &quot;LARGER_IS_BETTER&quot; - Larger values are better; scores are
    * sorted in descending order.  - &quot;SMALLER_IS_BETTER&quot; - Smaller
    * values are better; scores are sorted in ascending order.
    */
  var order: js.UndefOr[String] = js.native
}
object SchemaLeaderboard {
  
  @scala.inline
  def apply(): SchemaLeaderboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboard]
  }
  
  @scala.inline
  implicit class SchemaLeaderboardMutableBuilder[Self <: SchemaLeaderboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsIconUrlDefault(value: Boolean): Self = StObject.set(x, "isIconUrlDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIconUrlDefaultUndefined: Self = StObject.set(x, "isIconUrlDefault", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
