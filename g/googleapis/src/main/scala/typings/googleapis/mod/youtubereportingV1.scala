package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubereportingV1 {
  
  @JSImport("googleapis", "youtubereporting_v1.Resource$Jobs")
  @js.native
  class ResourceJobs protected ()
    extends typings.googleapis.youtubereportingV1Mod.youtubereportingV1.ResourceJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "youtubereporting_v1.Resource$Jobs$Reports")
  @js.native
  class ResourceJobsReports protected ()
    extends typings.googleapis.youtubereportingV1Mod.youtubereportingV1.ResourceJobsReports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "youtubereporting_v1.Resource$Media")
  @js.native
  class ResourceMedia protected ()
    extends typings.googleapis.youtubereportingV1Mod.youtubereportingV1.ResourceMedia {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "youtubereporting_v1.Resource$Reporttypes")
  @js.native
  class ResourceReporttypes protected ()
    extends typings.googleapis.youtubereportingV1Mod.youtubereportingV1.ResourceReporttypes {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * YouTube Reporting API
    *
    * Schedules reporting jobs containing your YouTube Analytics data and
    * downloads the resulting bulk data reports in the form of CSV files.
    *
    * @example
    * const {google} = require('googleapis');
    * const youtubereporting = google.youtubereporting('v1');
    *
    * @namespace youtubereporting
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Youtubereporting
    */
  @JSImport("googleapis", "youtubereporting_v1.Youtubereporting")
  @js.native
  class Youtubereporting protected ()
    extends typings.googleapis.youtubereportingV1Mod.youtubereportingV1.Youtubereporting {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
