package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an turn-based auto-match criteria object.
  */
trait SchemaTurnBasedAutoMatchingCriteria extends StObject {
  
  /**
    * A bitmask indicating when auto-matches are valid. When ANDed with other
    * exclusive bitmasks, the result must be zero. Can be used to support
    * exclusive roles within a game.
    */
  var exclusiveBitmask: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedAutoMatchingCriteria.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of players that should be added to the match by
    * auto-matching.
    */
  var maxAutoMatchingPlayers: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum number of players that should be added to the match by
    * auto-matching.
    */
  var minAutoMatchingPlayers: js.UndefOr[Double] = js.undefined
}
object SchemaTurnBasedAutoMatchingCriteria {
  
  inline def apply(): SchemaTurnBasedAutoMatchingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedAutoMatchingCriteria]
  }
  
  extension [Self <: SchemaTurnBasedAutoMatchingCriteria](x: Self) {
    
    inline def setExclusiveBitmask(value: String): Self = StObject.set(x, "exclusiveBitmask", value.asInstanceOf[js.Any])
    
    inline def setExclusiveBitmaskUndefined: Self = StObject.set(x, "exclusiveBitmask", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxAutoMatchingPlayers(value: Double): Self = StObject.set(x, "maxAutoMatchingPlayers", value.asInstanceOf[js.Any])
    
    inline def setMaxAutoMatchingPlayersUndefined: Self = StObject.set(x, "maxAutoMatchingPlayers", js.undefined)
    
    inline def setMinAutoMatchingPlayers(value: Double): Self = StObject.set(x, "minAutoMatchingPlayers", value.asInstanceOf[js.Any])
    
    inline def setMinAutoMatchingPlayersUndefined: Self = StObject.set(x, "minAutoMatchingPlayers", js.undefined)
  }
}
