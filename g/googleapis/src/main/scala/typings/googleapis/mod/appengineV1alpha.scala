package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appengineV1alpha {
  
  /**
    * App Engine Admin API
    *
    * Provisions and manages developers&#39; App Engine applications.
    *
    * @example
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1alpha');
    *
    * @namespace appengine
    * @type {Function}
    * @version v1alpha
    * @variation v1alpha
    * @param {object=} options Options for Appengine
    */
  @JSImport("googleapis", "appengine_v1alpha.Appengine")
  @js.native
  class Appengine protected ()
    extends typings.googleapis.v1alphaMod.appengineV1alpha.Appengine {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "appengine_v1alpha.Resource$Apps")
  @js.native
  class ResourceApps protected ()
    extends typings.googleapis.v1alphaMod.appengineV1alpha.ResourceApps {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1alpha.Resource$Apps$Authorizedcertificates")
  @js.native
  class ResourceAppsAuthorizedcertificates protected ()
    extends typings.googleapis.v1alphaMod.appengineV1alpha.ResourceAppsAuthorizedcertificates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1alpha.Resource$Apps$Authorizeddomains")
  @js.native
  class ResourceAppsAuthorizeddomains protected ()
    extends typings.googleapis.v1alphaMod.appengineV1alpha.ResourceAppsAuthorizeddomains {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1alpha.Resource$Apps$Domainmappings")
  @js.native
  class ResourceAppsDomainmappings protected ()
    extends typings.googleapis.v1alphaMod.appengineV1alpha.ResourceAppsDomainmappings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1alpha.Resource$Apps$Locations")
  @js.native
  class ResourceAppsLocations protected ()
    extends typings.googleapis.v1alphaMod.appengineV1alpha.ResourceAppsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1alpha.Resource$Apps$Operations")
  @js.native
  class ResourceAppsOperations protected ()
    extends typings.googleapis.v1alphaMod.appengineV1alpha.ResourceAppsOperations {
    def this(context: APIRequestContext) = this()
  }
}
