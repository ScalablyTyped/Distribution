package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a room auto-match criteria object.
  */
@js.native
trait SchemaRoomAutoMatchingCriteria extends StObject {
  
  /**
    * A bitmask indicating when auto-matches are valid. When ANDed with other
    * exclusive bitmasks, the result must be zero. Can be used to support
    * exclusive roles within a game.
    */
  var exclusiveBitmask: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomAutoMatchingCriteria.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of players that should be added to the room by
    * auto-matching.
    */
  var maxAutoMatchingPlayers: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number of players that should be added to the room by
    * auto-matching.
    */
  var minAutoMatchingPlayers: js.UndefOr[Double] = js.native
}
object SchemaRoomAutoMatchingCriteria {
  
  @scala.inline
  def apply(): SchemaRoomAutoMatchingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomAutoMatchingCriteria]
  }
  
  @scala.inline
  implicit class SchemaRoomAutoMatchingCriteriaMutableBuilder[Self <: SchemaRoomAutoMatchingCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusiveBitmask(value: String): Self = StObject.set(x, "exclusiveBitmask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveBitmaskUndefined: Self = StObject.set(x, "exclusiveBitmask", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMaxAutoMatchingPlayers(value: Double): Self = StObject.set(x, "maxAutoMatchingPlayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAutoMatchingPlayersUndefined: Self = StObject.set(x, "maxAutoMatchingPlayers", js.undefined)
    
    @scala.inline
    def setMinAutoMatchingPlayers(value: Double): Self = StObject.set(x, "minAutoMatchingPlayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAutoMatchingPlayersUndefined: Self = StObject.set(x, "minAutoMatchingPlayers", js.undefined)
  }
}
