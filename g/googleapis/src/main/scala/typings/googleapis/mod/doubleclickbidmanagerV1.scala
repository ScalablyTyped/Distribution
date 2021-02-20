package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doubleclickbidmanagerV1 {
  
  /**
    * DoubleClick Bid Manager API
    *
    * API for viewing and managing your reports in DoubleClick Bid Manager.
    *
    * @example
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v1');
    *
    * @namespace doubleclickbidmanager
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Doubleclickbidmanager
    */
  @JSImport("googleapis", "doubleclickbidmanager_v1.Doubleclickbidmanager")
  @js.native
  class Doubleclickbidmanager protected ()
    extends typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1.Doubleclickbidmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "doubleclickbidmanager_v1.Resource$Lineitems")
  @js.native
  class ResourceLineitems protected ()
    extends typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1.ResourceLineitems {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "doubleclickbidmanager_v1.Resource$Queries")
  @js.native
  class ResourceQueries protected ()
    extends typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1.ResourceQueries {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "doubleclickbidmanager_v1.Resource$Reports")
  @js.native
  class ResourceReports protected ()
    extends typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1.ResourceReports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "doubleclickbidmanager_v1.Resource$Sdf")
  @js.native
  class ResourceSdf protected ()
    extends typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1.ResourceSdf {
    def this(context: APIRequestContext) = this()
  }
}
