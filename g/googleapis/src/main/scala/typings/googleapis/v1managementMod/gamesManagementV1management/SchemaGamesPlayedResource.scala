package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for metadata about a player playing a game with the
  * currently authenticated user.
  */
trait SchemaGamesPlayedResource extends StObject {
  
  /**
    * True if the player was auto-matched with the currently authenticated
    * user.
    */
  var autoMatched: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The last time the player played the game in milliseconds since the epoch
    * in UTC.
    */
  var timeMillis: js.UndefOr[String] = js.undefined
}
object SchemaGamesPlayedResource {
  
  inline def apply(): SchemaGamesPlayedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesPlayedResource]
  }
  
  extension [Self <: SchemaGamesPlayedResource](x: Self) {
    
    inline def setAutoMatched(value: Boolean): Self = StObject.set(x, "autoMatched", value.asInstanceOf[js.Any])
    
    inline def setAutoMatchedUndefined: Self = StObject.set(x, "autoMatched", js.undefined)
    
    inline def setTimeMillis(value: String): Self = StObject.set(x, "timeMillis", value.asInstanceOf[js.Any])
    
    inline def setTimeMillisUndefined: Self = StObject.set(x, "timeMillis", js.undefined)
  }
}
