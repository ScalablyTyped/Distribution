package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceScoresReset
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the leaderboard.
    */
  var leaderboardId: js.UndefOr[String] = js.undefined
}
object ParamsResourceScoresReset {
  
  inline def apply(): ParamsResourceScoresReset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceScoresReset]
  }
  
  extension [Self <: ParamsResourceScoresReset](x: Self) {
    
    inline def setLeaderboardId(value: String): Self = StObject.set(x, "leaderboardId", value.asInstanceOf[js.Any])
    
    inline def setLeaderboardIdUndefined: Self = StObject.set(x, "leaderboardId", js.undefined)
  }
}
