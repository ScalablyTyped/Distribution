package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebasehostingV1beta1 {
  
  /**
    * Firebase Hosting API
    *
    * The Firebase Hosting REST API enables programmatic and customizable
    * deployments to your Firebase-hosted sites. Use this REST API to deploy new
    * or updated hosting configurations and content files.
    *
    * @example
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * @namespace firebasehosting
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Firebasehosting
    */
  @JSImport("googleapis", "firebasehosting_v1beta1.Firebasehosting")
  @js.native
  class Firebasehosting protected ()
    extends typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1.Firebasehosting {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "firebasehosting_v1beta1.Resource$Sites")
  @js.native
  class ResourceSites protected ()
    extends typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1.ResourceSites {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firebasehosting_v1beta1.Resource$Sites$Domains")
  @js.native
  class ResourceSitesDomains protected ()
    extends typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1.ResourceSitesDomains {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firebasehosting_v1beta1.Resource$Sites$Releases")
  @js.native
  class ResourceSitesReleases protected ()
    extends typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1.ResourceSitesReleases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firebasehosting_v1beta1.Resource$Sites$Versions")
  @js.native
  class ResourceSitesVersions protected ()
    extends typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1.ResourceSitesVersions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firebasehosting_v1beta1.Resource$Sites$Versions$Files")
  @js.native
  class ResourceSitesVersionsFiles protected ()
    extends typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1.ResourceSitesVersionsFiles {
    def this(context: APIRequestContext) = this()
  }
}
