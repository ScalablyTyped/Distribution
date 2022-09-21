package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Games")
@js.native
open class Games protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var achievementDefinitions: ResourceAchievementdefinitions = js.native
  
  var achievements: ResourceAchievements = js.native
  
  var applications: ResourceApplications = js.native
  
  var context: APIRequestContext = js.native
  
  var events: ResourceEvents = js.native
  
  var leaderboards: ResourceLeaderboards = js.native
  
  var metagame: ResourceMetagame = js.native
  
  var players: ResourcePlayers = js.native
  
  var revisions: ResourceRevisions = js.native
  
  var scores: ResourceScores = js.native
  
  var snapshots: ResourceSnapshots = js.native
  
  var stats: ResourceStats = js.native
}
