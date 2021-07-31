package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsV24 {
  
  /**
    * Google Analytics API
    *
    * Views and manages your Google Analytics data.
    *
    * @example
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v2.4');
    *
    * @namespace analytics
    * @type {Function}
    * @version v2.4
    * @variation v2.4
    * @param {object=} options Options for Analytics
    */
  @JSImport("googleapis", "analytics_v2_4.Analytics")
  @js.native
  class Analytics protected ()
    extends typings.googleapis.v24Mod.analyticsV24.Analytics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "analytics_v2_4.Resource$Data")
  @js.native
  class ResourceData protected ()
    extends typings.googleapis.v24Mod.analyticsV24.ResourceData {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "analytics_v2_4.Resource$Management")
  @js.native
  class ResourceManagement protected ()
    extends typings.googleapis.v24Mod.analyticsV24.ResourceManagement {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "analytics_v2_4.Resource$Management$Accounts")
  @js.native
  class ResourceManagementAccounts protected ()
    extends typings.googleapis.v24Mod.analyticsV24.ResourceManagementAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "analytics_v2_4.Resource$Management$Goals")
  @js.native
  class ResourceManagementGoals protected ()
    extends typings.googleapis.v24Mod.analyticsV24.ResourceManagementGoals {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "analytics_v2_4.Resource$Management$Profiles")
  @js.native
  class ResourceManagementProfiles protected ()
    extends typings.googleapis.v24Mod.analyticsV24.ResourceManagementProfiles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "analytics_v2_4.Resource$Management$Segments")
  @js.native
  class ResourceManagementSegments protected ()
    extends typings.googleapis.v24Mod.analyticsV24.ResourceManagementSegments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "analytics_v2_4.Resource$Management$Webproperties")
  @js.native
  class ResourceManagementWebproperties protected ()
    extends typings.googleapis.v24Mod.analyticsV24.ResourceManagementWebproperties {
    def this(context: APIRequestContext) = this()
  }
}
