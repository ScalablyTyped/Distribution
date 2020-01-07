package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "gamesManagement_v1management")
@js.native
object gamesManagement_v1management extends js.Object {
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
  @js.native
  class Gamesmanagement protected ()
    extends typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Gamesmanagement {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Achievements protected ()
    extends typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Resource$Achievements {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Applications protected ()
    extends typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Resource$Applications {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Events protected ()
    extends typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Resource$Events {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Players protected ()
    extends typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Resource$Players {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Quests protected ()
    extends typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Resource$Quests {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Rooms protected ()
    extends typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Resource$Rooms {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Scores protected ()
    extends typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Resource$Scores {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Turnbasedmatches protected ()
    extends typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Resource$Turnbasedmatches {
    def this(context: APIRequestContext) = this()
  }
  
}

