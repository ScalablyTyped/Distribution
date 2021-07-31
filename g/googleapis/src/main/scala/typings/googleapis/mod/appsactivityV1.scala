package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsactivityV1 {
  
  /**
    * Drive Activity API
    *
    * Provides a historical view of activity.
    *
    * @example
    * const {google} = require('googleapis');
    * const appsactivity = google.appsactivity('v1');
    *
    * @namespace appsactivity
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Appsactivity
    */
  @JSImport("googleapis", "appsactivity_v1.Appsactivity")
  @js.native
  class Appsactivity protected ()
    extends typings.googleapis.appsactivityV1Mod.appsactivityV1.Appsactivity {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "appsactivity_v1.Resource$Activities")
  @js.native
  class ResourceActivities protected ()
    extends typings.googleapis.appsactivityV1Mod.appsactivityV1.ResourceActivities {
    def this(context: APIRequestContext) = this()
  }
}
