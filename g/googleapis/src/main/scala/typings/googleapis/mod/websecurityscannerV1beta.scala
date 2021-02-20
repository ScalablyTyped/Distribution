package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websecurityscannerV1beta {
  
  @JSImport("googleapis", "websecurityscanner_v1beta.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs")
  @js.native
  class ResourceProjectsScanconfigs protected ()
    extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjectsScanconfigs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns")
  @js.native
  class ResourceProjectsScanconfigsScanruns protected ()
    extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjectsScanconfigsScanruns {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns$Crawledurls")
  @js.native
  class ResourceProjectsScanconfigsScanrunsCrawledurls protected ()
    extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjectsScanconfigsScanrunsCrawledurls {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns$Findings")
  @js.native
  class ResourceProjectsScanconfigsScanrunsFindings protected ()
    extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjectsScanconfigsScanrunsFindings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns$Findingtypestats")
  @js.native
  class ResourceProjectsScanconfigsScanrunsFindingtypestats protected ()
    extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjectsScanconfigsScanrunsFindingtypestats {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Web Security Scanner API
    *
    * Scans your Compute and App Engine apps for common web vulnerabilities.
    *
    * @example
    * const {google} = require('googleapis');
    * const websecurityscanner = google.websecurityscanner('v1beta');
    *
    * @namespace websecurityscanner
    * @type {Function}
    * @version v1beta
    * @variation v1beta
    * @param {object=} options Options for Websecurityscanner
    */
  @JSImport("googleapis", "websecurityscanner_v1beta.Websecurityscanner")
  @js.native
  class Websecurityscanner protected ()
    extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
