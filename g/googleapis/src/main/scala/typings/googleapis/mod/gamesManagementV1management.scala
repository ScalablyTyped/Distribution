package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamesManagementV1management {
  
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
  @JSImport("googleapis", "gamesManagement_v1management.Gamesmanagement")
  @js.native
  class Gamesmanagement protected ()
    extends typings.googleapis.v1managementMod.gamesManagementV1management.Gamesmanagement {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "gamesManagement_v1management.Resource$Achievements")
  @js.native
  class ResourceAchievements protected ()
    extends typings.googleapis.v1managementMod.gamesManagementV1management.ResourceAchievements {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gamesManagement_v1management.Resource$Applications")
  @js.native
  class ResourceApplications protected ()
    extends typings.googleapis.v1managementMod.gamesManagementV1management.ResourceApplications {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gamesManagement_v1management.Resource$Events")
  @js.native
  class ResourceEvents protected ()
    extends typings.googleapis.v1managementMod.gamesManagementV1management.ResourceEvents {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gamesManagement_v1management.Resource$Players")
  @js.native
  class ResourcePlayers protected ()
    extends typings.googleapis.v1managementMod.gamesManagementV1management.ResourcePlayers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gamesManagement_v1management.Resource$Quests")
  @js.native
  class ResourceQuests protected ()
    extends typings.googleapis.v1managementMod.gamesManagementV1management.ResourceQuests {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gamesManagement_v1management.Resource$Rooms")
  @js.native
  class ResourceRooms protected ()
    extends typings.googleapis.v1managementMod.gamesManagementV1management.ResourceRooms {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gamesManagement_v1management.Resource$Scores")
  @js.native
  class ResourceScores protected ()
    extends typings.googleapis.v1managementMod.gamesManagementV1management.ResourceScores {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gamesManagement_v1management.Resource$Turnbasedmatches")
  @js.native
  class ResourceTurnbasedmatches protected ()
    extends typings.googleapis.v1managementMod.gamesManagementV1management.ResourceTurnbasedmatches {
    def this(context: APIRequestContext) = this()
  }
}
