package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingV2beta1 {
  
  /**
    * Stackdriver Logging API
    *
    * Writes log entries and manages your Logging configuration.
    *
    * @example
    * const {google} = require('googleapis');
    * const logging = google.logging('v2beta1');
    *
    * @namespace logging
    * @type {Function}
    * @version v2beta1
    * @variation v2beta1
    * @param {object=} options Options for Logging
    */
  @JSImport("googleapis", "logging_v2beta1.Logging")
  @js.native
  class Logging protected ()
    extends typings.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "logging_v2beta1.Resource$Entries")
  @js.native
  class ResourceEntries protected ()
    extends typings.googleapis.loggingV2beta1Mod.loggingV2beta1.ResourceEntries {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2beta1.Resource$Monitoredresourcedescriptors")
  @js.native
  class ResourceMonitoredresourcedescriptors protected ()
    extends typings.googleapis.loggingV2beta1Mod.loggingV2beta1.ResourceMonitoredresourcedescriptors {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.loggingV2beta1Mod.loggingV2beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2beta1.Resource$Projects$Metrics")
  @js.native
  class ResourceProjectsMetrics protected ()
    extends typings.googleapis.loggingV2beta1Mod.loggingV2beta1.ResourceProjectsMetrics {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "logging_v2beta1.Resource$Projects$Sinks")
  @js.native
  class ResourceProjectsSinks protected ()
    extends typings.googleapis.loggingV2beta1Mod.loggingV2beta1.ResourceProjectsSinks {
    def this(context: APIRequestContext) = this()
  }
}
