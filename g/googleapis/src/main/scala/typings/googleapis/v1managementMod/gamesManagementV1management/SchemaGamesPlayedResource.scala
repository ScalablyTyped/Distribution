package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for metadata about a player playing a game with the
  * currently authenticated user.
  */
@js.native
trait SchemaGamesPlayedResource extends StObject {
  
  /**
    * True if the player was auto-matched with the currently authenticated
    * user.
    */
  var autoMatched: js.UndefOr[Boolean] = js.native
  
  /**
    * The last time the player played the game in milliseconds since the epoch
    * in UTC.
    */
  var timeMillis: js.UndefOr[String] = js.native
}
object SchemaGamesPlayedResource {
  
  @scala.inline
  def apply(): SchemaGamesPlayedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesPlayedResource]
  }
  
  @scala.inline
  implicit class SchemaGamesPlayedResourceMutableBuilder[Self <: SchemaGamesPlayedResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMatched(value: Boolean): Self = StObject.set(x, "autoMatched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMatchedUndefined: Self = StObject.set(x, "autoMatched", js.undefined)
    
    @scala.inline
    def setTimeMillis(value: String): Self = StObject.set(x, "timeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMillisUndefined: Self = StObject.set(x, "timeMillis", js.undefined)
  }
}
