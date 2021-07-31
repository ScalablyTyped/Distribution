package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monitoringV3 {
  
  /**
    * Stackdriver Monitoring API
    *
    * Manages your Stackdriver Monitoring data and configurations. Most projects
    * must be associated with a Stackdriver account, with a few exceptions as
    * noted on the individual method pages.
    *
    * @example
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * @namespace monitoring
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Monitoring
    */
  @JSImport("googleapis", "monitoring_v3.Monitoring")
  @js.native
  class Monitoring protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.Monitoring {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects$Alertpolicies")
  @js.native
  class ResourceProjectsAlertpolicies protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjectsAlertpolicies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects$Collectdtimeseries")
  @js.native
  class ResourceProjectsCollectdtimeseries protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjectsCollectdtimeseries {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects$Groups")
  @js.native
  class ResourceProjectsGroups protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjectsGroups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects$Groups$Members")
  @js.native
  class ResourceProjectsGroupsMembers protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjectsGroupsMembers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects$Metricdescriptors")
  @js.native
  class ResourceProjectsMetricdescriptors protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjectsMetricdescriptors {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects$Monitoredresourcedescriptors")
  @js.native
  class ResourceProjectsMonitoredresourcedescriptors protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjectsMonitoredresourcedescriptors {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects$Notificationchanneldescriptors")
  @js.native
  class ResourceProjectsNotificationchanneldescriptors protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjectsNotificationchanneldescriptors {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects$Notificationchannels")
  @js.native
  class ResourceProjectsNotificationchannels protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjectsNotificationchannels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects$Timeseries")
  @js.native
  class ResourceProjectsTimeseries protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjectsTimeseries {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Projects$Uptimecheckconfigs")
  @js.native
  class ResourceProjectsUptimecheckconfigs protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceProjectsUptimecheckconfigs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "monitoring_v3.Resource$Uptimecheckips")
  @js.native
  class ResourceUptimecheckips protected ()
    extends typings.googleapis.monitoringV3Mod.monitoringV3.ResourceUptimecheckips {
    def this(context: APIRequestContext) = this()
  }
}
