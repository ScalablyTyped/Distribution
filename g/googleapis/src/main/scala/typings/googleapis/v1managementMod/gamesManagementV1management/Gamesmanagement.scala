package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Gamesmanagement")
@js.native
open class Gamesmanagement protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var achievements: ResourceAchievements = js.native
  
  var applications: ResourceApplications = js.native
  
  var context: APIRequestContext = js.native
  
  var events: ResourceEvents = js.native
  
  var players: ResourcePlayers = js.native
  
  var scores: ResourceScores = js.native
}
