package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaserulesV1 {
  
  /**
    * Firebase Rules API
    *
    * Creates and manages rules that determine when a Firebase Rules-enabled
    * service should permit a request.
    *
    * @example
    * const {google} = require('googleapis');
    * const firebaserules = google.firebaserules('v1');
    *
    * @namespace firebaserules
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Firebaserules
    */
  @JSImport("googleapis", "firebaserules_v1.Firebaserules")
  @js.native
  class Firebaserules protected ()
    extends typings.googleapis.firebaserulesV1Mod.firebaserulesV1.Firebaserules {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "firebaserules_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.firebaserulesV1Mod.firebaserulesV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firebaserules_v1.Resource$Projects$Releases")
  @js.native
  class ResourceProjectsReleases protected ()
    extends typings.googleapis.firebaserulesV1Mod.firebaserulesV1.ResourceProjectsReleases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firebaserules_v1.Resource$Projects$Rulesets")
  @js.native
  class ResourceProjectsRulesets protected ()
    extends typings.googleapis.firebaserulesV1Mod.firebaserulesV1.ResourceProjectsRulesets {
    def this(context: APIRequestContext) = this()
  }
}
