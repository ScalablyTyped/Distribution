package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Play Game Services Management API
  *
  * The Management API for Google Play Game Services.
  *
  * @example
  * const {google} = require('googleapis');
  * const gamesManagement = google.gamesManagement('v1management');
  *
  * @namespace gamesManagement
  * @type {Function}
  * @version v1management
  * @variation v1management
  * @param {object=} options Options for Gamesmanagement
  */
@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Gamesmanagement")
@js.native
class Gamesmanagement protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var achievements: ResourceAchievements = js.native
  
  var applications: ResourceApplications = js.native
  
  var context: APIRequestContext = js.native
  
  var events: ResourceEvents = js.native
  
  var players: ResourcePlayers = js.native
  
  var quests: ResourceQuests = js.native
  
  var rooms: ResourceRooms = js.native
  
  var scores: ResourceScores = js.native
  
  var turnBasedMatches: ResourceTurnbasedmatches = js.native
}
