package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clouderrorreportingV1beta1 {
  
  /**
    * Stackdriver Error Reporting API
    *
    * Groups and counts similar errors from cloud services and applications,
    * reports new errors, and provides access to error groups and their
    * associated errors.
    *
    * @example
    * const {google} = require('googleapis');
    * const clouderrorreporting = google.clouderrorreporting('v1beta1');
    *
    * @namespace clouderrorreporting
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Clouderrorreporting
    */
  @JSImport("googleapis", "clouderrorreporting_v1beta1.Clouderrorreporting")
  @js.native
  class Clouderrorreporting protected ()
    extends typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1.Clouderrorreporting {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "clouderrorreporting_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "clouderrorreporting_v1beta1.Resource$Projects$Events")
  @js.native
  class ResourceProjectsEvents protected ()
    extends typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1.ResourceProjectsEvents {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "clouderrorreporting_v1beta1.Resource$Projects$Groups")
  @js.native
  class ResourceProjectsGroups protected ()
    extends typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1.ResourceProjectsGroups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "clouderrorreporting_v1beta1.Resource$Projects$Groupstats")
  @js.native
  class ResourceProjectsGroupstats protected ()
    extends typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1.ResourceProjectsGroupstats {
    def this(context: APIRequestContext) = this()
  }
}
