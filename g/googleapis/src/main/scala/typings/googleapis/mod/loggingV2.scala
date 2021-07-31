package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingV2 {
  
  /**
    * Stackdriver Logging API
    *
    * Writes log entries and manages your Logging configuration.
    *
    * @example
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * @namespace logging
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Logging
    */
  @JSImport("googleapis", "logging_v2.Logging")
  @js.native
  class Logging protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.Logging {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Billingaccounts")
  @js.native
  class ResourceBillingaccounts protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceBillingaccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Billingaccounts$Exclusions")
  @js.native
  class ResourceBillingaccountsExclusions protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceBillingaccountsExclusions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Billingaccounts$Logs")
  @js.native
  class ResourceBillingaccountsLogs protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceBillingaccountsLogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Billingaccounts$Sinks")
  @js.native
  class ResourceBillingaccountsSinks protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceBillingaccountsSinks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Entries")
  @js.native
  class ResourceEntries protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceEntries {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Exclusions")
  @js.native
  class ResourceExclusions protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceExclusions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Folders")
  @js.native
  class ResourceFolders protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceFolders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Folders$Exclusions")
  @js.native
  class ResourceFoldersExclusions protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceFoldersExclusions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Folders$Logs")
  @js.native
  class ResourceFoldersLogs protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceFoldersLogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Folders$Sinks")
  @js.native
  class ResourceFoldersSinks protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceFoldersSinks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Logs")
  @js.native
  class ResourceLogs protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceLogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Monitoredresourcedescriptors")
  @js.native
  class ResourceMonitoredresourcedescriptors protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceMonitoredresourcedescriptors {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Organizations")
  @js.native
  class ResourceOrganizations protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceOrganizations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Organizations$Exclusions")
  @js.native
  class ResourceOrganizationsExclusions protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceOrganizationsExclusions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Organizations$Logs")
  @js.native
  class ResourceOrganizationsLogs protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceOrganizationsLogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Organizations$Sinks")
  @js.native
  class ResourceOrganizationsSinks protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceOrganizationsSinks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Projects$Exclusions")
  @js.native
  class ResourceProjectsExclusions protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceProjectsExclusions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Projects$Logs")
  @js.native
  class ResourceProjectsLogs protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceProjectsLogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Projects$Metrics")
  @js.native
  class ResourceProjectsMetrics protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceProjectsMetrics {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Projects$Sinks")
  @js.native
  class ResourceProjectsSinks protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceProjectsSinks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2.Resource$Sinks")
  @js.native
  class ResourceSinks protected ()
    extends typings.googleapis.loggingV2Mod.loggingV2.ResourceSinks {
    def this(context: APIRequestContext) = this()
  }
}
